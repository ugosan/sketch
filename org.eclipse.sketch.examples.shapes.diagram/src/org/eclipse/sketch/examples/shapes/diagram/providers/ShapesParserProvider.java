/**
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *  
 *
 * $Id$
 */ 
 package org.eclipse.sketch.examples.shapes.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.ConnectionLabelEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DashedConnectionLabelEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.UnknownLabelEditPart;
import org.eclipse.sketch.examples.shapes.diagram.parsers.MessageFormatParser;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry;

/**
 * @generated
 */
public class ShapesParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser unknownLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownLabel_5001Parser() {
		if (unknownLabel_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ShapesPackage.eINSTANCE
					.getShape_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unknownLabel_5001Parser = parser;
		}
		return unknownLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionLabel_6001Parser() {
		if (connectionLabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ShapesPackage.eINSTANCE
					.getAbstractConnection_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionLabel_6001Parser = parser;
		}
		return connectionLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser dashedConnectionLabel_6002Parser;

	/**
	 * @generated
	 */
	private IParser getDashedConnectionLabel_6002Parser() {
		if (dashedConnectionLabel_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ShapesPackage.eINSTANCE
					.getAbstractConnection_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dashedConnectionLabel_6002Parser = parser;
		}
		return dashedConnectionLabel_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UnknownLabelEditPart.VISUAL_ID:
			return getUnknownLabel_5001Parser();
		case ConnectionLabelEditPart.VISUAL_ID:
			return getConnectionLabel_6001Parser();
		case DashedConnectionLabelEditPart.VISUAL_ID:
			return getDashedConnectionLabel_6002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ShapesVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ShapesVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ShapesElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
