/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDLX.Need#getRessource <em>Ressource</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.Need#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.Need#getNeedSet <em>Need Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDLX.PDLXPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Ressource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ressource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ressource</em>' reference.
   * @see #setRessource(Ressource)
   * @see fr.enseeiht.pDLX.PDLXPackage#getNeed_Ressource()
   * @model
   * @generated
   */
  Ressource getRessource();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.Need#getRessource <em>Ressource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ressource</em>' reference.
   * @see #getRessource()
   * @generated
   */
  void setRessource(Ressource value);

  /**
   * Returns the value of the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' attribute.
   * @see #setQuantity(int)
   * @see fr.enseeiht.pDLX.PDLXPackage#getNeed_Quantity()
   * @model
   * @generated
   */
  int getQuantity();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.Need#getQuantity <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' attribute.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(int value);

  /**
   * Returns the value of the '<em><b>Need Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Need Set</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Need Set</em>' reference.
   * @see #setNeedSet(NeedSet)
   * @see fr.enseeiht.pDLX.PDLXPackage#getNeed_NeedSet()
   * @model
   * @generated
   */
  NeedSet getNeedSet();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.Need#getNeedSet <em>Need Set</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Need Set</em>' reference.
   * @see #getNeedSet()
   * @generated
   */
  void setNeedSet(NeedSet value);

} // Need
