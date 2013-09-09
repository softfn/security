package category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public class ExprGroup implements Expression {
    private List<Expression> expressions = new ArrayList<Expression>();
    private LinkSign linker;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public LinkSign getLinker() {
        return linker;
    }

    public void setLinker(LinkSign linker) {
        this.linker = linker;
    }

    @Override
    public String toString() {
        return "ExprGroup{" +
                "expressions=" + expressions +
                ", linker=" + linker +
                '}';
    }

    public enum LinkSign {
        AND("AND"), OR("OR");
        private String value;

        private LinkSign(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static LinkSign getLinkSign(String value) {
            for (LinkSign ls : LinkSign.values()) {
                if (ls.getValue().equalsIgnoreCase(value)) {
                    return ls;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "LinkSign{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }
}
