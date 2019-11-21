package net.minecraft.server;

import java.util.function.Predicate;

public class BlockProperties {

    public static final BlockStateBoolean a = BlockStateBoolean.of("attached");
    public static final BlockStateBoolean b = BlockStateBoolean.of("bottom");
    public static final BlockStateBoolean c = BlockStateBoolean.of("conditional");
    public static final BlockStateBoolean d = BlockStateBoolean.of("disarmed");
    public static final BlockStateBoolean e = BlockStateBoolean.of("drag");
    public static final BlockStateBoolean f = BlockStateBoolean.of("enabled");
    public static final BlockStateBoolean g = BlockStateBoolean.of("extended");
    public static final BlockStateBoolean h = BlockStateBoolean.of("eye");
    public static final BlockStateBoolean i = BlockStateBoolean.of("falling");
    public static final BlockStateBoolean j = BlockStateBoolean.of("hanging");
    public static final BlockStateBoolean k = BlockStateBoolean.of("has_bottle_0");
    public static final BlockStateBoolean l = BlockStateBoolean.of("has_bottle_1");
    public static final BlockStateBoolean m = BlockStateBoolean.of("has_bottle_2");
    public static final BlockStateBoolean n = BlockStateBoolean.of("has_record");
    public static final BlockStateBoolean o = BlockStateBoolean.of("has_book");
    public static final BlockStateBoolean p = BlockStateBoolean.of("inverted");
    public static final BlockStateBoolean q = BlockStateBoolean.of("in_wall");
    public static final BlockStateBoolean r = BlockStateBoolean.of("lit");
    public static final BlockStateBoolean s = BlockStateBoolean.of("locked");
    public static final BlockStateBoolean t = BlockStateBoolean.of("occupied");
    public static final BlockStateBoolean u = BlockStateBoolean.of("open");
    public static final BlockStateBoolean v = BlockStateBoolean.of("persistent");
    public static final BlockStateBoolean w = BlockStateBoolean.of("powered");
    public static final BlockStateBoolean x = BlockStateBoolean.of("short");
    public static final BlockStateBoolean y = BlockStateBoolean.of("signal_fire");
    public static final BlockStateBoolean z = BlockStateBoolean.of("snowy");
    public static final BlockStateBoolean A = BlockStateBoolean.of("triggered");
    public static final BlockStateBoolean B = BlockStateBoolean.of("unstable");
    public static final BlockStateBoolean C = BlockStateBoolean.of("waterlogged");
    public static final BlockStateEnum<EnumDirection.EnumAxis> D = BlockStateEnum.of("axis", EnumDirection.EnumAxis.class, EnumDirection.EnumAxis.X, EnumDirection.EnumAxis.Z);
    public static final BlockStateEnum<EnumDirection.EnumAxis> E = BlockStateEnum.of("axis", EnumDirection.EnumAxis.class);
    public static final BlockStateBoolean F = BlockStateBoolean.of("up");
    public static final BlockStateBoolean G = BlockStateBoolean.of("down");
    public static final BlockStateBoolean H = BlockStateBoolean.of("north");
    public static final BlockStateBoolean I = BlockStateBoolean.of("east");
    public static final BlockStateBoolean J = BlockStateBoolean.of("south");
    public static final BlockStateBoolean K = BlockStateBoolean.of("west");
    public static final BlockStateDirection L = BlockStateDirection.a("facing", EnumDirection.NORTH, EnumDirection.EAST, EnumDirection.SOUTH, EnumDirection.WEST, EnumDirection.UP, EnumDirection.DOWN);
    public static final BlockStateDirection M = BlockStateDirection.a("facing", (enumdirection) -> {
        return enumdirection != EnumDirection.UP;
    });
    public static final BlockStateDirection N = BlockStateDirection.a("facing", (Predicate) EnumDirection.EnumDirectionLimit.HORIZONTAL);
    public static final BlockStateEnum<BlockPropertyAttachPosition> O = BlockStateEnum.of("face", BlockPropertyAttachPosition.class);
    public static final BlockStateEnum<BlockPropertyBellAttach> P = BlockStateEnum.of("attachment", BlockPropertyBellAttach.class);
    public static final BlockStateEnum<BlockPropertyRedstoneSide> Q = BlockStateEnum.of("east", BlockPropertyRedstoneSide.class);
    public static final BlockStateEnum<BlockPropertyRedstoneSide> R = BlockStateEnum.of("north", BlockPropertyRedstoneSide.class);
    public static final BlockStateEnum<BlockPropertyRedstoneSide> S = BlockStateEnum.of("south", BlockPropertyRedstoneSide.class);
    public static final BlockStateEnum<BlockPropertyRedstoneSide> T = BlockStateEnum.of("west", BlockPropertyRedstoneSide.class);
    public static final BlockStateEnum<BlockPropertyDoubleBlockHalf> U = BlockStateEnum.of("half", BlockPropertyDoubleBlockHalf.class);
    public static final BlockStateEnum<BlockPropertyHalf> V = BlockStateEnum.of("half", BlockPropertyHalf.class);
    public static final BlockStateEnum<BlockPropertyTrackPosition> W = BlockStateEnum.of("shape", BlockPropertyTrackPosition.class);
    public static final BlockStateEnum<BlockPropertyTrackPosition> X = BlockStateEnum.a("shape", BlockPropertyTrackPosition.class, (blockpropertytrackposition) -> {
        return blockpropertytrackposition != BlockPropertyTrackPosition.NORTH_EAST && blockpropertytrackposition != BlockPropertyTrackPosition.NORTH_WEST && blockpropertytrackposition != BlockPropertyTrackPosition.SOUTH_EAST && blockpropertytrackposition != BlockPropertyTrackPosition.SOUTH_WEST;
    });
    public static final BlockStateInteger Y = BlockStateInteger.of("age", 0, 1);
    public static final BlockStateInteger Z = BlockStateInteger.of("age", 0, 2);
    public static final BlockStateInteger aa = BlockStateInteger.of("age", 0, 3);
    public static final BlockStateInteger ab = BlockStateInteger.of("age", 0, 5);
    public static final BlockStateInteger ac = BlockStateInteger.of("age", 0, 7);
    public static final BlockStateInteger ad = BlockStateInteger.of("age", 0, 15);
    public static final BlockStateInteger ae = BlockStateInteger.of("age", 0, 25);
    public static final BlockStateInteger af = BlockStateInteger.of("bites", 0, 6);
    public static final BlockStateInteger ag = BlockStateInteger.of("delay", 1, 4);
    public static final BlockStateInteger ah = BlockStateInteger.of("distance", 1, 7);
    public static final BlockStateInteger ai = BlockStateInteger.of("eggs", 1, 4);
    public static final BlockStateInteger aj = BlockStateInteger.of("hatch", 0, 2);
    public static final BlockStateInteger ak = BlockStateInteger.of("layers", 1, 8);
    public static final BlockStateInteger al = BlockStateInteger.of("level", 0, 3);
    public static final BlockStateInteger am = BlockStateInteger.of("level", 0, 8);
    public static final BlockStateInteger an = BlockStateInteger.of("level", 1, 8);
    public static final BlockStateInteger ao = BlockStateInteger.of("level", 0, 15);
    public static final BlockStateInteger ap = BlockStateInteger.of("moisture", 0, 7);
    public static final BlockStateInteger aq = BlockStateInteger.of("note", 0, 24);
    public static final BlockStateInteger ar = BlockStateInteger.of("pickles", 1, 4);
    public static final BlockStateInteger as = BlockStateInteger.of("power", 0, 15);
    public static final BlockStateInteger at = BlockStateInteger.of("stage", 0, 1);
    public static final BlockStateInteger au = BlockStateInteger.of("distance", 0, 7);
    public static final BlockStateInteger av = BlockStateInteger.of("rotation", 0, 15);
    public static final BlockStateEnum<BlockPropertyBedPart> aw = BlockStateEnum.of("part", BlockPropertyBedPart.class);
    public static final BlockStateEnum<BlockPropertyChestType> ax = BlockStateEnum.of("type", BlockPropertyChestType.class);
    public static final BlockStateEnum<BlockPropertyComparatorMode> ay = BlockStateEnum.of("mode", BlockPropertyComparatorMode.class);
    public static final BlockStateEnum<BlockPropertyDoorHinge> az = BlockStateEnum.of("hinge", BlockPropertyDoorHinge.class);
    public static final BlockStateEnum<BlockPropertyInstrument> aA = BlockStateEnum.of("instrument", BlockPropertyInstrument.class);
    public static final BlockStateEnum<BlockPropertyPistonType> aB = BlockStateEnum.of("type", BlockPropertyPistonType.class);
    public static final BlockStateEnum<BlockPropertySlabType> aC = BlockStateEnum.of("type", BlockPropertySlabType.class);
    public static final BlockStateEnum<BlockPropertyStairsShape> aD = BlockStateEnum.of("shape", BlockPropertyStairsShape.class);
    public static final BlockStateEnum<BlockPropertyStructureMode> aE = BlockStateEnum.of("mode", BlockPropertyStructureMode.class);
    public static final BlockStateEnum<BlockPropertyBambooSize> aF = BlockStateEnum.of("leaves", BlockPropertyBambooSize.class);
}
