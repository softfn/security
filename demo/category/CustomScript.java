package category;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午3:11
 * To change this template use File | Settings | File Templates.
 */
public class CustomScript implements Serializable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CustomScript{" +
                "content='" + content + '\'' +
                '}';
    }
}
