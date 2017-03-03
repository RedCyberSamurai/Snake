import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * Created by admin on 27.02.2017.
 */
public class Snake {
    public static  final Color COLOR = Color.GRAY;
    public static final int BLOCKWIDTH = 10;
    public static final int BLOCKHEIGHT = 10;

    private Vector2D position;
    private SnakeBody body;

    public Snake() {
        Random rand = new Random();
        this.position = new Vector2D();

        this.position.setX(rand.nextInt(Canvas.XFIELDS));
        this.position.setY(rand.nextInt(Canvas.YFIELDS));
        this.body = new SnakeBody(this.position);
    }

    public Vector2D getPosition() {
        return this.position;
    }

    public SnakeBody getBody() {
        return this.body;
    }

    public int[] getPositionAsArray() {
        return new int[]{this.position.getX(), this.position.getY()};
    }

    public boolean collides(Food food) {
        Vector2D foodPosition = food.getPosition();

        if(this.position.getX() == foodPosition.getX() && this.position.getY() == foodPosition.getY()) {
            return true;
        }

        return false;
    }

    public boolean intersects(Food food) {
        List<int[]> body = this.body.getParts();
        Vector2D foodPosition = food.getPosition();

        for(int[] b : body) {
            if(b[0] == foodPosition.getX() && b[1] == foodPosition.getY()) {
                return true;
            }
        }

        return false;
    }

}
