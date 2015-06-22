package br.ufpe.cin.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.xbase.lib.InputOutput;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

import br.ufpe.cin.tupi.Action;
import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.Guard;
import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.Memory;
import br.ufpe.cin.tupi.Model;
import br.ufpe.cin.tupi.State;
import br.ufpe.cin.tupi.Transition;

public class TupiScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO qualified names instaed of simplenames

	@Inject
	IQualifiedNameProvider nameProvider;

	@Override
	public IScope getScope(EObject context, EReference reference) {

		if (context instanceof Transition) {

			Model m = EcoreUtil2.getContainerOfType(context, Model.class);
			MachineDecl mach = m.getMachine();
			final List<String> objects = getDescriptions(mach);

			return new FilteringScope(super.getScope(context, reference), new Predicate<IEObjectDescription>() {

				@Override
				public boolean apply(IEObjectDescription input) {

					boolean contains = objects.contains(input.getName().toString());
					return contains;
				}
			});
		}
		return super.getScope(context, reference);
	}

	public List<String> getDescriptions(MachineDecl mach) {
		final List<String> objects = new ArrayList<String>();

		try {
			for (Action a : mach.getBody().getActionsDecl().getActions()) {
				objects.add(a.getName());
			}
		} catch (NullPointerException e) {
			InputOutput.println(e.getCause());
		}

		try {
			for (Event e : mach.getBody().getEventsDecl().getEvents()) {
				objects.add(e.getName());
			}
		} catch (NullPointerException e) {
			InputOutput.println(e.getCause());
		}

		try {
			for (Guard e : mach.getBody().getGuardsDecl().getGuards()) {
				objects.add(e.getName());
			}
		} catch (NullPointerException e) {
			InputOutput.println(e.getCause());
		}

		try {

			for (Memory e : mach.getBody().getMemoriesDecl().getMemories()) {
				objects.add(e.getName());
			}
		} catch (NullPointerException e) {
			InputOutput.println(e.getCause());
		}

		try {
			for (State e : mach.getBody().getStatesDecl().getStates()) {
				objects.add(e.getName());
			}
		} catch (NullPointerException e) {
			InputOutput.println(e.getCause());
		}

		if (mach.getSuperType() != null) {
			objects.addAll(getDescriptions(mach.getSuperType()));
		}

		return objects;
	}

}
