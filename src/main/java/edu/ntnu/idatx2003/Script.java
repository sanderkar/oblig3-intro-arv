package edu.ntnu.idatx2003;

import java.util.List;

public class Script {
  List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        String newText = text;
        for (TextCommand command : textCommands) {
            newText = command.execute(newText);
        }
        return newText;
    }
}
