package category;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public class QueryVar implements Variable {
    private String name;
    private String refId;
    private String refDesc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRefDesc() {
        return refDesc;
    }

    public void setRefDesc(String refDesc) {
        this.refDesc = refDesc;
    }

    @Override
    public String toString() {
        return "QueryVar{" +
                "name='" + name + '\'' +
                ", refId='" + refId + '\'' +
                ", refDesc='" + refDesc + '\'' +
                '}';
    }
}
