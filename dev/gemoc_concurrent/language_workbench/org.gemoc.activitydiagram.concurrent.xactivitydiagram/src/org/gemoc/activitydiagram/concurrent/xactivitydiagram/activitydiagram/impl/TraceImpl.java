/**
 */
package org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.impl.TraceImpl#getExecutedNodes <em>Executed Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends EObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getExecutedNodes() <em>Executed Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> executedNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getExecutedNodes() {
		if (executedNodes == null) {
			executedNodes = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, ActivitydiagramPackage.TRACE__EXECUTED_NODES);
		}
		return executedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACE__EXECUTED_NODES:
				return getExecutedNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACE__EXECUTED_NODES:
				getExecutedNodes().clear();
				getExecutedNodes().addAll((Collection<? extends ActivityNode>)newValue);
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
			case ActivitydiagramPackage.TRACE__EXECUTED_NODES:
				getExecutedNodes().clear();
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
			case ActivitydiagramPackage.TRACE__EXECUTED_NODES:
				return executedNodes != null && !executedNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
