package april20.encapsulation.texteditor;

public class TextMain {
    public static void main(String[] args) {
        TextEditor editor= new TextEditor();

        editor.setText("Welcome Sneha");
        System.out.println("Text: "+ editor.getText());

    }
}
