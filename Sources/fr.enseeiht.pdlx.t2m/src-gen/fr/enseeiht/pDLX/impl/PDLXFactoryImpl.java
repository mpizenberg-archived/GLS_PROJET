/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX.impl;

import fr.enseeiht.pDLX.Guidance;
import fr.enseeiht.pDLX.Need;
import fr.enseeiht.pDLX.NeedSet;
import fr.enseeiht.pDLX.PDLXFactory;
import fr.enseeiht.pDLX.PDLXPackage;
import fr.enseeiht.pDLX.ProcessElement;
import fr.enseeiht.pDLX.Ressource;
import fr.enseeiht.pDLX.WorkDefinition;
import fr.enseeiht.pDLX.WorkSequence;
import fr.enseeiht.pDLX.WorkSequenceType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDLXFactoryImpl extends EFactoryImpl implements PDLXFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PDLXFactory init()
  {
    try
    {
      PDLXFactory thePDLXFactory = (PDLXFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.enseeiht.fr/PDLX"); 
      if (thePDLXFactory != null)
      {
        return thePDLXFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PDLXFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDLXFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PDLXPackage.PROCESS: return createProcess();
      case PDLXPackage.PROCESS_ELEMENT: return createProcessElement();
      case PDLXPackage.WORK_DEFINITION: return createWorkDefinition();
      case PDLXPackage.RESSOURCE: return createRessource();
      case PDLXPackage.NEED: return createNeed();
      case PDLXPackage.NEED_SET: return createNeedSet();
      case PDLXPackage.WORK_SEQUENCE: return createWorkSequence();
      case PDLXPackage.GUIDANCE: return createGuidance();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDLXPackage.WORK_SEQUENCE_TYPE:
        return createWorkSequenceTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDLXPackage.WORK_SEQUENCE_TYPE:
        return convertWorkSequenceTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.enseeiht.pDLX.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessElement createProcessElement()
  {
    ProcessElementImpl processElement = new ProcessElementImpl();
    return processElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition createWorkDefinition()
  {
    WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
    return workDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ressource createRessource()
  {
    RessourceImpl ressource = new RessourceImpl();
    return ressource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Need createNeed()
  {
    NeedImpl need = new NeedImpl();
    return need;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeedSet createNeedSet()
  {
    NeedSetImpl needSet = new NeedSetImpl();
    return needSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSequence createWorkSequence()
  {
    WorkSequenceImpl workSequence = new WorkSequenceImpl();
    return workSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guidance createGuidance()
  {
    GuidanceImpl guidance = new GuidanceImpl();
    return guidance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSequenceType createWorkSequenceTypeFromString(EDataType eDataType, String initialValue)
  {
    WorkSequenceType result = WorkSequenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWorkSequenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDLXPackage getPDLXPackage()
  {
    return (PDLXPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PDLXPackage getPackage()
  {
    return PDLXPackage.eINSTANCE;
  }

} //PDLXFactoryImpl
