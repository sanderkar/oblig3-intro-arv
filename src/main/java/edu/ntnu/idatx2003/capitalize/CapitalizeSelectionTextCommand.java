package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeWordsTextCommand {

  private String selection;

  public CapitalizeSelectionTextCommand(String selection){
    this.selection = selection;

  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {

    String newText = text.replace(selection, selection.substring(0, 1).toUpperCase() + selection.substring(1));
    return newText;
  }
}
