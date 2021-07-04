package com.telepathicgrunt.repurposedstructures.modinit;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.world.structures.AdvancedJigsawStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.BuriableStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.CityNetherStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.GenericJigsawStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.GenericNetherJigsawStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.LandBasedEndStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.MansionStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.MineshaftEndStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.MineshaftStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.ShipwreckEndStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.ShipwreckNetherStructure;
import com.telepathicgrunt.repurposedstructures.world.structures.configs.NetherShipwreckConfig;
import com.telepathicgrunt.repurposedstructures.world.structures.pieces.MansionPieces;
import com.telepathicgrunt.repurposedstructures.world.structures.pieces.StructurePiecesBehavior;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.fabricmc.fabric.impl.structure.FabricStructureImpl;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.chunk.StructuresConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RSStructures {

    public static final Map<StructureFeature<?>, StructureConfig> RS_STRUCTURES = new HashMap<>();
    public static final Set<Identifier> RS_STRUCTURE_START_PIECES = new HashSet<>();

    // MINESHAFTS

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_BIRCH = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/birch/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.birchMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/birch/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.birchMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.birchMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.birchMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.birchMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_DARK_FOREST = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/dark_forest/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.darkForestMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/dark_forest/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.darkForestMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.darkForestMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.darkForestMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.darkForestMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_DESERT = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/desert/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.desertMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/desert/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.desertMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.desertMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.desertMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.desertMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_NETHER = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/nether/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.netherMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/nether/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.netherMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.netherMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.netherMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.netherMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_CRIMSON = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/crimson/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.crimsonMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/crimson/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.crimsonMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.crimsonMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.crimsonMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.crimsonMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_WARPED = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/warped/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.warpedMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/warped/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.warpedMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.warpedMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.warpedMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.warpedMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_ICY = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/icy/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.icyMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/icy/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.icyMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.icyMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.icyMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.icyMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_JUNGLE = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/jungle/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.jungleMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/jungle/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.jungleMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.jungleMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.jungleMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.jungleMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_OCEAN = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/ocean/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.oceanMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/ocean/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.oceanMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.oceanMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.oceanMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.oceanMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_SAVANNA = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/savanna/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.savannaMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/savanna/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.savannaMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.savannaMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.savannaMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.savannaMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_STONE = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/stone/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.stoneMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/stone/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.stoneMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.stoneMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.stoneMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.stoneMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_SWAMP = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/swamp/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.swampMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/swamp/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.swampMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.swampMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.swampMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.swampMineshaftSpawnrate)
            .build();

    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_TAIGA = new MineshaftStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/taiga/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.taigaMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/taiga/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.taigaMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.taigaMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.taigaMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.taigaMineshaftSpawnrate)
            .build();


    public static StructureFeature<DefaultFeatureConfig> MINESHAFT_END = new MineshaftEndStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "mineshafts/end/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.endMineshaftSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "mineshafts/end/spawner_4_end"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, RepurposedStructures.RSAllConfig.RSMineshaftsConfig.size.endMineshaftSize))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.endMineshaftMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.endMineshaftMinHeight)
            .setProbability(RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.endMineshaftSpawnrate)
            .build();

    // STRONGHOLDS

    public static StructureFeature<DefaultFeatureConfig> STRONGHOLD_NETHER = new AdvancedJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "strongholds/nether/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdSize)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "strongholds/nether/portal_room"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, (int) (RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdSize * 0.6D))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdMinHeight)
            .build();

    // FORTRESSES

    public static StructureFeature<DefaultFeatureConfig> FORTRESS_JUNGLE = new AdvancedJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "fortresses/jungle/start_pool"))
            .setStructureSize(RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressSize)
            .setBiomeRange(4)
            .setRequiredPieces(ImmutableMap.of(
                    new Identifier(RepurposedStructures.MODID, "fortresses/jungle/spawner"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(2, (int) (RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressSize * 0.6D)),
                    new Identifier(RepurposedStructures.MODID, "fortresses/jungle/balcony"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(1, (int) (RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressSize * 0.2D)),
                    new Identifier(RepurposedStructures.MODID, "fortresses/jungle/turn_inside_chest"),
                    new StructurePiecesBehavior.RequiredPieceNeeds(4, (int) (RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressSize * 0.6D))))
            .setMaxY(RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressMaxHeight)
            .setMinY(RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressMinHeight)
            .setVerticalRange(RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressVerticalRange)
            .build();

    // IGLOOS

    public static StructureFeature<DefaultFeatureConfig> IGLOO_GRASSY = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "igloos/grassy_top")).setStructureSize(20).cannotSpawnInWater().build();
    public static StructureFeature<DefaultFeatureConfig> IGLOO_STONE = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "igloos/stone_top")).setStructureSize(20).cannotSpawnInWater().build();

    // TEMPLES

    public static StructureFeature<DefaultFeatureConfig> TEMPLE_NETHER_WASTELAND = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "temples/nether_wasteland")).setStructureSize(8).setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-16).setLiquidSpotOffset(-16).build();
    public static StructureFeature<DefaultFeatureConfig> TEMPLE_NETHER_BASALT = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "temples/nether_basalt")).setStructureSize(8).setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-16).setLiquidSpotOffset(-16).build();
    public static StructureFeature<DefaultFeatureConfig> TEMPLE_NETHER_WARPED = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "temples/nether_warped")).setStructureSize(8).setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-16).setLiquidSpotOffset(-16).build();
    public static StructureFeature<DefaultFeatureConfig> TEMPLE_NETHER_CRIMSON = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "temples/nether_crimson")).setStructureSize(8).setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-16).setLiquidSpotOffset(-16).build();
    public static StructureFeature<DefaultFeatureConfig> TEMPLE_NETHER_SOUL = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "temples/nether_soul")).setStructureSize(8).setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-16).setLiquidSpotOffset(-16).build();

    // OUTPOSTS

    public static StructureFeature<DefaultFeatureConfig> OUTPOST_NETHER_BRICK = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/nether_brick/base_plates")).setStructureSize(11).searchForHighestLand().setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-13).setLiquidSpotOffset(-15).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_WARPED = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/warped/base_plates")).setStructureSize(11).searchForHighestLand().setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-13).setLiquidSpotOffset(-15).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_CRIMSON = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/crimson/base_plates")).setStructureSize(11).searchForHighestLand().setSearchSealevelOffset(3).canSpawnOnLiquid().setLedgeSpotOffset(-13).setLiquidSpotOffset(-15).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_BIRCH = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/birch/base_plates")).setStructureSize(11).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_JUNGLE = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/jungle/base_plates")).setStructureSize(11).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_GIANT_TREE_TAIGA = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/giant_tree_taiga/base_plates")).setStructureSize(11).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_DESERT = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/desert/base_plates")).setStructureSize(11).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_BADLANDS = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/badlands/base_plates")).setStructureSize(11).setTerrainHeightRadius(1).setAllowTerrainHeightRange(20).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_SNOWY = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/snowy/base_plates")).setStructureSize(11).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_ICY = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/icy/base_plates")).setStructureSize(11).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_TAIGA = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/taiga/base_plates")).setStructureSize(11).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_OAK = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/oak/base_plates")).setStructureSize(11).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.VILLAGE).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> OUTPOST_END = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "outposts/end/base_plates")).setStructureSize(11).setBiomeRange(2).setAllowTerrainHeightRange(3).setAllowTerrainHeightRange(15).setMinHeightLimit(55).setStructureBlacklistRange(4).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.END_AVOID_STRUCTURE).collect(Collectors.toSet())).build();

    // PYRAMIDS

    public static StructureFeature<DefaultFeatureConfig> PYRAMID_NETHER = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/nether")).setStructureSize(8).searchForHighestLand().canSpawnOnLiquid().setLedgeSpotOffset(-3).setLiquidSpotOffset(-2).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_BADLANDS = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/badlands")).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_SNOWY = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/snowy")).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_END = new LandBasedEndStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/end")).setStructureSize(11).setCenterOffset(-2).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_ICY = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/icy")).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_JUNGLE = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/jungle")).setOffsetAmount(20).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_MUSHROOM = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/mushroom")).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_OCEAN = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/ocean")).cannotSpawnInWater().useOceanHeightmap().build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_GIANT_TREE_TAIGA = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/giant_tree_taiga")).build();
    public static StructureFeature<DefaultFeatureConfig> PYRAMID_FLOWER_FOREST = new BuriableStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "pyramids/flower_forest")).build();

    // SHIPWRECKS

    public static StructureFeature<DefaultFeatureConfig> SHIPWRECK_END = new ShipwreckEndStructure();
    public static StructureFeature<NetherShipwreckConfig> SHIPWRECK_NETHER_BRICKS = new ShipwreckNetherStructure(new Identifier(RepurposedStructures.MODID, "shipwrecks/nether_bricks"), -3);
    public static StructureFeature<NetherShipwreckConfig> SHIPWRECK_CRIMSON = new ShipwreckNetherStructure(new Identifier(RepurposedStructures.MODID, "shipwrecks/crimson"), -4);
    public static StructureFeature<NetherShipwreckConfig> SHIPWRECK_WARPED = new ShipwreckNetherStructure(new Identifier(RepurposedStructures.MODID, "shipwrecks/warped"), -4);

    // VILLAGES

    public static StructureFeature<DefaultFeatureConfig> VILLAGE_BADLANDS = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/badlands/town_centers")).setStructureSize(10).setBiomeRange(1).setTerrainHeightRadius(2).setAllowTerrainHeightRange(20).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_BIRCH = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/birch/town_centers")).setStructureSize(6).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_DARK_FOREST = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/dark_forest/town_centers")).setStructureSize(6).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_JUNGLE = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/jungle/town_centers")).setStructureSize(8).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_SWAMP = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/swamp/town_centers")).setStructureSize(6).setCenterOffset(-1).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_MOUNTAINS = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/birch/town_centers")).setStructureSize(6).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_GIANT_TAIGA = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/birch/town_centers")).setStructureSize(6).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_OAK = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/birch/town_centers")).setStructureSize(6).setBiomeRange(1).setStructureBlacklistRange(5).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.MANSION).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_CRIMSON = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/crimson/town_centers")).setStructureSize(6).searchForHighestLand().setSearchSealevelOffset(1).setLedgeSpotOffset(-12).setLiquidSpotOffset(-13).setBiomeRange(1).setStructureBlacklistRange(10).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.NETHER_OUTPOST).collect(Collectors.toSet())).build();
    public static StructureFeature<DefaultFeatureConfig> VILLAGE_WARPED = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "villages/warped/town_centers")).setStructureSize(6).searchForHighestLand().setSearchSealevelOffset(1).setLedgeSpotOffset(-12).setLiquidSpotOffset(-13).setBiomeRange(1).setStructureBlacklistRange(10).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.NETHER_OUTPOST).collect(Collectors.toSet())).build();

    // RUINED PORTALS

    public static StructureFeature<DefaultFeatureConfig> RUINED_PORTAL_END = new LandBasedEndStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "ruined_portals/end")).setStructureSize(20).setCenterOffset(-6).build();

    // RUINS

    public static StructureFeature<DefaultFeatureConfig> RUINS_NETHER = new GenericNetherJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "ruins/nether/start_pool")).setStructureSize(1).searchForHighestLand().canSpawnOnLiquid().setLedgeSpotOffset(-3).setLiquidSpotOffset(-2).build();
    public static StructureFeature<DefaultFeatureConfig> RUINS_LAND_WARM = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "ruins/land_warm/start_pool")).setStructureSize(2).setTerrainHeightRadius(2).setAllowTerrainHeightRange(5).cannotSpawnInWater().build();
    public static StructureFeature<DefaultFeatureConfig> RUINS_LAND_HOT = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "ruins/land_hot/start_pool")).setStructureSize(2).setTerrainHeightRadius(2).setAllowTerrainHeightRange(5).cannotSpawnInWater().build();
    // regexpos1

    // CITIES

    public static StructureFeature<DefaultFeatureConfig> CITY_NETHER = new CityNetherStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "cities/nether/start_pool")).setStructureSize(5).setStructureBlacklistRange(4).setAvoidStructuresSet(Stream.of(RSStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_NETHER_STRUCTURE).collect(Collectors.toSet())).build();

    // MANSIONS

    public static StructureFeature<DefaultFeatureConfig> MANSION_BIRCH = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.BIRCH);
    public static StructureFeature<DefaultFeatureConfig> MANSION_JUNGLE = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.JUNGLE);
    public static StructureFeature<DefaultFeatureConfig> MANSION_OAK = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.OAK);
    public static StructureFeature<DefaultFeatureConfig> MANSION_SAVANNA = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.SAVANNA);
    public static StructureFeature<DefaultFeatureConfig> MANSION_TAIGA = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.TAIGA);
    public static StructureFeature<DefaultFeatureConfig> MANSION_DESERT = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.DESERT);
    public static StructureFeature<DefaultFeatureConfig> MANSION_SNOWY = new MansionStructure(MansionPieces.Piece.MANSIONTYPE.SNOWY);

    // WITCH HUTS

    public static StructureFeature<DefaultFeatureConfig> WITCH_HUTS_OAK = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "witch_huts/oak_start_pool")).setStructureSize(11).build();
    public static StructureFeature<DefaultFeatureConfig> WITCH_HUTS_TAIGA = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "witch_huts/taiga_start_pool")).setStructureSize(11).build();
    public static StructureFeature<DefaultFeatureConfig> WITCH_HUTS_BIRCH = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "witch_huts/birch_start_pool")).setStructureSize(11).build();
    public static StructureFeature<DefaultFeatureConfig> WITCH_HUTS_DARK_FOREST = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "witch_huts/dark_forest_start_pool")).setStructureSize(11).build();
    public static StructureFeature<DefaultFeatureConfig> WITCH_HUTS_GIANT_TREE_TAIGA = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "witch_huts/giant_tree_taiga_start_pool")).setStructureSize(11).build();

    // BASTIONS

    public static StructureFeature<DefaultFeatureConfig> BASTION_UNDERGROUND = new GenericJigsawStructure.Builder<>(new Identifier(RepurposedStructures.MODID, "bastions/underground/starts")).setStructureSize(10).setFixedYSpawn(12).doNotUseHeightmap().setBiomeRange(7).setStructureBlacklistRange(5).setAvoidStructuresSet(ImmutableSet.of(RSStructureTagMap.STRUCTURE_TAGS.BASTION_AVOID_STRUCTURE)).build();



    public static void registerStructures() {
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_birch"), MINESHAFT_BIRCH).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 399117345)).superflatFeature(MINESHAFT_BIRCH.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_dark_forest"), MINESHAFT_DARK_FOREST).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 2011511156)).superflatFeature(MINESHAFT_DARK_FOREST.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_desert"), MINESHAFT_DESERT).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1990612785)).superflatFeature(MINESHAFT_DESERT.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_end"), MINESHAFT_END).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 2057488602)).superflatFeature(MINESHAFT_END.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_nether"), MINESHAFT_NETHER).step(GenerationStep.Feature.VEGETAL_DECORATION).defaultConfig(new StructureConfig(1, 0, 1220811654)).superflatFeature(MINESHAFT_NETHER.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_crimson"), MINESHAFT_CRIMSON).step(GenerationStep.Feature.VEGETAL_DECORATION).defaultConfig(new StructureConfig(1, 0, 1153019610)).superflatFeature(MINESHAFT_CRIMSON.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_warped"), MINESHAFT_WARPED).step(GenerationStep.Feature.VEGETAL_DECORATION).defaultConfig(new StructureConfig(1, 0, 1095888662)).superflatFeature(MINESHAFT_WARPED.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_icy"), MINESHAFT_ICY).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1451015246)).superflatFeature(MINESHAFT_ICY.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_jungle"), MINESHAFT_JUNGLE).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1434412876)).superflatFeature(MINESHAFT_JUNGLE.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_ocean"), MINESHAFT_OCEAN).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1774808662)).superflatFeature(MINESHAFT_OCEAN.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_savanna"), MINESHAFT_SAVANNA).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1960212212)).superflatFeature(MINESHAFT_SAVANNA.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_stone"), MINESHAFT_STONE).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1436736620)).superflatFeature(MINESHAFT_STONE.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_swamp"), MINESHAFT_SWAMP).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 2037177700)).superflatFeature(MINESHAFT_SWAMP.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mineshaft_taiga"), MINESHAFT_TAIGA).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(1, 0, 1383003172)).superflatFeature(MINESHAFT_TAIGA.configure(FeatureConfig.DEFAULT)).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "stronghold_nether"), STRONGHOLD_NETHER).step(GenerationStep.Feature.TOP_LAYER_MODIFICATION).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSStrongholdsConfig.nether.netherStrongholdAverageChunkDistance * 0.5f), 1731422513)).superflatFeature(STRONGHOLD_NETHER.configure(FeatureConfig.DEFAULT)).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "fortress_jungle"), FORTRESS_JUNGLE).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSFortressesConfig.jungleFortress.jungleFortressAverageChunkDistance * 0.5f), 1464189157)).superflatFeature(FORTRESS_JUNGLE.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "igloo_grassy"), IGLOO_GRASSY).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSIgloosConfig.grassyIglooAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSIgloosConfig.grassyIglooAverageChunkDistance * 0.5f), 1460835582)).superflatFeature(IGLOO_GRASSY.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "igloo_stone"), IGLOO_STONE).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSIgloosConfig.stoneIglooAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSIgloosConfig.stoneIglooAverageChunkDistance * 0.5f), 1327429039)).superflatFeature(IGLOO_STONE.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "temple_nether_wasteland"), TEMPLE_NETHER_WASTELAND).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSTemplesConfig.netherWastelandTempleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSTemplesConfig.netherWastelandTempleAverageChunkDistance * 0.5f), 1435489909)).superflatFeature(TEMPLE_NETHER_WASTELAND.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "temple_nether_soul"), TEMPLE_NETHER_SOUL).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSTemplesConfig.netherSoulTempleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSTemplesConfig.netherSoulTempleAverageChunkDistance * 0.5f), 1799485937)).superflatFeature(TEMPLE_NETHER_SOUL.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "temple_nether_basalt"), TEMPLE_NETHER_BASALT).step(GenerationStep.Feature.VEGETAL_DECORATION).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSTemplesConfig.netherBasaltTempleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSTemplesConfig.netherBasaltTempleAverageChunkDistance * 0.5f), 1063117750)).superflatFeature(TEMPLE_NETHER_BASALT.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "temple_nether_crimson"), TEMPLE_NETHER_CRIMSON).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSTemplesConfig.netherCrimsonTempleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSTemplesConfig.netherCrimsonTempleAverageChunkDistance * 0.5f), 1898896156)).superflatFeature(TEMPLE_NETHER_CRIMSON.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "temple_nether_warped"), TEMPLE_NETHER_WARPED).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSTemplesConfig.netherWarpedTempleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSTemplesConfig.netherWarpedTempleAverageChunkDistance * 0.5f), 1635542708)).superflatFeature(TEMPLE_NETHER_WARPED.configure(FeatureConfig.DEFAULT)).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_nether_brick"), OUTPOST_NETHER_BRICK).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.netherBrickOutpostAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.netherBrickOutpostAverageChunkDistance * 0.5f), 1305971394)).superflatFeature(OUTPOST_NETHER_BRICK.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_warped"), OUTPOST_WARPED).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.warpedOutpostAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.warpedOutpostAverageChunkDistance * 0.5f), 1928816918)).superflatFeature(OUTPOST_WARPED.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_crimson"), OUTPOST_CRIMSON).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.crimsonOutpostAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.crimsonOutpostAverageChunkDistance * 0.5f), 1951425662)).superflatFeature(OUTPOST_CRIMSON.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_birch"), OUTPOST_BIRCH).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostBirchAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostBirchAverageChunkDistance * 0.5f), 1676743168)).superflatFeature(OUTPOST_BIRCH.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_jungle"), OUTPOST_JUNGLE).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostJungleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostJungleAverageChunkDistance * 0.5f), 548433028)).superflatFeature(OUTPOST_JUNGLE.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_giant_tree_taiga"), OUTPOST_GIANT_TREE_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostGiantTreeTaigaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostGiantTreeTaigaAverageChunkDistance * 0.5f), 993252541)).superflatFeature(OUTPOST_GIANT_TREE_TAIGA.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_desert"), OUTPOST_DESERT).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostDesertAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostDesertAverageChunkDistance * 0.5f), 593099376)).superflatFeature(OUTPOST_DESERT.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_badlands"), OUTPOST_BADLANDS).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostBadlandsAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostBadlandsAverageChunkDistance * 0.5f), 1702026868)).superflatFeature(OUTPOST_BADLANDS.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_snowy"), OUTPOST_SNOWY).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostSnowyAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostSnowyAverageChunkDistance * 0.5f), 849388460)).superflatFeature(OUTPOST_SNOWY.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_icy"), OUTPOST_ICY).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostIcyAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostIcyAverageChunkDistance * 0.5f), 935294633)).superflatFeature(OUTPOST_ICY.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_taiga"), OUTPOST_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostTaigaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostTaigaAverageChunkDistance * 0.5f), 272805097)).superflatFeature(OUTPOST_TAIGA.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_oak"), OUTPOST_OAK).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostOakAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostOakAverageChunkDistance * 0.5f), 698118385)).superflatFeature(OUTPOST_OAK.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "outpost_end"), OUTPOST_END).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostEndAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSOutpostsConfig.outpostEndAverageChunkDistance * 0.5f), 831830630)).superflatFeature(OUTPOST_END.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_badlands"), PYRAMID_BADLANDS).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidBadlandsAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidBadlandsAverageChunkDistance * 0.5f), 1718729448)).superflatFeature(PYRAMID_BADLANDS.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_nether"), PYRAMID_NETHER).step(GenerationStep.Feature.VEGETAL_DECORATION).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidNetherAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidNetherAverageChunkDistance * 0.5f), 2054372964)).superflatFeature(PYRAMID_NETHER.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_snowy"), PYRAMID_SNOWY).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidSnowyAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidSnowyAverageChunkDistance * 0.5f), 1630533493)).superflatFeature(PYRAMID_SNOWY.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_end"), PYRAMID_END).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidEndAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidEndAverageChunkDistance * 0.5f), 1145023315)).superflatFeature(PYRAMID_END.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_icy"), PYRAMID_ICY).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidIcyAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidIcyAverageChunkDistance * 0.5f), 884076931)).superflatFeature(PYRAMID_ICY.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_jungle"), PYRAMID_JUNGLE).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidJungleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidJungleAverageChunkDistance * 0.5f), 1483015905)).superflatFeature(PYRAMID_JUNGLE.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_mushroom"), PYRAMID_MUSHROOM).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidMushroomAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidMushroomAverageChunkDistance * 0.5f), 1035759391)).superflatFeature(PYRAMID_MUSHROOM.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_ocean"), PYRAMID_OCEAN).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidOceanAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidOceanAverageChunkDistance * 0.5f), 777281414)).superflatFeature(PYRAMID_OCEAN.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_giant_tree_taiga"), PYRAMID_GIANT_TREE_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidGiantTreeTaigaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidGiantTreeTaigaAverageChunkDistance * 0.5f), 1977974973)).superflatFeature(PYRAMID_GIANT_TREE_TAIGA.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "pyramid_flower_forest"), PYRAMID_FLOWER_FOREST).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidFlowerForestAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSPyramidsConfig.pyramidFlowerForestAverageChunkDistance * 0.5f), 1984904323)).superflatFeature(PYRAMID_FLOWER_FOREST.configure(FeatureConfig.DEFAULT)).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "shipwreck_end"), SHIPWRECK_END).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSShipwrecksConfig.endShipwreckAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSShipwrecksConfig.endShipwreckAverageChunkDistance * 0.5f), 1605500075)).superflatFeature(SHIPWRECK_END.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "shipwreck_nether_bricks"), SHIPWRECK_NETHER_BRICKS).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSShipwrecksConfig.netherBricksShipwreckAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSShipwrecksConfig.netherBricksShipwreckAverageChunkDistance * 0.5f), 2073308006)).superflatFeature(SHIPWRECK_NETHER_BRICKS.configure(new NetherShipwreckConfig(true))).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "shipwreck_crimson"), SHIPWRECK_CRIMSON).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSShipwrecksConfig.crimsonShipwreckAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSShipwrecksConfig.crimsonShipwreckAverageChunkDistance * 0.5f), 1019716871)).superflatFeature(SHIPWRECK_CRIMSON.configure(new NetherShipwreckConfig(false))).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "shipwreck_warped"), SHIPWRECK_WARPED).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSShipwrecksConfig.warpedShipwreckAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSShipwrecksConfig.warpedShipwreckAverageChunkDistance * 0.5f), 2072979641)).superflatFeature(SHIPWRECK_WARPED.configure(new NetherShipwreckConfig(false))).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_badlands"), VILLAGE_BADLANDS).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.badlandsVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.badlandsVillageAverageChunkDistance * 0.5f), 1319707555)).superflatFeature(VILLAGE_BADLANDS.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_birch"), VILLAGE_BIRCH).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.birchVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.birchVillageAverageChunkDistance * 0.5f), 1102567365)).superflatFeature(VILLAGE_BIRCH.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_dark_oak"), VILLAGE_DARK_FOREST).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.darkForestVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.darkForestVillageAverageChunkDistance * 0.5f), 1921339358)).superflatFeature(VILLAGE_DARK_FOREST.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_jungle"), VILLAGE_JUNGLE).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.jungleVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.jungleVillageAverageChunkDistance * 0.5f), 1229975218)).superflatFeature(VILLAGE_JUNGLE.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_swamp"), VILLAGE_SWAMP).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.swampVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.swampVillageAverageChunkDistance * 0.5f), 1559650945)).superflatFeature(VILLAGE_SWAMP.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_mountains"), VILLAGE_MOUNTAINS).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.mountainsVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.mountainsVillageAverageChunkDistance * 0.5f), 2010875989)).superflatFeature(VILLAGE_MOUNTAINS.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_giant_taiga"), VILLAGE_GIANT_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.giantTaigaVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.giantTaigaVillageAverageChunkDistance * 0.5f), 1559528842)).superflatFeature(VILLAGE_GIANT_TAIGA.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_crimson"), VILLAGE_CRIMSON).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.crimsonVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.crimsonVillageAverageChunkDistance * 0.5f), 1854750198)).superflatFeature(VILLAGE_CRIMSON.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_warped"), VILLAGE_WARPED).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.warpedVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.warpedVillageAverageChunkDistance * 0.5f), 1298332136)).superflatFeature(VILLAGE_WARPED.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "village_oak"), VILLAGE_OAK).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSVillagesConfig.oakVillageAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSVillagesConfig.oakVillageAverageChunkDistance * 0.5f), 2112891039)).superflatFeature(VILLAGE_OAK.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "ruined_portal_end"), RUINED_PORTAL_END).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSRuinedPortalsConfig.ruinedPortalEndAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSRuinedPortalsConfig.ruinedPortalEndAverageChunkDistance * 0.5f), 532404086)).superflatFeature(RUINED_PORTAL_END.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "ruins_nether"), RUINS_NETHER).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSRuinsConfig.ruinsNetherAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSRuinsConfig.ruinsNetherAverageChunkDistance * 0.5f), 1336047555)).superflatFeature(RUINS_NETHER.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "ruins_land_warm"), RUINS_LAND_WARM).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSRuinsConfig.ruinsLandWarmAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSRuinsConfig.ruinsLandWarmAverageChunkDistance * 0.25f), 18646107)).superflatFeature(RUINS_LAND_WARM.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "ruins_land_hot"), RUINS_LAND_HOT).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSRuinsConfig.ruinsLandHotAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSRuinsConfig.ruinsLandHotAverageChunkDistance * 0.25f), 1243670027)).superflatFeature(RUINS_LAND_HOT.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
        // regexpos2

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "city_nether"), CITY_NETHER).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSCitiesConfig.cityNetherAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSCitiesConfig.cityNetherAverageChunkDistance * 0.5f), 2082652405)).superflatFeature(CITY_NETHER.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_birch"), MANSION_BIRCH).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionBirchAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionBirchAverageChunkDistance * 0.5f), 182367035)).superflatFeature(MANSION_BIRCH.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_jungle"), MANSION_JUNGLE).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionJungleAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionJungleAverageChunkDistance * 0.5f), 1267916621)).superflatFeature(MANSION_JUNGLE.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_oak"), MANSION_OAK).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionOakAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionOakAverageChunkDistance * 0.5f), 147853731)).superflatFeature(MANSION_OAK.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_savanna"), MANSION_SAVANNA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionSavannaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionSavannaAverageChunkDistance * 0.5f), 2024558925)).superflatFeature(MANSION_SAVANNA.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_taiga"), MANSION_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionTaigaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionTaigaAverageChunkDistance * 0.5f), 418506505)).superflatFeature(MANSION_TAIGA.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_desert"), MANSION_DESERT).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionDesertAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionDesertAverageChunkDistance * 0.5f), 724317387)).superflatFeature(MANSION_DESERT.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "mansion_snowy"), MANSION_SNOWY).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionSnowyAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSMansionsConfig.mansionSnowyAverageChunkDistance * 0.5f), 1115107889)).superflatFeature(MANSION_SNOWY.configure(FeatureConfig.DEFAULT)).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "witch_hut_oak"), WITCH_HUTS_OAK).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsOakAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsOakAverageChunkDistance * 0.5f), 741641348)).superflatFeature(WITCH_HUTS_OAK.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "witch_hut_taiga"), WITCH_HUTS_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsTaigaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsTaigaAverageChunkDistance * 0.5f), 1925189659)).superflatFeature(WITCH_HUTS_TAIGA.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "witch_hut_birch"), WITCH_HUTS_BIRCH).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsBirchAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsBirchAverageChunkDistance * 0.5f), 904634508)).superflatFeature(WITCH_HUTS_BIRCH.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "witch_hut_dark_forest"), WITCH_HUTS_DARK_FOREST).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsDarkForestAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsDarkForestAverageChunkDistance * 0.5f), 165100151)).superflatFeature(WITCH_HUTS_DARK_FOREST.configure(FeatureConfig.DEFAULT)).register();
        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "witch_hut_giant_tree_taiga"), WITCH_HUTS_GIANT_TREE_TAIGA).step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsGiantTreeTaigaAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSWitchHutsConfig.witchHutsGiantTreeTaigaAverageChunkDistance * 0.5f), 200289401)).superflatFeature(WITCH_HUTS_GIANT_TREE_TAIGA.configure(FeatureConfig.DEFAULT)).register();

        FabricStructureBuilder.create(new Identifier(RepurposedStructures.MODID, "bastion_underground"), BASTION_UNDERGROUND).step(GenerationStep.Feature.UNDERGROUND_STRUCTURES).defaultConfig(new StructureConfig(RepurposedStructures.RSAllConfig.RSBastionsConfig.bastionUndergroundAverageChunkDistance, (int) (RepurposedStructures.RSAllConfig.RSBastionsConfig.bastionUndergroundAverageChunkDistance * 0.5f), 1359301629)).superflatFeature(BASTION_UNDERGROUND.configure(FeatureConfig.DEFAULT)).register();

        RS_STRUCTURES.putAll(StructuresConfig.DEFAULT_STRUCTURES);
        RS_STRUCTURES.putAll(FabricStructureImpl.STRUCTURE_TO_CONFIG_MAP); // Override DEFAULT_STRUCTURES by default for same key as FabricStructureImpl is what is used for worldgen
        RS_STRUCTURES.keySet().removeIf(key -> key.getName() == null || !key.getName().contains(RepurposedStructures.MODID));

        //registers the structure pieces.
        RSStructurePieces.registerStructurePieces();
    }
}
