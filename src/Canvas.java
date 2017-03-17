import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.List;

/**
 * Created by admin on 27.02.2017.
 */
public class Canvas extends JPanel {

    public final static int WIDTH = 300;
    public final static int HEIGHT = 400;
    public final static int XFIELDS = 20;
    public final static int YFIELDS = 25;

    private Food food;
    private Snake snake;
    private SnakeController snakeController;

    public Canvas() {
        this.food = new Food();
        this.snake = new Snake();

        this.food.setLocation(this.snake);
        this.snakeController = new SnakeController(this.snake, this.food);

        // bind keylistener to panel
        KeyListener kl = (KeyListener) snakeController.getEmitter();
        this.addKeyListener(kl);
        this.setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        // draw background
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(0,0,WIDTH,HEIGHT);

        // draw fields
        g2d.setPaint(Color.WHITE);
        for(int i = 0; i < XFIELDS; i++) {
            for(int j = 0; j < YFIELDS;j++) {
                g2d.fillRect(30+11*i, 30+11*j, Snake.BLOCKWIDTH, Snake.BLOCKHEIGHT);
            }
        }

        // draw food
        g2d.setPaint(Food.COLOR);
        Vector2D foodPosition = this.food.getPosition();
        g2d.fillRect(30+11*foodPosition.getX(), 30+11*foodPosition.getY(), Food.BLOCKWIDTH, Food.BLOCKHEIGHT);

        // draw snake
        g2d.setPaint(Snake.COLOR);
        SnakeBody snakeBody = this.snake.getBody();
        List<int[]> body = snakeBody.getParts();

        int[] b;
        for(int i = 0; i < body.size()-1; i++) {
            b = body.get(i);
            g2d.fillRect(30+11*b[0], 30+11*b[1], Snake.BLOCKWIDTH ,Snake.BLOCKHEIGHT);
        }

        // draw snake head
        g2d.setPaint(Snake.HEADCOLOR);
        b = body.get(body.size()-1);
        g2d.fillRect(30+11*b[0], 30+11*b[1], Snake.BLOCKWIDTH ,Snake.BLOCKHEIGHT);
    }
}
