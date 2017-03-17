import java.util.List;

/**
 * Created by admin on 27.02.2017.
 */
public class SnakeController {

    private Food food;
    private Snake snake;
    private SnakeWorker snakeWorker;

    private IEmittable emitter;

    public SnakeController(Snake snake, Food food) {
        SnakeCallback sc = new SnakeCallback(this);

        this.food = food;
        this.snake = snake;
        this.snakeWorker = new SnakeWorker(sc);

        this.emitter = new Keyboard(this.snake);

        Thread snakeThread = new Thread(this.snakeWorker);
        snakeThread.start();
    }

    public void growSnake() {
        if(this.snake.collides(this.food)) {
            SnakeBody snakeBody = this.snake.getBody();

            snakeWorker.setFrameTime();
            snakeBody.append(this.snake.getPosition());

            this.food.setLocation(this.snake);
        }
    }

    public void moveSnake() {
        Vector2D snakePos = this.snake.getPosition();

        SnakeBody body = this.snake.getBody();
        List<int[]> bodyParts = body.getParts();
        for(int i = 0; i < bodyParts.size()-1; i++) {
            bodyParts.set(i, bodyParts.get(i+1));
        }

        bodyParts.remove(bodyParts.size()-1);
        bodyParts.add(this.snake.getPositionAsArray());

        System.out.println("Snake is moving..." + snakePos.getY());
    }
}
