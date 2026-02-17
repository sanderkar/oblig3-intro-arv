package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  //override ex
  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder newText = new StringBuilder();
    for (String word : words) {
      newText.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
    }
    return newText.toString().trim();
  }

}
