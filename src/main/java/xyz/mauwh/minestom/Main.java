package xyz.mauwh.minestom;

import net.minestom.server.MinecraftServer;

public final class Main {

    public static void main(String[] args) {
        MinecraftServer.init().start("0.0.0.0", 25565);
    }

}
