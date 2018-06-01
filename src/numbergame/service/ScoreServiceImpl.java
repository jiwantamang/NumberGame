package numbergame.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import numbergame.model.Score;

/**
 *
 * @author g1
 */
public class ScoreServiceImpl implements ScoreService{
    private String fileName = "HighScores.hs";
    @Override
    public void saveScore(Score score) {
        try {
                        
            String str = score.getTime() + " " + score.getDate() + " " + score.getPlayers_initial()+ " " +score.getPair() + " " + score.getPlayers_score();
                        
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));            
            writer.append(str);
            writer.newLine();
            writer.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScoreServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ScoreServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Score> getHighScores() {
        return null;
    }

    @Override
    public List<Score> getHighScores(int start, int end) {
        System.out.println("Getting high scores");
        
        List<Score> scores = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String sCurrentLine;
            while((sCurrentLine = reader.readLine()) != null) {
                String[] record = sCurrentLine.split(" ");
                Score score = new Score();                
                for(int i=1;i <= record.length ;i ++){
                    switch(i){
                        case 1:
                            score.setTime(record[0]);
                            break;
                        case 2:
                            score.setDate(record[1]);
                            break;
                        case 3:
                            score.setPlayers_initial(Integer.parseInt(record[2]));
                            break;                            
                        case 4:
                            score.setPair(Integer.parseInt(record[3]));
                            break;
                        case 5:
                            score.setPlayers_score(Integer.parseInt(record[4]));
                            break;
                    }
                }
                
                scores.add(score);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScoreServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ScoreServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return scores;
    }
    
}
