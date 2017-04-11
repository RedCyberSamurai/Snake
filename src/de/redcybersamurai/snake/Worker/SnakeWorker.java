package de.redcybersamurai.snake.Worker;

import de.redcybersamurai.snake.Callback.SnakeCallback;

/**
 * Created by admin on 27.02.2017.
 */
public class SnakeWorker implements Runnable {
    private boolean isRunning = true;
    private int frameTime = 500;
    private double decreaseTime = 0.8;

    private SnakeCallback snakeCallback;

    public SnakeWorker(SnakeCallback snakeCallback) {
        this.snakeCallback = snakeCallback;
    }

    public void terminate() {
        this.isRunning = false;
    }

    public void setFrameTime() {
        this.frameTime *=  this.decreaseTime;
        this.decreaseTime += (1 - this.decreaseTime) * 0.122;
    }

    public void run() {

        try {
            while(isRunning) {
                Thread.sleep(this.frameTime);
                this.snakeCallback.call();
            }

        } catch (InterruptedException e) {
            System.out.println("de.redcybersamurai.snake.Actor.Snake Worker Thread error");
            System.out.println(e.getMessage());
        }
    }
}
