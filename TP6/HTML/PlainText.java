package TP6.HTML;

public class PlainText implements HTMLText {

    private String content;

    public PlainText(String content){
        this.content = content;
    }

    public String source() {
        return content;
    }

    public void setText(String text){
        content = text;
    }

    @Override
    public String toString() {
        return source();
    }
}
