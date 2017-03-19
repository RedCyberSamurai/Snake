import java.awt.*;
import java.util.Random;

/**
 * Created by admin on 28.02.2017.
 */
public class Food {
    public static final Color COLOR = Color.RED;
    public static final int BLOCKWIDTH = 10;
    public static final int BLOCKHEIGHT = 10;

    private Random rand;
    private Vector2D position;

    private World world;

    public Food(World world) {
        this.rand = new Random();
        this.world = world;
    }

    public Vector2D getPosition() {
        return this.position;
    }

    public void setLocation(Snake snake) {

        this.position = new Vector2D(
                this.rand.nextInt(world.getXFields()),
                this.rand.nextInt(world.getYFields())
        );
    }
}
