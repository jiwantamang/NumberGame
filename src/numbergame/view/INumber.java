package numbergame.view;

import numbergame.event.ClickListener;

/**
 *
 * @author g1
 */
public interface INumber extends ClickListener{
    public int getNumber();
    public void paired();  
    public boolean isPaired();
    public boolean isBlankPanel();
    public int getRow();
    public int getColumn();
        
}
