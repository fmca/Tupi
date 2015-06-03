package br.ufpe.cin.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.emf.ecore.EReference;

import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.TupiPackage;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when tozz use it.
 * 
 */
class TupiScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope getScope(EObject context,  EReference reference) {

          // We want to define the Scope for the Element's superElement cross-reference
          if(context instanceof Event
              && reference == TupiPackage.Literals.TRIGGER_EVENT__EVENT){
            // Collect a list of candidates by going through the model
            // EcoreUtil2 provides useful functionality to do that
            // For example searching for all elements within the root Object's tree
            EObject rootElement = EcoreUtil2.getRootContainer(context);
            
            List<Event> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Event.class);
            // Scopes.scopeFor creates IEObjectDescriptions and puts them into an IScope instance
            IScope scope = Scopes.scopeFor(candidates);
            return scope;
          }
          return super.getScope(context, reference);
      }
      

}
