
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: BinaryExprType.java,v 1.1 2010/07/09 08:17:05 back Exp $
 */
package org.ralasafe.db.sql.xml;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class BinaryExprType.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:05 $
 */
public class BinaryExprType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _variable1.
     */
    private Variable1 _variable1;

    /**
     * Field _operator.
     */
    private Operator _operator;

    /**
     * Field _variable2.
     */
    private Variable2 _variable2;


    //----------------/
    //- Constructors -/
    //----------------/

    public BinaryExprType() {
        super();
    }


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'operator'.
     *
     * @return the value of field 'Operator'.
     */
    public Operator getOperator(
    ) {
        return this._operator;
    }

    /**
     * Returns the value of field 'variable1'.
     *
     * @return the value of field 'Variable1'.
     */
    public Variable1 getVariable1(
    ) {
        return this._variable1;
    }

    /**
     * Returns the value of field 'variable2'.
     *
     * @return the value of field 'Variable2'.
     */
    public Variable2 getVariable2(
    ) {
        return this._variable2;
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
     * Sets the value of field 'operator'.
     *
     * @param operator the value of field 'operator'.
     */
    public void setOperator(
            final Operator operator) {
        this._operator = operator;
    }

    /**
     * Sets the value of field 'variable1'.
     *
     * @param variable1 the value of field 'variable1'.
     */
    public void setVariable1(
            final Variable1 variable1) {
        this._variable1 = variable1;
    }

    /**
     * Sets the value of field 'variable2'.
     *
     * @param variable2 the value of field 'variable2'.
     */
    public void setVariable2(
            final Variable2 variable2) {
        this._variable2 = variable2;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @return the unmarshaled org.ralasafe.db.sql.xml.BinaryExprType
     * @throws org.exolab.castor.xml.MarshalException
     *          if object is
     *          null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public static BinaryExprType unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (BinaryExprType) Unmarshaller.unmarshal(BinaryExprType.class, reader);
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
