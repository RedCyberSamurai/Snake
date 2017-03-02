/**
 * Created by admin on 27.02.2017.
 */
public class SnakeCallback implements Callback {

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
