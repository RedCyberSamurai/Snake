import java.util.Random;

/**
 * Created by admin on 27.02.2017.
 */
public class Snake extends Growable {

    public static final int BLOCKWIDTH = 10;
    public static final int BLOCKHEIGHT = 10;

    private Random rand;
    private int x, y;

    public Snake() {
        rand = new Random();

        System.out.println(Canvas.XFIELDS);
        x = rand.nextInt(Canvas.XFIELDS);
        System.out.println(x);

        y = rand.nextInt(Canvas.YFIELDS);
        this.resetBody(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getPosition() {
        return new int[]{this.x, this.y};
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void eat() {
        this.appendBody(x, y);
    }


}
