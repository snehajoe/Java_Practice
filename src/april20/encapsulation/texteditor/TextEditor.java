package april20.encapsulation.texteditor;

public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = " ";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
