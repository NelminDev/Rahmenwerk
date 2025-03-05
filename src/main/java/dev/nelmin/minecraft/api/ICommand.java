package dev.nelmin.minecraft.api;

import java.util.List;

public interface ICommand {
    List<ICommand> getNodes();

    String getName();

    String getPermission();
}
