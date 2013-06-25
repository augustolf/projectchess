package com.deploy.ligbdx;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.deploy.libgdx.GameRoot;

public class LibgdxGame {

    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Jogo de Exemplo Libgdx";
        config.fullscreen = false;
        config.resizable = false;
        config.width = 540;
        config.height = 430;
        config.samples = 2;
        config.useGL20 = true;
        
        new LwjglApplication(new GameRoot(), config);
    }

}
