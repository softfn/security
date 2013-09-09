package category;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午4:44
 * To change this template use File | Settings | File Templates.
 */
public class BinaryExpr implements Expression {
    private String variable1;
    private BinaryOperator operator;
    private String variable2;

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    public void setOperator(BinaryOperator operator) {
        this.operator = operator;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    @Override
    public String toString() {
        return "BinaryExpr{" +
                "variable1='" + variable1 + '\'' +
                ", operator=" + operator +
                ", variable2='" + variable2 + '\'' +
                '}';
    }

    public enum BinaryOperator {
        EQ("="), NEQ("!="), GT("gt"), GTEQ(">="), LT("<"), LTEQ("<=");
        private String value;

        private BinaryOperator(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static BinaryOperator getBinaryOperator(String value) {
            for (BinaryOperator bo : BinaryOperator.values()) {
                if (bo.getValue().equalsIgnoreCase(value)) {
                    return bo;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "BinaryOperator{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

}
