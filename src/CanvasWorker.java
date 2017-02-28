/**
 * Created by admin on 27.02.2017.
 */
public class CanvasWorker implements Runnable {

    private boolean isRunning = true;
    private int frameTime = 16;

    private CanvasCallback canvasCallback;

    public CanvasWorker(CanvasCallback canvasCallback) {
        this.canvasCallback = canvasCallback;
    }

    public void terminate() {
        this.isRunning = false;
    }

    public void run() {

        try {
            while(this.isRunning) {
                Thread.sleep(this.frameTime);
                this.canvasCallback.call();
            }

        } catch (InterruptedException e) {
            System.out.println("Canvas Worker Thread Error.");
            System.out.println(e.getMessage());
        }
    }
}
