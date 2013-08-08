
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: StoredProcedureType.java,v 1.1 2010/07/09 08:17:06 back Exp $
 */
package org.ralasafe.db.sql.xml;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class StoredProcedureType.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:06 $
 */
public class StoredProcedureType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parameterList.
     */
    private java.util.Vector _parameterList;

    /**
     * Field _content.
     */
    private String _content;

    /**
     * Field _select.
     */
    private Select _select;


    //----------------/
    //- Constructors -/
    //----------------/

    public StoredProcedureType() {
        super();
        this._parameterList = new java.util.Vector();
    }


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * @param vParameter
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public void addParameter(
            final Parameter vParameter)
            throws IndexOutOfBoundsException {
        this._parameterList.addElement(vParameter);
    }

    /**
     * @param index
     * @param vParameter
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final Parameter vParameter)
            throws IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * Method enumerateParameter.
     *
     * @return an Enumeration over all
     *         org.ralasafe.db.sql.xml.Parameter elements
     */
    public java.util.Enumeration enumerateParameter(
    ) {
        return this._parameterList.elements();
    }

    /**
     * Returns the value of field 'content'.
     *
     * @return the value of field 'Content'.
     */
    public String getContent(
    ) {
        return this._content;
    }

    /**
     * Method getParameter.
     *
     * @param index
     * @return the value of the org.ralasafe.db.sql.xml.Parameter at
     *         the given index
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public Parameter getParameter(
            final int index)
            throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        return (Parameter) _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public Parameter[] getParameter(
    ) {
        Parameter[] array = new Parameter[0];
        return (Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCount.
     *
     * @return the size of this collection
     */
    public int getParameterCount(
    ) {
        return this._parameterList.size();
    }

    /**
     * Returns the value of field 'select'.
     *
     * @return the value of field 'Select'.
     */
    public Select getSelect(
    ) {
        return this._select;
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
     */
    public void removeAllParameter(
    ) {
        this._parameterList.clear();
    }

    /**
     * Method removeParameter.
     *
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public Parameter removeParameterAt(
            final int index) {
        Object obj = this._parameterList.remove(index);
        return (Parameter) obj;
    }

    /**
     * Sets the value of field 'content'.
     *
     * @param content the value of field 'content'.
     */
    public void setContent(
            final String content) {
        this._content = content;
    }

    /**
     * @param index
     * @param vParameter
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final Parameter vParameter)
            throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        this._parameterList.set(index, vParameter);
    }

    /**
     * @param vParameterArray
     */
    public void setParameter(
            final Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();

        for (int i = 0; i < vParameterArray.length; i++) {
            this._parameterList.add(vParameterArray[i]);
        }
    }

    /**
     * Sets the value of field 'select'.
     *
     * @param select the value of field 'select'.
     */
    public void setSelect(
            final Select select) {
        this._select = select;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @return the unmarshaled
     *         org.ralasafe.db.sql.xml.StoredProcedureType
     * @throws org.exolab.castor.xml.MarshalException
     *          if object is
     *          null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public static StoredProcedureType unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (StoredProcedureType) Unmarshaller.unmarshal(StoredProcedureType.class, reader);
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
