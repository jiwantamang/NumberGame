package numbergame.model;

/**
 *
 * @author g1
 */
public class Score {
    private String time;
    private String date;
    private int players_initial;
    private int pair;
    private int players_score;    
    
    public Score(){}

    public Score(String time, String date, int players_initial, int pair, int players_score) {
        this.time = time;
        this.date = date;
        this.players_initial = players_initial;
        this.pair = pair;
        this.players_score = players_score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPlayers_initial() {
        return players_initial;
    }

    public void setPlayers_initial(int players_initial) {
        this.players_initial = players_initial;
    }

    public int getPair() {
        return pair;
    }

    public void setPair(int pair) {
        this.pair = pair;
    }

        
    public int getPlayers_score() {
        return players_score;
    }

    public void setPlayers_score(int players_score) {
        this.players_score = players_score;
    }

    @Override
    public String toString() {
        return "Score "+ players_score + ", Pair "+pair + ", Date " + date;
    }
    
    
    
    
    
}
