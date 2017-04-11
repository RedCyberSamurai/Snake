package de.redcybersamurai.snake.Actor;

import de.redcybersamurai.snake.Actor.Property.Vector2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 28.02.2017.
 */
public class SnakeBody {

    private List<int[]> parts;

    public SnakeBody() {}

    public SnakeBody(Vector2D pos) {
        this.reset(pos);
    }

    public List<int[]> getParts() {
        return this.parts;
    }

    public void append(Vector2D pos) {
        this.parts.add(new int[]{pos.getX(), pos.getY()});
    }

    public void reset(Vector2D pos) {
        this.parts = new ArrayList<>();
        this.parts.add(new int[]{pos.getX(), pos.getY()});
    }
}
