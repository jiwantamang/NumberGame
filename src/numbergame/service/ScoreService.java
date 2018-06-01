package numbergame.service;

import java.util.List;
import numbergame.model.Score;

/**
 *
 * @author g1
 */
public interface ScoreService {
    public void saveScore(Score score);
    public List<Score> getHighScores();
    public List<Score> getHighScores(int start,int end);
}
