package org.yunxi.remodifier.common.util;

import org.yunxi.remodifier.Remodifier;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;

public class ModTags {
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Remodifier.MODID, name));
        }

        public static final TagKey<Item> WEAPON_ITEMS = createTag("weapon");
    }
}