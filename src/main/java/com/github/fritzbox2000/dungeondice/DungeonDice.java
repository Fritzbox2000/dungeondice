package com.github.fritzbox2000.dungeondice;
// Imports
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DungeonDice.MODID)
public class DungeonDice {
    //Name of the mod (should be a unique MODID)
    public static final String MODID = "dungeondice";
    // So I can enter things into the log
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    // When the Mod initialises then enter this into the log
    public DungeonDice(){
        LOGGER.debug("Dungeon Dice initialised");
    }
}
