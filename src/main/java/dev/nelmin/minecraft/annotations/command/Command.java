package dev.nelmin.minecraft.annotations.command;

public @interface Command {
    String name = "";
    String description = "";
    String[] permissions = null;
}
