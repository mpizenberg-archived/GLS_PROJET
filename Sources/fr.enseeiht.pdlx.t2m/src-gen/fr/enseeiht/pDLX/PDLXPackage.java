/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pDLX.PDLXFactory
 * @model kind="package"
 * @generated
 */
public interface PDLXPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pDLX";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.enseeiht.fr/PDLX";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pDLX";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDLXPackage eINSTANCE = fr.enseeiht.pDLX.impl.PDLXPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.ProcessImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.ProcessElementImpl <em>Process Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.ProcessElementImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getProcessElement()
   * @generated
   */
  int PROCESS_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Process Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.WorkDefinitionImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getWorkDefinition()
   * @generated
   */
  int WORK_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Work Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.RessourceImpl <em>Ressource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.RessourceImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getRessource()
   * @generated
   */
  int RESSOURCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__QUANTITY = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ressource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.NeedImpl <em>Need</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.NeedImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getNeed()
   * @generated
   */
  int NEED = 4;

  /**
   * The feature id for the '<em><b>Ressource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__RESSOURCE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__QUANTITY = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Need Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__NEED_SET = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Need</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.NeedSetImpl <em>Need Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.NeedSetImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getNeedSet()
   * @generated
   */
  int NEED_SET = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED_SET__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wd</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED_SET__WD = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Need Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED_SET_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.WorkSequenceImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getWorkSequence()
   * @generated
   */
  int WORK_SEQUENCE = 6;

  /**
   * The feature id for the '<em><b>Link Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__LINK_TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__PREDECESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__SUCCESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Work Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.impl.GuidanceImpl <em>Guidance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.impl.GuidanceImpl
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getGuidance()
   * @generated
   */
  int GUIDANCE = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TEXT = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Guidance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDLX.WorkSequenceType <em>Work Sequence Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDLX.WorkSequenceType
   * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getWorkSequenceType()
   * @generated
   */
  int WORK_SEQUENCE_TYPE = 8;


  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see fr.enseeiht.pDLX.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pDLX.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.enseeiht.pDLX.Process#getProcessElements <em>Process Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Elements</em>'.
   * @see fr.enseeiht.pDLX.Process#getProcessElements()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessElements();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Element</em>'.
   * @see fr.enseeiht.pDLX.ProcessElement
   * @generated
   */
  EClass getProcessElement();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Definition</em>'.
   * @see fr.enseeiht.pDLX.WorkDefinition
   * @generated
   */
  EClass getWorkDefinition();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.WorkDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pDLX.WorkDefinition#getName()
   * @see #getWorkDefinition()
   * @generated
   */
  EAttribute getWorkDefinition_Name();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.Ressource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ressource</em>'.
   * @see fr.enseeiht.pDLX.Ressource
   * @generated
   */
  EClass getRessource();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.Ressource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pDLX.Ressource#getName()
   * @see #getRessource()
   * @generated
   */
  EAttribute getRessource_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.Ressource#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantity</em>'.
   * @see fr.enseeiht.pDLX.Ressource#getQuantity()
   * @see #getRessource()
   * @generated
   */
  EAttribute getRessource_Quantity();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.Need <em>Need</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Need</em>'.
   * @see fr.enseeiht.pDLX.Need
   * @generated
   */
  EClass getNeed();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDLX.Need#getRessource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ressource</em>'.
   * @see fr.enseeiht.pDLX.Need#getRessource()
   * @see #getNeed()
   * @generated
   */
  EReference getNeed_Ressource();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.Need#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantity</em>'.
   * @see fr.enseeiht.pDLX.Need#getQuantity()
   * @see #getNeed()
   * @generated
   */
  EAttribute getNeed_Quantity();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDLX.Need#getNeedSet <em>Need Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Need Set</em>'.
   * @see fr.enseeiht.pDLX.Need#getNeedSet()
   * @see #getNeed()
   * @generated
   */
  EReference getNeed_NeedSet();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.NeedSet <em>Need Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Need Set</em>'.
   * @see fr.enseeiht.pDLX.NeedSet
   * @generated
   */
  EClass getNeedSet();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.NeedSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pDLX.NeedSet#getName()
   * @see #getNeedSet()
   * @generated
   */
  EAttribute getNeedSet_Name();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDLX.NeedSet#getWd <em>Wd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wd</em>'.
   * @see fr.enseeiht.pDLX.NeedSet#getWd()
   * @see #getNeedSet()
   * @generated
   */
  EReference getNeedSet_Wd();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Sequence</em>'.
   * @see fr.enseeiht.pDLX.WorkSequence
   * @generated
   */
  EClass getWorkSequence();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.WorkSequence#getLinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Type</em>'.
   * @see fr.enseeiht.pDLX.WorkSequence#getLinkType()
   * @see #getWorkSequence()
   * @generated
   */
  EAttribute getWorkSequence_LinkType();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDLX.WorkSequence#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see fr.enseeiht.pDLX.WorkSequence#getPredecessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Predecessor();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDLX.WorkSequence#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Successor</em>'.
   * @see fr.enseeiht.pDLX.WorkSequence#getSuccessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Successor();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDLX.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance</em>'.
   * @see fr.enseeiht.pDLX.Guidance
   * @generated
   */
  EClass getGuidance();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDLX.Guidance#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.enseeiht.pDLX.Guidance#getText()
   * @see #getGuidance()
   * @generated
   */
  EAttribute getGuidance_Text();

  /**
   * Returns the meta object for enum '{@link fr.enseeiht.pDLX.WorkSequenceType <em>Work Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Work Sequence Type</em>'.
   * @see fr.enseeiht.pDLX.WorkSequenceType
   * @generated
   */
  EEnum getWorkSequenceType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PDLXFactory getPDLXFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.ProcessImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS_ELEMENTS = eINSTANCE.getProcess_ProcessElements();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.ProcessElementImpl <em>Process Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.ProcessElementImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getProcessElement()
     * @generated
     */
    EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.WorkDefinitionImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getWorkDefinition()
     * @generated
     */
    EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.RessourceImpl <em>Ressource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.RessourceImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getRessource()
     * @generated
     */
    EClass RESSOURCE = eINSTANCE.getRessource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESSOURCE__NAME = eINSTANCE.getRessource_Name();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESSOURCE__QUANTITY = eINSTANCE.getRessource_Quantity();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.NeedImpl <em>Need</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.NeedImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getNeed()
     * @generated
     */
    EClass NEED = eINSTANCE.getNeed();

    /**
     * The meta object literal for the '<em><b>Ressource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEED__RESSOURCE = eINSTANCE.getNeed_Ressource();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEED__QUANTITY = eINSTANCE.getNeed_Quantity();

    /**
     * The meta object literal for the '<em><b>Need Set</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEED__NEED_SET = eINSTANCE.getNeed_NeedSet();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.NeedSetImpl <em>Need Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.NeedSetImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getNeedSet()
     * @generated
     */
    EClass NEED_SET = eINSTANCE.getNeedSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEED_SET__NAME = eINSTANCE.getNeedSet_Name();

    /**
     * The meta object literal for the '<em><b>Wd</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEED_SET__WD = eINSTANCE.getNeedSet_Wd();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.WorkSequenceImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getWorkSequence()
     * @generated
     */
    EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

    /**
     * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE__LINK_TYPE = eINSTANCE.getWorkSequence_LinkType();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.impl.GuidanceImpl <em>Guidance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.impl.GuidanceImpl
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getGuidance()
     * @generated
     */
    EClass GUIDANCE = eINSTANCE.getGuidance();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUIDANCE__TEXT = eINSTANCE.getGuidance_Text();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDLX.WorkSequenceType <em>Work Sequence Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDLX.WorkSequenceType
     * @see fr.enseeiht.pDLX.impl.PDLXPackageImpl#getWorkSequenceType()
     * @generated
     */
    EEnum WORK_SEQUENCE_TYPE = eINSTANCE.getWorkSequenceType();

  }

} //PDLXPackage
