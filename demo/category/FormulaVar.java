package category;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
public class FormulaVar implements Variable {
    private String name;
    private String variable1;
    private PperatorType operator;
    private String variable2;
    private ReturnType returnType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public PperatorType getOperator() {
        return operator;
    }

    public void setOperator(PperatorType operator) {
        this.operator = operator;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return "FormulaVar{" +
                "name='" + name + '\'' +
                ", variable1='" + variable1 + '\'' +
                ", operator=" + operator +
                ", variable2='" + variable2 + '\'' +
                ", returnType=" + returnType +
                '}';
    }

    public enum PperatorType {
        ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");
        private String value;

        public String getValue() {
            return value;
        }

        private PperatorType(String value) {
            this.value = value;
        }

        public static PperatorType getPperatorType(String value) {
            for (PperatorType pt : PperatorType.values()) {
                if (pt.getValue().equalsIgnoreCase(value)) {
                    return pt;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "PperatorType{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public enum ReturnType {
        FLOAT("Float"), INTEGER("Integer");
        private String value;

        private ReturnType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static ReturnType getReturnType(String value) {
            for (ReturnType rt : ReturnType.values()) {
                if (rt.getValue().equalsIgnoreCase(value)) {
                    return rt;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "ReturnType{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }
}
