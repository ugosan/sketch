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
package org.eclipse.sketch.examples.shapes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Unknown#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Unknown#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown()
 * @model kind="class"
 * @generated
 */
public class Unknown extends EObjectImpl implements Shape {
	/**
	 * The default value of the '{@link #getSvg() <em>Svg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvg()
	 * @generated
	 * @ordered
	 */
	protected static final String SVG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSvg() <em>Svg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvg()
	 * @generated
	 * @ordered
	 */
	protected String svg = SVG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected static final String META_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected String meta = META_EDEFAULT;

	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected String element = ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unknown() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.UNKNOWN;
	}

	/**
	 * Returns the value of the '<em><b>Svg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svg</em>' attribute.
	 * @see #setSvg(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape_Svg()
	 * @model
	 * @generated
	 */
	public String getSvg() {
		return svg;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Unknown#getSvg <em>Svg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svg</em>' attribute.
	 * @see #getSvg()
	 * @generated
	 */
	public void setSvg(String newSvg) {
		String oldSvg = svg;
		svg = newSvg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__SVG, oldSvg, svg));
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape_Label()
	 * @model
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Unknown#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' attribute.
	 * @see #setMeta(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown_Meta()
	 * @model
	 * @generated
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Unknown#getMeta <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' attribute.
	 * @see #getMeta()
	 * @generated
	 */
	public void setMeta(String newMeta) {
		String oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__META, oldMeta, meta));
	}

	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown_Element()
	 * @model
	 * @generated
	 */
	public String getElement() {
		return element;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Unknown#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	public void setElement(String newElement) {
		String oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShapesPackage.UNKNOWN__SVG:
				return getSvg();
			case ShapesPackage.UNKNOWN__LABEL:
				return getLabel();
			case ShapesPackage.UNKNOWN__META:
				return getMeta();
			case ShapesPackage.UNKNOWN__ELEMENT:
				return getElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShapesPackage.UNKNOWN__SVG:
				setSvg((String)newValue);
				return;
			case ShapesPackage.UNKNOWN__LABEL:
				setLabel((String)newValue);
				return;
			case ShapesPackage.UNKNOWN__META:
				setMeta((String)newValue);
				return;
			case ShapesPackage.UNKNOWN__ELEMENT:
				setElement((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShapesPackage.UNKNOWN__SVG:
				setSvg(SVG_EDEFAULT);
				return;
			case ShapesPackage.UNKNOWN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ShapesPackage.UNKNOWN__META:
				setMeta(META_EDEFAULT);
				return;
			case ShapesPackage.UNKNOWN__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShapesPackage.UNKNOWN__SVG:
				return SVG_EDEFAULT == null ? svg != null : !SVG_EDEFAULT.equals(svg);
			case ShapesPackage.UNKNOWN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ShapesPackage.UNKNOWN__META:
				return META_EDEFAULT == null ? meta != null : !META_EDEFAULT.equals(meta);
			case ShapesPackage.UNKNOWN__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (svg: ");
		result.append(svg);
		result.append(", label: ");
		result.append(label);
		result.append(", meta: ");
		result.append(meta);
		result.append(", element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} // Unknown
