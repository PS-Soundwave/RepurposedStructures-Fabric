package com.telepathicgrunt.repurposedstructures.world.processors;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.telepathicgrunt.repurposedstructures.modinit.RSProcessors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.structure.Structure;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.Chunk;

/**
 * FOR ELEMENTS USING legacy_single_pool_element AND WANTS AIR TO REPLACE TERRAIN.
 */
public class FloodWithWaterProcessor extends StructureProcessor {

    public static final Codec<FloodWithWaterProcessor> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
            Codec.INT.fieldOf("flood_level").forGetter(config -> config.floodLevel)
    ).apply(instance, instance.stable(FloodWithWaterProcessor::new)));

    private final int floodLevel;

    private FloodWithWaterProcessor(int floodLevel) {
        this.floodLevel = floodLevel;
    }

    @Override
    public Structure.StructureBlockInfo process(WorldView worldView, BlockPos pos, BlockPos blockPos, Structure.StructureBlockInfo structureBlockInfoLocal, Structure.StructureBlockInfo structureBlockInfoWorld, StructurePlacementData structurePlacementData) {
        if(structureBlockInfoWorld.state.getFluidState().isIn(FluidTags.WATER)){
            tickWaterFluid(worldView, structureBlockInfoWorld);
            return structureBlockInfoWorld;
        }
        else if(structureBlockInfoWorld.state.getBlock() instanceof PlantBlock){
            structureBlockInfoWorld = new Structure.StructureBlockInfo(structureBlockInfoWorld.pos, Blocks.WATER.getDefaultState(), null);
            tickWaterFluid(worldView, structureBlockInfoWorld);
        }

        if (structureBlockInfoWorld.pos.getY() <= floodLevel) {
            if(structureBlockInfoWorld.state.isAir()){
                structureBlockInfoWorld = new Structure.StructureBlockInfo(structureBlockInfoWorld.pos, Blocks.WATER.getDefaultState(), null);
                tickWaterFluid(worldView, structureBlockInfoWorld);
            }
            else if(structureBlockInfoWorld.state.contains(Properties.WATERLOGGED)){
                structureBlockInfoWorld = new Structure.StructureBlockInfo(structureBlockInfoWorld.pos, structureBlockInfoWorld.state.with(Properties.WATERLOGGED, true), null);
                tickWaterFluid(worldView, structureBlockInfoWorld);
            }
        }
        return structureBlockInfoWorld;
    }

    private void tickWaterFluid(WorldView worldView, Structure.StructureBlockInfo structureBlockInfoWorld) {
        Chunk currentChunk = worldView.getChunk(structureBlockInfoWorld.pos);
        currentChunk.getFluidTickScheduler().schedule(structureBlockInfoWorld.pos, Fluids.WATER, 1);
    }

    @Override
    protected StructureProcessorType<?> getType() {
        return RSProcessors.FLOOD_WITH_WATER_PROCESSOR;
    }
}