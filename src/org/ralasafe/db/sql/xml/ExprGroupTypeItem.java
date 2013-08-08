
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: ExprGroupTypeItem.java,v 1.1 2010/07/09 08:17:07 back Exp $
 */
package org.ralasafe.db.sql.xml;

/**
 * Class ExprGroupTypeItem.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:07 $
 */
public class ExprGroupTypeItem implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * Field _binaryExpr.
     */
    private BinaryExpr _binaryExpr;

    /**
     * Field _inExpr.
     */
    private InExpr _inExpr;

    /**
     * Field _notInExpr.
     */
    private NotInExpr _notInExpr;

    /**
     * Field _isNullExpr.
     */
    private IsNullExpr _isNullExpr;

    /**
     * Field _isNotNullExpr.
     */
    private IsNotNullExpr _isNotNullExpr;

    /**
     * Field _exprGroup.
     */
    private ExprGroup _exprGroup;


    //----------------/
    //- Constructors -/
    //----------------/

    public ExprGroupTypeItem() {
        super();
    }


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'binaryExpr'.
     *
     * @return the value of field 'BinaryExpr'.
     */
    public BinaryExpr getBinaryExpr(
    ) {
        return this._binaryExpr;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     *
     * @return the value of field 'ChoiceValue'.
     */
    public Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'exprGroup'.
     *
     * @return the value of field 'ExprGroup'.
     */
    public ExprGroup getExprGroup(
    ) {
        return this._exprGroup;
    }

    /**
     * Returns the value of field 'inExpr'.
     *
     * @return the value of field 'InExpr'.
     */
    public InExpr getInExpr(
    ) {
        return this._inExpr;
    }

    /**
     * Returns the value of field 'isNotNullExpr'.
     *
     * @return the value of field 'IsNotNullExpr'.
     */
    public IsNotNullExpr getIsNotNullExpr(
    ) {
        return this._isNotNullExpr;
    }

    /**
     * Returns the value of field 'isNullExpr'.
     *
     * @return the value of field 'IsNullExpr'.
     */
    public IsNullExpr getIsNullExpr(
    ) {
        return this._isNullExpr;
    }

    /**
     * Returns the value of field 'notInExpr'.
     *
     * @return the value of field 'NotInExpr'.
     */
    public NotInExpr getNotInExpr(
    ) {
        return this._notInExpr;
    }

    /**
     * Sets the value of field 'binaryExpr'.
     *
     * @param binaryExpr the value of field 'binaryExpr'.
     */
    public void setBinaryExpr(
            final BinaryExpr binaryExpr) {
        this._binaryExpr = binaryExpr;
        this._choiceValue = binaryExpr;
    }

    /**
     * Sets the value of field 'exprGroup'.
     *
     * @param exprGroup the value of field 'exprGroup'.
     */
    public void setExprGroup(
            final ExprGroup exprGroup) {
        this._exprGroup = exprGroup;
        this._choiceValue = exprGroup;
    }

    /**
     * Sets the value of field 'inExpr'.
     *
     * @param inExpr the value of field 'inExpr'.
     */
    public void setInExpr(
            final InExpr inExpr) {
        this._inExpr = inExpr;
        this._choiceValue = inExpr;
    }

    /**
     * Sets the value of field 'isNotNullExpr'.
     *
     * @param isNotNullExpr the value of field 'isNotNullExpr'.
     */
    public void setIsNotNullExpr(
            final IsNotNullExpr isNotNullExpr) {
        this._isNotNullExpr = isNotNullExpr;
        this._choiceValue = isNotNullExpr;
    }

    /**
     * Sets the value of field 'isNullExpr'.
     *
     * @param isNullExpr the value of field 'isNullExpr'.
     */
    public void setIsNullExpr(
            final IsNullExpr isNullExpr) {
        this._isNullExpr = isNullExpr;
        this._choiceValue = isNullExpr;
    }

    /**
     * Sets the value of field 'notInExpr'.
     *
     * @param notInExpr the value of field 'notInExpr'.
     */
    public void setNotInExpr(
            final NotInExpr notInExpr) {
        this._notInExpr = notInExpr;
        this._choiceValue = notInExpr;
    }

}
