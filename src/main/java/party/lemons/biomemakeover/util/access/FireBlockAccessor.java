package party.lemons.biomemakeover.util.access;

import net.minecraft.block.Block;

public interface FireBlockAccessor
{
	void bm_registerFlammable(Block block, int burnChance, int spreadChance);
}
