package com.github.brinxmat.intellijturtleplugin.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;


public class TurtleFileType extends LanguageFileType {
    public static final TurtleFileType INSTANCE = new TurtleFileType();

    private TurtleFileType() {
        super(Turtle.INSTANCE);
    }
    @Override
    public @NotNull String getName() {
        return "Turtle File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Turtle file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "ttl";
    }

    @Override
    public @Nullable Icon getIcon() {
        return TurtleIcons.FILE;
    }
}
