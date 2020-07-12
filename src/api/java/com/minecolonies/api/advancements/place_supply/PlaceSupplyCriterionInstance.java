package com.minecolonies.api.advancements.place_supply;

import com.minecolonies.api.util.constant.Constants;
import net.minecraft.advancements.criterion.CriterionInstance;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.util.ResourceLocation;

public class PlaceSupplyCriterionInstance extends CriterionInstance
{
    public PlaceSupplyCriterionInstance()
    {
        super(new ResourceLocation(Constants.MOD_ID, Constants.CRITERION_SUPPLY_PLACED), EntityPredicate.AndPredicate.field_234582_a_);
    }
}
