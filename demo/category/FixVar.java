package category;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午3:26
 * To change this template use File | Settings | File Templates.
 */
public class FixVar implements Variable {
    private String name;
    private VarType type;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FixVar{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }

    public enum VarType {
        STRING("String"), INTEGER("Integer"), FLOAT("Float"), BOOLEAN("Boolean"), DATETIME("Datetime");
        private String value;

        private VarType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static VarType getType(String value) {
            for (VarType type : VarType.values()) {
                if (type.getValue().equalsIgnoreCase(value))
                    return type;
            }
            return null;
        }

        @Override
        public String toString() {
            return "VarType{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

}
