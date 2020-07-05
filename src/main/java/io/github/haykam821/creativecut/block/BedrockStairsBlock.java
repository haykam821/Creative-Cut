package io.github.haykam821.creativecut.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class BedrockStairsBlock extends StairsBlock {
	public BedrockStairsBlock() {
		super(Blocks.BEDROCK.getDefaultState(), Block.Settings.copy(Blocks.BEDROCK));
	}
}