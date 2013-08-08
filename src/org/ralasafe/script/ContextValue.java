package org.ralasafe.script;

import org.ralasafe.SystemConstant;

public class ContextValue extends DefineVariable {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Script likes: Object v = context.get("key");
     */
    public String toScript() {
        String v = getVariableName();
        String context = SystemConstant.CONTEXT;
        StringBuffer buff = new StringBuffer();
        buff.append(" Object ").append(v).append(" = ").append(context)
                .append(".get(\"").append(key).append("\"); ").append(
                "\n");
        return buff.toString();
    }
}
