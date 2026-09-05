package io.github.username.template;

import io.github.username.template.command.*;
import io.papermc.paper.plugin.bootstrap.*;
import io.papermc.paper.plugin.lifecycle.event.types.*;
import org.bukkit.plugin.java.*;
import org.jetbrains.annotations.*;

@SuppressWarnings({"UnstableApiUsage", "unused"})
public final class Bootstrap implements PluginBootstrap {

    @Override
    public void bootstrap(@NotNull BootstrapContext context) {
        var lifecycleManager = context.getLifecycleManager();

        lifecycleManager.registerEventHandler(LifecycleEvents.COMMANDS, commands -> {
            commands.registrar().register(Command.create());
        });
    }

    @Override
    public @NotNull JavaPlugin createPlugin(@NotNull PluginProviderContext context) {
        return new Main(context.getLogger());
    }
}
