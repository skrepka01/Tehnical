package ry.tehnical;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import ry.tehnical.listener.ResponseConnect;
import ry.tehnical.registration.Registration;

import java.util.HashMap;
import java.util.Map;

public final class BuildYourCity extends JavaPlugin {

    // todo: продолжить создавать головы боллов (navigatorBosses)
    public static BuildYourCity instance;
    private final Registration registration = new Registration();
    /**
     * Суть данного режима заключается в том,что...
     * Игрок спавниться в опеределённом месте и ему нужно победить боссов.
     * Для того ,чтоб победить боссов ему нужно прокачать свой уровень .
     * 10 lvl - моб житель
     * Житель ничего не делает ,его просто нужно убить.
     * После убийства жителя,на 25 уровне появляется моб зомби.
     * Зомби имеет 40 хп и уже может наносить урон игроку
     */
    @Override
    public void onEnable() {
        instance = this;
        registration.registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
