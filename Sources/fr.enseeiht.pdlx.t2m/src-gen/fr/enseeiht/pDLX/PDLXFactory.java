/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pDLX.PDLXPackage
 * @generated
 */
public interface PDLXFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDLXFactory eINSTANCE = fr.enseeiht.pDLX.impl.PDLXFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Process Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Element</em>'.
   * @generated
   */
  ProcessElement createProcessElement();

  /**
   * Returns a new object of class '<em>Work Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Definition</em>'.
   * @generated
   */
  WorkDefinition createWorkDefinition();

  /**
   * Returns a new object of class '<em>Ressource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ressource</em>'.
   * @generated
   */
  Ressource createRessource();

  /**
   * Returns a new object of class '<em>Need</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Need</em>'.
   * @generated
   */
  Need createNeed();

  /**
   * Returns a new object of class '<em>Need Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Need Set</em>'.
   * @generated
   */
  NeedSet createNeedSet();

  /**
   * Returns a new object of class '<em>Work Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Sequence</em>'.
   * @generated
   */
  WorkSequence createWorkSequence();

  /**
   * Returns a new object of class '<em>Guidance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guidance</em>'.
   * @generated
   */
  Guidance createGuidance();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PDLXPackage getPDLXPackage();

} //PDLXFactory
