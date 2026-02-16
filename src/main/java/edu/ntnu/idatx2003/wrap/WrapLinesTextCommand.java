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
    return "" + opening + text.replace("\n", end + "\n" + opening) + end;
  }

}
