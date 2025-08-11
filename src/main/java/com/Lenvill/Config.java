package com.Lenvill;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@net.minecraftforge.common.config.Config(modid = Base.MODID)
public class Config {
    public static Configuration config;

    @net.minecraftforge.common.config.Config.Comment("Here's this config option's annotation")
    public static boolean aConfigOption = true;

    @net.minecraftforge.common.config.Config.Comment("Tool for debugging")
    public static boolean advancedLogging = false;
}
