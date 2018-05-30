package numbergame.event;

import java.util.List;

/**
 *
 * @author g1
 */
public interface PointListener {
    public void pointGained(List<Integer> points);
    public void lostPoint(int point);
        
}
