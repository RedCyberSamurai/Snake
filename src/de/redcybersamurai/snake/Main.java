package de.redcybersamurai.snake;

import de.redcybersamurai.snake.Controller.UserInterfaceController;
import de.redcybersamurai.snake.UI.JavaSwingInterface;
import de.redcybersamurai.snake.UI.IUserInterface;

/**
 * Created by admin on 27.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        IUserInterface userInterface = new JavaSwingInterface();
        UserInterfaceController jsi = new UserInterfaceController(userInterface);
    }
}
