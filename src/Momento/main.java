package Momento;

public class main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.setContent("d");

        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
