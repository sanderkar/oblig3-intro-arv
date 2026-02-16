package edu.ntnu.idatx2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {
    public WrapLinesTextCommand(String opening, String end) {
      super(opening, end);
    }


  @Override
    public String execute(String text) {
    if (text == null || text.isBlank()) {
      return text;
    }
    String removedLinesText = text.replace("\n\n", "");
    return "" + opening + removedLinesText.replace("\n", end + "\n" + opening) + end;
  }

}
