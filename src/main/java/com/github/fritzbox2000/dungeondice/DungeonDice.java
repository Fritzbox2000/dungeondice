package com.github.fritzbox2000.dungeondice;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DungeonDice.MODID)
public class DungeonDice {
    public static final String MODID = "dungeondice";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public DungeonDice(){
        LOGGER.debug("Test Run --=DUNGEON DICE=--");
    }
}
