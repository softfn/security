
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: DefineVariableType.java,v 1.2 2010/07/29 02:41:59 back Exp $
 */
package org.ralasafe.db.sql.xml;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * @version $Revision: 1.2 $ $Date: 2010/07/29 02:41:59 $
 */
public class DefineVariableType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private String _name;

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * Field _simpleValue.
     */
    private SimpleValue _simpleValue;

    /**
     * Field _contextValue.
     */
    private ContextValue _contextValue;

    /**
     * Field _userValue.
     */
    private UserValue _userValue;

    /**
     * Field _hintValue.
     */
    private HintValue _hintValue;

    /**
     * Field _queryRef.
     */
    private QueryRef _queryRef;

    /**
     * Field _formula.
     */
    private Formula _formula;


    //----------------/
    //- Constructors -/
    //----------------/

    public DefineVariableType() {
        super();
    }


    //-----------/
    //- Methods -/
    //-----------/

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
     * Returns the value of field 'contextValue'.
     *
     * @return the value of field 'ContextValue'.
     */
    public ContextValue getContextValue(
    ) {
        return this._contextValue;
    }

    /**
     * Returns the value of field 'formula'.
     *
     * @return the value of field 'Formula'.
     */
    public Formula getFormula(
    ) {
        return this._formula;
    }

    /**
     * Returns the value of field 'hintValue'.
     *
     * @return the value of field 'HintValue'.
     */
    public HintValue getHintValue(
    ) {
        return this._hintValue;
    }

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'Name'.
     */
    public String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'queryRef'.
     *
     * @return the value of field 'QueryRef'.
     */
    public QueryRef getQueryRef(
    ) {
        return this._queryRef;
    }

    /**
     * Returns the value of field 'simpleValue'.
     *
     * @return the value of field 'SimpleValue'.
     */
    public SimpleValue getSimpleValue(
    ) {
        return this._simpleValue;
    }

    /**
     * Returns the value of field 'userValue'.
     *
     * @return the value of field 'UserValue'.
     */
    public UserValue getUserValue(
    ) {
        return this._userValue;
    }

    /**
     * Method isValid.
     *
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * @param out
     * @throws org.exolab.castor.xml.MarshalException
     *          if object is
     *          null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     *                             marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *                             if this
     *                             object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException
     *                             if object is
     *                             null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'contextValue'.
     *
     * @param contextValue the value of field 'contextValue'.
     */
    public void setContextValue(
            final ContextValue contextValue) {
        this._contextValue = contextValue;
        this._choiceValue = contextValue;
    }

    /**
     * Sets the value of field 'formula'.
     *
     * @param formula the value of field 'formula'.
     */
    public void setFormula(
            final Formula formula) {
        this._formula = formula;
        this._choiceValue = formula;
    }

    /**
     * Sets the value of field 'hintValue'.
     *
     * @param hintValue the value of field 'hintValue'.
     */
    public void setHintValue(
            final HintValue hintValue) {
        this._hintValue = hintValue;
        this._choiceValue = hintValue;
    }

    /**
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'queryRef'.
     *
     * @param queryRef the value of field 'queryRef'.
     */
    public void setQueryRef(
            final QueryRef queryRef) {
        this._queryRef = queryRef;
        this._choiceValue = queryRef;
    }

    /**
     * Sets the value of field 'simpleValue'.
     *
     * @param simpleValue the value of field 'simpleValue'.
     */
    public void setSimpleValue(
            final SimpleValue simpleValue) {
        this._simpleValue = simpleValue;
        this._choiceValue = simpleValue;
    }

    /**
     * Sets the value of field 'userValue'.
     *
     * @param userValue the value of field 'userValue'.
     */
    public void setUserValue(
            final UserValue userValue) {
        this._userValue = userValue;
        this._choiceValue = userValue;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @return the unmarshaled org.ralasafe.db.sql.xml.DefineVariableTyp
     * @throws org.exolab.castor.xml.MarshalException
     *          if object is
     *          null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public static DefineVariableType unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (DefineVariableType) Unmarshaller.unmarshal(DefineVariableType.class, reader);
    }

    /**
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public void validate(
    )
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
