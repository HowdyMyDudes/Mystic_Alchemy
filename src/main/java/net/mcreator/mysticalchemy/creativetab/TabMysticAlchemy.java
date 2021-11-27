
package net.mcreator.mysticalchemy.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.mysticalchemy.item.ItemElementalPistol;
import net.mcreator.mysticalchemy.ElementsMysticAlchemy;

@ElementsMysticAlchemy.ModElement.Tag
public class TabMysticAlchemy extends ElementsMysticAlchemy.ModElement {
	public TabMysticAlchemy(ElementsMysticAlchemy instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmysticalchemy") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemElementalPistol.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
