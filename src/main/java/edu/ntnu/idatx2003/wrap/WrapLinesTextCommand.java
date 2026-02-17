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

    for (int i = 0; i < splitText.length; i++) {
      String s = splitText[i];

      if (!s.isBlank()) {
        sb.append(opening).append(s).append(end);
        }

      if (i < splitText.length - 1) {
        sb.append("\n");
        }
    }

    return sb.toString();
  }


}
