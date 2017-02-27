import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 27.02.2017.
 */
public class Growable {

    private List<int[]> body;

    public List<int[]> getBody() {
        return this.body;
    }

    public void appendBody(int x, int y) {
        body.add(new int[]{x, y});
    }

    public void resetBody(int x, int y) {
        body = new ArrayList<>();
        body.add(new int[]{x, y});
    }
}
