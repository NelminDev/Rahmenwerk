package dev.nelmin.minecraft.api;

import java.util.List;

public interface ICommandNode {
    List<ICommandNode> getNodes();

    String getName();

    String getPermission();
}
