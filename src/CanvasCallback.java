import javax.swing.*;

/**
 * Created by admin on 27.02.2017.
 */
public class CanvasCallback implements ICallback {

    private JPanel jPanel;

    public CanvasCallback(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    @Override
    public void call() {
        this.jPanel.repaint();
    }
}
