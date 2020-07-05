package io.github.haykam821.creativecut.block;

import io.github.haykam821.creativecut.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum ModBlocks {
	BEDROCK_SLAB("bedrock_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)), ItemGroup.BUILDING_BLOCKS),
	BEDROCK_STAIRS("bedrock_stairs", new BedrockStairsBlock(), ItemGroup.BUILDING_BLOCKS),
	BEDROCK_WALL("bedrock_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)), ItemGroup.DECORATIONS);

	public Block block;
	public Item item;

	private ModBlocks(String path, Block block, ItemGroup group) {
		Identifier id = new Identifier(Main.MOD_ID, path);

		this.block = block;
		Registry.register(Registry.BLOCK, id, this.block);

		this.item = new BlockItem(block, new Item.Settings().group(group));
		Registry.register(Registry.ITEM, id, this.item);
	}

	public static ModBlocks initialize() {
		return null;
	}
}