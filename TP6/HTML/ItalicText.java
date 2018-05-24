package TP6.HTML;

public class ItalicText extends FormatText{

    public ItalicText(HTMLText text) {
        super(text);
    }

    @Override
    public String source() {
        return "<i>"+this.text+"</i>";
    }
}
