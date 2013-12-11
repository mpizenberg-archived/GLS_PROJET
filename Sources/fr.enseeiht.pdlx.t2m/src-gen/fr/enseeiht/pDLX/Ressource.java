/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDLX.Ressource#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.Ressource#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDLX.PDLXPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.pDLX.PDLXPackage#getRessource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.Ressource#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see fr.enseeiht.pDLX.PDLXPackage#getRessource_Quantity()
   * @model
   * @generated
   */
  int getQuantity();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.Ressource#getQuantity <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' attribute.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(int value);

} // Ressource
