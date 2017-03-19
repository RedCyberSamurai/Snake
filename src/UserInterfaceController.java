/**
 * Created by admin on 27.02.2017.
 */
public class UserInterfaceController {

    private UserInterface ui;

    public UserInterfaceController(UserInterface ui) {
        this.ui = ui;

        WorldCallback wc = new WorldCallback(this.ui.getPanel());
        WorldWorker ww = new WorldWorker(wc);
        Thread canvasThread = new Thread(ww);
        canvasThread.start();
    }
}
