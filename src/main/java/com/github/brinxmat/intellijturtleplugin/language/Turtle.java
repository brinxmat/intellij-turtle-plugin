package com.github.brinxmat.intellijturtleplugin.language;

import com.intellij.lang.Language;

public class Turtle extends Language {

  public static final Turtle INSTANCE = new Turtle();

  private Turtle() {
    super("Turtle");
  }
}
