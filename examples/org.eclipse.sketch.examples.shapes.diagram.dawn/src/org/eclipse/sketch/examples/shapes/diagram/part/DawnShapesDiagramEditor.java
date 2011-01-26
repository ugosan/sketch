package org.eclipse.sketch.examples.shapes.diagram.part;

import org.eclipse.emf.cdo.dawn.editors.IDawnEditor;
import org.eclipse.emf.cdo.dawn.editors.IDawnEditorSupport;
import org.eclipse.emf.cdo.dawn.editors.impl.DawnGMFEditorSupport;
import org.eclipse.emf.cdo.dawn.ui.DawnEditorInput;
import org.eclipse.emf.cdo.ui.CDOEditorInput;
import org.eclipse.emf.cdo.view.CDOView;

import org.eclipse.net4j.util.transaction.TransactionException;

import org.eclipse.emf.common.ui.URIEditorInput;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.AbstractDocumentProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;

public class DawnShapesDiagramEditor extends ShapesDiagramEditor
		implements
			IDawnEditor {
	public static String ID = "org.eclipse.sketch.examples.shapes.diagram.part.DawnShapesDiagramEditor ";

	private IDawnEditorSupport dawnEditorSupport;

	public DawnShapesDiagramEditor() {
		super();
		setDocumentProvider(new DawnShapesDocumentProvider());
		setDawnEditorSupport(new DawnGMFEditorSupport(this));
	}

	@Override
	public void setInput(IEditorInput input) {
		try {
			doSetInput(input, true);
		} catch (CoreException x) {
			x.printStackTrace(System.err);
			String title = x.getMessage();
			String msg = x.getMessage();
			Shell shell = getSite().getShell();
			ErrorDialog.openError(shell, title, msg, x.getStatus());
		}

		dawnEditorSupport.setView(((DawnEditorInput) input).getView());
		dawnEditorSupport.registerListeners();
	}

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			dawnEditorSupport.setDirty(false);
			updateState(getEditorInput());
			validateState(getEditorInput());
			performSave(false, monitor);
			getDiagramGraphicalViewer().getControl().redraw();	
		} catch (TransactionException e) {
			if (e.getMessage().contains("conflict")) {
				MessageDialog.openError(Display.getDefault().getActiveShell(),
						"conflict",
						"Your Resource is in conflict and cannot be committed");
			} else {
				throw e;
			}
		}
	}

	@Override
	public boolean isDirty() {
		return dawnEditorSupport.isDirty();
	}

	public String getContributorID() {
		return ID;
	}

	@Override
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput
				|| input instanceof CDOEditorInput) {
			setDocumentProvider(getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	@Override
	public void dispose() {
		try {
			super.dispose();
		} finally {
			dawnEditorSupport.close();
		}
	}

	public CDOView getView() {
		return dawnEditorSupport.getView();
	}

	public void setDirty() {
		dawnEditorSupport.setDirty(true);
		((AbstractDocumentProvider) getDocumentProvider())
				.changed(getEditorInput());
	}

	public void setDawnEditorSupport(IDawnEditorSupport dawnEditorSupport) {
		this.dawnEditorSupport = dawnEditorSupport;
	}

	public IDawnEditorSupport getDawnEditorSupport() {
		return dawnEditorSupport;
	}
}
