/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.MemoryDecl#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getMemoryDecl()
 * @model
 * @generated
 */
public interface MemoryDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.Memory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memories</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getMemoryDecl_Memories()
   * @model containment="true"
   * @generated
   */
  EList<Memory> getMemories();

} // MemoryDecl
