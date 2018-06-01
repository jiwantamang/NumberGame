package numbergame.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

public class ScoreListModel extends AbstractListModel{
    private List<Score> scoreList;
    
    public ScoreListModel(){
        scoreList = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return scoreList.size();
    }

    @Override
    public Object getElementAt(int index) {
        if (index < scoreList.size( ))
            return scoreList.get (index);
        else
            return null;
    }
    
    public void addElement (Score o) {
        scoreList.add(o);
         int index0 = scoreList.size() - 1;
         int index1 = index0;
         fireIntervalAdded(this, index0, index1);
    }
            
    public void updateData(List<Score> contacts){
        System.out.println("Updating model data");
        this.scoreList = contacts;
        
    }

}
