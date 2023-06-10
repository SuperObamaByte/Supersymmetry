import static globals.Globals.*

import static gregtech.api.unification.material.Materials.*;
import gregtech.api.unification.material.MarkerMaterials;
import static gregtech.api.unification.ore.OrePrefix.dye;

//REMOVE OLD RECIPES
// Stainless Steel Dust * 9
mods.gregtech.mixer.removeByInput(120, [metaitem('dustIron') * 6, metaitem('dustNickel'), metaitem('dustManganese'), metaitem('dustChrome'), metaitem('circuit.integrated').withNbt(["Configuration": 3])], null)
// Stainless Steel Dust * 9
mods.gregtech.mixer.removeByInput(120, [metaitem('dustIron') * 4, metaitem('dustInvar') * 3, metaitem('dustManganese'), metaitem('dustChrome'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)


EBF = recipemap('electric_blast_furnace')
MIXER = recipemap('mixer')
ADVANCED_ARC_FURNACE = recipemap('advanced_arc_furnace')
EBF.recipeBuilder()
    .inputs(ore('dustIron') * 6)
    .inputs(ore('dustNickel'))
    .inputs(ore('dustTinyManganese') * 2)
    .fluidOutputs(fluid('carburized_stainless_steel') * 1440)
    .duration(800)
    .EUt(Globals.voltAmps[2] * 2)
    .buildAndRegister()

EBF.recipeBuilder()
    .inputs(ore('dustMagnetite') * 14)
    .inputs(ore('dustNickel'))
    .inputs(ore('dustTinyManganese') * 2)
    .fluidOutputs(fluid('carburized_stainless_steel') * 1440)
    .duration(800)
    .EUt(Globals.voltAmps[2] * 2)
    .buildAndRegister()

 EBF.recipeBuilder()
    .inputs(ore('dustBandedIron') * 15)
    .inputs(ore('dustNickel'))
    .inputs(ore('dustTinyManganese') * 2)
    .fluidOutputs(fluid('carburized_stainless_steel') * 1440)
    .duration(800)
    .EUt(Globals.voltAmps[2] * 2)
    .buildAndRegister()   

 EBF.recipeBuilder()
    .inputs(ore('dustIronIiiOxide') * 15)
    .inputs(ore('dustNickel'))
    .inputs(ore('dustTinyManganese') * 2)
    .fluidOutputs(fluid('carburized_stainless_steel') * 1440)
    .duration(800)
    .EUt(Globals.voltAmps[2] * 2)
    .buildAndRegister()   

 EBF.recipeBuilder()
    .inputs(ore('dustGraniticMineralSand') * 30)
    .inputs(ore('dustNickel'))
    .inputs(ore('dustTinyManganese') * 2)
    .fluidOutputs(fluid('carburized_stainless_steel') * 1440)
    .duration(800)
    .EUt(Globals.voltAmps[2] * 2)
    .buildAndRegister()   

// VACUUM.recipeBuilder()
//     .fluidInputs(fluid('oxygen') * 2000)
//     .fluidInputs(fluid('carburized_stainless_steel') * 1440)
//     .inputs(ore('dustSmallFerrosilicon') * 2)
//    .inputs(ore('dustFerrochromium') * 3)
//    .inputs(ore('dustSmallQuicklime'))
//    .inputs(ore('dustSmallFluorite'))
//     .fluidOutputs(fluid('stainless_steel') * 1440)
//     .duration(400)
//     .EUt(Globals.voltAmps[3])
//     .buildAndRegister()

EBF.recipeBuilder()
    .inputs(ore('dustSiliconDioxide') * 3)
    .inputs(ore('dustIron') * 3)
    .inputs(ore('dustCoke') * 2)
    .outputs(ore('dustFerrosilicon').first() * 4)
    .fluidOutputs(fluid('carbon_monoxide') * 2000)
    .duration(300)
    .EUt(Globals.voltAmps[1] * 2)
    .buildAndRegister()


// AOD Process
// TODO: ENABLE FLUID INPUTS AFTER ADDING 2 MORE FLUID SLOTS TO THIS
ADVANCED_ARC_FURNACE.recipeBuilder()
    //.fluidInputs(fluid('oxygen') * 2000)
    //.fluidInputs(fluid('argon') * 500)
    .fluidInputs(fluid('carburized_stainless_steel') * 1440)    
    .inputs(ore('dustSmallFerrosilicon') * 2)
    .inputs(ore('dustFerrochromium') * 3)
    .inputs(ore('dustSmallQuicklime'))
    .inputs(ore('dustSmallFluorite'))
    .fluidOutputs(fluid('stainless_steel') * 1440)
    .duration(400)
    .EUt(Globals.voltAmps[3])
    .buildAndRegister()

/*
ADVANCED_ARC_FURNACE.recipeBuilder()
    //.fluidInputs(fluid('oxygen') * 2000)
    //.fluidInputs(fluid('nitrogen') * 1000)
    .fluidInputs(fluid('carburized_stainless_steel') * 1440)    
    .inputs(ore('dustSmallFerrosilicon') * 2)
    .inputs(ore('dustFerrochromium') * 3)
    .inputs(ore('dustSmallQuicklime'))
    .inputs(ore('dustSmallFluorite'))
    .fluidOutputs(fluid('stainless_steel') * 1440)
    .duration(600)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

 */