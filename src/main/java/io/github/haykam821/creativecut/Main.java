package io.github.haykam821.creativecut;

import io.github.haykam821.creativecut.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public static final String MOD_ID = "creativecut";

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
	}
}