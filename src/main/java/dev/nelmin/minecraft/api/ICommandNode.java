package dev.nelmin.minecraft.api;

import org.bukkit.entity.Player;

import java.util.List;

public interface ICommandNode {
    String getName();

    List<ICommand> getNodes();

    void execute(Player player, String[] args);
}
