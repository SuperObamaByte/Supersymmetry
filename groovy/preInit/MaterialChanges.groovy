import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.fluids.*

import material.SuSyMaterials
import classes.ChangeFlags

log.infoMC("Registering new material event listener")

private static void renameFluid(Material material, FluidStorageKey fluidStorageKey, String translationKey) {
    FluidProperty property = material.getProperty(PropertyKey.FLUID);
    if (property == null) throw new IllegalArgumentException("Material requires fluid property");

    FluidStorage storage = property.getStorage();
    FluidBuilder builder = storage.getQueuedBuilder(fluidStorageKey);
    if (builder == null) throw new IllegalArgumentException("No fluid associated with storage key");
    builder.translation(translationKey);
}

eventManager.listen(EventPriority.LOWEST) {
    MaterialEvent event ->
        log.infoMC("Renaming fluids")

        renameFluid(Materials.Polybenzimidazole, FluidStorageKeys.LIQUID, "removed_polybenzimidazole")

        log.infoMC("Starting new material registration")
        
        SuSyMaterials.init()

        log.infoMC("Finished new material registration")

        log.infoMC("Starting modifying material flags")

        ChangeFlags.init()

        log.infoMC("Finished modifying material flags")
}