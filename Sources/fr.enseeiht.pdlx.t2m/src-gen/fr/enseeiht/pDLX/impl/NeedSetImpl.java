/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX.impl;

import fr.enseeiht.pDLX.NeedSet;
import fr.enseeiht.pDLX.PDLXPackage;
import fr.enseeiht.pDLX.WorkDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.enseeiht.pDLX.impl.NeedSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.impl.NeedSetImpl#getWd <em>Wd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeedSetImpl extends ProcessElementImpl implements NeedSet
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWd() <em>Wd</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWd()
   * @generated
   * @ordered
   */
  protected WorkDefinition wd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeedSetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDLXPackage.Literals.NEED_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDLXPackage.NEED_SET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition getWd()
  {
    if (wd != null && wd.eIsProxy())
    {
      InternalEObject oldWd = (InternalEObject)wd;
      wd = (WorkDefinition)eResolveProxy(oldWd);
      if (wd != oldWd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDLXPackage.NEED_SET__WD, oldWd, wd));
      }
    }
    return wd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition basicGetWd()
  {
    return wd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWd(WorkDefinition newWd)
  {
    WorkDefinition oldWd = wd;
    wd = newWd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDLXPackage.NEED_SET__WD, oldWd, wd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PDLXPackage.NEED_SET__NAME:
        return getName();
      case PDLXPackage.NEED_SET__WD:
        if (resolve) return getWd();
        return basicGetWd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDLXPackage.NEED_SET__NAME:
        setName((String)newValue);
        return;
      case PDLXPackage.NEED_SET__WD:
        setWd((WorkDefinition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PDLXPackage.NEED_SET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PDLXPackage.NEED_SET__WD:
        setWd((WorkDefinition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PDLXPackage.NEED_SET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PDLXPackage.NEED_SET__WD:
        return wd != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NeedSetImpl
