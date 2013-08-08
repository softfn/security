
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: ExprGroupTypeDescriptor.java,v 1.1 2010/07/09 08:17:20 back Exp $
 */
package org.ralasafe.db.sql.xml.descriptors;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.ralasafe.db.sql.xml.ExprGroupType;

/**
 * Class ExprGroupTypeDescriptor.
 *
 * @version $Revision: 1.1 $ $Date: 2010/07/09 08:17:20 $
 */
public class ExprGroupTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public ExprGroupTypeDescriptor() {
        super();
        _xmlName = "ExprGroupType";
        _elementDefinition = false;
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
        org.exolab.castor.mapping.FieldHandler handler = null;
        org.exolab.castor.xml.FieldValidator fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _linker
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.types.LinkerType.class, "_linker", "linker", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                ExprGroupType target = (ExprGroupType) object;
                return target.getLinker();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    ExprGroupType target = (ExprGroupType) object;
                    target.setLinker((org.ralasafe.db.sql.xml.types.LinkerType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return null;
            }
        };
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.ralasafe.db.sql.xml.types.LinkerType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("LinkerType");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _linker
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _items
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.ralasafe.db.sql.xml.ExprGroupTypeItem.class, "_items", (String) null, org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue(Object object)
                    throws IllegalStateException {
                ExprGroupType target = (ExprGroupType) object;
                return target.getExprGroupTypeItem();
            }

            public void setValue(Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException {
                try {
                    ExprGroupType target = (ExprGroupType) object;
                    target.addExprGroupTypeItem((org.ralasafe.db.sql.xml.ExprGroupTypeItem) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ExprGroupType target = (ExprGroupType) object;
                    target.removeAllExprGroupTypeItem();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }

            public Object newInstance(Object parent) {
                return new org.ralasafe.db.sql.xml.ExprGroupTypeItem();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.ralasafe.db.sql.xml.ExprGroupTypeItem");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.ralasafe.db.sql.xml.descriptors.ExprGroupTypeItemDescriptor());
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _items
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
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
        return org.ralasafe.db.sql.xml.ExprGroupType.class;
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
