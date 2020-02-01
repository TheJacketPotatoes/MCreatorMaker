package net.mcreator.fanmakermod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementsfanmakermod.ModElement.Tag
public class MCreatorTestHoe extends Elementsfanmakermod.ModElement {
	@ObjectHolder("fanmakermod:testhoe")
	public static final Item block = null;

	public MCreatorTestHoe(Elementsfanmakermod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 852;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 34;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 10f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("testhoe"));
	}
}
