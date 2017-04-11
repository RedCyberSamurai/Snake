package de.redcybersamurai.snake.Actor.Property;

/**
 * Created by admin on 10.03.2017.
 */
public class Direction2D {
    public enum Aim { RIGHT, LEFT }

    public final static byte LOOK_UP = 0;
    public final static byte LOOK_RIGHT = 1;
    public final static byte LOOK_DOWN = 2;
    public final static byte LOOK_LEFT = 3;

    private byte currentDirection;
    private byte maxAim = 4;

    public Direction2D() {
        currentDirection = 3;
    }

    public byte getAim() {
        return this.currentDirection;
    }

    public void setAim(Aim aim) {
        switch (aim) {
            case LEFT:
                this.currentDirection--;
                break;
            case RIGHT:
                this.currentDirection++;
                break;
        }

        this.currentDirection += this.maxAim;
        this.currentDirection %= this.maxAim;
    }
}
