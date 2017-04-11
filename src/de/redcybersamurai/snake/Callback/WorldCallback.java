package de.redcybersamurai.snake.Callback;

import de.redcybersamurai.snake.Callback.ICallback;
import de.redcybersamurai.snake.Scene.IScene;

import javax.swing.*;

/**
 * Created by admin on 27.02.2017.
 */
public class WorldCallback implements ICallback {
    private IScene scene;

    public WorldCallback(IScene scene) {
        this.scene = scene;
    }

    @Override
    public void call() {
        this.scene.repaint();
    }
}
