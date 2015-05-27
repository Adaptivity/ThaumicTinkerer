package com.nekokittygames.Thaumic.Tinkerer.common.items

import com.nekokittygames.Thaumic.Tinkerer.common.ThaumicTinkerer
import com.nekokittygames.Thaumic.Tinkerer.common.items.quartz.ItemDarkQuartz
import com.nekokittygames.Thaumic.Tinkerer.common.libs.LibItemNames
import net.minecraftforge.fml.common.registry.GameRegistry

/**
 * Created by Katrina on 22/05/2015.
 */
object ModItems {


  def registerItems() = {
    def registerItem(item: ModItem, name: String) = {
      GameRegistry.registerItem(item, name)
    }

    registerItem(ItemDarkQuartz, LibItemNames.DARK_QUARTZ)
    registerItem(ItemJarSeal,LibItemNames.JARSEAL)
  }


  def registerInventoryItems() = {
    ThaumicTinkerer.proxy.registerInventoryItem(ItemDarkQuartz, LibItemNames.DARK_QUARTZ)

    for(i <- 0 to 16)
      {
        ThaumicTinkerer.proxy.registerInventoryItem(ItemJarSeal, LibItemNames.JARSEAL,i)
      }
  }
}
