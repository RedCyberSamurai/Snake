import javax.swing.*;

/**
 * Created by admin on 27.02.2017.
 */
public class WorldCallback implements ICallback {

    private JPanel jPanel;

    public WorldCallback(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    @Override
    public void call() {
        this.jPanel.repaint();
    }
}
