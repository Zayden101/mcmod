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
    public static final RegistryObject<Item> DAMAGE = ITEMS.register("damage", () -> new HoeItem(ItemTier.NETHERITE, 100, -0.1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MY_CROSSBOW = ITEMS.register("my_crossbow", () -> new CrossbowItem(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> THROWABLE_ARROW = ITEMS.register("throwable_arrow", () -> new BowItem(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Block> NETHER_BLOCK = BLOCKS.register("nether_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<BlockItem> NETHER_BLOCK_ITEM = ITEMS.register("nether_block_item", () -> new BlockItem(NETHER_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> REDSTONEAXE= ITEMS.register("redstoneaxe", () -> new AxeItem(ItemTier.NETHERITE, 10, -1.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONEPICKAXE = ITEMS.register("redstonepickaxe", () -> new PickaxeItem(ItemTier.NETHERITE, 1, -0.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONESHOVEL = ITEMS.register("redstoneshovel", () -> new ShovelItem(ItemTier.NETHERITE, 2, -1.0f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONESWORD = ITEMS.register("redstonesword", () -> new SwordItem(ItemTier.NETHERITE, 4, -0.3f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONEHOE = ITEMS.register("redstonehoe", () -> new HoeItem(ItemTier.NETHERITE, 1, -0.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

}