/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame.view;

import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import numbergame.event.ClickListener;
import numbergame.event.PointListener;

/**
 *
 * @author g1
 */
public class GameArea extends javax.swing.JPanel {

    /**
     * Creates new form GameArea
     */
    private ClickListener listener;
    
    private List<ClickListener> listenerObjects = new ArrayList<>();
    
    private int previous_row = -1;
    private int previous_column = -1;
    private INumber previous_number = null;
          
    private Map<String,INumber> firstRow = new HashMap<>();
    private Map<String,INumber> secondRow = new HashMap<>();
    private Map<String,INumber> thirdRow = new HashMap<>();
    private Map<String,INumber> fourthRow = new HashMap<>();
    private Map<String,INumber> fifthRow = new HashMap<>();
    private Map<String,INumber> sixthRow = new HashMap<>();
    private Map<String,INumber> seventhRow = new HashMap<>();
    private Map<String,INumber> eightRow = new HashMap<>();
    private Map<String,INumber> ninthRow = new HashMap<>();
    private Map<String,INumber> tenthRow = new HashMap<>();
    private Map<String,INumber> elevenRow = new HashMap<>();
    private Map<String,INumber> twelveRow = new HashMap<>();
    
    private PointListener pointListener;
    public GameArea() {
        initComponents();
       
         listener = new ClickListener() {
            @Override
            public void clicked(int row, int column,INumber number) {
                if(number.isPaired()) return;
                if(previous_row == -1 || previous_column == -1){
                    previous_row = row;
                    previous_column = column;
                    previous_number = number;
                    for(ClickListener listener : listenerObjects)
                        listener.clicked(row, column,number);
                }else{
                    if(isValidSwitched(row, column,number)){
                        int row_moved = Math.abs(row - previous_row);
                        int column_moved = Math.abs(column - previous_column);
                        
                        // check if pair or not
                        
                        if((previous_number.getNumber() + number.getNumber()) == 10 || (previous_number.getNumber() == number.getNumber())){
                            number.paired();
                            previous_number.paired();
                            
                            previous_row = -1;
                            previous_column = -1;
                            
                            // update point listener
                            List<Integer> point = new ArrayList<>();
                            // check either row or column is moved
                            if(row_moved > 0){
                                // check if blank panel is between
                            }
                            if(column_moved > 0){
                                // check if blank panel is between
                            }
                            point.add(10);
                            pointListener.pointGained(point);
                        }
                                                
                    }else{
                        previous_row = row;
                        previous_column = column;
                        previous_number = number;
                        
                        for(ClickListener listener : listenerObjects)
                            listener.clicked(row, column,number);
                    }
                }                                
            }            
        };
        
     
        GridBagConstraints gbc = new GridBagConstraints();        
        gbc.gridx = 0;
        gbc.gridy = 0;
        _11 = new Number(1,1,this);
        _11.setListener(listener);
        firstRow.put("_11", _11);
        add(_11,gbc);
        
                
        gbc.gridx = 1;
        gbc.gridy = 0;
        _21 = new Number(2,1,this);
        _21.setListener(listener);
        firstRow.put("_21", _21);
        add(_21,gbc);
        
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        _31 = new Number(3,1,this);
        _31.setListener(listener);
        firstRow.put("_31", _31);
        add(_31,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 0;
        _41 = new Number(4,1,this);
        _41.setListener(listener);
        firstRow.put("_41", _41);
        add(_41,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 0;
        _51 = new Number(5,1,this);
        _51.setListener(listener);
        firstRow.put("_51", _51);
        add(_51,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 0;
        _61 = new Number(6,1,this);
        _61.setListener(listener);
        firstRow.put("_61", _61);
        add(_61,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 0;
        _71 = new Number(7,1,this);
        _71.setListener(listener);
        firstRow.put("_71", _71);
        add(_71,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 0;
        _81 = new Number(8,1,this);
        _81.setListener(listener);
        firstRow.put("_81", _81);
        add(_81,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 0;
        _91 = new Number(9,1,this);
        _91.setListener(listener);
        firstRow.put("_91", _91);
        add(_91,gbc);
        
        
        // second row 
        gbc.gridx = 0;
        gbc.gridy = 1;
        _12 = new Number(1,2,this);
        _12.setListener(listener);        
        add(_12,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        _22 = new Number(2,2,this);
        _22.setListener(listener);
        add(_22,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        _32 = new Number(3,2,this);
        _32.setListener(listener);
        add(_32,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 1;
        _42 = new Number(4,2,this);
        _42.setListener(listener);
        add(_42,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 1;
        _52 = new Number(5,2,this);
        _52.setListener(listener);
        add(_52,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 1;
        _62 = new Number(6,2,this);
        _62.setListener(listener);
        add(_62,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 1;
        _72 = new Number(7,2,this);
        _72.setListener(listener);
        add(_72,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 1;
        _82 = new Number(8,2,this);
        _82.setListener(listener);
        add(_82,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 1;
        _92 = new Number(9,2,this);
        _92.setListener(listener);
        add(_92,gbc);
        
        
        // third row
        gbc.gridx = 0;
        gbc.gridy = 2;
        _13 = new Number(1,3,this);
        _13.setListener(listener);
        add(_13,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        _23 = new Number(2,3,this);
        _23.setListener(listener);
        add(_23,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        _33 = new Number(3,3,this);
        _33.setListener(listener);
        add(_33,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 2;
        _43 = new Number(4,3,this);
        _43.setListener(listener);
        add(_43,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 2;
        _53 = new Number(5,3,this);
        _53.setListener(listener);
        add(_53,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 2;
        _63 = new Number(6,3,this);
        _63.setListener(listener);
        add(_63,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 2;
        _73 = new Number(7,3,this);
        _73.setListener(listener);
        add(_73,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 2;
        _83 = new Number(8,3,this);
        _83.setListener(listener);
        add(_83,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 2;
        _93 =  new Number(9,3,this);
        _93.setListener(listener);
        add(_93,gbc);
        
        
        // fourth row
        gbc.gridx = 0;
        gbc.gridy = 3;
        _14 = new Number(1,4,this);
        _14.setListener(listener);
        add(_14,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        _24 = new Number(2,4,this);
        _24.setListener(listener);
        add(_24,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 3;
        _34 = new Number(3,4,this);
        _34.setListener(listener);
        add(_34,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 3;
        _44 = new Number(4,4,this);
        _44.setListener(listener);
        add(_44,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 3;
        _54 = new Number(5,4,this);
        _54.setListener(listener);
        add(_54,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 3;
        _64 = new Number(6,4,this);
        _64.setListener(listener);
        add(_64,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 3;
        _74 = new Number(7,4,this);
        _74.setListener(listener);
        add(_74,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 3;
        _84 = new Number(8,4,this);
        _84.setListener(listener);
        add(_84,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 3;
        _94 =  new Number(9,4,this);
        _94.setListener(listener);
        add(_94,gbc);
        
        
        // fifth row
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        _15 = new Number(1,5,this);
        _15.setListener(listener);
        add(_15,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        _25 = new Number(2,5,this);
        _25.setListener(listener);
        add(_25,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 4;
        _35 = new Number(3,5,this);
        _35.setListener(listener);
        add(_35,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 4;
        _45 = new Number(4,5,this);
        _45.setListener(listener);
        add(_45,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 4;
        _55 = new Number(5,5,this);
        _55.setListener(listener);
        add(_55,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 4;
        _65 = new Number(6,5,this);
        _65.setListener(listener);
        add(_65,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 4;
        _75 = new Number(7,5,this);
        _75.setListener(listener);
        add(_75,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 4;
        _85 = new Number(8,5,this);
        _85.setListener(listener);
        add(_85,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 4;
        _95 =  new Number(9,5,this);
        _95.setListener(listener);
        add(_95,gbc);
        
        
        // sixth row
        gbc.gridx = 0;
        gbc.gridy = 5;
        _16 = new Number(1,6,this);
        _16.setListener(listener);
        add(_16,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        _26 = new Number(2,6,this);
        _26.setListener(listener);
        add(_26,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 5;
        _36 = new Number(3,6,this);
        _36.setListener(listener);
        add(_36,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 5;
        _46 = new Number(4,6,this);
        _46.setListener(listener);
        add(_46,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 5;
        _56 = new Number(5,6,this);
        _56.setListener(listener);
        add(_56,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 5;
        _66 = new Number(6,6,this);
        _66.setListener(listener);
        add(_66,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 5;
        _76 = new Number(7,6,this);
        _76.setListener(listener);
        add(_76,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 5;
        _86 = new Number(8,6,this);
        _86.setListener(listener);
        add(_86,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 5;
        _96 =  new Number(9,6,this);
        _96.setListener(listener);
        add(_96,gbc);
        
        
        
        
        // seventh row
        gbc.gridx = 0;
        gbc.gridy = 6;
        _17 = new Number(1,7,this);
        _17.setListener(listener);
        add(_17,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        _27 = new Number(2,7,this);
        _27.setListener(listener);
        add(_27,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 6;
        _37 = new Number(3,7,this);
        _37.setListener(listener);
        add(_37,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 6;
        _47 = new Number(4,7,this);
        _47.setListener(listener);
        add(_47,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 6;
        _57 = new Number(5,7,this);
        _57.setListener(listener);
        add(_57,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 6;
        _67 = new Number(6,7,this);
        _67.setListener(listener);
        add(_67,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 6;
        _77 = new Number(7,7,this);
        _77.setListener(listener);
        add(_77,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 6;
        _87 = new Number(8,7,this);
        _87.setListener(listener);
        add(_87,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 6;
        _97 =  new Number(9,7,this);
        _97.setListener(listener);
        add(_97,gbc);
        
        
        
        // eight row
        gbc.gridx = 0;
        gbc.gridy = 7;
        _18 = new Number(1,8,this);
        _18.setListener(listener);
        add(_18,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 7;
        _28 = new Number(2,8,this);
        _28.setListener(listener);
        add(_28,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 7;
        _38 = new Number(3,8,this);
        _38.setListener(listener);
        add(_38,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 7;
        _48 = new Number(4,8,this);
        _48.setListener(listener);
        add(_48,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 7;
        _58 = new Number(5,8,this);
        _58.setListener(listener);
        add(_58,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 7;
        _68 = new Number(6,8,this);
        _68.setListener(listener);
        add(_68,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 7;
        _78 = new Number(7,8,this);
        _78.setListener(listener);
        add(_78,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 7;
        _88 = new Number(8,8,this);
        _88.setListener(listener);
        add(_88,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 7;
        _98 =  new Number(9,8,this);
        _98.setListener(listener);
        add(_98,gbc);
        
        // ninth row
               
        gbc.gridx = 0;
        gbc.gridy = 8;
        _19 = new Number(1,9,this);
        _19.setListener(listener);
        add(_19,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 8;
        _29 = new Number(2,9,this);
        _29.setListener(listener);
        add(_29,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 8;
        _39 = new Number(3,9,this);
        _39.setListener(listener);
        add(_39,gbc); 
        
        gbc.gridx = 3;
        gbc.gridy = 8;
        _49 = new Number(4,9,this);
        _49.setListener(listener);
        add(_49,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 8;
        _59 = new Number(5,9,this);
        _59.setListener(listener);
        add(_59,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 8;
        _69 = new Number(6,9,this);
        _69.setListener(listener);
        add(_69,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 8;
        _79 = new Number(7,9,this);
        _79.setListener(listener);
        add(_79,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 8;
        _89 = new Number(8,9,this);
        _89.setListener(listener);
        add(_89,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 8;
        _99 =  new Number(9,9,this);
        _99.setListener(listener);
        add(_99,gbc);
        
        
        // tenth row
        gbc.gridx = 0;
        gbc.gridy = 9;       
        _110 = new Number(1,10,this);
        _110.setListener(listener);
        add(_110,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 9;
        _210 = new Number(2,10,this);
        _210.setListener(listener);
        add(_210,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 9;
        _310 = new Number(3,10,this);
        _310.setListener(listener);
        add(_310,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 9;
        _410 = new Number(4,10,this);
        _410.setListener(listener);
        add(_410,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 9;
        _510 = new Number(5,10,this);
        _510.setListener(listener);
        add(_510,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 9;
        _610 = new Number(6,10,this);
        _610.setListener(listener);
        add(_610,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 9;
        _710 = new Number(7,10,this);
        _710.setListener(listener);
        add(_710,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 9;
        _810 = new Number(8,10,this);
        _810.setListener(listener);
        add(_810,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 9;
        _910 =  new Number(9,10,this);
        _910.setListener(listener);
        add(_910,gbc);
        
        
        
        // eleven row
        gbc.gridx = 0;
        gbc.gridy = 10;
        _111 = new Number(1,11,this);
        _111.setListener(listener);
        add(_111,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 10;
        _211 = new Number(2,11,this);
        _211.setListener(listener);
        add(_211,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 10;
        _311 = new Number(3,11,this);
        _311.setListener(listener);
        add(_311,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 10;
        _411 = new Number(4,11,this);
        _411.setListener(listener);
        add(_411,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 10;
        _511 = new Number(5,11,this);
        _511.setListener(listener);
        add(_511,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 10;
        _611 = new Number(6,11,this);
        _611.setListener(listener);
        add(_611,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 10;
        _711 = new Number(7,11,this);
        _711.setListener(listener);
        add(_711,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 10;
        _811 = new Number(8,11,this);
        _811.setListener(listener);
        add(_811,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 10;
        _911 =  new Number(9,11,this);
        _911.setListener(listener);
        add(_911,gbc);
        
        
        // twelve row
        gbc.gridx = 0;
        gbc.gridy = 11;
        _112 = new Number(1,12,this);
        _112.setListener(listener);
        add(_112,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 11;
        _212 = new Number(2,12,this);
        _212.setListener(listener);
        add(_212,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 11;
        _312 = new Number(3,12,this);
        _312.setListener(listener);
        add(_312,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 11;
        _412 = new Number(4,12,this);
        _412.setListener(listener);
        add(_412,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 11;
        _512 = new Number(5,12,this);
        _512.setListener(listener);
        add(_512,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 11;
        _612 = new Number(6,12,this);
        _612.setListener(listener);
        add(_612,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 11;
        _712 = new Number(7,12,this);
        _712.setListener(listener);
        add(_712,gbc);
        
        gbc.gridx = 7;
        gbc.gridy = 11;
        _812 = new Number(8,12,this);
        _812.setListener(listener);
        add(_812,gbc);
        
        gbc.gridx = 8;
        gbc.gridy = 11;
        _912 =  new Number(9,12,this);
        _912.setListener(listener);
        add(_912,gbc);
        
        
        resetGame();
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents

    private Number _11;
    private Number _110;
    private Number _111;
    private Number _112;
    private Number _12;
    private Number _13;
    private Number _14;
    private Number _15;
    private Number _16;
    private Number _17;
    private Number _18;
    private Number _19;
    private Number _21;
    private Number _210;
    private Number _211;
    private Number _212;
    private Number _22;
    private Number _23;
    private Number _24;
    private Number _25;
    private Number _26;
    private Number _27;
    private Number _28;
    private Number _29;
    private Number _31;
    private Number _310;
    private Number _311;
    private Number _312;
    private Number _32;
    private Number _33;
    private Number _34;
    private Number _35;
    private Number _36;
    private Number _37;
    private Number _38;
    private Number _39;
    private Number _41;
    private Number _410;
    private Number _411;
    private Number _412;
    private Number _42;
    private Number _43;
    private Number _44;
    private Number _45;
    private Number _46;
    private Number _47;
    private Number _48;
    private Number _49;
    private Number _51;
    private Number _510;
    private Number _511;
    private Number _512;
    private Number _52;
    private Number _53;
    private Number _54;
    private Number _55;
    private Number _56;
    private Number _57;
    private Number _58;
    private Number _59;
    private Number _61;
    private Number _610;
    private Number _611;
    private Number _612;
    private Number _62;
    private Number _63;
    private Number _64;
    private Number _65;
    private Number _66;
    private Number _67;
    private Number _68;
    private Number _69;
    private Number _71;
    private Number _710;
    private Number _711;
    private Number _712;
    private Number _72;
    private Number _73;
    private Number _74;
    private Number _75;
    private Number _76;
    private Number _77;
    private Number _78;
    private Number _79;
    private Number _81;
    private Number _810;
    private Number _811;
    private Number _812;
    private Number _82;
    private Number _83;
    private Number _84;
    private Number _85;
    private Number _86;
    private Number _87;
    private Number _88;
    private Number _89;
    private Number _91;
    private Number _910;
    private Number _911;
    private Number _912;
    private Number _92;
    private Number _93;
    private Number _94;
    private Number _95;
    private Number _96;
    private Number _97;
    private Number _98;
    private Number _99;

    public void resetGame() {
        _12.setText(Integer.toString(getRandom()));
        _11.setText(Integer.toString(getRandom()));
        _110.setText(Integer.toString(getRandom()));
        _111.setText(Integer.toString(getRandom()));
        _112.setText(Integer.toString(getRandom()));
        _22.setText(Integer.toString(getRandom()));
        _13.setText(Integer.toString(getRandom()));
        _14.setText(Integer.toString(getRandom()));
        _15.setText(Integer.toString(getRandom()));
        _16.setText(Integer.toString(getRandom()));
        _17.setText(Integer.toString(getRandom()));
        _18.setText(Integer.toString(getRandom()));
        _19.setText(Integer.toString(getRandom()));
        _21.setText(Integer.toString(getRandom()));
        _210.setText(Integer.toString(getRandom()));
        _211.setText(Integer.toString(getRandom()));
        _212.setText(Integer.toString(getRandom()));
        _23.setText(Integer.toString(getRandom()));
        _24.setText(Integer.toString(getRandom()));
        _25.setText(Integer.toString(getRandom()));
        _26.setText(Integer.toString(getRandom()));
        _27.setText(Integer.toString(getRandom()));
        _28.setText(Integer.toString(getRandom()));
        _29.setText(Integer.toString(getRandom()));
        _31.setText(Integer.toString(getRandom()));
        _310.setText(Integer.toString(getRandom()));
        _311.setText(Integer.toString(getRandom()));
        _312.setText(Integer.toString(getRandom()));
        _32.setText(Integer.toString(getRandom()));
        _33.setText(Integer.toString(getRandom()));
        _34.setText(Integer.toString(getRandom()));
        _35.setText(Integer.toString(getRandom()));
        _36.setText(Integer.toString(getRandom()));
        _37.setText(Integer.toString(getRandom()));
        _38.setText(Integer.toString(getRandom()));
        _39.setText(Integer.toString(getRandom()));
        _41.setText(Integer.toString(getRandom()));
        _410.setText(Integer.toString(getRandom()));
        _411.setText(Integer.toString(getRandom()));
        _412.setText(Integer.toString(getRandom()));
        _42.setText(Integer.toString(getRandom()));
        _43.setText(Integer.toString(getRandom()));
        _44.setText(Integer.toString(getRandom()));
        _45.setText(Integer.toString(getRandom()));
        _46.setText(Integer.toString(getRandom()));
        _47.setText(Integer.toString(getRandom()));
        _48.setText(Integer.toString(getRandom()));
        _49.setText(Integer.toString(getRandom()));
        _51.setText(Integer.toString(getRandom()));
        _510.setText(Integer.toString(getRandom()));
        _511.setText(Integer.toString(getRandom()));
        _512.setText(Integer.toString(getRandom()));
        _52.setText(Integer.toString(getRandom()));
        _53.setText(Integer.toString(getRandom()));
        _54.setText(Integer.toString(getRandom()));
        _55.setText(Integer.toString(getRandom()));
        _56.setText(Integer.toString(getRandom()));
        _57.setText(Integer.toString(getRandom()));
        _58.setText(Integer.toString(getRandom()));
        _59.setText(Integer.toString(getRandom()));
        _61.setText(Integer.toString(getRandom()));
        _610.setText(Integer.toString(getRandom()));
        _611.setText(Integer.toString(getRandom()));
        _612.setText(Integer.toString(getRandom()));
        _62.setText(Integer.toString(getRandom()));
        _63.setText(Integer.toString(getRandom()));
        _64.setText(Integer.toString(getRandom()));
        _65.setText(Integer.toString(getRandom()));
        _66.setText(Integer.toString(getRandom()));
        _67.setText(Integer.toString(getRandom()));
        _68.setText(Integer.toString(getRandom()));
        _69.setText(Integer.toString(getRandom()));
        _71.setText(Integer.toString(getRandom()));
        _710.setText(Integer.toString(getRandom()));
        _711.setText(Integer.toString(getRandom()));
        _712.setText(Integer.toString(getRandom()));
        _72.setText(Integer.toString(getRandom()));
        _73.setText(Integer.toString(getRandom()));
        _74.setText(Integer.toString(getRandom()));
        _75.setText(Integer.toString(getRandom()));
        _76.setText(Integer.toString(getRandom()));
        _77.setText(Integer.toString(getRandom()));
        _78.setText(Integer.toString(getRandom()));
        _79.setText(Integer.toString(getRandom()));
        _81.setText(Integer.toString(getRandom()));
        _810.setText(Integer.toString(getRandom()));
        _811.setText(Integer.toString(getRandom()));
        _812.setText(Integer.toString(getRandom()));
        _82.setText(Integer.toString(getRandom()));
        _83.setText(Integer.toString(getRandom()));
        _84.setText(Integer.toString(getRandom()));
        _85.setText(Integer.toString(getRandom()));
        _86.setText(Integer.toString(getRandom()));
        _87.setText(Integer.toString(getRandom()));
        _88.setText(Integer.toString(getRandom()));
        _89.setText(Integer.toString(getRandom()));
        _91.setText(Integer.toString(getRandom()));
        _910.setText(Integer.toString(getRandom()));
        _911.setText(Integer.toString(getRandom()));
        _912.setText(Integer.toString(getRandom()));
        _92.setText(Integer.toString(getRandom()));
        _93.setText(Integer.toString(getRandom()));
        _94.setText(Integer.toString(getRandom()));
        _95.setText(Integer.toString(getRandom()));
        _96.setText(Integer.toString(getRandom()));
        _97.setText(Integer.toString(getRandom()));
        _98.setText(Integer.toString(getRandom()));
        _99.setText(Integer.toString(getRandom()));
    }

    public void addListener(ClickListener listener){
        this.listenerObjects.add(listener);
    }
    private int getRandom() {
        Random random = new Random();
        int number = 0;
        while (number == 0) {
            number = random.nextInt(9);
        }

        return number;
    }
    
    private boolean isValidSwitched(int new_row, int new_column,INumber number) {
                // check if row or column is valid for move or not
                if((new_row != previous_row) && (new_column == previous_column)){
                    // row is moved
                    int row_moved = new_row - previous_row;                    
                    if(Math.abs(row_moved) <= 1){
                        return true;
                    }else{
                        // check if blank panel is existed or not
                        switch(new_row){
                            
                        }
                        
                    }
                    return Math.abs(row_moved) <= 1 ? true : false;
                }
                
                if((new_column != previous_column) && (new_row == previous_row)){
                    int column_moved = new_column - previous_column;                    
                    return Math.abs(column_moved) <=1 ? true : false;
                }
                
                return false;
            }

    public void setPointListener(PointListener listener) {
        this.pointListener = listener;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
