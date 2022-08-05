package com.example.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    //    bit.ly/leaguemcdl
    //    ./gradlew runClient
    //    9203761810494409281
    //    5819196019061264483

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Block> FANCY_ORE = BLOCKS.register("fancy_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<BlockItem> FANCY_ORE_ITEM = ITEMS.register("fancy_ore_item", () -> new BlockItem(FANCY_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MY_AXE = ITEMS.register("my_axe", () -> new AxeItem(ItemTier.NETHERITE, 15, -2.8f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_PICKAXE = ITEMS.register("my_pickaxe", () -> new PickaxeItem(ItemTier.NETHERITE, 2, -1.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_SHOVEL = ITEMS.register("my_shovel", () -> new ShovelItem(ItemTier.NETHERITE, 3, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_SWORD = ITEMS.register("my_sword", () -> new SwordItem(ItemTier.NETHERITE, 8, -0.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_HOE = ITEMS.register("my_hoe", () -> new HoeItem(ItemTier.NETHERITE, 1, -1.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_BOW = ITEMS.register("my_bow", () -> new BowItem(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> DAMAGE = ITEMS.register("damage", () -> new SwordItem(ItemTier.NETHERITE, 99999, -0.1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_CROSSBOW = ITEMS.register("my_crossbow", () -> new CrossbowItem(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> THROWABLE_ARROW = ITEMS.register("throwable_arrow", () -> new BowItem(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Block> NETHER_BLOCK = BLOCKS.register("nether_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<BlockItem> NETHER_BLOCK_ITEM = ITEMS.register("nether_block_item", () -> new BlockItem(NETHER_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordItem(ItemTier.STONE, 3, -1.8f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(ItemTier.STONE, 1, -2.8f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_AXE= ITEMS.register("redstone_axe", () -> new AxeItem(ItemTier.STONE, 5, -3.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(ItemTier.STONE, 2, -2.9f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeItem(ItemTier.STONE, 1, -2.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> EMERALD_SWORD= ITEMS.register("emerald_sword", () -> new SwordItem(ItemTier.STONE, 2, -1.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ItemTier.WOOD, 2, -1.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ItemTier.STONE, 3, -2.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ItemTier.STONE, 1, -1.4f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ItemTier.WOOD, 1, -1.8f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> LAPIS_SWORD= ITEMS.register("lapis_sword", () -> new SwordItem(ItemTier.IRON, 5, -3.2f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(ItemTier.IRON, 2, -3.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(ItemTier.IRON, 27, -3.9f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(ItemTier.IRON, 3, -3.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(ItemTier.IRON, 1, -3.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_SWORD= ITEMS.register("copper_sword", () -> new SwordItem(ItemTier.STONE, 2, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ItemTier.STONE, 1, -2.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ItemTier.STONE, 3, -3.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ItemTier.STONE, 1, -2.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ItemTier.STONE, 1, -2.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> NETHER_STAR_SWORD= ITEMS.register("nether_star_sword", () -> new SwordItem(ItemTier.NETHERITE, 8, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHER_STAR_PICKAXE = ITEMS.register("nether_star_pickaxe", () -> new PickaxeItem(ItemTier.NETHERITE, 6, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHER_STAR_AXE = ITEMS.register("nether_star_axe", () -> new AxeItem(ItemTier.NETHERITE, 16, -2.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHER_STAR_SHOVEL = ITEMS.register("nether_star_shovel", () -> new ShovelItem(ItemTier.NETHERITE, 5, -2.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHER_STAR_HOE = ITEMS.register("nether_star_hoe", () -> new HoeItem(ItemTier.NETHERITE, 3, -2.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> COAL_SWORD= ITEMS.register("coal_sword", () -> new SwordItem(ItemTier.WOOD, 2, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COAL_PICKAXE = ITEMS.register("coal_pickaxe", () -> new PickaxeItem(ItemTier.WOOD, 1, -2.6f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COAL_AXE = ITEMS.register("coal_axe", () -> new AxeItem(ItemTier.WOOD, 3, -3.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COAL_SHOVEL = ITEMS.register("coal_shovel", () -> new ShovelItem(ItemTier.WOOD, 1, -2.9f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COAL_HOE = ITEMS.register("coal_hoe", () -> new HoeItem(ItemTier.WOOD, 1, -2.7f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> MAGMA_SWORD= ITEMS.register("magma_sword", () -> new SwordItem(ItemTier.IRON, 4, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGMA_PICKAXE = ITEMS.register("magma_pickaxe", () -> new PickaxeItem(ItemTier.IRON, 2, -2.4f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGMA_AXE = ITEMS.register("magma_axe", () -> new AxeItem(ItemTier.IRON, 6, -3.8f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGMA_SHOVEL = ITEMS.register("magma_shovel", () -> new ShovelItem(ItemTier.IRON, 1, -2.9f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGMA_HOE = ITEMS.register("magma_hoe", () -> new HoeItem(ItemTier.IRON, 1, -2.7f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> BREAD_SWORD= ITEMS.register("bread_sword", () -> new SwordItem(ItemTier.STONE, 8, -3.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    //public static final RegistryObject<Item> _SWORD= ITEMS.register("_sword", () -> new SwordItem(ItemTier.WOOD, 2, -2.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    //public static final RegistryObject<Item> _PICKAXE = ITEMS.register("_pickaxe", () -> new PickaxeItem(ItemTier.WOOD, 1, -2.6f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    //public static final RegistryObject<Item> _AXE = ITEMS.register("_axe", () -> new AxeItem(ItemTier.WOOD, 3, -3.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    //public static final RegistryObject<Item> _SHOVEL = ITEMS.register("_shovel", () -> new ShovelItem(ItemTier.WOOD, 1, -2.9f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    //public static final RegistryObject<Item> _HOE = ITEMS.register("_hoe", () -> new HoeItem(ItemTier.WOOD, 1, -2.7f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

}