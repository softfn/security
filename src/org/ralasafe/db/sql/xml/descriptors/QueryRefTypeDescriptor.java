
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: QueryRefTypeDescriptor.java,v 1.1 2010/07/09 08:17:19 back Exp $
 */
package org.ralasafe.db.sql.xml.descriptors;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.ralasafe.db.sql.xml.QueryRefType;

/**
 * Class QueryRefTypeDescriptor.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:19 $
 */
public class QueryRefTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public QueryRefTypeDescriptor() {
        super();
        _xmlName = "QueryRefType";
        _elementDefinition = false;
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
        org.exolab.castor.mapping.FieldHandler handler = null;
        org.exolab.castor.xml.FieldValidator fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _id
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(Integer.TYPE, "_id", "id", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryRefType target = (QueryRefType) object;
                if (!target.hasId()) {
                    return null;
                }
                return new Integer(target.getId());
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryRefType target = (QueryRefType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteId();
                        return;
                    }
                    target.setId(((Integer) value).intValue());
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("int");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _id
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _name
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_name", "name", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                QueryRefType target = (QueryRefType) object;
                return target.getName();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    QueryRefType target = (QueryRefType) object;
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
        //-- initialize element descriptors

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
        return org.ralasafe.db.sql.xml.QueryRefType.class;
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
