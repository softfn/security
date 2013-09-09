package category;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午2:52
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class UserCategory implements Serializable {
    private String name;
    private List<Variable> variables = new ArrayList<Variable>();
    private ExprGroup exprGroup;
    private CustomScript customScript;

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    @XmlElement
    public ExprGroup getExprGroup() {
        return exprGroup;
    }

    public void setExprGroup(ExprGroup exprGroup) {
        this.exprGroup = exprGroup;
    }

    @XmlElement
    public CustomScript getCustomScript() {
        return customScript;
    }

    public void setCustomScript(CustomScript customScript) {
        this.customScript = customScript;
    }

    @Override
    public String toString() {
        return "UserCategory{" +
                "name='" + name + '\'' +
                ", variables=" + variables +
                ", exprGroup=" + exprGroup +
                ", customScript=" + customScript +
                '}';
    }
}
