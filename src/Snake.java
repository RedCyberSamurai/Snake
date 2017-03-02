import java.util.List;
import java.util.Random;

/**
 * Created by admin on 27.02.2017.
 */
public class Snake {

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

    public void eat() {
        this.body.append(this.position);
    }

    public boolean intersects(Food food) {
        boolean isIntersecting = false;

        //List<int[]> body = this.body.getParts();

        return isIntersecting;
    }

}
