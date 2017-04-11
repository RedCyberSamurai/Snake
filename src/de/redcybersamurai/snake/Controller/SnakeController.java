package de.redcybersamurai.snake.Controller;

import de.redcybersamurai.snake.Actor.Food;
import de.redcybersamurai.snake.Actor.Property.Direction2D;
import de.redcybersamurai.snake.Actor.Property.Vector2D;
import de.redcybersamurai.snake.Actor.Snake;
import de.redcybersamurai.snake.Actor.SnakeBody;
import de.redcybersamurai.snake.Callback.SnakeCallback;
import de.redcybersamurai.snake.Emitter.IEmittable;
import de.redcybersamurai.snake.Emitter.Keyboard;
import de.redcybersamurai.snake.Worker.SnakeWorker;

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

    public IEmittable getEmitter() {
        return this.emitter;
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
        this.positionSnakeHead();

        SnakeBody body = this.snake.getBody();
        List<int[]> bodyParts = body.getParts();
        for(int i = 0; i < bodyParts.size()-1; i++) {
            bodyParts.set(i, bodyParts.get(i+1));
        }

        bodyParts.remove(bodyParts.size()-1);
        bodyParts.add(this.snake.getPositionAsArray());
    }

    private void positionSnakeHead() {
        Vector2D snakePos = this.snake.getPosition();
        byte snakeDirection = this.snake.getDirection();

        switch (snakeDirection) {
            case Direction2D.LOOK_UP:
                snakePos.setY(snakePos.getY()-1);
                break;
            case Direction2D.LOOK_RIGHT:
                snakePos.setX(snakePos.getX()+1);
                break;
            case Direction2D.LOOK_DOWN:
                snakePos.setY(snakePos.getY()+1);
                break;
            case Direction2D.LOOK_LEFT:
                snakePos.setX(snakePos.getX()-1);
                break;
        }
    }
}
