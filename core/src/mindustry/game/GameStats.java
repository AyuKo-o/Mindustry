package mindustry.game;

import arc.struct.*;
import mindustry.world.*;

public class GameStats{
    /** Enemy (red team) units destroyed. */
    public int enemyUnitsDestroyed;
    /** Total waves lasted. */
    public int wavesLasted;
    /** Friendly buildings fully built. */
    public int buildingsBuilt;
    /** Friendly buildings fully deconstructed. */
    public int buildingsDeconstructed;
    /** Friendly buildings destroyed. */
    public int buildingsDestroyed;
    /** Total units created by any means. */
    public int unitsCreated;
    /** Record of blocks that have been placed by count. Used for objectives only. */
    public ObjectIntMap<Block> placedBlockCount = new ObjectIntMap<>();
}
