package numbergame.view;

import numbergame.event.ClickListener;

/**
 *
 * @author g1
 */
public interface INumber extends ClickListener{
    public void moveLeft(int length);
    public void moveRigth(int length);
    public void moveDown(int length);
    public void moveUp(int length);    
    
    public int getNumber();
    
    public void paired();
    
    public boolean isPaired();
}
