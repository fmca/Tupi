package br.ufpe.cin.scoping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

public class TupiINALSP extends ImportedNamespaceAwareLocalScopeProvider {
	@Inject
	private IDefaultResourceDescriptionStrategy rds;

	@Override
	protected ISelectable internalGetAllDescriptions(final Resource resource) {
		Iterable<EObject> allContents = new Iterable<EObject>(){
			public Iterator<EObject> iterator() {
				return EcoreUtil.getAllContents(resource, false);
			}
		}; 
		final List<IEObjectDescription> allDescriptions = new ArrayList<IEObjectDescription>();
		IAcceptor<IEObjectDescription> acceptor = new IAcceptor<IEObjectDescription>() {
			
			@Override
			public void accept(IEObjectDescription t) {
				allDescriptions.add(t);
			}
		};
		for (EObject o : allContents) {
			rds.createEObjectDescriptions(o, acceptor);
		}
		return new MultimapBasedSelectable(allDescriptions);
	}
	
	public IScope getLocalScope(IScope parent, final EObject context, final EReference reference) {
		return getLocalElementsScope(parent, context, reference); 
	}

}
