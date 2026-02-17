package edu.ntnu.idatx2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

  String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;

  }

  public String getSelection() {
    return selection;
  }

  @Override
    public String execute(String text) {
    String newText = text.replace(selection, opening + selection + end);
    return newText;

    }
}
