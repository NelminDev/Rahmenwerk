package dev.nelmin.minecraft.api;

import org.bukkit.entity.Player;

import java.util.List;

public interface ICommand {
    String getName();

    List<ICommandNode> getNodes();

    void execute(Player player, String[] args);
}
