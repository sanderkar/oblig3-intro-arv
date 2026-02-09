package edu.ntnu.idatx2003.replace;

import edu.ntnu.idatx2003.TextCommand;

public class ReplaceFirstTextCommand implements TextCommand {
  private String target;
  private String replacement;
  private String replacedString;


  public ReplaceFirstTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;




  }
  @Override
  public String execute(String text) {
    replacedString = text.replaceFirst(target, replacement);
    return replacedString;
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
