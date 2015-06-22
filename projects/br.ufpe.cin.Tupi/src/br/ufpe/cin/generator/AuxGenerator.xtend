package br.ufpe.cin.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import br.ufpe.cin.jvmmodel.TupiJvmModelInferrer
import com.google.inject.Inject

class AuxGenerator implements IGenerator {
	@Inject package TupiGenerator g1
	@Inject package JvmModelGenerator g2

	@Override override void doGenerate(Resource input, IFileSystemAccess fsa) {
		g1.doGenerate(input, fsa)
		g2.doGenerate(input, fsa)
	}

}