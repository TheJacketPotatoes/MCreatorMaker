package net.mcreator.fanmakermod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsfanmakermod.ModElement.Tag
public class MCreatorTestSword extends Elementsfanmakermod.ModElement {
	@ObjectHolder("fanmakermod:testsword")
	public static final Item block = null;

	public MCreatorTestSword(Elementsfanmakermod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3F, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("testsword"));
	}
}
