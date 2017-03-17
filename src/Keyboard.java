import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

/**
 * Created by admin on 10.03.2017.
 */
public class Keyboard implements IEmittable, KeyListener {
    private IControllable player;

    private HashMap<Integer, Boolean> keysPressed;

    public Keyboard(IControllable player) {
        this.player = player;
        this.keysPressed = new HashMap<>();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        Boolean isKeyPressed = this.keysPressed.get(keyCode);

        if(isKeyPressed != null && isKeyPressed) {
            return;
        }

        this.keysPressed.put(keyCode, true);

        switch(keyCode) {
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
        int keyCode = e.getKeyCode();
        this.keysPressed.put(keyCode, false);
    }
}
