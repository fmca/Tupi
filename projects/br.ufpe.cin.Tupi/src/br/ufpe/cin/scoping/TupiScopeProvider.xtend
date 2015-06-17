package br.ufpe.cin.scoping

import br.ufpe.cin.tupi.Event
import br.ufpe.cin.tupi.Transition
import br.ufpe.cin.tupi.TriggerEvent
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import br.ufpe.cin.tupi.Action
import br.ufpe.cin.tupi.Guard
import br.ufpe.cin.tupi.State
import br.ufpe.cin.tupi.TupiPackage

class TupiScopeProvider extends AbstractDeclarativeScopeProvider {

	override getScope(EObject context, EReference reference) {

		if (context instanceof TriggerEvent) {

			// Collect a list of candidates by going through the model
			// EcoreUtil2 provides useful functionality to do that
			// For example searching for all elements within the root Object's tree
			val rootElement = EcoreUtil2.getRootContainer(context);

			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Event)
			// Scopes.scopeFor creates IEObjectDescriptions and puts them into an IScope instance
			return Scopes.scopeFor(candidates);
		} else if (context instanceof Transition) {
			val rootElement = EcoreUtil2.getRootContainer(context);
			
			if(reference == TupiPackage.Literals.TRANSITION__ACTION){
				val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Action);
				return Scopes.scopeFor(candidates);
			}else if (reference == TupiPackage.Literals.TRANSITION__DEST_STATE){
				val candidates = EcoreUtil2.getAllContentsOfType(rootElement, State);
				return Scopes.scopeFor(candidates);
			}else if (reference == TupiPackage.Literals.TRANSITION__GUARD){
				val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Guard);
				return Scopes.scopeFor(candidates);
			}

			
		}

	}

}