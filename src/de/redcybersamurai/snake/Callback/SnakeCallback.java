package de.redcybersamurai.snake.Callback;

import de.redcybersamurai.snake.Controller.SnakeController;

/**
 * Created by admin on 27.02.2017.
 */
public class SnakeCallback implements ICallback {

    private SnakeController snakeController;

    public SnakeCallback(SnakeController snakeController) {
        this.snakeController = snakeController;
    }

    @Override
    public void call() {
        this.snakeController.moveSnake();
        this.snakeController.growSnake();
    }
}
