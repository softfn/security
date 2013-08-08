
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: QueryTypeDescriptor.java,v 1.1 2010/07/09 08:17:18 back Exp $
 */
package org.ralasafe.db.sql.xml.descriptors;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.ralasafe.db.sql.xml.QueryType;

/**
 * Class QueryTypeDescriptor.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:18 $
 */
public class QueryTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private String _nsURI;

    /**
     * Field _xmlName.
     */
    private String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


    //----------------/
    //- Constructors -/
    //----------------/

    public QueryTypeDescriptor() {
        super();
        _xmlName = "QueryType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
        org.exolab.castor.mapping.FieldHandler handler = null;
        org.exolab.castor.xml.FieldValidator fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _name
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_name", "name", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                return target.getName();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    target.setName((String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _name
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _ds
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_ds", "ds", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                return target.getDs();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    target.setDs((String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _ds
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _isRawSQL
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(Boolean.TYPE, "_isRawSQL", "isRawSQL", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                if (!target.hasIsRawSQL()) {
                    return null;
                }
                return (target.getIsRawSQL() ? Boolean.TRUE : Boolean.FALSE);
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteIsRawSQL();
                        return;
                    }
                    target.setIsRawSQL(((Boolean) value).booleanValue());
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _isRawSQL
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _isStoredProcedure
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(Boolean.TYPE, "_isStoredProcedure", "isStoredProcedure", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                if (!target.hasIsStoredProcedure()) {
                    return null;
                }
                return (target.getIsStoredProcedure() ? Boolean.TRUE : Boolean.FALSE);
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteIsStoredProcedure();
                        return;
                    }
                    target.setIsStoredProcedure(((Boolean) value).booleanValue());
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _isStoredProcedure
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _type
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.types.QueryTypeTypeType.class, "_type", "type", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                return target.getType();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    target.setType((org.ralasafe.db.sql.xml.types.QueryTypeTypeType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.ralasafe.db.sql.xml.types.QueryTypeTypeType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("QueryTypeTypeType");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _type
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _queryTypeSequence
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.QueryTypeSequence.class, "_queryTypeSequence", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                return target.getQueryTypeSequence();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    target.setQueryTypeSequence((org.ralasafe.db.sql.xml.QueryTypeSequence) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.QueryTypeSequence();
            }
        };
        desc.setSchemaType("org.ralasafe.db.sql.xml.QueryTypeSequence");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.ralasafe.db.sql.xml.descriptors.QueryTypeSequenceDescriptor());
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _queryTypeSequence
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _rawSQL
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.RawSQL.class, "_rawSQL", "rawSQL", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                return target.getRawSQL();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    target.setRawSQL((org.ralasafe.db.sql.xml.RawSQL) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.RawSQL();
            }
        };
        desc.setSchemaType("org.ralasafe.db.sql.xml.RawSQL");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _rawSQL
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _storedProcedure
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.StoredProcedure.class, "_storedProcedure", "storedProcedure", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryType target = (QueryType) object;
                return target.getStoredProcedure();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryType target = (QueryType) object;
                    target.setStoredProcedure((org.ralasafe.db.sql.xml.StoredProcedure) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.StoredProcedure();
            }
        };
        desc.setSchemaType("org.ralasafe.db.sql.xml.StoredProcedure");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _storedProcedure
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     *
     * @return the access mode specified for this class.
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     *
     * @return the identity field, null if this class has no
     *         identity.
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     *
     * @return the Java class represented by this descriptor.
     */
    public Class getJavaClass(
    ) {
        return org.ralasafe.db.sql.xml.QueryType.class;
    }

    /**
     * Method getNameSpacePrefix.
     *
     * @return the namespace prefix to use when marshaling as XML.
     */
    public String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     *
     * @return the namespace URI used when marshaling and
     *         unmarshaling as XML.
     */
    public String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     *
     * @return a specific validator for the class described by this
     *         ClassDescriptor.
     */
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     *
     * @return the XML Name for the Class being described.
     */
    public String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     *
     * @return true if XML schema definition of this Class is that
     *         of a global
     *         element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
