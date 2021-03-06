package com.lothrazar.cyclic.block.conveyor;

import net.minecraft.util.IStringSerializable;

public enum ConveyorType implements IStringSerializable {

  STRAIGHT, UP, DOWN, CORNER_LEFT, CORNER_RIGHT;

  @Override
  public String getString() {
    return this.name().toLowerCase();
  }

  public boolean isCorner() {
    return this == CORNER_LEFT || this == CORNER_RIGHT;
  }

  public boolean isVertical() {
    return this == UP || this == DOWN;
  }
}
