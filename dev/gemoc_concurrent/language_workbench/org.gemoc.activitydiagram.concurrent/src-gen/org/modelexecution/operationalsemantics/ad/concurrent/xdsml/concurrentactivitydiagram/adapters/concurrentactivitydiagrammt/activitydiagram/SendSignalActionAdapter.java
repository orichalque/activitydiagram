package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram;

import activitydiagram.SendSignalAction;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SendSignalActionAdapter extends EObjectAdapter<SendSignalAction> implements org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.SendSignalAction {
  private org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public SendSignalActionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isRunning() {
    return adaptee.isRunning();
  }
  
  @Override
  public void setRunning(final boolean o) {
    adaptee.setRunning(o);
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge> */Object outgoing;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge> */Object getOutgoing() {
    if (outgoing == null)
    	outgoing = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory);
    return outgoing;
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge> */Object incoming;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge> */Object getIncoming() {
    if (incoming == null)
    	incoming = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory);
    return incoming;
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity getActivity() {
    return () adaptersFactory.createAdapter(adaptee.getActivity(), eResource);
  }
  
  @Override
  public void setActivity(final org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity o) {
    if (o != null)
    	adaptee.setActivity(((org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram.ActivityAdapter) o).getAdaptee());
    else adaptee.setActivity(null);
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal getSignal() {
    return () adaptersFactory.createAdapter(adaptee.getSignal(), eResource);
  }
  
  @Override
  public void setSignal(final org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal o) {
    if (o != null)
    	adaptee.setSignal(((org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram.SignalAdapter) o).getAdaptee());
    else adaptee.setSignal(null);
  }
  
  @Override
  public void addTokens(final /* List<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Token> */Object tokens) {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityNodeAspect.addTokens(adaptee, ((fr.inria.diverse.melange.adapters.EListAdapter) tokens).getAdaptee()
    );
  }
  
  @Override
  public void execute() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityNodeAspect.execute(adaptee);
  }
  
  @Override
  public void removeToken(final org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Token token) {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityNodeAspect.removeToken(adaptee, ((org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram.TokenAdapter) token).getAdaptee()
    );
  }
  
  @Override
  public void terminate() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityNodeAspect.terminate(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean RUNNING_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getSendSignalAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__OUTGOING:
    		return getOutgoing();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__INCOMING:
    		return getIncoming();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__ACTIVITY:
    		return getActivity();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__RUNNING:
    		return isRunning() ? Boolean.TRUE : Boolean.FALSE;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__HELD_TOKENS:
    		return getHeldTokens();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__SIGNAL:
    		return getSignal();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__ACTIVITY:
    		return getActivity() != null;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__RUNNING:
    		return isRunning() != RUNNING_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__HELD_TOKENS:
    		return getHeldTokens() != null && !getHeldTokens().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__SIGNAL:
    		return getSignal() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__ACTIVITY:
    		setActivity(
    		(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__RUNNING:
    		setRunning(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.SEND_SIGNAL_ACTION__SIGNAL:
    		setSignal(
    		(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
