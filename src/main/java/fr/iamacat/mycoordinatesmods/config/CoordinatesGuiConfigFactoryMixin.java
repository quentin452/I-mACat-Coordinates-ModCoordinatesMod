package fr.iamacat.mycoordinatesmods.config;

import net.minecraft.client.gui.GuiScreen;

import com.falsepattern.lib.config.SimpleGuiFactory;

public class CoordinatesGuiConfigFactoryMixin implements SimpleGuiFactory {

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return CoordinatesGuiConfigMixin.class;
    }
}
