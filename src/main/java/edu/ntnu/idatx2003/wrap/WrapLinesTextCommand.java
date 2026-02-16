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

    StringBuilder sb = new StringBuilder();
    String[] splitText = text.split("\n");

    for (String s : splitText) {
      sb.append(opening + s + end);
    }
    return sb.toString();
    //return "" + opening + text.replace("\n", end + "\n" + opening) + end;
  }

}
