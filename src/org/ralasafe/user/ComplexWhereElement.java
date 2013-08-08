package org.ralasafe.user;

public class ComplexWhereElement implements WhereElement {
    private WhereElement firstPart;
    private LWhereElement[] linkedParts;

    public WhereElement getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(WhereElement firstPart) {
        this.firstPart = firstPart;
    }

    public LWhereElement[] getLinkedParts() {
        return linkedParts;
    }

    public void setLinkedParts(LWhereElement[] linkedParts) {
        this.linkedParts = linkedParts;
    }
}
