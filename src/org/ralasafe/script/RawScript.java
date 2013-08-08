package org.ralasafe.script;

public class RawScript {
    private String content = "";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toScript() {
        return content;
    }
}
