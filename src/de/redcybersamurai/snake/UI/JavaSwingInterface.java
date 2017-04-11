package de.redcybersamurai.snake.UI;

import de.redcybersamurai.snake.Actor.World;
import de.redcybersamurai.snake.Scene.IScene;
import de.redcybersamurai.snake.Scene.JavaSwingScene;

import javax.swing.*;

/**
 * Created by admin on 27.02.2017.
 */
public class JavaSwingInterface extends JFrame implements IUserInterface {
    private JPanel jPanel;
    private IScene scene;

    public JavaSwingInterface() {
        this.jPanel = new World();
        this.scene = new JavaSwingScene(jPanel);


        this.add(jPanel);

        // TODO
        this.setTitle("de.redcybersamurai.snake.Actor.Snake Game");
        this.setSize(this.jPanel.getWidth(), this.jPanel.getHeight());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public IScene getScene() {
        return scene;
    }
}
