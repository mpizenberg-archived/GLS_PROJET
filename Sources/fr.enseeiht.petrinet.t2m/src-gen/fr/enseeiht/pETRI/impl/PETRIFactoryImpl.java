/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pETRI.impl;

import fr.enseeiht.pETRI.*;

import org.eclipse.emf.ecore.EClass;
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
public class PETRIFactoryImpl extends EFactoryImpl implements PETRIFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PETRIFactory init()
  {
    try
    {
      PETRIFactory thePETRIFactory = (PETRIFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.enseeiht.fr/PETRI"); 
      if (thePETRIFactory != null)
      {
        return thePETRIFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PETRIFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PETRIFactoryImpl()
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
      case PETRIPackage.PETRI_NET: return createPetriNet();
      case PETRIPackage.PETRI_NET_ELEMENT: return createPetriNetElement();
      case PETRIPackage.NODE: return createNode();
      case PETRIPackage.PLACE: return createPlace();
      case PETRIPackage.TRANSITION: return createTransition();
      case PETRIPackage.ARC: return createArc();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetriNet createPetriNet()
  {
    PetriNetImpl petriNet = new PetriNetImpl();
    return petriNet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetriNetElement createPetriNetElement()
  {
    PetriNetElementImpl petriNetElement = new PetriNetElementImpl();
    return petriNetElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place createPlace()
  {
    PlaceImpl place = new PlaceImpl();
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arc createArc()
  {
    ArcImpl arc = new ArcImpl();
    return arc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PETRIPackage getPETRIPackage()
  {
    return (PETRIPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PETRIPackage getPackage()
  {
    return PETRIPackage.eINSTANCE;
  }

} //PETRIFactoryImpl
