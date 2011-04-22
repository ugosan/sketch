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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.sketch.Sketch;

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
 *   <li>{@link org.eclipse.sketch.examples.shapes.Unknown#getDna <em>Dna</em>}</li>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Unknown#getSketch <em>Sketch</em>}</li>
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
	protected static final String META_EDEFAULT = "";

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
	 * The default value of the '{@link #getDna() <em>Dna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDna()
	 * @generated
	 * @ordered
	 */
	protected static final String DNA_EDEFAULT = "####";

	/**
	 * The cached value of the '{@link #getDna() <em>Dna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDna()
	 * @generated
	 * @ordered
	 */
	protected String dna = DNA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSketch() <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSketch()
	 * @generated
	 * @ordered
	 */
	protected Sketch sketch;

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
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' attribute.
	 * @see #setMeta(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown_Meta()
	 * @model default=""
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
	 * Returns the value of the '<em><b>Dna</b></em>' attribute.
	 * The default value is <code>"####"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dna</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dna</em>' attribute.
	 * @see #setDna(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown_Dna()
	 * @model default="####"
	 * @generated
	 */
	public String getDna() {
		return dna;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Unknown#getDna <em>Dna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dna</em>' attribute.
	 * @see #getDna()
	 * @generated
	 */
	public void setDna(String newDna) {
		String oldDna = dna;
		dna = newDna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__DNA, oldDna, dna));
	}

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown_Sketch()
	 * @model containment="true"
	 * @generated
	 */
	public Sketch getSketch() {
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSketch(Sketch newSketch, NotificationChain msgs) {
		Sketch oldSketch = sketch;
		sketch = newSketch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__SKETCH, oldSketch, newSketch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Unknown#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	public void setSketch(Sketch newSketch) {
		if (newSketch != sketch) {
			NotificationChain msgs = null;
			if (sketch != null)
				msgs = ((InternalEObject)sketch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.UNKNOWN__SKETCH, null, msgs);
			if (newSketch != null)
				msgs = ((InternalEObject)newSketch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.UNKNOWN__SKETCH, null, msgs);
			msgs = basicSetSketch(newSketch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.UNKNOWN__SKETCH, newSketch, newSketch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapesPackage.UNKNOWN__SKETCH:
				return basicSetSketch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ShapesPackage.UNKNOWN__DNA:
				return getDna();
			case ShapesPackage.UNKNOWN__SKETCH:
				return getSketch();
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
			case ShapesPackage.UNKNOWN__DNA:
				setDna((String)newValue);
				return;
			case ShapesPackage.UNKNOWN__SKETCH:
				setSketch((Sketch)newValue);
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
			case ShapesPackage.UNKNOWN__DNA:
				setDna(DNA_EDEFAULT);
				return;
			case ShapesPackage.UNKNOWN__SKETCH:
				setSketch((Sketch)null);
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
			case ShapesPackage.UNKNOWN__DNA:
				return DNA_EDEFAULT == null ? dna != null : !DNA_EDEFAULT.equals(dna);
			case ShapesPackage.UNKNOWN__SKETCH:
				return sketch != null;
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
		result.append(", dna: ");
		result.append(dna);
		result.append(')');
		return result.toString();
	}

} // Unknown
