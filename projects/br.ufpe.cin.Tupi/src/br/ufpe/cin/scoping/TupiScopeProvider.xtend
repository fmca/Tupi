package br.ufpe.cin.scoping

import br.ufpe.cin.tupi.TriggerEvent
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import br.ufpe.cin.tupi.MachineDecl

class TupiScopeProvider extends AbstractDeclarativeScopeProvider {
	def IScope scope_Trigger_event(TriggerEvent trigger, EReference eReference) {
		return Scopes.scopeFor((trigger.machine.type.typeRef.eContainer as MachineDecl).body.eventsDecl.events)
	}
}