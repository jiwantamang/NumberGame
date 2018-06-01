package numbergame.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import numbergame.event.MenuActionListener;
import numbergame.event.PointListener;
import numbergame.model.Score;
import numbergame.service.ScoreService;
import numbergame.service.ScoreServiceImpl;

/**
 *
 * @author g1
 */
public class GamePanel extends JPanel{
    
    private GameArea gameArea;
    private ScorePanel scorePanel;
    
    private int point = 0;
    private int pair = 0;
    
    private MenuActionListener menuActionListener;
    private PointListener listener;
    public GamePanel(){
        setLayout(new BorderLayout());
        
        listener = new PointListener() {
            @Override
            public void pointGained(List<Integer> points) {
                int total_gained_point = 0;
                for(Integer p : points){
                    total_gained_point = total_gained_point + p;
                }
                
                point = point + total_gained_point;
                pair = pair + 1;
                scorePanel.updateScore(Integer.toString(point));
                
                // update the pair
                scorePanel.updatePair(Integer.toString(pair));
            }

            @Override
            public void lostPoint(int loss_point) {
                point = point - loss_point;
            }
        };
        
        
        
        menuActionListener = new MenuActionListener() {
            @Override
            public void buttonClicked(String command) {
                if(command.equalsIgnoreCase("restart")){
                    
                        if(pair > 0 && point > 0){
                            // ask user if he wants to save the score

                        int result = JOptionPane.showConfirmDialog(null, "Do you want to save score ???","Confirmation",JOptionPane.YES_NO_OPTION);

                        if(result == 0){
                            // save game result

                            ScoreService scoreService = new ScoreServiceImpl();
                            Score score = new Score();
                            score.setDate(LocalDate.now().toString());
                            score.setTime(LocalTime.now().toString());
                            score.setPair(pair);
                            score.setPlayers_score(point);
                            scoreService.saveScore(score);
                        }
                    }
                                        
                    initGamePanelUI();
                    pair = 0;
                    point = 0;
                    
                }
                
                if(command.equalsIgnoreCase("repopulate")){
                    if(point < 20)
                    {
                        JOptionPane.showMessageDialog(null, "Insufficient scores, scores must be greater than 20");
                        return;
                    }
                    
                    gameArea.repopulateNumber();
                    
                    point = point - 20;
                    scorePanel.updateScore(Integer.toString(point));
                }
                
                if(command.equalsIgnoreCase("exit")){
                    // ask user if he wants to save the score
                    if(pair > 0 && point > 0){
                        int result = JOptionPane.showConfirmDialog(null, "Do you want to save score ???","Confirmation",JOptionPane.YES_NO_OPTION);
                    
                        if(result == 0){
                            // save game result

                            ScoreService scoreService = new ScoreServiceImpl();
                            Score score = new Score();
                            score.setDate(LocalTime.now().toString());
                            score.setTime(LocalTime.now().toString());
                            score.setPair(pair);
                            score.setPlayers_score(point);
                            scoreService.saveScore(score);
                        }
                    }
                    
                    
                    System.exit(0);
                }
            }
        };
                
        
        initGamePanelUI();
        
                                        
    }
    
    public void initGamePanelUI(){
        removeAll();
        gameArea = new GameArea();
        gameArea.setPointListener(listener);
                        
        scorePanel = new ScorePanel();
        scorePanel.resetScores();
        scorePanel.setActionListener(menuActionListener);
        
        add(gameArea,BorderLayout.CENTER);
        add(scorePanel,BorderLayout.SOUTH);
        
        revalidate();
        repaint();
        System.out.println("Clicked");
    }
 
           
}
