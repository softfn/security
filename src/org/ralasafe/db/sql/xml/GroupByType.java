
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: GroupByType.java,v 1.2 2010/07/29 02:41:59 back Exp $
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
public class GroupByType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _columnList.
     */
    private java.util.Vector _columnList;


    //----------------/
    //- Constructors -/
    //----------------/

    public GroupByType() {
        super();
        this._columnList = new java.util.Vector();
    }


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * @param vColumn
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public void addColumn(
            final Column vColumn)
            throws IndexOutOfBoundsException {
        this._columnList.addElement(vColumn);
    }

    /**
     * @param index
     * @param vColumn
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public void addColumn(
            final int index,
            final Column vColumn)
            throws IndexOutOfBoundsException {
        this._columnList.add(index, vColumn);
    }

    /**
     * Method enumerateColumn.
     *
     * @return an Enumeration over all org.ralasafe.db.sql.xml.Column
     *         elements
     */
    public java.util.Enumeration enumerateColumn(
    ) {
        return this._columnList.elements();
    }

    /**
     * Method getColumn.
     *
     * @param index
     * @return the value of the org.ralasafe.db.sql.xml.Column at the
     *         given index
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public Column getColumn(
            final int index)
            throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._columnList.size()) {
            throw new IndexOutOfBoundsException("getColumn: Index value '" + index + "' not in range [0.." + (this._columnList.size() - 1) + "]");
        }

        return (Column) _columnList.get(index);
    }

    /**
     * Method getColumn.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public Column[] getColumn(
    ) {
        Column[] array = new Column[0];
        return (Column[]) this._columnList.toArray(array);
    }

    /**
     * Method getColumnCount.
     *
     * @return the size of this collection
     */
    public int getColumnCount(
    ) {
        return this._columnList.size();
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
    public void removeAllColumn(
    ) {
        this._columnList.clear();
    }

    /**
     * Method removeColumn.
     *
     * @param vColumn
     * @return true if the object was removed from the collection.
     */
    public boolean removeColumn(
            final Column vColumn) {
        boolean removed = _columnList.remove(vColumn);
        return removed;
    }

    /**
     * Method removeColumnAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public Column removeColumnAt(
            final int index) {
        Object obj = this._columnList.remove(index);
        return (Column) obj;
    }

    /**
     * @param index
     * @param vColumn
     * @throws IndexOutOfBoundsException if the index
     *                                   given is outside the bounds of the collection
     */
    public void setColumn(
            final int index,
            final Column vColumn)
            throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._columnList.size()) {
            throw new IndexOutOfBoundsException("setColumn: Index value '" + index + "' not in range [0.." + (this._columnList.size() - 1) + "]");
        }

        this._columnList.set(index, vColumn);
    }

    /**
     * @param vColumnArray
     */
    public void setColumn(
            final Column[] vColumnArray) {
        //-- copy array
        _columnList.clear();

        for (int i = 0; i < vColumnArray.length; i++) {
            this._columnList.add(vColumnArray[i]);
        }
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @return the unmarshaled org.ralasafe.db.sql.xml.GroupByType
     * @throws org.exolab.castor.xml.MarshalException
     *          if object is
     *          null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException
     *          if this
     *          object is an invalid instance according to the schema
     */
    public static GroupByType unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (GroupByType) Unmarshaller.unmarshal(GroupByType.class, reader);
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
