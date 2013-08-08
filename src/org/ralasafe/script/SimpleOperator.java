package org.ralasafe.script;

/**
 * Operators: =, !=, <=, <, >=, >
 */
public class SimpleOperator extends Operator {
    public String toScript() {
        StringBuffer buff = new StringBuffer();
        String operator = getValue();
        if (getValue().equals("=")) {
            operator = "==";
        }
        buff.append(" ").append(operator).append(" ");
        return buff.toString();
    }
}
