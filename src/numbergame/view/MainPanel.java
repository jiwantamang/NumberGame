package numbergame.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author g1
 */
public class MainPanel extends JPanel{
    private static JPanel bodyPanel;
    
    public MainPanel(){
        setLayout(new BorderLayout());
        bodyPanel = new JPanel();
        bodyPanel.setLayout(new BorderLayout());
        add(bodyPanel,BorderLayout.CENTER);
        
    }
    
    public static void setBodyPanel(JPanel panel){
        bodyPanel.removeAll();
        bodyPanel.add(panel,BorderLayout.CENTER);        
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }
    
}
