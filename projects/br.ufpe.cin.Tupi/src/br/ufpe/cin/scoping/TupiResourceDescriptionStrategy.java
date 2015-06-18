package br.ufpe.cin.scoping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.TupiPackage;

public class TupiResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {


public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
	
	if (eObject instanceof JvmTypeReference ) {
		Map<String, String> data = new HashMap<String, String>();
		List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject, TupiPackage.Literals.MACHINE_DECL__SUPER_TYPE);
		if (nodes.size()>0) {
			String parentName = nodes.get(0).getText().trim();
			data.put("machine", parentName);
		}
		return createEOD(eObject, acceptor, data );
	} else if (eObject instanceof MachineDecl ) {
		Map<String, String> data = new HashMap<String, String>();
		MachineDecl machine = EcoreUtil2.getContainerOfType(eObject, MachineDecl.class);
		data.put("machine", machine.getName());
		return createEOD(eObject, acceptor, data);
	}
	return super.createEObjectDescriptions(eObject, acceptor);
	
}

private boolean createEOD(EObject eObject,
		IAcceptor<IEObjectDescription> acceptor, Map<String, String> data) {
	if (getQualifiedNameProvider() == null)
		return false;
	try {
		org.eclipse.xtext.naming.QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
		if (qualifiedName != null) {
			acceptor.accept(EObjectDescription.create(qualifiedName, eObject, data));
		}
	} catch (Exception exc) {
		exc.printStackTrace();
	}
	return true;
}

}
