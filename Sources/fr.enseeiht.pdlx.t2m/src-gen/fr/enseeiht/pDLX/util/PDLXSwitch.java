/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX.util;

import fr.enseeiht.pDLX.Guidance;
import fr.enseeiht.pDLX.Need;
import fr.enseeiht.pDLX.NeedSet;
import fr.enseeiht.pDLX.PDLXPackage;
import fr.enseeiht.pDLX.ProcessElement;
import fr.enseeiht.pDLX.Ressource;
import fr.enseeiht.pDLX.WorkDefinition;
import fr.enseeiht.pDLX.WorkSequence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pDLX.PDLXPackage
 * @generated
 */
public class PDLXSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PDLXPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDLXSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PDLXPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PDLXPackage.PROCESS:
      {
        fr.enseeiht.pDLX.Process process = (fr.enseeiht.pDLX.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.PROCESS_ELEMENT:
      {
        ProcessElement processElement = (ProcessElement)theEObject;
        T result = caseProcessElement(processElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.WORK_DEFINITION:
      {
        WorkDefinition workDefinition = (WorkDefinition)theEObject;
        T result = caseWorkDefinition(workDefinition);
        if (result == null) result = caseProcessElement(workDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.RESSOURCE:
      {
        Ressource ressource = (Ressource)theEObject;
        T result = caseRessource(ressource);
        if (result == null) result = caseProcessElement(ressource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.NEED:
      {
        Need need = (Need)theEObject;
        T result = caseNeed(need);
        if (result == null) result = caseProcessElement(need);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.NEED_SET:
      {
        NeedSet needSet = (NeedSet)theEObject;
        T result = caseNeedSet(needSet);
        if (result == null) result = caseProcessElement(needSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.WORK_SEQUENCE:
      {
        WorkSequence workSequence = (WorkSequence)theEObject;
        T result = caseWorkSequence(workSequence);
        if (result == null) result = caseProcessElement(workSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PDLXPackage.GUIDANCE:
      {
        Guidance guidance = (Guidance)theEObject;
        T result = caseGuidance(guidance);
        if (result == null) result = caseProcessElement(guidance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(fr.enseeiht.pDLX.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessElement(ProcessElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkDefinition(WorkDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRessource(Ressource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Need</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Need</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeed(Need object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Need Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Need Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeedSet(NeedSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkSequence(WorkSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guidance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guidance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuidance(Guidance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PDLXSwitch
