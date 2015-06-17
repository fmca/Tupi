package br.ufpe.cin.scoping;

import br.ufpe.cin.tupi.Action;
import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.Guard;
import br.ufpe.cin.tupi.State;
import br.ufpe.cin.tupi.Transition;
import br.ufpe.cin.tupi.TriggerEvent;
import br.ufpe.cin.tupi.TupiPackage;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

@SuppressWarnings("all")
public class TupiScopeProvider extends AbstractDeclarativeScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((context instanceof TriggerEvent)) {
      final EObject rootElement = EcoreUtil2.getRootContainer(context);
      final List<Event> candidates = EcoreUtil2.<Event>getAllContentsOfType(rootElement, Event.class);
      return Scopes.scopeFor(candidates);
    } else {
      if ((context instanceof Transition)) {
        final EObject rootElement_1 = EcoreUtil2.getRootContainer(context);
        boolean _equals = Objects.equal(reference, TupiPackage.Literals.TRANSITION__ACTION);
        if (_equals) {
          final List<Action> candidates_1 = EcoreUtil2.<Action>getAllContentsOfType(rootElement_1, Action.class);
          return Scopes.scopeFor(candidates_1);
        } else {
          boolean _equals_1 = Objects.equal(reference, TupiPackage.Literals.TRANSITION__DEST_STATE);
          if (_equals_1) {
            final List<State> candidates_2 = EcoreUtil2.<State>getAllContentsOfType(rootElement_1, State.class);
            return Scopes.scopeFor(candidates_2);
          } else {
            boolean _equals_2 = Objects.equal(reference, TupiPackage.Literals.TRANSITION__GUARD);
            if (_equals_2) {
              final List<Guard> candidates_3 = EcoreUtil2.<Guard>getAllContentsOfType(rootElement_1, Guard.class);
              return Scopes.scopeFor(candidates_3);
            }
          }
        }
      }
    }
    return null;
  }
}
