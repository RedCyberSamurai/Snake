import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by admin on 27.02.2017.
 */
public class Canvas extends JPanel {

    public final static int WIDTH = 300;
    public final static int HEIGHT = 400;
    public final static int XFIELDS = 20;
    public final static int YFIELDS = 25;

    private Snake snake;
    private SnakeController snakeController;

    public Canvas() {
        this.snake = new Snake();
        this.snakeController = new SnakeController(snake);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.BLACK);
        g2d.fillRect(0,0,WIDTH,HEIGHT);

        g2d.setPaint(Color.WHITE);
        for(int i = 0; i < XFIELDS; i++) {
            for(int j = 0; j < YFIELDS;j++) {
                g2d.fillRect(30+11*i, 30+11*j, Snake.BLOCKWIDTH, Snake.BLOCKHEIGHT);
            }
        }

        g2d.setPaint(Color.GRAY);
        List<int[]> body = this.snake.getBody();

        for(int[] b: body) {
            g2d.fillRect(30+11*b[0], 30+11*b[1] ,Snake.BLOCKWIDTH ,Snake.BLOCKHEIGHT);
        }
    }
}
