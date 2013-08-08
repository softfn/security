package org.ralasafe.db;

import org.ralasafe.ObjectNewer;

public class JavaBeanObjectNewer implements ObjectNewer {

    private Class clas;

    public JavaBeanObjectNewer(String className) {
        try {
            clas = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Object newObject() {
        try {
            return clas.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}