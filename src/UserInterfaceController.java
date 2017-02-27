/**
 * Created by admin on 27.02.2017.
 */
public class UserInterfaceController {

    private UserInterface ui;

    public UserInterfaceController(UserInterface ui) {
        this.ui = ui;

        CanvasCallback cc = new CanvasCallback(this.ui.getPanel());
        CanvasWorker cw = new CanvasWorker(cc);

        cw.start();
    }
}
