package org.ralasafe.user;


public class FieldWhereElement implements WhereElement {
    private String name;
    private Comparator compartor;
    private Object value;

    public Comparator getCompartor() {
        return compartor;
    }

    public void setCompartor(Comparator compartor) {
        this.compartor = compartor;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
