package com.devnemo.nemos.vertical.slabs.world.level.block;

import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.NemosVerticalBlockStateProperties;
import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.VerticalSlabType;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block implements SimpleWaterloggedBlock {

    public static final MapCodec<VerticalSlabBlock> CODEC = VerticalSlabBlock.simpleCodec(VerticalSlabBlock::new);
    public static EnumProperty<VerticalSlabType> TYPE = NemosVerticalBlockStateProperties.VERTICAL_SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape FRONT_SHAPE = Block.box(0, 0, 0, 16, 16, 8);
    protected static final VoxelShape LEFT_SHAPE = Block.box(0, 0, 0, 8, 16, 16);
    protected static final VoxelShape RIGHT_SHAPE = Block.box(8, 0, 0, 16, 16, 16);
    protected static final VoxelShape BACK_SHAPE = Block.box(0, 0, 8, 16, 16, 16);
    private static final double leftArea = 0.333;
    private static final double rightArea = 0.666;

    public MapCodec<? extends VerticalSlabBlock> getCodec() {
        return CODEC;
    }

    public VerticalSlabBlock(Properties properties) {
        super(properties);

        this.registerDefaultState(this.defaultBlockState()
                .setValue(TYPE, VerticalSlabType.FRONT)
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected boolean useShapeForLightOcclusion(BlockState state) {
        return state.getValue(TYPE) != VerticalSlabType.DOUBLE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    @Override
    protected @NotNull VoxelShape getShape(
            BlockState state,
            @NotNull BlockGetter blockGetter,
            @NotNull BlockPos pos,
            @NotNull CollisionContext context
    ) {
        var slabType = state.getValue(TYPE);

        return switch (slabType) {
            case DOUBLE -> Shapes.block();
            case FRONT -> FRONT_SHAPE;
            case LEFT -> LEFT_SHAPE;
            case RIGHT -> RIGHT_SHAPE;
            case BACK -> BACK_SHAPE;
        };

    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        var blockPos = blockPlaceContext.getClickedPos();
        var blockState = blockPlaceContext.getLevel().getBlockState(blockPos);

        if (blockState.is(this)) {
            return blockState.setValue(TYPE, VerticalSlabType.DOUBLE).setValue(WATERLOGGED, false);
        }

        var fluidState = blockPlaceContext.getLevel().getFluidState(blockPos);
        var newblockState = this.defaultBlockState()
                .setValue(TYPE, VerticalSlabType.BACK)
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        var direction = blockPlaceContext.getClickedFace();
        var zPos = blockPlaceContext.getClickLocation().z - (double) blockPos.getZ();
        var xPos = blockPlaceContext.getClickLocation().x - (double) blockPos.getX();

        if (direction == Direction.UP || direction == Direction.DOWN) {
            VerticalSlabType type = getVerticalSlabType(zPos, xPos);

            return newblockState.setValue(TYPE, type);
        }

        if (direction == Direction.SOUTH) {
            return getBlockStateForXPos(xPos, newblockState, VerticalSlabType.FRONT);
        } else if (direction == Direction.NORTH) {
            return getBlockStateForXPos(xPos, newblockState, VerticalSlabType.BACK);
        } else if (direction == Direction.WEST) {
            return getBlockStateForZPos(zPos, newblockState, VerticalSlabType.RIGHT);
        } else if (direction == Direction.EAST) {
            return getBlockStateForZPos(zPos, newblockState, VerticalSlabType.LEFT);
        }

        return newblockState;
    }

    private static VerticalSlabType getVerticalSlabType(double zPos, double xPos) {
        var diffZ = 1 - zPos;
        var diffX = 1 - xPos;
        VerticalSlabType type;

        if (zPos > 0.5) {
            if (xPos > 0.5) {
                type = diffX > diffZ ? VerticalSlabType.BACK : VerticalSlabType.RIGHT;
            } else {
                type = xPos > diffZ ? VerticalSlabType.BACK : VerticalSlabType.LEFT;
            }
        } else {
            if (xPos > 0.5) {
                type = diffX > zPos ? VerticalSlabType.FRONT : VerticalSlabType.RIGHT;
            } else {
                type = xPos > zPos ? VerticalSlabType.FRONT : VerticalSlabType.LEFT;
            }
        }

        return type;
    }

    private BlockState getBlockStateForXPos(double xPos, BlockState blockState, VerticalSlabType defaultSlabType) {
        if (xPos < leftArea) {
            return blockState.setValue(TYPE, VerticalSlabType.LEFT);
        }

        if (xPos > rightArea) {
            return blockState.setValue(TYPE, VerticalSlabType.RIGHT);
        }

        return blockState.setValue(TYPE, defaultSlabType);
    }

    private BlockState getBlockStateForZPos(double zPos, BlockState blockState, VerticalSlabType defaultSlabType) {
        if (zPos < leftArea) {
            return blockState.setValue(TYPE, VerticalSlabType.FRONT);
        }

        if (zPos > rightArea) {
            return blockState.setValue(TYPE, VerticalSlabType.BACK);
        }

        return blockState.setValue(TYPE, defaultSlabType);
    }

    @Override
    protected boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        ItemStack itemStack = context.getItemInHand();
        VerticalSlabType slabType = state.getValue(TYPE);

        if (slabType == VerticalSlabType.DOUBLE || !itemStack.is(this.asItem())) {
            return false;
        }

        if (context.replacingClickedOnBlock()) {
            Direction direction = context.getClickedFace();

            if (slabType == VerticalSlabType.FRONT) {
                return direction == Direction.SOUTH;
            }

            if (slabType == VerticalSlabType.BACK) {
                return direction == Direction.NORTH;
            }

            if (slabType == VerticalSlabType.LEFT) {
                return direction == Direction.EAST;
            }

            if (slabType == VerticalSlabType.RIGHT) {
                return direction == Direction.WEST;
            }
        }

        return true;
    }

    @Override
    protected @NotNull FluidState getFluidState(BlockState state) {
        if (state.getValue(WATERLOGGED)) {
            return Fluids.WATER.getSource(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean placeLiquid(
            @NotNull LevelAccessor levelAccessor,
            @NotNull BlockPos pos,
            @NotNull BlockState state,
            @NotNull FluidState fluidState
    ) {
        if (isDoubleVerticalSlab(state)) {
            return SimpleWaterloggedBlock.super.placeLiquid(levelAccessor, pos, state, fluidState);
        }

        return false;
    }

    @Override
    public boolean canPlaceLiquid(
            @Nullable LivingEntity filler,
            @NotNull BlockGetter blockGetter,
            @NotNull BlockPos pos,
            @NotNull BlockState state,
            @NotNull Fluid fluid
    ) {
        if (isDoubleVerticalSlab(state)) {
            return SimpleWaterloggedBlock.super.canPlaceLiquid(filler, blockGetter, pos, state, fluid);
        }
        return false;
    }

    @Override
    protected @NotNull BlockState updateShape(
            BlockState state,
            @NotNull LevelReader levelReader,
            @NotNull ScheduledTickAccess scheduledTickAccess,
            @NotNull BlockPos pos,
            @NotNull Direction direction,
            @NotNull BlockPos neighborPos,
            @NotNull BlockState neighborState,
            @NotNull RandomSource randomSource
    ) {
        if (state.getValue(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(levelReader));
        }
        return super.updateShape(state, levelReader, scheduledTickAccess, pos, direction, neighborPos, neighborState, randomSource);
    }

    @Override
    protected boolean isPathfindable(@NotNull BlockState state, PathComputationType type) {
        return switch (type) {
            case LAND, AIR -> false;
            case WATER -> state.getFluidState().is(FluidTags.WATER);
        };
    }

    private boolean isDoubleVerticalSlab(BlockState state) {
        return state.getValue(TYPE) != VerticalSlabType.DOUBLE;
    }
}
