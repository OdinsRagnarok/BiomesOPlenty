/*******************************************************************************
 * Copyright 2014-2019, the Biomes O' Plenty Team
 *
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 *
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/
package biomesoplenty.common.world.gen.feature;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.common.world.gen.feature.tree.BasicTreeFeature;
import biomesoplenty.common.world.gen.feature.tree.BayouTreeFeature;
import biomesoplenty.common.world.gen.feature.tree.BulbTreeFeature;
import biomesoplenty.common.world.gen.feature.tree.BushTreeFeature;
import biomesoplenty.common.world.gen.feature.tree.MahoganyTreeFeature;
import biomesoplenty.common.world.gen.feature.tree.TaigaTreeFeature;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.AbstractFlowersFeature;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class BOPBiomeFeatures
{
	public static final AbstractTreeFeature<NoFeatureConfig> CONIFEROUS_TREE = new TaigaTreeFeature.Builder().log(BOPBlocks.fir_log.getDefaultState()).leaves(BOPBlocks.fir_leaves.getDefaultState()).minHeight(5).maxHeight(28).create();
	public static final AbstractTreeFeature<NoFeatureConfig> CONIFEROUS_TREE_LARGE = new TaigaTreeFeature.Builder().log(BOPBlocks.fir_log.getDefaultState()).leaves(BOPBlocks.fir_leaves.getDefaultState()).minHeight(20).maxHeight(40).trunkWidth(2).create();
	public static final AbstractTreeFeature<NoFeatureConfig> OAK_TREE = new BasicTreeFeature.Builder().create();
	public static final AbstractTreeFeature<NoFeatureConfig> PINK_CHERRY_TREE = new BasicTreeFeature.Builder().log(BOPBlocks.cherry_log.getDefaultState()).leaves(BOPBlocks.pink_cherry_leaves.getDefaultState()).create();
	public static final AbstractTreeFeature<NoFeatureConfig> WHITE_CHERRY_TREE = new BasicTreeFeature.Builder().log(BOPBlocks.cherry_log.getDefaultState()).leaves(BOPBlocks.white_cherry_leaves.getDefaultState()).create();
	public static final AbstractTreeFeature<NoFeatureConfig> BAYOU_TREE = new BayouTreeFeature.Builder().create();
	public static final AbstractTreeFeature<NoFeatureConfig> BULB_TREE = new BulbTreeFeature.Builder().create();
	public static final AbstractTreeFeature<NoFeatureConfig> MAHOGANY_TREE = new MahoganyTreeFeature.Builder().create();
	public static final AbstractTreeFeature<NoFeatureConfig> BUSH = new BushTreeFeature.Builder().create();

	public static final AbstractFlowersFeature CHERRY_BLOSSOM_GROVE_FLOWERS = new CherryBlossomGroveFlowersFeature();
	public static final AbstractFlowersFeature SHRUBLAND_FLOWERS = new ShrublandFlowersFeature();
	
	public static final SurfaceBuilderConfig LOAMY_GRASS_DIRT_GRAVEL_SURFACE = new SurfaceBuilderConfig(BOPBlocks.loamy_grass_block.getDefaultState(), BOPBlocks.loamy_dirt.getDefaultState(), Blocks.GRAVEL.getDefaultState());
	public static final SurfaceBuilderConfig SILTY_GRASS_DIRT_GRAVEL_SURFACE = new SurfaceBuilderConfig(BOPBlocks.silty_grass_block.getDefaultState(), BOPBlocks.silty_dirt.getDefaultState(), Blocks.GRAVEL.getDefaultState());
}
