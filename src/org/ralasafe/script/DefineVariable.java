package org.ralasafe.script;

public abstract class DefineVariable implements Script {
    private String variableName;

    public final String getVariableName() {
        return variableName;
    }

    public final void setVariableName(String variableName) {
        this.variableName = variableName;
    }
}
