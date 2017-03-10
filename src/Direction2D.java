/**
 * Created by admin on 10.03.2017.
 */
public class Direction2D {
    enum Aim { TOP, RIGHT, BOTTOM, LEFT }

    private Aim currentDirection;

    public Direction2D() {
        currentDirection = Aim.BOTTOM;
    }

    public Aim getAim() {
        return this.currentDirection;
    }

    public void setAim(Aim aim) {
        this.currentDirection = aim;
    }
}
