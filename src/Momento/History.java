package Momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        if(states.size() == 0) return new EditorState("");
        var lastState = states.get(states.size() - 1);
        states.remove(lastState);

        return lastState;
    }
}
