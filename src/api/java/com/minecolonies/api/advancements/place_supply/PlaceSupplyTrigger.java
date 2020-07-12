package com.minecolonies.api.advancements.place_supply;

import com.google.gson.JsonObject;
import com.minecolonies.api.advancements.AbstractCriterionTrigger;
import com.minecolonies.api.util.constant.Constants;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.loot.ConditionArrayParser;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class PlaceSupplyTrigger extends AbstractCriterionTrigger<PlaceSupplyListeners, PlaceSupplyCriterionInstance>
{
    public PlaceSupplyTrigger()
    {
        super(new ResourceLocation(Constants.MOD_ID, Constants.CRITERION_SUPPLY_PLACED), PlaceSupplyListeners::new);
    }

    public void trigger(final ServerPlayerEntity player)
    {
        final PlaceSupplyListeners listeners = this.getListeners(player.getAdvancements());
        if (listeners != null)
        {
            listeners.trigger();
        }
    }

    @NotNull
    @Override
    public PlaceSupplyCriterionInstance func_230307_a_(@NotNull final JsonObject jsonObject, @NotNull final ConditionArrayParser conditionArrayParser)
    {
        return new PlaceSupplyCriterionInstance();
    }
}
