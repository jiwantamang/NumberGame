package numbergame.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import numbergame.event.ClickListener;

/**
 *
 * @author g1
 */
public class Number extends JButton implements ActionListener,MouseListener,INumber{
    private boolean isSelected = false;
    private int row;
    private int column;
    
    private ClickListener listener;
    private GameArea gameArea;
    private boolean isPaired = false;
    public Number(int column,int row,GameArea gameArea){        
        this.column = column;
        this.row = row;        
        
        this.gameArea = gameArea;
        
        gameArea.addListener(this);
        
        setBackground(Color.RED);
        this.addActionListener(this);
        this.addMouseListener(this);
        
        
        
        
    }

 
    public void setListener(ClickListener listener){
        this.listener = listener;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        listener.clicked(row, column,this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(isSelected) return;

        if(getBackground() == Color.ORANGE) return;
        
        setHoverBackground();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(getBackground() == Color.ORANGE) return;
        if(!isSelected){
            setBackground(Color.RED);
            setForeground(Color.BLACK);
        }
    }
    
    public void setSelectedBackground(){        
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);        
    }
    
    public void setDefaultBackground(){
        setBackground(Color.RED);
        setForeground(Color.BLACK);        
    }
    
    public void setHoverBackground(){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }
    
    
    public void isSelect(){
        this.isSelected = true;
        setSelectedBackground();
    }
    
    public void unselect(){
        isSelected = false;
        setDefaultBackground();
    }

   
    @Override
    public void clicked(int row, int column,INumber number) {  
        if(isPaired) return;
        if(this.row == row && this.column == column){            
            isSelect();
        }else{
            unselect();
        }
        
    }
        

    @Override
    public int getNumber() {
        return Integer.parseInt(getText());
    }

    @Override
    public void paired() {
        setForeground(Color.ORANGE);
        setBackground(Color.ORANGE);
        isPaired = true;
    }

    @Override
    public boolean isBlankPanel(int row,int column){
        if(this.row == row && this.column == column){
            // check if it is a blank panel
            return (getBackground() == Color.ORANGE) ? true : false;
        }
        return false;
    }
    
    @Override
    public boolean isPaired() {
        return isPaired;
    }
    
}
