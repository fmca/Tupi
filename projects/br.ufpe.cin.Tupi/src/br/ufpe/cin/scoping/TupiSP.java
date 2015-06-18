package br.ufpe.cin.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import br.ufpe.cin.tupi.Type;

public class TupiSP extends AbstractDeclarativeScopeProvider {

		private EObject origCtx = null;

		public IScope getScope(EObject context, EReference reference) {
			origCtx = context;
			return super.getScope(context, reference);
		}

		IScope scope_EvaluableIDRef_ref(Type context, EReference reference) {
			return extendInheritanceScope(context, reference);
		}

		IScope scope_AssignableIDRef_ref(Type context, EReference reference) {
			return extendInheritanceScope(context, reference);
		}
		
		IScope extendInheritanceScope(Type context, EReference reference) {


			// get original context scope
			IScope ctxScope = delegateGetScope(origCtx, reference);

			// add inheritance scopes
			Set<Type> allParents = collectAllParrents(context, new HashSet<Type>()); 
			for (Type ent : allParents)
				ctxScope = ((TupiINALSP)getDelegate()).getLocalScope(ctxScope, ent, reference);

			return ctxScope;
		}
		
		Set<Type> collectAllParrents(Type context, Set<Type> elements) {
				elements.add(context);
			return elements;
		}
	
}
