import java.awt.*;
import java.util.Random;

/**
 * Created by admin on 28.02.2017.
 */
public class Food {
    public static final Color COLOR = Color.RED;

    private Random rand;
    private Vector2D position;

    public Food() {

        this.rand = new Random();
        this.setLocation();
    }

    public void setLocation() {

        this.position = new Vector2D(
                this.rand.nextInt(Canvas.XFIELDS),
                this.rand.nextInt(Canvas.YFIELDS)
        );
    }
}
