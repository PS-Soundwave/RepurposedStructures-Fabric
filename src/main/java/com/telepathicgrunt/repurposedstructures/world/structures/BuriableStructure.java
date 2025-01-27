package com.telepathicgrunt.repurposedstructures.world.structures;

import com.telepathicgrunt.repurposedstructures.modinit.RSStructures;
import com.telepathicgrunt.repurposedstructures.utils.GeneralUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.structures.JigsawPlacement;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureManager;


public class BuriableStructure extends AbstractBaseStructure<NoneFeatureConfiguration> {

    private final ResourceLocation startPool;
    private final int offsetAmount;
    private final boolean onLand;
    private final boolean cannotSpawnInWater;

    public BuriableStructure(ResourceLocation startPool, int offsetAmount, boolean onLand, boolean cannotSpawnInWater) {
        super(NoneFeatureConfiguration.CODEC);
        this.startPool = startPool;
        RSStructures.RS_STRUCTURE_START_PIECES.add(this.startPool);
        this.offsetAmount = offsetAmount;
        this.onLand = onLand;
        this.cannotSpawnInWater = cannotSpawnInWater;
    }

    @Override
    protected boolean isFeatureChunk(ChunkGenerator chunkGenerator, BiomeSource biomeSource, long seed, WorldgenRandom chunkRandom, ChunkPos chunkPos1, Biome biome, ChunkPos chunkPos, NoneFeatureConfiguration defaultFeatureConfig, LevelHeightAccessor heightLimitView) {

        if(cannotSpawnInWater){
            BlockPos cornerOfSpawnChunk = chunkPos.getWorldPosition();
            int landHeight = chunkGenerator.getFirstOccupiedHeight(cornerOfSpawnChunk.getX(), cornerOfSpawnChunk.getZ(), Heightmap.Types.WORLD_SURFACE_WG, heightLimitView);
            NoiseColumn columnOfBlocks = chunkGenerator.getBaseColumn(cornerOfSpawnChunk.getX(), cornerOfSpawnChunk.getZ(), heightLimitView);
            BlockState topBlock = columnOfBlocks.getBlockState(cornerOfSpawnChunk.above(landHeight));
            return topBlock.getFluidState().isEmpty();
        }

        return true;
    }

    @Override
    public StructureFeature.StructureStartFactory<NoneFeatureConfiguration> getStartFactory() {
        return BuriableStructure.Start::new;
    }

    public class Start extends StructureStart<NoneFeatureConfiguration> {

        public Start(StructureFeature<NoneFeatureConfiguration> structureIn, ChunkPos chunkPos1, int referenceIn, long seedIn) {
            super(structureIn, chunkPos1, referenceIn, seedIn);
        }

        @Override
        public void generatePieces(RegistryAccess dynamicRegistryManager, ChunkGenerator chunkGenerator, StructureManager structureManager, ChunkPos chunkPos1, Biome biome, NoneFeatureConfiguration defaultFeatureConfig, LevelHeightAccessor heightLimitView) {
            BlockPos blockpos = new BlockPos(chunkPos1.getMinBlockX(), chunkGenerator.getSeaLevel(), chunkPos1.getMinBlockZ());
            JigsawPlacement.addPieces(
                    dynamicRegistryManager,
                    new JigsawConfiguration(() -> dynamicRegistryManager.registryOrThrow(Registry.TEMPLATE_POOL_REGISTRY).get(startPool), 11),
                    PoolElementStructurePiece::new,
                    chunkGenerator,
                    structureManager,
                    blockpos,
                    this,
                    random,
                    false,
                    false,
                    heightLimitView);
            GeneralUtils.centerAllPieces(blockpos, this.pieces);
            this.getBoundingBox();
            Heightmap.Types heightMapToUse = onLand ? Heightmap.Types.WORLD_SURFACE_WG : Heightmap.Types.OCEAN_FLOOR_WG;

            BoundingBox box = this.pieces.get(0).getBoundingBox();
            int highestLandPos = chunkGenerator.getBaseHeight(box.minX(), box.minZ(), heightMapToUse, heightLimitView);
            highestLandPos = Math.min(highestLandPos, chunkGenerator.getBaseHeight(box.minX(), box.maxZ(), heightMapToUse, heightLimitView));
            highestLandPos = Math.min(highestLandPos, chunkGenerator.getBaseHeight(box.maxX(), box.minZ(), heightMapToUse, heightLimitView));
            highestLandPos = Math.min(highestLandPos, chunkGenerator.getBaseHeight(box.maxX(), box.maxZ(), heightMapToUse, heightLimitView));

            if(!onLand){
                int maxHeightForSubmerging = chunkGenerator.getSeaLevel() - box.getYSpan();
                highestLandPos = Math.min(highestLandPos, maxHeightForSubmerging);
            }

            this.moveInsideHeights(this.random, highestLandPos-(offsetAmount+1), highestLandPos-offsetAmount);
        }
    }


    public static class Builder<T extends BuriableStructure.Builder<T>> {
        private final ResourceLocation startPool;
        private int offsetAmount = 14;
        private boolean onLand = true;
        private boolean cannotSpawnInWater = true;

        public Builder(ResourceLocation startPool) {
            this.startPool = startPool;
        }

        @SuppressWarnings("unchecked")
        protected T getThis() {
            return (T) this;
        }

        public T setOffsetAmount(int offsetAmount){
            this.offsetAmount = offsetAmount;
            return getThis();
        }

        public T useOceanHeightmap(){
            this.onLand = false;
            return getThis();
        }

        public T cannotSpawnInWater(){
            this.cannotSpawnInWater = false;
            return getThis();
        }

        public BuriableStructure build() {
            return new BuriableStructure(
                    startPool,
                    offsetAmount,
                    onLand,
                    cannotSpawnInWater
            );
        }
    }
}