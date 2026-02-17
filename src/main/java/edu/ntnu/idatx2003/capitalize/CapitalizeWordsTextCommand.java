package edu.ntnu.idatx2003.capitalize;


public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

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
