package edu.ntnu.idatx2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {
    public WrapLinesTextCommand(String opening, String end) {
      super(opening, end);
    }


  @Override
    public String execute(String text) {
      if(text.isEmpty()){
        return "";
      }
      return "" + opening + text.replace("\n", end + "\n" + opening) + end;
    }
}
