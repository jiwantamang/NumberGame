package numbergame.command;

/**
 *
 * @author g1
 */
public interface Move {
    public void moveRight(int x,int y,int count);
    public void moveLeft(int x,int y,int count);
    public void moveUp(int x,int y,int count);
    public void moveDown(int x,int y,int count);
}
