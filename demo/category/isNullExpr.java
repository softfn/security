package category;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午5:08
 * To change this template use File | Settings | File Templates.
 */
public class IsNullExpr implements Expression {
    private String variable;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "IsNullExpr{" +
                "variable='" + variable + '\'' +
                '}';
    }
}
