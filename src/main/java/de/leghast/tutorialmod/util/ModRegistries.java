package de.leghast.tutorialmod.util;

import de.leghast.tutorialmod.TutorialMod;
import de.leghast.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs()
    {
        registerFuels();
    }

    private static void registerFuels()
    {
        TutorialMod.LOGGER.info("Registering fuel items for" + TutorialMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }
}
