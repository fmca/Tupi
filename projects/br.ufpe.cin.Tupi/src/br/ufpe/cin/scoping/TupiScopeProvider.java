package br.ufpe.cin.scoping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.TupiPackage;

public class TupiScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_EvaluableIDRef_ref(MachineDecl context, EReference reference) {
		final Set<String> allMachines = getAllMachines(context);
		Predicate<IEObjectDescription> filter = new Predicate<IEObjectDescription>() {
			@Override
			public boolean apply(IEObjectDescription input) {
				String machine = input.getUserData("machine");
				return machine != null && allMachines.contains(machine);
			}
		};
		return new FilteringScope(delegateGetScope(context, reference), filter );
		
	}
	
	Set<String> getAllMachines(MachineDecl context) {
		Map<String,String> allMachines = new HashMap<String,String>();
		for (IEObjectDescription e : delegateGetScope(context, TupiPackage.Literals.MACHINE_DECL__SUPER_TYPE).getAllElements()) {
			String parent = e.getUserData("machine");
			if (parent != null) {
				allMachines.put(e.getQualifiedName().toString(), parent);
			}
		}
		Set<String> result = Sets.newHashSet();
		String current = context.getName();
		while(current != null && result.add(current)) {
			current = allMachines.get(current);
		}
		return result;
	}
}
