package TP6.HTML;

public class BoldText extends FormatText{

    public BoldText(HTMLText text) {
        super(text);
    }

    @Override
    public String source() {
        return  "<b>"+text.source()+"</b>";
    }
}
