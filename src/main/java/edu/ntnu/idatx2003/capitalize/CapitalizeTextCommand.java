package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  //override ex
  public String execute(String text){
    String newText = text.substring(0, 1).toUpperCase() + text.substring(1);
    return newText;
  }
}
