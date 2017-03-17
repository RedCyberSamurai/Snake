import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by admin on 10.03.2017.
 */
public class Keyboard implements IEmittable, KeyListener {
    private IControllable player;

    public Keyboard(IControllable player) {
        this.player = player;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                player.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                player.moveRight();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
