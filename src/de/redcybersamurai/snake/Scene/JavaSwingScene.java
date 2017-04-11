package de.redcybersamurai.snake.Scene;

import javax.swing.*;

/**
 * Created by Dante on 02.04.2017.
 */
public class JavaSwingScene implements IScene {

    private JPanel jPanel;

    public JavaSwingScene(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    @Override
    public void repaint() {
        jPanel.repaint();
    }
}
