package State;

public class main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTools(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("=============================");

        canvas.setCurrentTools(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
