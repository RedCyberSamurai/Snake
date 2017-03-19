/**
 * Created by admin on 27.02.2017.
 */
public class WorldWorker implements Runnable {

    private boolean isRunning = true;
    private int frameTime = 16;

    private WorldCallback worldCallback;

    public WorldWorker(WorldCallback worldCallback) {
        this.worldCallback = worldCallback;
    }

    public void terminate() {
        this.isRunning = false;
    }

    public void run() {

        try {
            while(this.isRunning) {
                Thread.sleep(this.frameTime);
                this.worldCallback.call();
            }

        } catch (InterruptedException e) {
            System.out.println("World Worker Thread Error.");
            System.out.println(e.getMessage());
        }
    }
}
