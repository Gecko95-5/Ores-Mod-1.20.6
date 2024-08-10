package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;

public class ChainsawItem extends MiningToolItem {
    public ChainsawItem(ToolMaterial material, Item.Settings settings) {
        super(material, ModTags.Blocks.CHAINSAW_MINEABLE, settings);
    }
}
