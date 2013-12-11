/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX.impl;

import fr.enseeiht.pDLX.Need;
import fr.enseeiht.pDLX.NeedSet;
import fr.enseeiht.pDLX.PDLXPackage;
import fr.enseeiht.pDLX.Ressource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.enseeiht.pDLX.impl.NeedImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.impl.NeedImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.impl.NeedImpl#getNeedSet <em>Need Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeedImpl extends ProcessElementImpl implements Need
{
  /**
   * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRessource()
   * @generated
   * @ordered
   */
  protected Ressource ressource;

  /**
   * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected static final int QUANTITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantity()
   * @generated
   * @ordered
   */
  protected int quantity = QUANTITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getNeedSet() <em>Need Set</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeedSet()
   * @generated
   * @ordered
   */
  protected NeedSet needSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeedImpl()
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
    return PDLXPackage.Literals.NEED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ressource getRessource()
  {
    if (ressource != null && ressource.eIsProxy())
    {
      InternalEObject oldRessource = (InternalEObject)ressource;
      ressource = (Ressource)eResolveProxy(oldRessource);
      if (ressource != oldRessource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDLXPackage.NEED__RESSOURCE, oldRessource, ressource));
      }
    }
    return ressource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ressource basicGetRessource()
  {
    return ressource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRessource(Ressource newRessource)
  {
    Ressource oldRessource = ressource;
    ressource = newRessource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDLXPackage.NEED__RESSOURCE, oldRessource, ressource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getQuantity()
  {
    return quantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantity(int newQuantity)
  {
    int oldQuantity = quantity;
    quantity = newQuantity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDLXPackage.NEED__QUANTITY, oldQuantity, quantity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeedSet getNeedSet()
  {
    if (needSet != null && needSet.eIsProxy())
    {
      InternalEObject oldNeedSet = (InternalEObject)needSet;
      needSet = (NeedSet)eResolveProxy(oldNeedSet);
      if (needSet != oldNeedSet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDLXPackage.NEED__NEED_SET, oldNeedSet, needSet));
      }
    }
    return needSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeedSet basicGetNeedSet()
  {
    return needSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeedSet(NeedSet newNeedSet)
  {
    NeedSet oldNeedSet = needSet;
    needSet = newNeedSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDLXPackage.NEED__NEED_SET, oldNeedSet, needSet));
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
      case PDLXPackage.NEED__RESSOURCE:
        if (resolve) return getRessource();
        return basicGetRessource();
      case PDLXPackage.NEED__QUANTITY:
        return getQuantity();
      case PDLXPackage.NEED__NEED_SET:
        if (resolve) return getNeedSet();
        return basicGetNeedSet();
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
      case PDLXPackage.NEED__RESSOURCE:
        setRessource((Ressource)newValue);
        return;
      case PDLXPackage.NEED__QUANTITY:
        setQuantity((Integer)newValue);
        return;
      case PDLXPackage.NEED__NEED_SET:
        setNeedSet((NeedSet)newValue);
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
      case PDLXPackage.NEED__RESSOURCE:
        setRessource((Ressource)null);
        return;
      case PDLXPackage.NEED__QUANTITY:
        setQuantity(QUANTITY_EDEFAULT);
        return;
      case PDLXPackage.NEED__NEED_SET:
        setNeedSet((NeedSet)null);
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
      case PDLXPackage.NEED__RESSOURCE:
        return ressource != null;
      case PDLXPackage.NEED__QUANTITY:
        return quantity != QUANTITY_EDEFAULT;
      case PDLXPackage.NEED__NEED_SET:
        return needSet != null;
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
    result.append(" (quantity: ");
    result.append(quantity);
    result.append(')');
    return result.toString();
  }

} //NeedImpl
