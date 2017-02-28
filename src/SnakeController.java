import java.util.List;

/**
 * Created by admin on 27.02.2017.
 */
public class SnakeController {

    private Snake snake;
    private SnakeWorker snakeWorker;

    public SnakeController(Snake snake) {
        this.snake = snake;

        SnakeCallback sc = new SnakeCallback(this);

        this.snakeWorker = new SnakeWorker(sc);
        Thread snakeThread = new Thread(this.snakeWorker);
        snakeThread.start();
    }

    public void growSnake() {
        snakeWorker.setFrameTime();
    }

    public void moveSnake() {
        this.snake.setY(this.snake.getY()+1);

        List<int[]> body = this.snake.getBody();
        for(int i = 0; i < body.size()-1; i++) {
            body.set(i, body.get(i+1));
        }

        body.remove(body.size()-1);
        body.add(this.snake.getPosition());

        System.out.println("Snake is moving..." + this.snake.getY());
    }
}
