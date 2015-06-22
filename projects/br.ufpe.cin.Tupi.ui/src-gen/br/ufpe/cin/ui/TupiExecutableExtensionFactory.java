/*
 * generated by Xtext
 */
package br.ufpe.cin.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import br.ufpe.cin.ui.internal.TupiActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TupiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TupiActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TupiActivator.getInstance().getInjector(TupiActivator.BR_UFPE_CIN_TUPI);
	}
	
}