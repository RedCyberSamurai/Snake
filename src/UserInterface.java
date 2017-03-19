import javax.swing.*;

/**
 * Created by admin on 27.02.2017.
 */
public class UserInterface extends JFrame {

    private JPanel jPanel;

    public UserInterface() {
        jPanel = new World();

        this.add(jPanel);

        // TODO
        this.setTitle("Snake Game");
        this.setSize(jPanel.getWidth(), jPanel.getHeight());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public JPanel getPanel() {
        return this.jPanel;
    }
}
