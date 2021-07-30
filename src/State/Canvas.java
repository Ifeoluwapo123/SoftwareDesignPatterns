package State;

public class Canvas {

    private Tool currentTools;

    public void mouseDown(){
        currentTools.mouseDown();
    }

    public void mouseUp(){
       currentTools.mouseUp();
    }

    public Tool getCurrentTools() {
        return currentTools;
    }

    public void setCurrentTools(Tool currentTools) {
        this.currentTools = currentTools;
    }
}
