package hangman;

import music.MediaPlayer;

/**
 * @author e.famorcan
 */
public class Menu extends javax.swing.JFrame {

    private final int FORM_WIDTH = 1020;
    private final int FORM_HEIGHT = 700;

    public Menu() {
        initComponents();
        setForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        play_buttn = new javax.swing.JButton();
        exit_bttn = new javax.swing.JButton();
        btnrules = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1290, 720));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Chiller", 1, 150)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("The Haunted");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 60, 720, 180);

        play_buttn.setBackground(new java.awt.Color(0, 0, 0));
        play_buttn.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        play_buttn.setForeground(new java.awt.Color(255, 51, 51));
        play_buttn.setText("Play");
        play_buttn.setBorderPainted(false);
        play_buttn.setContentAreaFilled(false);
        play_buttn.setFocusPainted(false);
        play_buttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_buttnActionPerformed(evt);
            }
        });
        getContentPane().add(play_buttn);
        play_buttn.setBounds(290, 280, 420, 110);

        exit_bttn.setBackground(new java.awt.Color(0, 0, 0));
        exit_bttn.setFont(new java.awt.Font("Chiller", 1, 60)); // NOI18N
        exit_bttn.setForeground(new java.awt.Color(255, 51, 51));
        exit_bttn.setText("Exit");
        exit_bttn.setBorderPainted(false);
        exit_bttn.setContentAreaFilled(false);
        exit_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_bttnActionPerformed(evt);
            }
        });
        getContentPane().add(exit_bttn);
        exit_bttn.setBounds(420, 490, 160, 60);

        btnrules.setFont(new java.awt.Font("Chiller", 1, 80)); // NOI18N
        btnrules.setForeground(new java.awt.Color(255, 51, 51));
        btnrules.setText("Rules");
        btnrules.setBorderPainted(false);
        btnrules.setContentAreaFilled(false);
        btnrules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrulesActionPerformed(evt);
            }
        });
        getContentPane().add(btnrules);
        btnrules.setBounds(390, 390, 220, 101);

        jlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Haunted road.jpg"))); // NOI18N
        getContentPane().add(jlabel1);
        jlabel1.setBounds(0, 0, 1020, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void play_buttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_buttnActionPerformed
        this.dispose();
        new Gameplay();


    }//GEN-LAST:event_play_buttnActionPerformed

    private void exit_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_bttnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_bttnActionPerformed

    private void btnrulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrulesActionPerformed
        this.dispose();
        Rules rules = new Rules();
    }//GEN-LAST:event_btnrulesActionPerformed

    /**
     * setups the form
     */
    private void setForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        MediaPlayer music = new MediaPlayer();
        music.playWAV("Phantom by Steve Syz - Horror Main Menu Theme.wav");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrules;
    private javax.swing.JButton exit_bttn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JButton play_buttn;
    // End of variables declaration//GEN-END:variables

}
