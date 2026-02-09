package edu.ntnu.idata2003.replace;

import edu.ntnu.idata2003.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  private String target;
  private String replacement;
  private String replacedString;


  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;




  }
  @Override
    public String execute(String text) {
        replacedString = text.replaceAll(target, replacement);
        return replacedString;
    }

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }
}

