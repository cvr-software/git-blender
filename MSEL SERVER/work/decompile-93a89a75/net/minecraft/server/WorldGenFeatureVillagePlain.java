package net.minecraft.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class WorldGenFeatureVillagePlain {

    public static void a() {}

    static {
        ImmutableList<DefinedStructureProcessor> immutablelist = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.8F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestTag(TagsBlock.DOORS), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.WALL_TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.07F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.MOSSY_COBBLESTONE, 0.07F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHITE_TERRACOTTA, 0.07F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.OAK_LOG, 0.05F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.OAK_PLANKS, 0.1F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.OAK_STAIRS, 0.1F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.STRIPPED_OAK_LOG, 0.02F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.GLASS_PANE, 0.5F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates[]{new DefinedStructureProcessorPredicates(new DefinedStructureTestBlockState((IBlockData) ((IBlockData) Blocks.GLASS_PANE.getBlockData().set(BlockIronBars.NORTH, true)).set(BlockIronBars.SOUTH, true)), DefinedStructureTestTrue.a, (IBlockData) ((IBlockData) Blocks.BROWN_STAINED_GLASS_PANE.getBlockData().set(BlockIronBars.NORTH, true)).set(BlockIronBars.SOUTH, true)), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlockState((IBlockData) ((IBlockData) Blocks.GLASS_PANE.getBlockData().set(BlockIronBars.EAST, true)).set(BlockIronBars.WEST, true)), DefinedStructureTestTrue.a, (IBlockData) ((IBlockData) Blocks.BROWN_STAINED_GLASS_PANE.getBlockData().set(BlockIronBars.EAST, true)).set(BlockIronBars.WEST, true)), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.3F), DefinedStructureTestTrue.a, Blocks.CARROTS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.2F), DefinedStructureTestTrue.a, Blocks.POTATOES.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.1F), DefinedStructureTestTrue.a, Blocks.BEETROOTS.getBlockData())})));
        ImmutableList<DefinedStructureProcessor> immutablelist1 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.1F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/town_centers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/town_centers/plains_fountain_01", ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.2F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()))))), 50), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/town_centers/plains_meeting_point_1", ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.2F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()))))), 50), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/town_centers/plains_meeting_point_2"), 50), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/town_centers/plains_meeting_point_3", ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.7F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()))))), 50), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/town_centers/plains_fountain_01", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/town_centers/plains_meeting_point_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/town_centers/plains_meeting_point_2", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/town_centers/plains_meeting_point_3", immutablelist), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        ImmutableList<DefinedStructureProcessor> immutablelist2 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.GRASS_PATH), new DefinedStructureTestBlock(Blocks.WATER), Blocks.OAK_PLANKS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.GRASS_PATH, 0.1F), DefinedStructureTestTrue.a, Blocks.GRASS_BLOCK.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.GRASS_BLOCK), new DefinedStructureTestBlock(Blocks.WATER), Blocks.WATER.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.DIRT), new DefinedStructureTestBlock(Blocks.WATER), Blocks.WATER.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/streets"), new MinecraftKey("village/plains/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/corner_01", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/corner_02", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/corner_03", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/straight_01", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/straight_02", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/straight_03", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/straight_04", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/straight_05", immutablelist2), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/straight_06", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/crossroad_01", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/crossroad_02", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/crossroad_03", immutablelist2), 2), new Pair[]{new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/crossroad_04", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/crossroad_05", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/crossroad_06", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/streets/turn_01", immutablelist2), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/zombie/streets"), new MinecraftKey("village/plains/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/corner_01", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/corner_02", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/corner_03", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/straight_01", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/straight_02", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/straight_03", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/straight_04", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/straight_05", immutablelist2), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/straight_06", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/crossroad_01", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/crossroad_02", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/crossroad_03", immutablelist2), 2), new Pair[]{new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/crossroad_04", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/crossroad_05", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/crossroad_06", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/streets/turn_01", immutablelist2), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        ImmutableList<DefinedStructureProcessor> immutablelist3 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.3F), DefinedStructureTestTrue.a, Blocks.CARROTS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.2F), DefinedStructureTestTrue.a, Blocks.POTATOES.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.1F), DefinedStructureTestTrue.a, Blocks.BEETROOTS.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/houses"), new MinecraftKey("village/plains/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_2", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_3", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_4", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_5", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_6", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_7", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_house_8", immutablelist1), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_medium_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_medium_house_2", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_big_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_butcher_shop_1", immutablelist1), 2), new Pair[]{new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_butcher_shop_2", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_tool_smith_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_fletcher_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_shepherds_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_armorer_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_fisher_cottage_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_tannery_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_cartographer_1", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_library_1", immutablelist1), 5), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_library_2", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_masons_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_weaponsmith_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_temple_3", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_temple_4", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_stable_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_stable_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_large_farm_1", immutablelist3), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_farm_1", immutablelist3), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_animal_pen_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_animal_pen_2"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_animal_pen_3"), 5), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_accessory_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_meeting_point_4", ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.7F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()))))), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_meeting_point_5"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 10)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/zombie/houses"), new MinecraftKey("village/plains/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_3", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_4", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_5", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_6", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_7", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_small_house_8", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_medium_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_medium_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_big_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_butcher_shop_1", immutablelist), 2), new Pair[]{new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_butcher_shop_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_tool_smith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_fletcher_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_shepherds_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_armorer_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_fisher_cottage_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_tannery_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_cartographer_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_library_1", immutablelist), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_library_2", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_masons_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_weaponsmith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_temple_3", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_temple_4", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_stable_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_stable_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_large_farm_1", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_small_farm_1", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_animal_pen_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/houses/plains_animal_pen_2", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_animal_pen_3", immutablelist), 5), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_meeting_point_4", immutablelist), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/houses/plains_meeting_point_5", immutablelist), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 10)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/terminators"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_01", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_02", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_03", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_04", immutablelist2), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/trees"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.NORMAL_TREE, WorldGenFeatureConfiguration.e)), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/plains_lamp_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.NORMAL_TREE, WorldGenFeatureConfiguration.e)), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.PLAIN_FLOWER, WorldGenFeatureConfiguration.e)), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.HAY_PILE, WorldGenFeatureConfiguration.e)), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 2)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/zombie/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/plains_lamp_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.NORMAL_TREE, WorldGenFeatureConfiguration.e)), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.PLAIN_FLOWER, WorldGenFeatureConfiguration.e)), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.HAY_PILE, WorldGenFeatureConfiguration.e)), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 2)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/villagers/baby"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/plains/zombie/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/zombie/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/common/animals"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cows_1"), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/pigs_1"), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/horses_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/horses_2"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/horses_3"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/horses_4"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/horses_5"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/sheep_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/sheep_2"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 5)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/common/sheep"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/sheep_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/sheep_2"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/common/cats"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_black"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_british"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_calico"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_persian"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_ragdoll"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_red"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_siamese"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_tabby"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_white"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cat_jellie"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 3)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/common/butcher_animals"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/cows_1"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/pigs_1"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/sheep_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/animals/sheep_2"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/common/iron_golem"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/iron_golem"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/common/well_bottoms"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/common/well_bottom"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
