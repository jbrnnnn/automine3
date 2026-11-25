package com.automine;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum OreType {
    COAL("Coal", 0x8A8A8A, Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE),
    IRON("Iron", 0xD8AF93, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE),
    COPPER("Copper", 0xE77C56, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE),
    GOLD("Gold", 0xFCEE4B, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.NETHER_GOLD_ORE),
    REDSTONE("Redstone", 0xFF3030, Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE),
    LAPIS("Lapis", 0x4466FF, Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE),
    DIAMOND("Diamond", 0x33EBCB, Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE),
    EMERALD("Emerald", 0x17DD62, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE),
    QUARTZ("Quartz", 0xEEEEEE, Blocks.NETHER_QUARTZ_ORE),
    DEBRIS("Ancient Debris", 0xB5683A, Blocks.ANCIENT_DEBRIS);

    public static final int WOOD_COLOR = 0xC8A165;

    public final String label;
    public final int color;
    public final Block[] blocks;

    OreType(String label, int color, Block... blocks) {
        this.label = label;
        this.color = color;
        this.blocks = blocks;
    }
}
