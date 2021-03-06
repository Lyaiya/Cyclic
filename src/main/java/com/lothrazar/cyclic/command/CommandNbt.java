package com.lothrazar.cyclic.command;

import com.lothrazar.cyclic.ConfigRegistry;
import com.lothrazar.cyclic.util.UtilChat;
import com.mojang.brigadier.context.CommandContext;
import java.util.List;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class CommandNbt implements ICyclicCommand {

  @Override
  public String getName() {
    return "nbtprint";
  }

  @Override
  public boolean needsOp() {
    return ConfigRegistry.COMMANDNBT.get();
  }

  @Override
  public int execute(CommandContext<CommandSource> ctx, List<String> arguments, PlayerEntity player) {
    ItemStack held = player.getHeldItemMainhand();
    if (held.hasTag()) {
      UtilChat.sendFeedback(ctx, held.getTag().toString());
    }
    else {
      UtilChat.sendFeedback(ctx, "command.cyclic.nbtprint.null");
    }
    return 1;
  }
}
