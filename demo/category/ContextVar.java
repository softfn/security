package category;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午3:43
 * To change this template use File | Settings | File Templates.
 */
public class ContextVar implements Variable {
    private String name;
    private String key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ContextVar{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
