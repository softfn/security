
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: BusinessDataTypeDescriptor.java,v 1.1 2010/07/09 08:17:19 back Exp $
 */
package org.ralasafe.db.sql.xml.descriptors;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.ralasafe.db.sql.xml.BusinessDataType;

/**
 * Class BusinessDataTypeDescriptor.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:19 $
 */
public class BusinessDataTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public BusinessDataTypeDescriptor() {
        super();
        _xmlName = "BusinessDataType";
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
                BusinessDataType target = (BusinessDataType) object;
                return target.getName();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    BusinessDataType target = (BusinessDataType) object;
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
        //-- _isRawScript
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(Boolean.TYPE, "_isRawScript", "isRawScript", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                BusinessDataType target = (BusinessDataType) object;
                if (!target.hasIsRawScript()) {
                    return null;
                }
                return (target.getIsRawScript() ? Boolean.TRUE : Boolean.FALSE);
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    BusinessDataType target = (BusinessDataType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteIsRawScript();
                        return;
                    }
                    target.setIsRawScript(((Boolean) value).booleanValue());
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

        //-- validation code for: _isRawScript
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _defineVariableList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.DefineVariable.class, "_defineVariableList", "defineVariable", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                BusinessDataType target = (BusinessDataType) object;
                return target.getDefineVariable();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    BusinessDataType target = (BusinessDataType) object;
                    target.addDefineVariable((org.ralasafe.db.sql.xml.DefineVariable) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    BusinessDataType target = (BusinessDataType) object;
                    target.removeAllDefineVariable();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.DefineVariable();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.ralasafe.db.sql.xml.DefineVariable");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _defineVariableList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _exprGroup
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.ExprGroup.class, "_exprGroup", "exprGroup", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                BusinessDataType target = (BusinessDataType) object;
                return target.getExprGroup();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    BusinessDataType target = (BusinessDataType) object;
                    target.setExprGroup((org.ralasafe.db.sql.xml.ExprGroup) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.ExprGroup();
            }
        };
        desc.setSchemaType("org.ralasafe.db.sql.xml.ExprGroup");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _exprGroup
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _rawScript
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.RawScript.class, "_rawScript", "rawScript", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                BusinessDataType target = (BusinessDataType) object;
                return target.getRawScript();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    BusinessDataType target = (BusinessDataType) object;
                    target.setRawScript((org.ralasafe.db.sql.xml.RawScript) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.RawScript();
            }
        };
        desc.setSchemaType("org.ralasafe.db.sql.xml.RawScript");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _rawScript
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
        return org.ralasafe.db.sql.xml.BusinessDataType.class;
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
