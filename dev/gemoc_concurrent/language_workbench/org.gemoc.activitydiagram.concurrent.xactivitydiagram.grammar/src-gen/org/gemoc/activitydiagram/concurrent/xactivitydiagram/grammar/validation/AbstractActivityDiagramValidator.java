/*
 * generated by Xtext
 */
package org.gemoc.activitydiagram.concurrent.xactivitydiagram.grammar.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractActivityDiagramValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://activitydiagram/1.0"));
		return result;
	}
}