package numbergame;

import numbergame.view.GameMenu;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import numbergame.view.MainPanel;

/**
 *
 * @author g1
 */
public class NumberGame {    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setSize(new Dimension(400,600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GameMenu menu = new GameMenu();
                MainPanel mainPanel = new MainPanel();
                MainPanel.setBodyPanel(menu);
                frame.add(mainPanel,BorderLayout.CENTER);
                frame.setLocationRelativeTo(null);                
                frame.setVisible(true);
                
            }
        });
    }
}
