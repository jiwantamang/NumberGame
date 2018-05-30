package numbergame.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author g1
 */
public class GameAreaBack extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form GameArea
     */
    private JButton selectedButton;

    public GameAreaBack() {
        initComponents();
        resetGameNumber();

        _12.addMouseListener(this);
        _11.addMouseListener(this);
        _110.addMouseListener(this);
        _111.addMouseListener(this);
        _112.addMouseListener(this);
        _22.addMouseListener(this);
        _13.addMouseListener(this);
        _14.addMouseListener(this);
        _15.addMouseListener(this);
        _16.addMouseListener(this);
        _17.addMouseListener(this);
        _18.addMouseListener(this);
        _19.addMouseListener(this);
        _21.addMouseListener(this);
        _210.addMouseListener(this);
        _211.addMouseListener(this);
        _212.addMouseListener(this);
        _23.addMouseListener(this);
        _24.addMouseListener(this);
        _25.addMouseListener(this);
        _26.addMouseListener(this);
        _27.addMouseListener(this);
        _28.addMouseListener(this);
        _29.addMouseListener(this);
        _31.addMouseListener(this);
        _310.addMouseListener(this);
        _311.addMouseListener(this);
        _312.addMouseListener(this);
        _32.addMouseListener(this);
        _33.addMouseListener(this);
        _34.addMouseListener(this);
        _35.addMouseListener(this);
        _36.addMouseListener(this);
        _37.addMouseListener(this);
        _38.addMouseListener(this);
        _39.addMouseListener(this);
        _41.addMouseListener(this);
        _410.addMouseListener(this);
        _411.addMouseListener(this);
        _412.addMouseListener(this);
        _42.addMouseListener(this);
        _43.addMouseListener(this);
        _44.addMouseListener(this);
        _45.addMouseListener(this);
        _46.addMouseListener(this);
        _47.addMouseListener(this);
        _48.addMouseListener(this);
        _49.addMouseListener(this);
        _51.addMouseListener(this);
        _510.addMouseListener(this);
        _511.addMouseListener(this);
        _512.addMouseListener(this);
        _52.addMouseListener(this);
        _53.addMouseListener(this);
        _54.addMouseListener(this);
        _55.addMouseListener(this);
        _56.addMouseListener(this);
        _57.addMouseListener(this);
        _58.addMouseListener(this);
        _59.addMouseListener(this);
        _61.addMouseListener(this);
        _610.addMouseListener(this);
        _611.addMouseListener(this);
        _612.addMouseListener(this);
        _62.addMouseListener(this);
        _63.addMouseListener(this);
        _64.addMouseListener(this);
        _65.addMouseListener(this);
        _66.addMouseListener(this);
        _67.addMouseListener(this);
        _68.addMouseListener(this);
        _69.addMouseListener(this);
        _71.addMouseListener(this);
        _710.addMouseListener(this);
        _711.addMouseListener(this);
        _712.addMouseListener(this);
        _72.addMouseListener(this);
        _73.addMouseListener(this);
        _74.addMouseListener(this);
        _75.addMouseListener(this);
        _76.addMouseListener(this);
        _77.addMouseListener(this);
        _78.addMouseListener(this);
        _79.addMouseListener(this);
        _81.addMouseListener(this);
        _810.addMouseListener(this);
        _811.addMouseListener(this);
        _812.addMouseListener(this);
        _82.addMouseListener(this);
        _83.addMouseListener(this);
        _84.addMouseListener(this);
        _85.addMouseListener(this);
        _86.addMouseListener(this);
        _87.addMouseListener(this);
        _88.addMouseListener(this);
        _89.addMouseListener(this);
        _91.addMouseListener(this);
        _910.addMouseListener(this);
        _911.addMouseListener(this);
        _912.addMouseListener(this);
        _92.addMouseListener(this);
        _93.addMouseListener(this);
        _94.addMouseListener(this);
        _95.addMouseListener(this);
        _96.addMouseListener(this);
        _97.addMouseListener(this);
        _98.addMouseListener(this);
        _99.addMouseListener(this);

    }

    public void resetGameNumber() {
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

    public int getRandom() {
        Random random = new Random();
        int number = 0;
        while (number == 0) {
            number = random.nextInt(9);
        }

        return number;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        _11 = new javax.swing.JButton();
        _21 = new javax.swing.JButton();
        _31 = new javax.swing.JButton();
        _41 = new javax.swing.JButton();
        _51 = new javax.swing.JButton();
        _61 = new javax.swing.JButton();
        _71 = new javax.swing.JButton();
        _81 = new javax.swing.JButton();
        _91 = new javax.swing.JButton();
        _12 = new javax.swing.JButton();
        _22 = new javax.swing.JButton();
        _32 = new javax.swing.JButton();
        _42 = new javax.swing.JButton();
        _52 = new javax.swing.JButton();
        _62 = new javax.swing.JButton();
        _72 = new javax.swing.JButton();
        _82 = new javax.swing.JButton();
        _92 = new javax.swing.JButton();
        _13 = new javax.swing.JButton();
        _23 = new javax.swing.JButton();
        _33 = new javax.swing.JButton();
        _43 = new javax.swing.JButton();
        _53 = new javax.swing.JButton();
        _63 = new javax.swing.JButton();
        _73 = new javax.swing.JButton();
        _83 = new javax.swing.JButton();
        _93 = new javax.swing.JButton();
        _14 = new javax.swing.JButton();
        _24 = new javax.swing.JButton();
        _34 = new javax.swing.JButton();
        _44 = new javax.swing.JButton();
        _54 = new javax.swing.JButton();
        _64 = new javax.swing.JButton();
        _74 = new javax.swing.JButton();
        _84 = new javax.swing.JButton();
        _94 = new javax.swing.JButton();
        _15 = new javax.swing.JButton();
        _25 = new javax.swing.JButton();
        _35 = new javax.swing.JButton();
        _45 = new javax.swing.JButton();
        _55 = new javax.swing.JButton();
        _65 = new javax.swing.JButton();
        _75 = new javax.swing.JButton();
        _85 = new javax.swing.JButton();
        _95 = new javax.swing.JButton();
        _16 = new javax.swing.JButton();
        _26 = new javax.swing.JButton();
        _36 = new javax.swing.JButton();
        _46 = new javax.swing.JButton();
        _56 = new javax.swing.JButton();
        _66 = new javax.swing.JButton();
        _76 = new javax.swing.JButton();
        _86 = new javax.swing.JButton();
        _96 = new javax.swing.JButton();
        _17 = new javax.swing.JButton();
        _27 = new javax.swing.JButton();
        _37 = new javax.swing.JButton();
        _47 = new javax.swing.JButton();
        _57 = new javax.swing.JButton();
        _67 = new javax.swing.JButton();
        _77 = new javax.swing.JButton();
        _87 = new javax.swing.JButton();
        _97 = new javax.swing.JButton();
        _18 = new javax.swing.JButton();
        _28 = new javax.swing.JButton();
        _38 = new javax.swing.JButton();
        _48 = new javax.swing.JButton();
        _58 = new javax.swing.JButton();
        _68 = new javax.swing.JButton();
        _78 = new javax.swing.JButton();
        _88 = new javax.swing.JButton();
        _98 = new javax.swing.JButton();
        _19 = new javax.swing.JButton();
        _29 = new javax.swing.JButton();
        _39 = new javax.swing.JButton();
        _49 = new javax.swing.JButton();
        _59 = new javax.swing.JButton();
        _69 = new javax.swing.JButton();
        _79 = new javax.swing.JButton();
        _89 = new javax.swing.JButton();
        _99 = new javax.swing.JButton();
        _110 = new javax.swing.JButton();
        _210 = new javax.swing.JButton();
        _310 = new javax.swing.JButton();
        _410 = new javax.swing.JButton();
        _510 = new javax.swing.JButton();
        _610 = new javax.swing.JButton();
        _710 = new javax.swing.JButton();
        _810 = new javax.swing.JButton();
        _910 = new javax.swing.JButton();
        _111 = new javax.swing.JButton();
        _211 = new javax.swing.JButton();
        _311 = new javax.swing.JButton();
        _411 = new javax.swing.JButton();
        _511 = new javax.swing.JButton();
        _611 = new javax.swing.JButton();
        _711 = new javax.swing.JButton();
        _811 = new javax.swing.JButton();
        _911 = new javax.swing.JButton();
        _112 = new javax.swing.JButton();
        _212 = new javax.swing.JButton();
        _312 = new javax.swing.JButton();
        _412 = new javax.swing.JButton();
        _512 = new javax.swing.JButton();
        _612 = new javax.swing.JButton();
        _712 = new javax.swing.JButton();
        _812 = new javax.swing.JButton();
        _912 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setPreferredSize(new java.awt.Dimension(350, 500));
        setLayout(new java.awt.GridBagLayout());

        _11.setBackground(new java.awt.Color(255, 0, 0));
        _11.setForeground(new java.awt.Color(255, 255, 255));
        _11.setText("1");
        add(_11, new java.awt.GridBagConstraints());

        _21.setBackground(new java.awt.Color(255, 0, 0));
        _21.setForeground(new java.awt.Color(255, 255, 255));
        _21.setText("2");
        add(_21, new java.awt.GridBagConstraints());

        _31.setBackground(new java.awt.Color(255, 0, 0));
        _31.setForeground(new java.awt.Color(255, 255, 255));
        _31.setText("3");
        add(_31, new java.awt.GridBagConstraints());

        _41.setBackground(new java.awt.Color(255, 0, 0));
        _41.setForeground(new java.awt.Color(255, 255, 255));
        _41.setText("4");
        add(_41, new java.awt.GridBagConstraints());

        _51.setBackground(new java.awt.Color(255, 0, 0));
        _51.setForeground(new java.awt.Color(255, 255, 255));
        _51.setText("5");
        add(_51, new java.awt.GridBagConstraints());

        _61.setBackground(new java.awt.Color(255, 0, 0));
        _61.setForeground(new java.awt.Color(255, 255, 255));
        _61.setText("6");
        add(_61, new java.awt.GridBagConstraints());

        _71.setBackground(new java.awt.Color(255, 0, 0));
        _71.setForeground(new java.awt.Color(255, 255, 255));
        _71.setText("7");
        add(_71, new java.awt.GridBagConstraints());

        _81.setBackground(new java.awt.Color(255, 0, 0));
        _81.setForeground(new java.awt.Color(255, 255, 255));
        _81.setText("8");
        add(_81, new java.awt.GridBagConstraints());

        _91.setBackground(new java.awt.Color(255, 0, 0));
        _91.setForeground(new java.awt.Color(255, 255, 255));
        _91.setText("9");
        add(_91, new java.awt.GridBagConstraints());

        _12.setBackground(new java.awt.Color(255, 0, 0));
        _12.setForeground(new java.awt.Color(255, 255, 255));
        _12.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_12, gridBagConstraints);

        _22.setBackground(new java.awt.Color(255, 0, 0));
        _22.setForeground(new java.awt.Color(255, 255, 255));
        _22.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_22, gridBagConstraints);

        _32.setBackground(new java.awt.Color(255, 0, 0));
        _32.setForeground(new java.awt.Color(255, 255, 255));
        _32.setText("3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_32, gridBagConstraints);

        _42.setBackground(new java.awt.Color(255, 0, 0));
        _42.setForeground(new java.awt.Color(255, 255, 255));
        _42.setText("4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_42, gridBagConstraints);

        _52.setBackground(new java.awt.Color(255, 0, 0));
        _52.setForeground(new java.awt.Color(255, 255, 255));
        _52.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_52, gridBagConstraints);

        _62.setBackground(new java.awt.Color(255, 0, 0));
        _62.setForeground(new java.awt.Color(255, 255, 255));
        _62.setText("6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_62, gridBagConstraints);

        _72.setBackground(new java.awt.Color(255, 0, 0));
        _72.setForeground(new java.awt.Color(255, 255, 255));
        _72.setText("7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_72, gridBagConstraints);

        _82.setBackground(new java.awt.Color(255, 0, 0));
        _82.setForeground(new java.awt.Color(255, 255, 255));
        _82.setText("8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_82, gridBagConstraints);

        _92.setBackground(new java.awt.Color(255, 0, 0));
        _92.setForeground(new java.awt.Color(255, 255, 255));
        _92.setText("9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(_92, gridBagConstraints);

        _13.setBackground(new java.awt.Color(255, 0, 0));
        _13.setForeground(new java.awt.Color(255, 255, 255));
        _13.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_13, gridBagConstraints);

        _23.setBackground(new java.awt.Color(255, 0, 0));
        _23.setForeground(new java.awt.Color(255, 255, 255));
        _23.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_23, gridBagConstraints);

        _33.setBackground(new java.awt.Color(255, 0, 0));
        _33.setForeground(new java.awt.Color(255, 255, 255));
        _33.setText("3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_33, gridBagConstraints);

        _43.setBackground(new java.awt.Color(255, 0, 0));
        _43.setForeground(new java.awt.Color(255, 255, 255));
        _43.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_43, gridBagConstraints);

        _53.setBackground(new java.awt.Color(255, 0, 0));
        _53.setForeground(new java.awt.Color(255, 255, 255));
        _53.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_53, gridBagConstraints);

        _63.setBackground(new java.awt.Color(255, 0, 0));
        _63.setForeground(new java.awt.Color(255, 255, 255));
        _63.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_63, gridBagConstraints);

        _73.setBackground(new java.awt.Color(255, 0, 0));
        _73.setForeground(new java.awt.Color(255, 255, 255));
        _73.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_73, gridBagConstraints);

        _83.setBackground(new java.awt.Color(255, 0, 0));
        _83.setForeground(new java.awt.Color(255, 255, 255));
        _83.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_83, gridBagConstraints);

        _93.setBackground(new java.awt.Color(255, 0, 0));
        _93.setForeground(new java.awt.Color(255, 255, 255));
        _93.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        add(_93, gridBagConstraints);

        _14.setBackground(new java.awt.Color(255, 0, 0));
        _14.setForeground(new java.awt.Color(255, 255, 255));
        _14.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_14, gridBagConstraints);

        _24.setBackground(new java.awt.Color(255, 0, 0));
        _24.setForeground(new java.awt.Color(255, 255, 255));
        _24.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_24, gridBagConstraints);

        _34.setBackground(new java.awt.Color(255, 0, 0));
        _34.setForeground(new java.awt.Color(255, 255, 255));
        _34.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_34, gridBagConstraints);

        _44.setBackground(new java.awt.Color(255, 0, 0));
        _44.setForeground(new java.awt.Color(255, 255, 255));
        _44.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_44, gridBagConstraints);

        _54.setBackground(new java.awt.Color(255, 0, 0));
        _54.setForeground(new java.awt.Color(255, 255, 255));
        _54.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_54, gridBagConstraints);

        _64.setBackground(new java.awt.Color(255, 0, 0));
        _64.setForeground(new java.awt.Color(255, 255, 255));
        _64.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_64, gridBagConstraints);

        _74.setBackground(new java.awt.Color(255, 0, 0));
        _74.setForeground(new java.awt.Color(255, 255, 255));
        _74.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_74, gridBagConstraints);

        _84.setBackground(new java.awt.Color(255, 0, 0));
        _84.setForeground(new java.awt.Color(255, 255, 255));
        _84.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_84, gridBagConstraints);

        _94.setBackground(new java.awt.Color(255, 0, 0));
        _94.setForeground(new java.awt.Color(255, 255, 255));
        _94.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(_94, gridBagConstraints);

        _15.setBackground(new java.awt.Color(255, 0, 0));
        _15.setForeground(new java.awt.Color(255, 255, 255));
        _15.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_15, gridBagConstraints);

        _25.setBackground(new java.awt.Color(255, 0, 0));
        _25.setForeground(new java.awt.Color(255, 255, 255));
        _25.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_25, gridBagConstraints);

        _35.setBackground(new java.awt.Color(255, 0, 0));
        _35.setForeground(new java.awt.Color(255, 255, 255));
        _35.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_35, gridBagConstraints);

        _45.setBackground(new java.awt.Color(255, 0, 0));
        _45.setForeground(new java.awt.Color(255, 255, 255));
        _45.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_45, gridBagConstraints);

        _55.setBackground(new java.awt.Color(255, 0, 0));
        _55.setForeground(new java.awt.Color(255, 255, 255));
        _55.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_55, gridBagConstraints);

        _65.setBackground(new java.awt.Color(255, 0, 0));
        _65.setForeground(new java.awt.Color(255, 255, 255));
        _65.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_65, gridBagConstraints);

        _75.setBackground(new java.awt.Color(255, 0, 0));
        _75.setForeground(new java.awt.Color(255, 255, 255));
        _75.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_75, gridBagConstraints);

        _85.setBackground(new java.awt.Color(255, 0, 0));
        _85.setForeground(new java.awt.Color(255, 255, 255));
        _85.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_85, gridBagConstraints);

        _95.setBackground(new java.awt.Color(255, 0, 0));
        _95.setForeground(new java.awt.Color(255, 255, 255));
        _95.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        add(_95, gridBagConstraints);

        _16.setBackground(new java.awt.Color(255, 0, 0));
        _16.setForeground(new java.awt.Color(255, 255, 255));
        _16.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_16, gridBagConstraints);

        _26.setBackground(new java.awt.Color(255, 0, 0));
        _26.setForeground(new java.awt.Color(255, 255, 255));
        _26.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_26, gridBagConstraints);

        _36.setBackground(new java.awt.Color(255, 0, 0));
        _36.setForeground(new java.awt.Color(255, 255, 255));
        _36.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_36, gridBagConstraints);

        _46.setBackground(new java.awt.Color(255, 0, 0));
        _46.setForeground(new java.awt.Color(255, 255, 255));
        _46.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_46, gridBagConstraints);

        _56.setBackground(new java.awt.Color(255, 0, 0));
        _56.setForeground(new java.awt.Color(255, 255, 255));
        _56.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_56, gridBagConstraints);

        _66.setBackground(new java.awt.Color(255, 0, 0));
        _66.setForeground(new java.awt.Color(255, 255, 255));
        _66.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_66, gridBagConstraints);

        _76.setBackground(new java.awt.Color(255, 0, 0));
        _76.setForeground(new java.awt.Color(255, 255, 255));
        _76.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_76, gridBagConstraints);

        _86.setBackground(new java.awt.Color(255, 0, 0));
        _86.setForeground(new java.awt.Color(255, 255, 255));
        _86.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_86, gridBagConstraints);

        _96.setBackground(new java.awt.Color(255, 0, 0));
        _96.setForeground(new java.awt.Color(255, 255, 255));
        _96.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        add(_96, gridBagConstraints);

        _17.setBackground(new java.awt.Color(255, 0, 0));
        _17.setForeground(new java.awt.Color(255, 255, 255));
        _17.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_17, gridBagConstraints);

        _27.setBackground(new java.awt.Color(255, 0, 0));
        _27.setForeground(new java.awt.Color(255, 255, 255));
        _27.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_27, gridBagConstraints);

        _37.setBackground(new java.awt.Color(255, 0, 0));
        _37.setForeground(new java.awt.Color(255, 255, 255));
        _37.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_37, gridBagConstraints);

        _47.setBackground(new java.awt.Color(255, 0, 0));
        _47.setForeground(new java.awt.Color(255, 255, 255));
        _47.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_47, gridBagConstraints);

        _57.setBackground(new java.awt.Color(255, 0, 0));
        _57.setForeground(new java.awt.Color(255, 255, 255));
        _57.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_57, gridBagConstraints);

        _67.setBackground(new java.awt.Color(255, 0, 0));
        _67.setForeground(new java.awt.Color(255, 255, 255));
        _67.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_67, gridBagConstraints);

        _77.setBackground(new java.awt.Color(255, 0, 0));
        _77.setForeground(new java.awt.Color(255, 255, 255));
        _77.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_77, gridBagConstraints);

        _87.setBackground(new java.awt.Color(255, 0, 0));
        _87.setForeground(new java.awt.Color(255, 255, 255));
        _87.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_87, gridBagConstraints);

        _97.setBackground(new java.awt.Color(255, 0, 0));
        _97.setForeground(new java.awt.Color(255, 255, 255));
        _97.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        add(_97, gridBagConstraints);

        _18.setBackground(new java.awt.Color(255, 0, 0));
        _18.setForeground(new java.awt.Color(255, 255, 255));
        _18.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_18, gridBagConstraints);

        _28.setBackground(new java.awt.Color(255, 0, 0));
        _28.setForeground(new java.awt.Color(255, 255, 255));
        _28.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_28, gridBagConstraints);

        _38.setBackground(new java.awt.Color(255, 0, 0));
        _38.setForeground(new java.awt.Color(255, 255, 255));
        _38.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_38, gridBagConstraints);

        _48.setBackground(new java.awt.Color(255, 0, 0));
        _48.setForeground(new java.awt.Color(255, 255, 255));
        _48.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_48, gridBagConstraints);

        _58.setBackground(new java.awt.Color(255, 0, 0));
        _58.setForeground(new java.awt.Color(255, 255, 255));
        _58.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_58, gridBagConstraints);

        _68.setBackground(new java.awt.Color(255, 0, 0));
        _68.setForeground(new java.awt.Color(255, 255, 255));
        _68.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_68, gridBagConstraints);

        _78.setBackground(new java.awt.Color(255, 0, 0));
        _78.setForeground(new java.awt.Color(255, 255, 255));
        _78.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_78, gridBagConstraints);

        _88.setBackground(new java.awt.Color(255, 0, 0));
        _88.setForeground(new java.awt.Color(255, 255, 255));
        _88.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_88, gridBagConstraints);

        _98.setBackground(new java.awt.Color(255, 0, 0));
        _98.setForeground(new java.awt.Color(255, 255, 255));
        _98.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        add(_98, gridBagConstraints);

        _19.setBackground(new java.awt.Color(255, 0, 0));
        _19.setForeground(new java.awt.Color(255, 255, 255));
        _19.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_19, gridBagConstraints);

        _29.setBackground(new java.awt.Color(255, 0, 0));
        _29.setForeground(new java.awt.Color(255, 255, 255));
        _29.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_29, gridBagConstraints);

        _39.setBackground(new java.awt.Color(255, 0, 0));
        _39.setForeground(new java.awt.Color(255, 255, 255));
        _39.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_39, gridBagConstraints);

        _49.setBackground(new java.awt.Color(255, 0, 0));
        _49.setForeground(new java.awt.Color(255, 255, 255));
        _49.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_49, gridBagConstraints);

        _59.setBackground(new java.awt.Color(255, 0, 0));
        _59.setForeground(new java.awt.Color(255, 255, 255));
        _59.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_59, gridBagConstraints);

        _69.setBackground(new java.awt.Color(255, 0, 0));
        _69.setForeground(new java.awt.Color(255, 255, 255));
        _69.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_69, gridBagConstraints);

        _79.setBackground(new java.awt.Color(255, 0, 0));
        _79.setForeground(new java.awt.Color(255, 255, 255));
        _79.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_79, gridBagConstraints);

        _89.setBackground(new java.awt.Color(255, 0, 0));
        _89.setForeground(new java.awt.Color(255, 255, 255));
        _89.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_89, gridBagConstraints);

        _99.setBackground(new java.awt.Color(255, 0, 0));
        _99.setForeground(new java.awt.Color(255, 255, 255));
        _99.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        add(_99, gridBagConstraints);

        _110.setBackground(new java.awt.Color(255, 0, 0));
        _110.setForeground(new java.awt.Color(255, 255, 255));
        _110.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_110, gridBagConstraints);

        _210.setBackground(new java.awt.Color(255, 0, 0));
        _210.setForeground(new java.awt.Color(255, 255, 255));
        _210.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_210, gridBagConstraints);

        _310.setBackground(new java.awt.Color(255, 0, 0));
        _310.setForeground(new java.awt.Color(255, 255, 255));
        _310.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_310, gridBagConstraints);

        _410.setBackground(new java.awt.Color(255, 0, 0));
        _410.setForeground(new java.awt.Color(255, 255, 255));
        _410.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_410, gridBagConstraints);

        _510.setBackground(new java.awt.Color(255, 0, 0));
        _510.setForeground(new java.awt.Color(255, 255, 255));
        _510.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_510, gridBagConstraints);

        _610.setBackground(new java.awt.Color(255, 0, 0));
        _610.setForeground(new java.awt.Color(255, 255, 255));
        _610.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_610, gridBagConstraints);

        _710.setBackground(new java.awt.Color(255, 0, 0));
        _710.setForeground(new java.awt.Color(255, 255, 255));
        _710.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_710, gridBagConstraints);

        _810.setBackground(new java.awt.Color(255, 0, 0));
        _810.setForeground(new java.awt.Color(255, 255, 255));
        _810.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_810, gridBagConstraints);

        _910.setBackground(new java.awt.Color(255, 0, 0));
        _910.setForeground(new java.awt.Color(255, 255, 255));
        _910.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        add(_910, gridBagConstraints);

        _111.setBackground(new java.awt.Color(255, 0, 0));
        _111.setForeground(new java.awt.Color(255, 255, 255));
        _111.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_111, gridBagConstraints);

        _211.setBackground(new java.awt.Color(255, 0, 0));
        _211.setForeground(new java.awt.Color(255, 255, 255));
        _211.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_211, gridBagConstraints);

        _311.setBackground(new java.awt.Color(255, 0, 0));
        _311.setForeground(new java.awt.Color(255, 255, 255));
        _311.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_311, gridBagConstraints);

        _411.setBackground(new java.awt.Color(255, 0, 0));
        _411.setForeground(new java.awt.Color(255, 255, 255));
        _411.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_411, gridBagConstraints);

        _511.setBackground(new java.awt.Color(255, 0, 0));
        _511.setForeground(new java.awt.Color(255, 255, 255));
        _511.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_511, gridBagConstraints);

        _611.setBackground(new java.awt.Color(255, 0, 0));
        _611.setForeground(new java.awt.Color(255, 255, 255));
        _611.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_611, gridBagConstraints);

        _711.setBackground(new java.awt.Color(255, 0, 0));
        _711.setForeground(new java.awt.Color(255, 255, 255));
        _711.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_711, gridBagConstraints);

        _811.setBackground(new java.awt.Color(255, 0, 0));
        _811.setForeground(new java.awt.Color(255, 255, 255));
        _811.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_811, gridBagConstraints);

        _911.setBackground(new java.awt.Color(255, 0, 0));
        _911.setForeground(new java.awt.Color(255, 255, 255));
        _911.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        add(_911, gridBagConstraints);

        _112.setBackground(new java.awt.Color(255, 0, 0));
        _112.setForeground(new java.awt.Color(255, 255, 255));
        _112.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_112, gridBagConstraints);

        _212.setBackground(new java.awt.Color(255, 0, 0));
        _212.setForeground(new java.awt.Color(255, 255, 255));
        _212.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_212, gridBagConstraints);

        _312.setBackground(new java.awt.Color(255, 0, 0));
        _312.setForeground(new java.awt.Color(255, 255, 255));
        _312.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_312, gridBagConstraints);

        _412.setBackground(new java.awt.Color(255, 0, 0));
        _412.setForeground(new java.awt.Color(255, 255, 255));
        _412.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_412, gridBagConstraints);

        _512.setBackground(new java.awt.Color(255, 0, 0));
        _512.setForeground(new java.awt.Color(255, 255, 255));
        _512.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_512, gridBagConstraints);

        _612.setBackground(new java.awt.Color(255, 0, 0));
        _612.setForeground(new java.awt.Color(255, 255, 255));
        _612.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_612, gridBagConstraints);

        _712.setBackground(new java.awt.Color(255, 0, 0));
        _712.setForeground(new java.awt.Color(255, 255, 255));
        _712.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_712, gridBagConstraints);

        _812.setBackground(new java.awt.Color(255, 0, 0));
        _812.setForeground(new java.awt.Color(255, 255, 255));
        _812.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_812, gridBagConstraints);

        _912.setBackground(new java.awt.Color(255, 0, 0));
        _912.setForeground(new java.awt.Color(255, 255, 255));
        _912.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        add(_912, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _11;
    private javax.swing.JButton _110;
    private javax.swing.JButton _111;
    private javax.swing.JButton _112;
    private javax.swing.JButton _12;
    private javax.swing.JButton _13;
    private javax.swing.JButton _14;
    private javax.swing.JButton _15;
    private javax.swing.JButton _16;
    private javax.swing.JButton _17;
    private javax.swing.JButton _18;
    private javax.swing.JButton _19;
    private javax.swing.JButton _21;
    private javax.swing.JButton _210;
    private javax.swing.JButton _211;
    private javax.swing.JButton _212;
    private javax.swing.JButton _22;
    private javax.swing.JButton _23;
    private javax.swing.JButton _24;
    private javax.swing.JButton _25;
    private javax.swing.JButton _26;
    private javax.swing.JButton _27;
    private javax.swing.JButton _28;
    private javax.swing.JButton _29;
    private javax.swing.JButton _31;
    private javax.swing.JButton _310;
    private javax.swing.JButton _311;
    private javax.swing.JButton _312;
    private javax.swing.JButton _32;
    private javax.swing.JButton _33;
    private javax.swing.JButton _34;
    private javax.swing.JButton _35;
    private javax.swing.JButton _36;
    private javax.swing.JButton _37;
    private javax.swing.JButton _38;
    private javax.swing.JButton _39;
    private javax.swing.JButton _41;
    private javax.swing.JButton _410;
    private javax.swing.JButton _411;
    private javax.swing.JButton _412;
    private javax.swing.JButton _42;
    private javax.swing.JButton _43;
    private javax.swing.JButton _44;
    private javax.swing.JButton _45;
    private javax.swing.JButton _46;
    private javax.swing.JButton _47;
    private javax.swing.JButton _48;
    private javax.swing.JButton _49;
    private javax.swing.JButton _51;
    private javax.swing.JButton _510;
    private javax.swing.JButton _511;
    private javax.swing.JButton _512;
    private javax.swing.JButton _52;
    private javax.swing.JButton _53;
    private javax.swing.JButton _54;
    private javax.swing.JButton _55;
    private javax.swing.JButton _56;
    private javax.swing.JButton _57;
    private javax.swing.JButton _58;
    private javax.swing.JButton _59;
    private javax.swing.JButton _61;
    private javax.swing.JButton _610;
    private javax.swing.JButton _611;
    private javax.swing.JButton _612;
    private javax.swing.JButton _62;
    private javax.swing.JButton _63;
    private javax.swing.JButton _64;
    private javax.swing.JButton _65;
    private javax.swing.JButton _66;
    private javax.swing.JButton _67;
    private javax.swing.JButton _68;
    private javax.swing.JButton _69;
    private javax.swing.JButton _71;
    private javax.swing.JButton _710;
    private javax.swing.JButton _711;
    private javax.swing.JButton _712;
    private javax.swing.JButton _72;
    private javax.swing.JButton _73;
    private javax.swing.JButton _74;
    private javax.swing.JButton _75;
    private javax.swing.JButton _76;
    private javax.swing.JButton _77;
    private javax.swing.JButton _78;
    private javax.swing.JButton _79;
    private javax.swing.JButton _81;
    private javax.swing.JButton _810;
    private javax.swing.JButton _811;
    private javax.swing.JButton _812;
    private javax.swing.JButton _82;
    private javax.swing.JButton _83;
    private javax.swing.JButton _84;
    private javax.swing.JButton _85;
    private javax.swing.JButton _86;
    private javax.swing.JButton _87;
    private javax.swing.JButton _88;
    private javax.swing.JButton _89;
    private javax.swing.JButton _91;
    private javax.swing.JButton _910;
    private javax.swing.JButton _911;
    private javax.swing.JButton _912;
    private javax.swing.JButton _92;
    private javax.swing.JButton _93;
    private javax.swing.JButton _94;
    private javax.swing.JButton _95;
    private javax.swing.JButton _96;
    private javax.swing.JButton _97;
    private javax.swing.JButton _98;
    private javax.swing.JButton _99;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == _11) {
            selectedButton = _11;
            _11.setBackground(Color.GREEN);
            _11.setForeground(Color.WHITE);
        }

        if (e.getSource() == _21) {
            selectedButton = _21;
            _21.setBackground(Color.GREEN);
            _21.setForeground(Color.WHITE);
        }

        if (e.getSource() == _31) {
            selectedButton = _31;
            _31.setBackground(Color.GREEN);
            _31.setForeground(Color.WHITE);
        }

        if (e.getSource() == _41) {
            selectedButton = _41;
            _41.setBackground(Color.GREEN);
            _41.setForeground(Color.WHITE);
        }

        if (e.getSource() == _51) {
            selectedButton = _51;
            _51.setBackground(Color.GREEN);
            _51.setForeground(Color.WHITE);
        } else {
            _51.setBackground(Color.RED);
            _51.setForeground(Color.WHITE);
        }

        if (e.getSource() == _61) {
            selectedButton = _61;
            _61.setBackground(Color.GREEN);
            _61.setForeground(Color.WHITE);
        } else {
            _61.setBackground(Color.RED);
            _61.setForeground(Color.WHITE);
        }

        if (e.getSource() == _71) {
            selectedButton = _71;
            _71.setBackground(Color.GREEN);
            _71.setForeground(Color.WHITE);
        } else {
            _71.setBackground(Color.RED);
            _71.setForeground(Color.WHITE);
        }

        if (e.getSource() == _81) {
            selectedButton = _81;
            _81.setBackground(Color.GREEN);
            _81.setForeground(Color.WHITE);
        } else {
            _81.setBackground(Color.RED);
            _81.setForeground(Color.WHITE);
        }

        if (e.getSource() == _91) {
            selectedButton = _91;
            _91.setBackground(Color.GREEN);
            _91.setForeground(Color.WHITE);
        } else {
            _91.setBackground(Color.RED);
            _91.setForeground(Color.WHITE);
        }

        // second row
        if (e.getSource() == _12) {
            selectedButton = _12;
            _12.setBackground(Color.GREEN);
            _12.setForeground(Color.WHITE);
        } else {
            _12.setBackground(Color.RED);
            _12.setForeground(Color.WHITE);
        }

        if (e.getSource() == _22) {
            selectedButton = _22;
            _22.setBackground(Color.GREEN);
            _22.setForeground(Color.WHITE);
        } else {
            _22.setBackground(Color.RED);
            _22.setForeground(Color.WHITE);
        }

        if (e.getSource() == _32) {
            selectedButton = _32;
            _32.setBackground(Color.GREEN);
            _32.setForeground(Color.WHITE);
        } else {
            _32.setBackground(Color.RED);
            _32.setForeground(Color.WHITE);
        }

        if (e.getSource() == _42) {
            selectedButton = _42;
            _42.setBackground(Color.GREEN);
            _42.setForeground(Color.WHITE);
        } else {
            _42.setBackground(Color.RED);
            _42.setForeground(Color.WHITE);
        }

        if (e.getSource() == _52) {
            selectedButton = _52;
            _52.setBackground(Color.GREEN);
            _52.setForeground(Color.WHITE);
        } else {
            _52.setBackground(Color.RED);
            _52.setForeground(Color.WHITE);
        }

        if (e.getSource() == _62) {
            selectedButton = _62;
            _62.setBackground(Color.GREEN);
            _62.setForeground(Color.WHITE);
        } else {
            _62.setBackground(Color.RED);
            _62.setForeground(Color.WHITE);
        }

        if (e.getSource() == _72) {
            selectedButton = _72;
            _72.setBackground(Color.GREEN);
            _72.setForeground(Color.WHITE);
        } else {
            _72.setBackground(Color.RED);
            _72.setForeground(Color.WHITE);
        }

        if (e.getSource() == _82) {
            selectedButton = _82;
            _82.setBackground(Color.GREEN);
            _82.setForeground(Color.WHITE);
        } else {
            _82.setBackground(Color.RED);
            _82.setForeground(Color.WHITE);
        }

        if (e.getSource() == _92) {
            selectedButton = _92;
            _92.setBackground(Color.GREEN);
            _92.setForeground(Color.WHITE);
        } else {
            _92.setBackground(Color.RED);
            _92.setForeground(Color.WHITE);
        }

        // third row
        if (e.getSource() == _13) {
            _13.setBackground(Color.GREEN);
            _13.setForeground(Color.WHITE);
        } else {
            _13.setBackground(Color.RED);
            _13.setForeground(Color.WHITE);
        }

        if (e.getSource() == _23) {
            _23.setBackground(Color.GREEN);
            _23.setForeground(Color.WHITE);
        } else {
            _23.setBackground(Color.RED);
            _23.setForeground(Color.WHITE);
        }

        if (e.getSource() == _33) {
            _33.setBackground(Color.GREEN);
            _33.setForeground(Color.WHITE);
        } else {
            _33.setBackground(Color.RED);
            _33.setForeground(Color.WHITE);
        }

        if (e.getSource() == _43) {
            _43.setBackground(Color.GREEN);
            _43.setForeground(Color.WHITE);
        } else {
            _43.setBackground(Color.RED);
            _43.setForeground(Color.WHITE);
        }

        if (e.getSource() == _53) {
            _53.setBackground(Color.GREEN);
            _53.setForeground(Color.WHITE);
        } else {
            _53.setBackground(Color.RED);
            _53.setForeground(Color.WHITE);
        }

        if (e.getSource() == _63) {
            _63.setBackground(Color.GREEN);
            _63.setForeground(Color.WHITE);
        } else {
            _63.setBackground(Color.RED);
            _63.setForeground(Color.WHITE);
        }

        if (e.getSource() == _73) {
            _73.setBackground(Color.GREEN);
            _73.setForeground(Color.WHITE);
        } else {
            _73.setBackground(Color.RED);
            _73.setForeground(Color.WHITE);
        }

        if (e.getSource() == _83) {
            _83.setBackground(Color.GREEN);
            _83.setForeground(Color.WHITE);
        } else {
            _83.setBackground(Color.RED);
            _83.setForeground(Color.WHITE);
        }

        if (e.getSource() == _93) {
            _93.setBackground(Color.GREEN);
            _93.setForeground(Color.WHITE);
        } else {
            _93.setBackground(Color.RED);
            _93.setForeground(Color.WHITE);
        }

        // fourth row
        if (e.getSource() == _14) {
            _14.setBackground(Color.GREEN);
            _14.setForeground(Color.WHITE);
        } else {
            _14.setBackground(Color.RED);
            _14.setForeground(Color.WHITE);
        }

        if (e.getSource() == _24) {
            _24.setBackground(Color.GREEN);
            _24.setForeground(Color.WHITE);
        } else {
            _24.setBackground(Color.RED);
            _24.setForeground(Color.WHITE);
        }

        if (e.getSource() == _34) {
            _34.setBackground(Color.GREEN);
            _34.setForeground(Color.WHITE);
        } else {
            _34.setBackground(Color.RED);
            _34.setForeground(Color.WHITE);
        }

        if (e.getSource() == _44) {
            _44.setBackground(Color.GREEN);
            _44.setForeground(Color.WHITE);
        } else {
            _44.setBackground(Color.RED);
            _44.setForeground(Color.WHITE);
        }

        if (e.getSource() == _54) {
            _54.setBackground(Color.GREEN);
            _54.setForeground(Color.WHITE);
        } else {
            _54.setBackground(Color.RED);
            _54.setForeground(Color.WHITE);
        }

        if (e.getSource() == _64) {
            _64.setBackground(Color.GREEN);
            _64.setForeground(Color.WHITE);
        } else {
            _64.setBackground(Color.RED);
            _64.setForeground(Color.WHITE);
        }

        if (e.getSource() == _74) {
            _74.setBackground(Color.GREEN);
            _74.setForeground(Color.WHITE);
        } else {
            _74.setBackground(Color.RED);
            _74.setForeground(Color.WHITE);
        }

        if (e.getSource() == _84) {
            _84.setBackground(Color.GREEN);
            _84.setForeground(Color.WHITE);
        } else {
            _84.setBackground(Color.RED);
            _84.setForeground(Color.WHITE);
        }

        if (e.getSource() == _94) {
            _94.setBackground(Color.GREEN);
            _94.setForeground(Color.WHITE);
        } else {
            _94.setBackground(Color.RED);
            _94.setForeground(Color.WHITE);
        }

        // fifth row 
        if (e.getSource() == _15) {
            _15.setBackground(Color.GREEN);
            _15.setForeground(Color.WHITE);
        } else {
            _15.setBackground(Color.RED);
            _15.setForeground(Color.WHITE);
        }

        if (e.getSource() == _25) {
            _25.setBackground(Color.GREEN);
            _25.setForeground(Color.WHITE);
        } else {
            _25.setBackground(Color.RED);
            _25.setForeground(Color.WHITE);
        }

        if (e.getSource() == _35) {
            _35.setBackground(Color.GREEN);
            _35.setForeground(Color.WHITE);
        } else {
            _35.setBackground(Color.RED);
            _35.setForeground(Color.WHITE);
        }

        if (e.getSource() == _45) {
            _45.setBackground(Color.GREEN);
            _45.setForeground(Color.WHITE);
        } else {
            _45.setBackground(Color.RED);
            _45.setForeground(Color.WHITE);
        }

        if (e.getSource() == _55) {
            _55.setBackground(Color.GREEN);
            _55.setForeground(Color.WHITE);
        } else {
            _55.setBackground(Color.RED);
            _55.setForeground(Color.WHITE);
        }

        if (e.getSource() == _65) {
            _65.setBackground(Color.GREEN);
            _65.setForeground(Color.WHITE);
        } else {
            _65.setBackground(Color.RED);
            _65.setForeground(Color.WHITE);
        }

        if (e.getSource() == _75) {
            _75.setBackground(Color.GREEN);
            _75.setForeground(Color.WHITE);
        } else {
            _75.setBackground(Color.RED);
            _75.setForeground(Color.WHITE);
        }

        if (e.getSource() == _85) {
            _85.setBackground(Color.GREEN);
            _85.setForeground(Color.WHITE);
        } else {
            _85.setBackground(Color.RED);
            _85.setForeground(Color.WHITE);
        }

        if (e.getSource() == _95) {
            _95.setBackground(Color.GREEN);
            _95.setForeground(Color.WHITE);
        } else {
            _95.setBackground(Color.RED);
            _95.setForeground(Color.WHITE);
        }

        // sixth row 
        if (e.getSource() == _16) {
            _16.setBackground(Color.GREEN);
            _16.setForeground(Color.WHITE);
        } else {
            _16.setBackground(Color.RED);
            _16.setForeground(Color.WHITE);
        }

        if (e.getSource() == _26) {
            _26.setBackground(Color.GREEN);
            _26.setForeground(Color.WHITE);
        } else {
            _26.setBackground(Color.RED);
            _26.setForeground(Color.WHITE);
        }

        if (e.getSource() == _36) {
            _36.setBackground(Color.GREEN);
            _36.setForeground(Color.WHITE);
        } else {
            _36.setBackground(Color.RED);
            _36.setForeground(Color.WHITE);
        }

        if (e.getSource() == _46) {
            _46.setBackground(Color.GREEN);
            _46.setForeground(Color.WHITE);
        } else {
            _46.setBackground(Color.RED);
            _46.setForeground(Color.WHITE);
        }

        if (e.getSource() == _56) {
            _56.setBackground(Color.GREEN);
            _56.setForeground(Color.WHITE);
        } else {
            _56.setBackground(Color.RED);
            _56.setForeground(Color.WHITE);
        }

        if (e.getSource() == _66) {
            _66.setBackground(Color.GREEN);
            _66.setForeground(Color.WHITE);
        } else {
            _66.setBackground(Color.RED);
            _66.setForeground(Color.WHITE);
        }

        if (e.getSource() == _76) {
            _76.setBackground(Color.GREEN);
            _76.setForeground(Color.WHITE);
        } else {
            _76.setBackground(Color.RED);
            _76.setForeground(Color.WHITE);
        }

        if (e.getSource() == _86) {
            _86.setBackground(Color.GREEN);
            _86.setForeground(Color.WHITE);
        } else {
            _86.setBackground(Color.RED);
            _86.setForeground(Color.WHITE);
        }

        if (e.getSource() == _96) {
            _96.setBackground(Color.GREEN);
            _96.setForeground(Color.WHITE);
        } else {
            _96.setBackground(Color.RED);
            _96.setForeground(Color.WHITE);
        }

        // seventh row 
        if (e.getSource() == _17) {
            _17.setBackground(Color.GREEN);
            _17.setForeground(Color.WHITE);
        } else {
            _17.setBackground(Color.RED);
            _17.setForeground(Color.WHITE);
        }

        if (e.getSource() == _27) {
            _27.setBackground(Color.GREEN);
            _27.setForeground(Color.WHITE);
        } else {
            _27.setBackground(Color.RED);
            _27.setForeground(Color.WHITE);
        }

        if (e.getSource() == _37) {
            _37.setBackground(Color.GREEN);
            _37.setForeground(Color.WHITE);
        } else {
            _37.setBackground(Color.RED);
            _37.setForeground(Color.WHITE);
        }

        if (e.getSource() == _47) {
            _47.setBackground(Color.GREEN);
            _47.setForeground(Color.WHITE);
        } else {
            _47.setBackground(Color.RED);
            _47.setForeground(Color.WHITE);
        }

        if (e.getSource() == _57) {
            _57.setBackground(Color.GREEN);
            _57.setForeground(Color.WHITE);
        } else {
            _57.setBackground(Color.RED);
            _57.setForeground(Color.WHITE);
        }

        if (e.getSource() == _67) {
            _67.setBackground(Color.GREEN);
            _67.setForeground(Color.WHITE);
        } else {
            _67.setBackground(Color.RED);
            _67.setForeground(Color.WHITE);
        }

        if (e.getSource() == _77) {
            _77.setBackground(Color.GREEN);
            _77.setForeground(Color.WHITE);
        } else {
            _77.setBackground(Color.RED);
            _77.setForeground(Color.WHITE);
        }

        if (e.getSource() == _87) {
            _87.setBackground(Color.GREEN);
            _87.setForeground(Color.WHITE);
        } else {
            _87.setBackground(Color.RED);
            _87.setForeground(Color.WHITE);
        }

        if (e.getSource() == _97) {
            _97.setBackground(Color.GREEN);
            _97.setForeground(Color.WHITE);
        } else {
            _97.setBackground(Color.RED);
            _97.setForeground(Color.WHITE);
        }

        // eigth row 
        if (e.getSource() == _18) {
            _18.setBackground(Color.GREEN);
            _18.setForeground(Color.WHITE);
        } else {
            _18.setBackground(Color.RED);
            _18.setForeground(Color.WHITE);
        }

        if (e.getSource() == _28) {
            _28.setBackground(Color.GREEN);
            _28.setForeground(Color.WHITE);
        } else {
            _28.setBackground(Color.RED);
            _28.setForeground(Color.WHITE);
        }

        if (e.getSource() == _38) {
            _38.setBackground(Color.GREEN);
            _38.setForeground(Color.WHITE);
        } else {
            _38.setBackground(Color.RED);
            _38.setForeground(Color.WHITE);
        }

        if (e.getSource() == _48) {
            _48.setBackground(Color.GREEN);
            _48.setForeground(Color.WHITE);
        } else {
            _48.setBackground(Color.RED);
            _48.setForeground(Color.WHITE);
        }

        if (e.getSource() == _58) {
            _58.setBackground(Color.GREEN);
            _58.setForeground(Color.WHITE);
        } else {
            _58.setBackground(Color.RED);
            _58.setForeground(Color.WHITE);
        }

        if (e.getSource() == _68) {
            _68.setBackground(Color.GREEN);
            _68.setForeground(Color.WHITE);
        } else {
            _68.setBackground(Color.RED);
            _68.setForeground(Color.WHITE);
        }

        if (e.getSource() == _78) {
            _78.setBackground(Color.GREEN);
            _78.setForeground(Color.WHITE);
        } else {
            _78.setBackground(Color.RED);
            _78.setForeground(Color.WHITE);
        }

        if (e.getSource() == _88) {
            _88.setBackground(Color.GREEN);
            _88.setForeground(Color.WHITE);
        } else {
            _88.setBackground(Color.RED);
            _88.setForeground(Color.WHITE);
        }

        if (e.getSource() == _98) {
            _98.setBackground(Color.GREEN);
            _98.setForeground(Color.WHITE);
        } else {
            _98.setBackground(Color.RED);
            _98.setForeground(Color.WHITE);
        }

        // ninth row
        if (e.getSource() == _19) {
            _19.setBackground(Color.GREEN);
            _19.setForeground(Color.WHITE);
        } else {
            _19.setBackground(Color.RED);
            _19.setForeground(Color.WHITE);
        }

        if (e.getSource() == _29) {
            _29.setBackground(Color.GREEN);
            _29.setForeground(Color.WHITE);
        } else {
            _29.setBackground(Color.RED);
            _29.setForeground(Color.WHITE);
        }

        if (e.getSource() == _39) {
            _39.setBackground(Color.GREEN);
            _39.setForeground(Color.WHITE);
        } else {
            _39.setBackground(Color.RED);
            _39.setForeground(Color.WHITE);
        }

        if (e.getSource() == _49) {
            _49.setBackground(Color.GREEN);
            _49.setForeground(Color.WHITE);
        } else {
            _49.setBackground(Color.RED);
            _49.setForeground(Color.WHITE);
        }

        if (e.getSource() == _59) {
            _59.setBackground(Color.GREEN);
            _59.setForeground(Color.WHITE);
        } else {
            _59.setBackground(Color.RED);
            _59.setForeground(Color.WHITE);
        }

        if (e.getSource() == _69) {
            _69.setBackground(Color.GREEN);
            _69.setForeground(Color.WHITE);
        } else {
            _69.setBackground(Color.RED);
            _69.setForeground(Color.WHITE);
        }

        if (e.getSource() == _79) {
            _79.setBackground(Color.GREEN);
            _79.setForeground(Color.WHITE);
        } else {
            _79.setBackground(Color.RED);
            _79.setForeground(Color.WHITE);
        }

        if (e.getSource() == _89) {
            _89.setBackground(Color.GREEN);
            _89.setForeground(Color.WHITE);
        } else {
            _89.setBackground(Color.RED);
            _89.setForeground(Color.WHITE);
        }

        if (e.getSource() == _99) {
            _99.setBackground(Color.GREEN);
            _99.setForeground(Color.WHITE);
        } else {
            _99.setBackground(Color.RED);
            _99.setForeground(Color.WHITE);
        }

        // tenth row 
        if (e.getSource() == _110) {
            _110.setBackground(Color.GREEN);
            _110.setForeground(Color.WHITE);
        } else {
            _110.setBackground(Color.RED);
            _110.setForeground(Color.WHITE);
        }

        if (e.getSource() == _210) {
            _210.setBackground(Color.GREEN);
            _210.setForeground(Color.WHITE);
        } else {
            _210.setBackground(Color.RED);
            _210.setForeground(Color.WHITE);
        }

        if (e.getSource() == _310) {
            _310.setBackground(Color.GREEN);
            _310.setForeground(Color.WHITE);
        } else {
            _310.setBackground(Color.RED);
            _310.setForeground(Color.WHITE);
        }

        if (e.getSource() == _410) {
            _410.setBackground(Color.GREEN);
            _410.setForeground(Color.WHITE);
        } else {
            _410.setBackground(Color.RED);
            _410.setForeground(Color.WHITE);
        }

        if (e.getSource() == _510) {
            _510.setBackground(Color.GREEN);
            _510.setForeground(Color.WHITE);
        } else {
            _510.setBackground(Color.RED);
            _510.setForeground(Color.WHITE);
        }

        if (e.getSource() == _610) {
            _610.setBackground(Color.GREEN);
            _610.setForeground(Color.WHITE);
        } else {
            _610.setBackground(Color.RED);
            _610.setForeground(Color.WHITE);
        }

        if (e.getSource() == _710) {
            _710.setBackground(Color.GREEN);
            _710.setForeground(Color.WHITE);
        } else {
            _710.setBackground(Color.RED);
            _710.setForeground(Color.WHITE);
        }

        if (e.getSource() == _810) {
            _810.setBackground(Color.GREEN);
            _810.setForeground(Color.WHITE);
        } else {
            _810.setBackground(Color.RED);
            _810.setForeground(Color.WHITE);
        }

        if (e.getSource() == _910) {
            _910.setBackground(Color.GREEN);
            _910.setForeground(Color.WHITE);
        } else {
            _910.setBackground(Color.RED);
            _910.setForeground(Color.WHITE);
        }

        // eleventh row 
        if (e.getSource() == _111) {
            _111.setBackground(Color.GREEN);
            _11.setForeground(Color.WHITE);
        } else {
            _111.setBackground(Color.RED);
            _111.setForeground(Color.WHITE);
        }

        if (e.getSource() == _211) {
            _211.setBackground(Color.GREEN);
            _211.setForeground(Color.WHITE);
        } else {
            _211.setBackground(Color.RED);
            _211.setForeground(Color.WHITE);
        }

        if (e.getSource() == _311) {
            _311.setBackground(Color.GREEN);
            _311.setForeground(Color.WHITE);
        } else {
            _311.setBackground(Color.RED);
            _311.setForeground(Color.WHITE);
        }

        if (e.getSource() == _411) {
            _411.setBackground(Color.GREEN);
            _411.setForeground(Color.WHITE);
        } else {
            _411.setBackground(Color.RED);
            _411.setForeground(Color.WHITE);
        }

        if (e.getSource() == _511) {
            _511.setBackground(Color.GREEN);
            _511.setForeground(Color.WHITE);
        } else {
            _511.setBackground(Color.RED);
            _511.setForeground(Color.WHITE);
        }

        if (e.getSource() == _611) {
            _611.setBackground(Color.GREEN);
            _611.setForeground(Color.WHITE);
        } else {
            _611.setBackground(Color.RED);
            _611.setForeground(Color.WHITE);
        }

        if (e.getSource() == _711) {
            _711.setBackground(Color.GREEN);
            _711.setForeground(Color.WHITE);
        } else {
            _711.setBackground(Color.RED);
            _711.setForeground(Color.WHITE);
        }

        if (e.getSource() == _811) {
            _811.setBackground(Color.GREEN);
            _811.setForeground(Color.WHITE);
        } else {
            _811.setBackground(Color.RED);
            _811.setForeground(Color.WHITE);
        }

        if (e.getSource() == _911) {
            _911.setBackground(Color.GREEN);
            _911.setForeground(Color.WHITE);
        } else {
            _911.setBackground(Color.RED);
            _911.setForeground(Color.WHITE);
        }

        // 12 th row
        if (e.getSource() == _112) {
            _112.setBackground(Color.GREEN);
            _112.setForeground(Color.WHITE);
        } else {
            _112.setBackground(Color.RED);
            _112.setForeground(Color.WHITE);
        }

        if (e.getSource() == _212) {
            _212.setBackground(Color.GREEN);
            _212.setForeground(Color.WHITE);
        } else {
            _212.setBackground(Color.RED);
            _212.setForeground(Color.WHITE);
        }

        if (e.getSource() == _312) {
            _312.setBackground(Color.GREEN);
            _312.setForeground(Color.WHITE);
        } else {
            _312.setBackground(Color.RED);
            _312.setForeground(Color.WHITE);
        }

        if (e.getSource() == _412) {
            _412.setBackground(Color.GREEN);
            _412.setForeground(Color.WHITE);
        } else {
            _412.setBackground(Color.RED);
            _412.setForeground(Color.WHITE);
        }

        if (e.getSource() == _512) {
            _512.setBackground(Color.GREEN);
            _512.setForeground(Color.WHITE);
        } else {
            _512.setBackground(Color.RED);
            _512.setForeground(Color.WHITE);
        }

        if (e.getSource() == _612) {
            _612.setBackground(Color.GREEN);
            _612.setForeground(Color.WHITE);
        } else {
            _612.setBackground(Color.RED);
            _612.setForeground(Color.WHITE);
        }

        if (e.getSource() == _712) {
            _712.setBackground(Color.GREEN);
            _712.setForeground(Color.WHITE);
        } else {
            _712.setBackground(Color.RED);
            _712.setForeground(Color.WHITE);
        }

        if (e.getSource() == _812) {
            _812.setBackground(Color.GREEN);
            _812.setForeground(Color.WHITE);
        } else {
            _812.setBackground(Color.RED);
            _812.setForeground(Color.WHITE);
        }

        if (e.getSource() == _912) {
            _912.setBackground(Color.GREEN);
            _912.setForeground(Color.WHITE);
        } else {
            _912.setBackground(Color.RED);
            _912.setForeground(Color.WHITE);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if (e.getSource() == _11) {
            _11.setBackground(Color.WHITE);
            _11.setForeground(Color.BLACK);
        } else {
            _11.setBackground(Color.RED);
            _11.setForeground(Color.WHITE);
        }

        if (e.getSource() == _21) {
            _21.setBackground(Color.WHITE);
            _21.setForeground(Color.BLACK);
        } else {
            _21.setBackground(Color.RED);
            _21.setForeground(Color.WHITE);
        }

        if (e.getSource() == _31) {
            _31.setBackground(Color.WHITE);
            _31.setForeground(Color.BLACK);
        } else {
            _31.setBackground(Color.RED);
            _31.setForeground(Color.WHITE);
        }

        if (e.getSource() == _41) {
            _41.setBackground(Color.WHITE);
            _41.setForeground(Color.BLACK);
        } else {
            _41.setBackground(Color.RED);
            _41.setForeground(Color.WHITE);
        }

        if (e.getSource() == _51) {
            _51.setBackground(Color.WHITE);
            _51.setForeground(Color.BLACK);
        } else {
            _51.setBackground(Color.RED);
            _51.setForeground(Color.WHITE);
        }

        if (e.getSource() == _61) {
            _61.setBackground(Color.WHITE);
            _61.setForeground(Color.BLACK);
        } else {
            _61.setBackground(Color.RED);
            _61.setForeground(Color.WHITE);
        }

        if (e.getSource() == _71) {
            _71.setBackground(Color.WHITE);
            _71.setForeground(Color.BLACK);
        } else {
            _71.setBackground(Color.RED);
            _71.setForeground(Color.WHITE);
        }

        if (e.getSource() == _81) {
            _81.setBackground(Color.WHITE);
            _81.setForeground(Color.BLACK);
        } else {
            _81.setBackground(Color.RED);
            _81.setForeground(Color.WHITE);
        }

        if (e.getSource() == _91) {
            _91.setBackground(Color.WHITE);
            _91.setForeground(Color.BLACK);
        } else {
            _91.setBackground(Color.RED);
            _91.setForeground(Color.WHITE);
        }

        // second row
        if (e.getSource() == _12) {
            _12.setBackground(Color.WHITE);
            _12.setForeground(Color.BLACK);
        } else {
            _12.setBackground(Color.RED);
            _12.setForeground(Color.WHITE);
        }

        if (e.getSource() == _22) {
            _22.setBackground(Color.WHITE);
            _22.setForeground(Color.BLACK);
        } else {
            _22.setBackground(Color.RED);
            _22.setForeground(Color.WHITE);
        }

        if (e.getSource() == _32) {
            _32.setBackground(Color.WHITE);
            _32.setForeground(Color.BLACK);
        } else {
            _32.setBackground(Color.RED);
            _32.setForeground(Color.WHITE);
        }

        if (e.getSource() == _42) {
            _42.setBackground(Color.WHITE);
            _42.setForeground(Color.BLACK);
        } else {
            _42.setBackground(Color.RED);
            _42.setForeground(Color.WHITE);
        }

        if (e.getSource() == _52) {
            _52.setBackground(Color.WHITE);
            _52.setForeground(Color.BLACK);
        } else {
            _52.setBackground(Color.RED);
            _52.setForeground(Color.WHITE);
        }

        if (e.getSource() == _62) {
            _62.setBackground(Color.WHITE);
            _62.setForeground(Color.BLACK);
        } else {
            _62.setBackground(Color.RED);
            _62.setForeground(Color.WHITE);
        }

        if (e.getSource() == _72) {
            _72.setBackground(Color.WHITE);
            _72.setForeground(Color.BLACK);
        } else {
            _72.setBackground(Color.RED);
            _72.setForeground(Color.WHITE);
        }

        if (e.getSource() == _82) {
            _82.setBackground(Color.WHITE);
            _82.setForeground(Color.BLACK);
        } else {
            _82.setBackground(Color.RED);
            _82.setForeground(Color.WHITE);
        }

        if (e.getSource() == _92) {
            _92.setBackground(Color.WHITE);
            _92.setForeground(Color.BLACK);
        } else {
            _92.setBackground(Color.RED);
            _92.setForeground(Color.WHITE);
        }

        // third row
        if (e.getSource() == _13) {
            _13.setBackground(Color.WHITE);
            _13.setForeground(Color.BLACK);
        } else {
            _13.setBackground(Color.RED);
            _13.setForeground(Color.WHITE);
        }

        if (e.getSource() == _23) {
            _23.setBackground(Color.WHITE);
            _23.setForeground(Color.BLACK);
        } else {
            _23.setBackground(Color.RED);
            _23.setForeground(Color.WHITE);
        }

        if (e.getSource() == _33) {
            _33.setBackground(Color.WHITE);
            _33.setForeground(Color.BLACK);
        } else {
            _33.setBackground(Color.RED);
            _33.setForeground(Color.WHITE);
        }

        if (e.getSource() == _43) {
            _43.setBackground(Color.WHITE);
            _43.setForeground(Color.BLACK);
        } else {
            _43.setBackground(Color.RED);
            _43.setForeground(Color.WHITE);
        }

        if (e.getSource() == _53) {
            _53.setBackground(Color.WHITE);
            _53.setForeground(Color.BLACK);
        } else {
            _53.setBackground(Color.RED);
            _53.setForeground(Color.WHITE);
        }

        if (e.getSource() == _63) {
            _63.setBackground(Color.WHITE);
            _63.setForeground(Color.BLACK);
        } else {
            _63.setBackground(Color.RED);
            _63.setForeground(Color.WHITE);
        }

        if (e.getSource() == _73) {
            _73.setBackground(Color.WHITE);
            _73.setForeground(Color.BLACK);
        } else {
            _73.setBackground(Color.RED);
            _73.setForeground(Color.WHITE);
        }

        if (e.getSource() == _83) {
            _83.setBackground(Color.WHITE);
            _83.setForeground(Color.BLACK);
        } else {
            _83.setBackground(Color.RED);
            _83.setForeground(Color.WHITE);
        }

        if (e.getSource() == _93) {
            _93.setBackground(Color.WHITE);
            _93.setForeground(Color.BLACK);
        } else {
            _93.setBackground(Color.RED);
            _93.setForeground(Color.WHITE);
        }

        // fourth row
        if (e.getSource() == _14) {
            _14.setBackground(Color.WHITE);
            _14.setForeground(Color.BLACK);
        } else {
            _14.setBackground(Color.RED);
            _14.setForeground(Color.WHITE);
        }

        if (e.getSource() == _24) {
            _24.setBackground(Color.WHITE);
            _24.setForeground(Color.BLACK);
        } else {
            _24.setBackground(Color.RED);
            _24.setForeground(Color.WHITE);
        }

        if (e.getSource() == _34) {
            _34.setBackground(Color.WHITE);
            _34.setForeground(Color.BLACK);
        } else {
            _34.setBackground(Color.RED);
            _34.setForeground(Color.WHITE);
        }

        if (e.getSource() == _44) {
            _44.setBackground(Color.WHITE);
            _44.setForeground(Color.BLACK);
        } else {
            _44.setBackground(Color.RED);
            _44.setForeground(Color.WHITE);
        }

        if (e.getSource() == _54) {
            _54.setBackground(Color.WHITE);
            _54.setForeground(Color.BLACK);
        } else {
            _54.setBackground(Color.RED);
            _54.setForeground(Color.WHITE);
        }

        if (e.getSource() == _64) {
            _64.setBackground(Color.WHITE);
            _64.setForeground(Color.BLACK);
        } else {
            _64.setBackground(Color.RED);
            _64.setForeground(Color.WHITE);
        }

        if (e.getSource() == _74) {
            _74.setBackground(Color.WHITE);
            _74.setForeground(Color.BLACK);
        } else {
            _74.setBackground(Color.RED);
            _74.setForeground(Color.WHITE);
        }

        if (e.getSource() == _84) {
            _84.setBackground(Color.WHITE);
            _84.setForeground(Color.BLACK);
        } else {
            _84.setBackground(Color.RED);
            _84.setForeground(Color.WHITE);
        }

        if (e.getSource() == _94) {
            _94.setBackground(Color.WHITE);
            _94.setForeground(Color.BLACK);
        } else {
            _94.setBackground(Color.RED);
            _94.setForeground(Color.WHITE);
        }

        // fifth row 
        if (e.getSource() == _15) {
            _15.setBackground(Color.WHITE);
            _15.setForeground(Color.BLACK);
        } else {
            _15.setBackground(Color.RED);
            _15.setForeground(Color.WHITE);
        }

        if (e.getSource() == _25) {
            _25.setBackground(Color.WHITE);
            _25.setForeground(Color.BLACK);
        } else {
            _25.setBackground(Color.RED);
            _25.setForeground(Color.WHITE);
        }

        if (e.getSource() == _35) {
            _35.setBackground(Color.WHITE);
            _35.setForeground(Color.BLACK);
        } else {
            _35.setBackground(Color.RED);
            _35.setForeground(Color.WHITE);
        }

        if (e.getSource() == _45) {
            _45.setBackground(Color.WHITE);
            _45.setForeground(Color.BLACK);
        } else {
            _45.setBackground(Color.RED);
            _45.setForeground(Color.WHITE);
        }

        if (e.getSource() == _55) {
            _55.setBackground(Color.WHITE);
            _55.setForeground(Color.BLACK);
        } else {
            _55.setBackground(Color.RED);
            _55.setForeground(Color.WHITE);
        }

        if (e.getSource() == _65) {
            _65.setBackground(Color.WHITE);
            _65.setForeground(Color.BLACK);
        } else {
            _65.setBackground(Color.RED);
            _65.setForeground(Color.WHITE);
        }

        if (e.getSource() == _75) {
            _75.setBackground(Color.WHITE);
            _75.setForeground(Color.BLACK);
        } else {
            _75.setBackground(Color.RED);
            _75.setForeground(Color.WHITE);
        }

        if (e.getSource() == _85) {
            _85.setBackground(Color.WHITE);
            _85.setForeground(Color.BLACK);
        } else {
            _85.setBackground(Color.RED);
            _85.setForeground(Color.WHITE);
        }

        if (e.getSource() == _95) {
            _95.setBackground(Color.WHITE);
            _95.setForeground(Color.BLACK);
        } else {
            _95.setBackground(Color.RED);
            _95.setForeground(Color.WHITE);
        }

        // sixth row 
        if (e.getSource() == _16) {
            _16.setBackground(Color.WHITE);
            _16.setForeground(Color.BLACK);
        } else {
            _16.setBackground(Color.RED);
            _16.setForeground(Color.WHITE);
        }

        if (e.getSource() == _26) {
            _26.setBackground(Color.WHITE);
            _26.setForeground(Color.BLACK);
        } else {
            _26.setBackground(Color.RED);
            _26.setForeground(Color.WHITE);
        }

        if (e.getSource() == _36) {
            _36.setBackground(Color.WHITE);
            _36.setForeground(Color.BLACK);
        } else {
            _36.setBackground(Color.RED);
            _36.setForeground(Color.WHITE);
        }

        if (e.getSource() == _46) {
            _46.setBackground(Color.WHITE);
            _46.setForeground(Color.BLACK);
        } else {
            _46.setBackground(Color.RED);
            _46.setForeground(Color.WHITE);
        }

        if (e.getSource() == _56) {
            _56.setBackground(Color.WHITE);
            _56.setForeground(Color.BLACK);
        } else {
            _56.setBackground(Color.RED);
            _56.setForeground(Color.WHITE);
        }

        if (e.getSource() == _66) {
            _66.setBackground(Color.WHITE);
            _66.setForeground(Color.BLACK);
        } else {
            _66.setBackground(Color.RED);
            _66.setForeground(Color.WHITE);
        }

        if (e.getSource() == _76) {
            _76.setBackground(Color.WHITE);
            _76.setForeground(Color.BLACK);
        } else {
            _76.setBackground(Color.RED);
            _76.setForeground(Color.WHITE);
        }

        if (e.getSource() == _86) {
            _86.setBackground(Color.WHITE);
            _86.setForeground(Color.BLACK);
        } else {
            _86.setBackground(Color.RED);
            _86.setForeground(Color.WHITE);
        }

        if (e.getSource() == _96) {
            _96.setBackground(Color.WHITE);
            _96.setForeground(Color.BLACK);
        } else {
            _96.setBackground(Color.RED);
            _96.setForeground(Color.WHITE);
        }

        // seventh row 
        if (e.getSource() == _17) {
            _17.setBackground(Color.WHITE);
            _17.setForeground(Color.BLACK);
        } else {
            _17.setBackground(Color.RED);
            _17.setForeground(Color.WHITE);
        }

        if (e.getSource() == _27) {
            _27.setBackground(Color.WHITE);
            _27.setForeground(Color.BLACK);
        } else {
            _27.setBackground(Color.RED);
            _27.setForeground(Color.WHITE);
        }

        if (e.getSource() == _37) {
            _37.setBackground(Color.WHITE);
            _37.setForeground(Color.BLACK);
        } else {
            _37.setBackground(Color.RED);
            _37.setForeground(Color.WHITE);
        }

        if (e.getSource() == _47) {
            _47.setBackground(Color.WHITE);
            _47.setForeground(Color.BLACK);
        } else {
            _47.setBackground(Color.RED);
            _47.setForeground(Color.WHITE);
        }

        if (e.getSource() == _57) {
            _57.setBackground(Color.WHITE);
            _57.setForeground(Color.BLACK);
        } else {
            _57.setBackground(Color.RED);
            _57.setForeground(Color.WHITE);
        }

        if (e.getSource() == _67) {
            _67.setBackground(Color.WHITE);
            _67.setForeground(Color.BLACK);
        } else {
            _67.setBackground(Color.RED);
            _67.setForeground(Color.WHITE);
        }

        if (e.getSource() == _77) {
            _77.setBackground(Color.WHITE);
            _77.setForeground(Color.BLACK);
        } else {
            _77.setBackground(Color.RED);
            _77.setForeground(Color.WHITE);
        }

        if (e.getSource() == _87) {
            _87.setBackground(Color.WHITE);
            _87.setForeground(Color.BLACK);
        } else {
            _87.setBackground(Color.RED);
            _87.setForeground(Color.WHITE);
        }

        if (e.getSource() == _97) {
            _97.setBackground(Color.WHITE);
            _97.setForeground(Color.BLACK);
        } else {
            _97.setBackground(Color.RED);
            _97.setForeground(Color.WHITE);
        }

        // eigth row 
        if (e.getSource() == _18) {
            _18.setBackground(Color.WHITE);
            _18.setForeground(Color.BLACK);
        } else {
            _18.setBackground(Color.RED);
            _18.setForeground(Color.WHITE);
        }

        if (e.getSource() == _28) {
            _28.setBackground(Color.WHITE);
            _28.setForeground(Color.BLACK);
        } else {
            _28.setBackground(Color.RED);
            _28.setForeground(Color.WHITE);
        }

        if (e.getSource() == _38) {
            _38.setBackground(Color.WHITE);
            _38.setForeground(Color.BLACK);
        } else {
            _38.setBackground(Color.RED);
            _38.setForeground(Color.WHITE);
        }

        if (e.getSource() == _48) {
            _48.setBackground(Color.WHITE);
            _48.setForeground(Color.BLACK);
        } else {
            _48.setBackground(Color.RED);
            _48.setForeground(Color.WHITE);
        }

        if (e.getSource() == _58) {
            _58.setBackground(Color.WHITE);
            _58.setForeground(Color.BLACK);
        } else {
            _58.setBackground(Color.RED);
            _58.setForeground(Color.WHITE);
        }

        if (e.getSource() == _68) {
            _68.setBackground(Color.WHITE);
            _68.setForeground(Color.BLACK);
        } else {
            _68.setBackground(Color.RED);
            _68.setForeground(Color.WHITE);
        }

        if (e.getSource() == _78) {
            _78.setBackground(Color.WHITE);
            _78.setForeground(Color.BLACK);
        } else {
            _78.setBackground(Color.RED);
            _78.setForeground(Color.WHITE);
        }

        if (e.getSource() == _88) {
            _88.setBackground(Color.WHITE);
            _88.setForeground(Color.BLACK);
        } else {
            _88.setBackground(Color.RED);
            _88.setForeground(Color.WHITE);
        }

        if (e.getSource() == _98) {
            _98.setBackground(Color.WHITE);
            _98.setForeground(Color.BLACK);
        } else {
            _98.setBackground(Color.RED);
            _98.setForeground(Color.WHITE);
        }

        // ninth row
        if (e.getSource() == _19) {
            _19.setBackground(Color.WHITE);
            _19.setForeground(Color.BLACK);
        } else {
            _19.setBackground(Color.RED);
            _19.setForeground(Color.WHITE);
        }

        if (e.getSource() == _29) {
            _29.setBackground(Color.WHITE);
            _29.setForeground(Color.BLACK);
        } else {
            _29.setBackground(Color.RED);
            _29.setForeground(Color.WHITE);
        }

        if (e.getSource() == _39) {
            _39.setBackground(Color.WHITE);
            _39.setForeground(Color.BLACK);
        } else {
            _39.setBackground(Color.RED);
            _39.setForeground(Color.WHITE);
        }

        if (e.getSource() == _49) {
            _49.setBackground(Color.WHITE);
            _49.setForeground(Color.BLACK);
        } else {
            _49.setBackground(Color.RED);
            _49.setForeground(Color.WHITE);
        }

        if (e.getSource() == _59) {
            _59.setBackground(Color.WHITE);
            _59.setForeground(Color.BLACK);
        } else {
            _59.setBackground(Color.RED);
            _59.setForeground(Color.WHITE);
        }

        if (e.getSource() == _69) {
            _69.setBackground(Color.WHITE);
            _69.setForeground(Color.BLACK);
        } else {
            _69.setBackground(Color.RED);
            _69.setForeground(Color.WHITE);
        }

        if (e.getSource() == _79) {
            _79.setBackground(Color.WHITE);
            _79.setForeground(Color.BLACK);
        } else {
            _79.setBackground(Color.RED);
            _79.setForeground(Color.WHITE);
        }

        if (e.getSource() == _89) {
            _89.setBackground(Color.WHITE);
            _89.setForeground(Color.BLACK);
        } else {
            _89.setBackground(Color.RED);
            _89.setForeground(Color.WHITE);
        }

        if (e.getSource() == _99) {
            _99.setBackground(Color.WHITE);
            _99.setForeground(Color.BLACK);
        } else {
            _99.setBackground(Color.RED);
            _99.setForeground(Color.WHITE);
        }

        // tenth row 
        if (e.getSource() == _110) {
            _110.setBackground(Color.WHITE);
            _110.setForeground(Color.BLACK);
        } else {
            _110.setBackground(Color.RED);
            _110.setForeground(Color.WHITE);
        }

        if (e.getSource() == _210) {
            _210.setBackground(Color.WHITE);
            _210.setForeground(Color.BLACK);
        } else {
            _210.setBackground(Color.RED);
            _210.setForeground(Color.WHITE);
        }

        if (e.getSource() == _310) {
            _310.setBackground(Color.WHITE);
            _310.setForeground(Color.BLACK);
        } else {
            _310.setBackground(Color.RED);
            _310.setForeground(Color.WHITE);
        }

        if (e.getSource() == _410) {
            _410.setBackground(Color.WHITE);
            _410.setForeground(Color.BLACK);
        } else {
            _410.setBackground(Color.RED);
            _410.setForeground(Color.WHITE);
        }

        if (e.getSource() == _510) {
            _510.setBackground(Color.WHITE);
            _510.setForeground(Color.BLACK);
        } else {
            _510.setBackground(Color.RED);
            _510.setForeground(Color.WHITE);
        }

        if (e.getSource() == _610) {
            _610.setBackground(Color.WHITE);
            _610.setForeground(Color.BLACK);
        } else {
            _610.setBackground(Color.RED);
            _610.setForeground(Color.WHITE);
        }

        if (e.getSource() == _710) {
            _710.setBackground(Color.WHITE);
            _710.setForeground(Color.BLACK);
        } else {
            _710.setBackground(Color.RED);
            _710.setForeground(Color.WHITE);
        }

        if (e.getSource() == _810) {
            _810.setBackground(Color.WHITE);
            _810.setForeground(Color.BLACK);
        } else {
            _810.setBackground(Color.RED);
            _810.setForeground(Color.WHITE);
        }

        if (e.getSource() == _910) {
            _910.setBackground(Color.WHITE);
            _910.setForeground(Color.BLACK);
        } else {
            _910.setBackground(Color.RED);
            _910.setForeground(Color.WHITE);
        }

        // eleventh row 
        if (e.getSource() == _111) {
            _111.setBackground(Color.WHITE);
            _11.setForeground(Color.BLACK);
        } else {
            _111.setBackground(Color.RED);
            _111.setForeground(Color.WHITE);
        }

        if (e.getSource() == _211) {
            _211.setBackground(Color.WHITE);
            _211.setForeground(Color.BLACK);
        } else {
            _211.setBackground(Color.RED);
            _211.setForeground(Color.WHITE);
        }

        if (e.getSource() == _311) {
            _311.setBackground(Color.WHITE);
            _311.setForeground(Color.BLACK);
        } else {
            _311.setBackground(Color.RED);
            _311.setForeground(Color.WHITE);
        }

        if (e.getSource() == _411) {
            _411.setBackground(Color.WHITE);
            _411.setForeground(Color.BLACK);
        } else {
            _411.setBackground(Color.RED);
            _411.setForeground(Color.WHITE);
        }

        if (e.getSource() == _511) {
            _511.setBackground(Color.WHITE);
            _511.setForeground(Color.BLACK);
        } else {
            _511.setBackground(Color.RED);
            _511.setForeground(Color.WHITE);
        }

        if (e.getSource() == _611) {
            _611.setBackground(Color.WHITE);
            _611.setForeground(Color.BLACK);
        } else {
            _611.setBackground(Color.RED);
            _611.setForeground(Color.WHITE);
        }

        if (e.getSource() == _711) {
            _711.setBackground(Color.WHITE);
            _711.setForeground(Color.BLACK);
        } else {
            _711.setBackground(Color.RED);
            _711.setForeground(Color.WHITE);
        }

        if (e.getSource() == _811) {
            _811.setBackground(Color.WHITE);
            _811.setForeground(Color.BLACK);
        } else {
            _811.setBackground(Color.RED);
            _811.setForeground(Color.WHITE);
        }

        if (e.getSource() == _911) {
            _911.setBackground(Color.WHITE);
            _911.setForeground(Color.BLACK);
        } else {
            _911.setBackground(Color.RED);
            _911.setForeground(Color.WHITE);
        }

        // 12 th row
        if (e.getSource() == _112) {
            _112.setBackground(Color.WHITE);
            _112.setForeground(Color.BLACK);
        } else {
            _112.setBackground(Color.RED);
            _112.setForeground(Color.WHITE);
        }

        if (e.getSource() == _212) {
            _212.setBackground(Color.WHITE);
            _212.setForeground(Color.BLACK);
        } else {
            _212.setBackground(Color.RED);
            _212.setForeground(Color.WHITE);
        }

        if (e.getSource() == _312) {
            _312.setBackground(Color.WHITE);
            _312.setForeground(Color.BLACK);
        } else {
            _312.setBackground(Color.RED);
            _312.setForeground(Color.WHITE);
        }

        if (e.getSource() == _412) {
            _412.setBackground(Color.WHITE);
            _412.setForeground(Color.BLACK);
        } else {
            _412.setBackground(Color.RED);
            _412.setForeground(Color.WHITE);
        }

        if (e.getSource() == _512) {
            _512.setBackground(Color.WHITE);
            _512.setForeground(Color.BLACK);
        } else {
            _512.setBackground(Color.RED);
            _512.setForeground(Color.WHITE);
        }

        if (e.getSource() == _612) {
            _612.setBackground(Color.WHITE);
            _612.setForeground(Color.BLACK);
        } else {
            _612.setBackground(Color.RED);
            _612.setForeground(Color.WHITE);
        }

        if (e.getSource() == _712) {
            _712.setBackground(Color.WHITE);
            _712.setForeground(Color.BLACK);
        } else {
            _712.setBackground(Color.RED);
            _712.setForeground(Color.WHITE);
        }

        if (e.getSource() == _812) {
            _812.setBackground(Color.WHITE);
            _812.setForeground(Color.BLACK);
        } else {
            _812.setBackground(Color.RED);
            _812.setForeground(Color.WHITE);
        }

        if (e.getSource() == _912) {
            _912.setBackground(Color.WHITE);
            _912.setForeground(Color.BLACK);
        } else {
            _912.setBackground(Color.RED);
            _912.setForeground(Color.WHITE);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
