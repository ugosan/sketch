package org.eclipse.sketch.examples.shapes.diagram.part;

import org.eclipse.emf.cdo.dawn.commands.CreateSemanticResourceRecordingCommand;
import org.eclipse.sketch.examples.shapes.ShapesFactory;

import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DawnDiagramEditPart;
import org.eclipse.emf.cdo.dawn.preferences.PreferenceConstants;
import org.eclipse.emf.cdo.dawn.transaction.DawnGMFEditingDomainFactory;
import org.eclipse.emf.cdo.dawn.ui.DawnEditorInput;
import org.eclipse.emf.cdo.dawn.util.connection.CDOConnectionUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import java.io.IOException;
import java.util.Collections;

public class DawnShapesDiagramEditorUtil extends ShapesDiagramEditorUtil {

	public static boolean openDiagram(Resource diagram)
			throws PartInitException {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		return null != page.openEditor(new DawnEditorInput(diagram.getURI()),
				DawnShapesDiagramEditor.ID);
	}

	public static void runWizard(Shell shell, Wizard wizard, String settingsKey) {
		IDialogSettings pluginDialogSettings = ShapesDiagramEditorPlugin
				.getInstance().getDialogSettings();
		IDialogSettings wizardDialogSettings = pluginDialogSettings
				.getSection(settingsKey);
		if (wizardDialogSettings == null) {
			wizardDialogSettings = pluginDialogSettings
					.addNewSection(settingsKey);
		}
		wizard.setDialogSettings(wizardDialogSettings);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x),
				500);
		dialog.open();
	}

	public static Resource createDiagram(URI diagramURI, URI modelURI,
			IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = DawnGMFEditingDomainFactory
				.getInstance().createEditingDomain();

		progressMonitor.beginTask(
				Messages.ShapesDiagramEditorUtil_CreateDiagramProgressTask, 3);

		CDOConnectionUtil.instance.init(
				PreferenceConstants.getRepositoryName(),
				PreferenceConstants.getProtocol(),
				PreferenceConstants.getServerName());
		CDOConnectionUtil.instance.openSession();
		ResourceSet resourceSet = editingDomain.getResourceSet();

		CDOTransaction transaction = CDOConnectionUtil.instance
				.openCurrentTransaction(resourceSet, diagramURI.toString());

		final Resource diagramResource = resourceSet.createResource(diagramURI);

		CreateSemanticResourceRecordingCommand createSemanticResourceCommand = new CreateSemanticResourceRecordingCommand(
				editingDomain, transaction, modelURI.path());

		editingDomain.getCommandStack().execute(createSemanticResourceCommand);
		final Resource modelResource = createSemanticResourceCommand
				.getResource();

		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.ShapesDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				EObject model = null;
				if (modelResource.getContents().size() > 0) {
					model = modelResource.getContents().get(0);
				} else {
					model = createInitialModel();
					attachModelToResource(model, modelResource);
				}

				Diagram diagram = ViewService.createDiagram(model,
						DawnDiagramEditPart.MODEL_ID,
						ShapesDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					modelResource.save(Collections.EMPTY_MAP);
					diagramResource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					ShapesDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}

				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			ShapesDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(modelResource));
		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	private static EObject createInitialModel() {
		return ShapesFactory.eINSTANCE.createDiagram();
	}

	private static void attachModelToResource(EObject model, Resource resource) {
		resource.getContents().add(model);
	}
}
