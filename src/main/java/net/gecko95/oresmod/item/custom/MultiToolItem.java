package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MultiToolItem extends MiningToolItem {
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Text SPLASH_TEXT = Text.literal("The Ultimate Tool").formatted(TITLE_FORMATTING);

    public MultiToolItem(ToolMaterial material, Item.Settings settings) {
        super(material, ModTags.Blocks.MULTI_TOOL_MINEABLE, settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(SPLASH_TEXT);
        super.appendTooltip(stack, context, tooltip, type);
    }
}