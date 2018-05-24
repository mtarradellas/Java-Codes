package TP6.HTML;

public abstract class FormatText implements HTMLText {
    protected HTMLText text;

    public FormatText(HTMLText text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return source();
    }
}
