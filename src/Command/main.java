package Command;

import Command.editor.BoldCommand;
import Command.editor.History;
import Command.editor.HtmlDocument;
import Command.editor.UndoCommand;
import Command.fx.Button;

public class main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();

        //composite command
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BandWhiteCommand());

        composite.execute();

        //undo command
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}
