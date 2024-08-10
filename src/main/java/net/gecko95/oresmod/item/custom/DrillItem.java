package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class DrillItem extends MiningToolItem {

    public DrillItem(ToolMaterial material, Item.Settings settings) {
        super(material, ModTags.Blocks.DRILL_MINEABLE, settings);
    }
}
