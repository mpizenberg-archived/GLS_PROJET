/**
 * <copyright>
 * </copyright>
 *
 */
package fr.enseeiht.pDLX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDLX.NeedSet#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pDLX.NeedSet#getWd <em>Wd</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDLX.PDLXPackage#getNeedSet()
 * @model
 * @generated
 */
public interface NeedSet extends ProcessElement
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
   * @see fr.enseeiht.pDLX.PDLXPackage#getNeedSet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.NeedSet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Wd</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wd</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wd</em>' reference.
   * @see #setWd(WorkDefinition)
   * @see fr.enseeiht.pDLX.PDLXPackage#getNeedSet_Wd()
   * @model
   * @generated
   */
  WorkDefinition getWd();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDLX.NeedSet#getWd <em>Wd</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wd</em>' reference.
   * @see #getWd()
   * @generated
   */
  void setWd(WorkDefinition value);

} // NeedSet
