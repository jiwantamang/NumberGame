package numbergame.event;

import javax.swing.JButton;
import numbergame.view.INumber;

/**
 *
 * @author g1
 */
public interface ClickListener {
    public void clicked(int row,int column,INumber number);
}
