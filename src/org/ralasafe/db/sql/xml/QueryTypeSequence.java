/**
 * Copyright (c) 2004-2011 Wang Jinbao(Julian Wong), http://www.ralasafe.com
 * Licensed under the MIT license: http://www.opensource.org/licenses/mit-license.php
 */
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: QueryTypeSequence.java,v 1.1 2010/07/09 08:17:08 back Exp $
 */

package org.ralasafe.db.sql.xml;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class QueryTypeSequence.
 * 
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:08 $
 */
public class QueryTypeSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _select.
     */
    private Select _select;

    /**
     * Field _from.
     */
    private From _from;

    /**
     * Field _where.
     */
    private Where _where;

    /**
     * Field _groupBy.
     */
    private GroupBy _groupBy;

    /**
     * Field _orderBy.
     */
    private OrderBy _orderBy;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueryTypeSequence() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'from'.
     * 
     * @return the value of field 'From'.
     */
    public From getFrom(
    ) {
        return this._from;
    }

    /**
     * Returns the value of field 'groupBy'.
     * 
     * @return the value of field 'GroupBy'.
     */
    public GroupBy getGroupBy(
    ) {
        return this._groupBy;
    }

    /**
     * Returns the value of field 'orderBy'.
     * 
     * @return the value of field 'OrderBy'.
     */
    public OrderBy getOrderBy(
    ) {
        return this._orderBy;
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
     * Returns the value of field 'where'.
     * 
     * @return the value of field 'Where'.
     */
    public Where getWhere(
    ) {
        return this._where;
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
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'from'.
     * 
     * @param from the value of field 'from'.
     */
    public void setFrom(
            final From from) {
        this._from = from;
    }

    /**
     * Sets the value of field 'groupBy'.
     * 
     * @param groupBy the value of field 'groupBy'.
     */
    public void setGroupBy(
            final GroupBy groupBy) {
        this._groupBy = groupBy;
    }

    /**
     * Sets the value of field 'orderBy'.
     * 
     * @param orderBy the value of field 'orderBy'.
     */
    public void setOrderBy(
            final OrderBy orderBy) {
        this._orderBy = orderBy;
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
     * Sets the value of field 'where'.
     * 
     * @param where the value of field 'where'.
     */
    public void setWhere(
            final Where where) {
        this._where = where;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.ralasafe.db.sql.xml.QueryTypeSequence
     */
    public static QueryTypeSequence unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (QueryTypeSequence) Unmarshaller.unmarshal(QueryTypeSequence.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
