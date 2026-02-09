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
      int firstPartLength = text.indexOf(opening);
      int lastPartLength = text.length() - text.indexOf(opening) - selection.length();
      String firstPart = text.substring(0, firstPartLength);
        String lastPart = text.substring(text.length() - lastPartLength);

      return "" + firstPart + selection + lastPart;

    }
}
