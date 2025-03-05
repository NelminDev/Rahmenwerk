package dev.nelmin.minecraft.annotations.command;

public @interface Argument {
    String name = "";
    ArgumentType type = ArgumentType.STRING;
    boolean required = false;
    String[] permissions = null;
}
