import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.List;

/**
 * Created by admin on 27.02.2017.
 */
public class World extends JPanel {

    private Food food;
    private Snake snake;
    private SnakeController snakeController;

    private int width;
    private int height;
    private int xFields;
    private int yFields;

    public World() {
        this.width = 300;
        this.height = 400;
        this.xFields = 20;
        this.yFields = 25;

        this.food = new Food(this);
        this.snake = new Snake(this);

        this.food.setLocation(this.snake);
        this.snakeController = new SnakeController(this.snake, this.food);

        // bind keylistener to panel
        KeyListener kl = (KeyListener) snakeController.getEmitter();
        this.addKeyListener(kl);
        this.setFocusable(true);
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getXFields() {
        return this.xFields;
    }

    public void setXFields(int xFields) {
        this.xFields = xFields;
    }

    public int getYFields() {
        return this.yFields;
    }

    public void setYFields(int yFields) {
        this.yFields = yFields;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        // draw background
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(0,0,this.width,this.height);

        // draw fields
        g2d.setPaint(Color.WHITE);
        for(int i = 0; i < this.xFields; i++) {
            for(int j = 0; j < this.yFields; j++) {
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
