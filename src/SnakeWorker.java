/**
 * Created by admin on 27.02.2017.
 */
public class SnakeWorker implements Runnable {

    private boolean isRunning = true;
    private int frameTime = 500;

    private SnakeCallback snakeCallback;

    public SnakeWorker(SnakeCallback snakeCallback) {
        this.snakeCallback = snakeCallback;
    }

    public void terminate() {
        this.isRunning = false;
    }

    public void setFrameTime() {
        this.frameTime *= 0.80;
    }

    public void run() {

        try {
            while(isRunning) {
                Thread.sleep(this.frameTime);
                this.snakeCallback.call();
            }

        } catch (InterruptedException e) {
            System.out.println("Snake Worker Thread error");
            System.out.println(e.getMessage());
        }
    }
}
