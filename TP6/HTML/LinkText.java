package TP6.HTML;

public class LinkText extends FormatText {
    private String link;

    public LinkText(HTMLText text, String link) {
        super(text);
        this.link = link;
    }

    @Override
    public String source() {
        return "<a href:" + String.format("\"www.%s\">", link) + text.source() + "</a>";
    }

}
