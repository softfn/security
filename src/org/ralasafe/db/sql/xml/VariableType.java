
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: VariableType.java,v 1.2 2010/07/29 02:41:59 back Exp $
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
public class VariableType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private String _name;


    //----------------/
    //- Constructors -/
    //----------------/

    public VariableType() {
        super();
    }


    //-----------/
    //- Methods -/
    //-----------/

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
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final String name) {
        this._name = name;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @return the unmarshaled org.ralasafe.db.sql.xml.VariableType
     * @throws org.exolab.castor.xml.MarshalException
     *          if object is
     *          null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public static VariableType unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (VariableType) Unmarshaller.unmarshal(VariableType.class, reader);
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
