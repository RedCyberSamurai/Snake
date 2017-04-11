package de.redcybersamurai.snake.Controller;

import de.redcybersamurai.snake.Callback.WorldCallback;
import de.redcybersamurai.snake.Scene.IScene;
import de.redcybersamurai.snake.UI.IUserInterface;
import de.redcybersamurai.snake.Worker.WorldWorker;

/**
 * Created by admin on 27.02.2017.
 */
public class UserInterfaceController {
    private IUserInterface ui;

    public UserInterfaceController(IUserInterface ui) {
        this.ui = ui;

        WorldCallback wc = new WorldCallback(this.ui.getScene());
        WorldWorker ww = new WorldWorker(wc);
        Thread worldThread = new Thread(ww);
        worldThread.start();
    }
}
