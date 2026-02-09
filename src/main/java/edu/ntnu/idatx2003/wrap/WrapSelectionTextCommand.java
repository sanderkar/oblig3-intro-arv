package edu.ntnu.idatx2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

  String selection;

  public WrapSelectionTextCommand(String selection, String opening, String end) {
    super(opening, end);
    this.selection = selection;

  }


  public String getSelection() {
    return selection;
  }

  @Override
    public String execute(String text) {
      return text;

    }
}
