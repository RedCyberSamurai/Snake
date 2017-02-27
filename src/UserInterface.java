import javax.swing.*;

/**
 * Created by admin on 27.02.2017.
 */
public class UserInterface extends JFrame {

    private JPanel jPanel;

    public UserInterface() {
        jPanel = new Canvas();

        this.add(jPanel);

        // TODO
        this.setTitle("Snake Game");
        this.setSize(Canvas.WIDTH, Canvas.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public JPanel getPanel() {
        return this.jPanel;
    }
}
