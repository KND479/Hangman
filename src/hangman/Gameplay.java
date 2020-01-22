package hangman;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import music.MediaPlayer;

/**
 * @author e.famorcan
 */
public class Gameplay extends javax.swing.JFrame {

    //GLOBAL VARIABLES BELLOW
    private final int FORM_WIDTH = 1290;
    private final int FORM_HEIGHT = 720;

    private String guess;
    public JLabel[] deathLabels = new JLabel[4];

    private boolean[] guessedSpots;
    private int trys = 0;

    public String word[] = {"Wary", "Vindicate", "Abject", "Aberration",
        "Abjure", "Abnegation", "Abrogate", "Abscond", "Abstruse", "Accede",
        "Accost", "Accretion", "Acumen", "Adamant", "Admonish", "Adumbrate",
        "Adverse", "Advocate", "Affluent", "Aggrandize", "Alacrity", "Alias",
        "Tirade", "Zephyr", "Yoke", "Fortuitous", "Forbearance", "Garrulous",
        "Gratuitous", "Hegemony", "Heterogenous", "Interlocutor", "Pernicious",
        "Quandary", "Semaphore", "Sanguine", "Surfeit", "Subjugate", "Staid",
        "Spurious", "Vestige", "Veracity", "Upbraid", "Utilitarian", "Elicit",
        "Elegy", "Egregious", "Expedient", "Connive", "Construe", "Vestige",
        "Upbraid", "Pellucid", "Paucity", "Partisan", "Fractious", "Fortuitous",
        "Forbearance", "Gourmand", "Grandiloquent", "Expurgate", "Fallacious",
        "Fatuous", "Fetter", "Flagrant", "Foil", "Annex", "Ambivalent", "Amenable",
        "Amorphous", "Anachronistic", "Anathema", "Antiseptic", "Cleave", "Clamor",
        "Circumvent", "Circumscribe", "Cogent", "Cognizant", "Conduit", "Cebacle",
        "Debauch", "Dearth", "Cupidity", "Divisive", "Disrepute", "Dispel",
        "Disparate", "Edict", "Egregious", "Ebullient", "Emollient",
        "Enfranchise", "Expedient", "Impute", "Inexorable", "Interlocutor",
        "Legerdemain", "Litigant", "Modicum"};

    public int number = random();

    /**
     * Creates new form Gameplay
     */
    public Gameplay() {
        initComponents();
         JOptionPane.showMessageDialog(null, "Oh no!! You've awaken the white "
                 + "lady!! \n Try to say the magic word to get the white "
                 + "lady back to sleep! \nGood Luck and Have Fun");

        lblWord.setText("Word: ");//set the lblword to say "word"
        guessedSpots = new boolean[word[number].length()];//create an array

        deathLabels[0] = lblRope;
        deathLabels[1] = lblHead;
        deathLabels[2] = lblBody;
        deathLabels[3] = lblLegs;

      
        for (int i = 0; i < deathLabels.length; i++) {
            deathLabels[i].setVisible(false);
        }

        for (int i = 0; i < guessedSpots.length; i++)// Fill in the array 
        {
            guessedSpots[i] = false;//for every spots of array puts false for now 
        }

        reveal();//reveal the letter
        setForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWord = new javax.swing.JLabel();
        btnM = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        lblLegs = new javax.swing.JLabel();
        lblRope = new javax.swing.JLabel();
        lblBody = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblWord.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        lblWord.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblWord);
        lblWord.setBounds(20, 600, 630, 100);

        btnM.setBackground(new java.awt.Color(0, 0, 0));
        btnM.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnM.setForeground(new java.awt.Color(255, 51, 51));
        btnM.setText("M");
        btnM.setBorderPainted(false);
        btnM.setContentAreaFilled(false);
        btnM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        getContentPane().add(btnM);
        btnM.setBounds(760, 580, 70, 50);

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1200, 10, 73, 23);

        btnT.setBackground(new java.awt.Color(0, 0, 0));
        btnT.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnT.setForeground(new java.awt.Color(255, 51, 51));
        btnT.setText("T");
        btnT.setBorderPainted(false);
        btnT.setContentAreaFilled(false);
        btnT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        getContentPane().add(btnT);
        btnT.setBounds(790, 640, 60, 50);

        btnU.setBackground(new java.awt.Color(0, 0, 0));
        btnU.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnU.setForeground(new java.awt.Color(255, 51, 51));
        btnU.setText("U");
        btnU.setBorderPainted(false);
        btnU.setContentAreaFilled(false);
        btnU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        getContentPane().add(btnU);
        btnU.setBounds(840, 640, 60, 50);

        btnO.setBackground(new java.awt.Color(0, 0, 0));
        btnO.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnO.setForeground(new java.awt.Color(255, 51, 51));
        btnO.setText("O");
        btnO.setBorderPainted(false);
        btnO.setContentAreaFilled(false);
        btnO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        getContentPane().add(btnO);
        btnO.setBounds(880, 580, 60, 50);

        btnN.setBackground(new java.awt.Color(0, 0, 0));
        btnN.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnN.setForeground(new java.awt.Color(255, 51, 51));
        btnN.setText("N");
        btnN.setBorderPainted(false);
        btnN.setContentAreaFilled(false);
        btnN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        getContentPane().add(btnN);
        btnN.setBounds(830, 580, 60, 50);

        btnZ.setBackground(new java.awt.Color(0, 0, 0));
        btnZ.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnZ.setForeground(new java.awt.Color(255, 51, 51));
        btnZ.setText("Z");
        btnZ.setBorderPainted(false);
        btnZ.setContentAreaFilled(false);
        btnZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        getContentPane().add(btnZ);
        btnZ.setBounds(1100, 640, 60, 50);

        btnA.setBackground(new java.awt.Color(0, 0, 0));
        btnA.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 51, 51));
        btnA.setText("A");
        btnA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA.setBorderPainted(false);
        btnA.setContentAreaFilled(false);
        btnA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA);
        btnA.setBounds(800, 460, 50, 50);

        btnW.setBackground(new java.awt.Color(0, 0, 0));
        btnW.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnW.setForeground(new java.awt.Color(255, 51, 51));
        btnW.setText("W");
        btnW.setBorderPainted(false);
        btnW.setContentAreaFilled(false);
        btnW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        getContentPane().add(btnW);
        btnW.setBounds(940, 640, 70, 50);

        btnE.setBackground(new java.awt.Color(0, 0, 0));
        btnE.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnE.setForeground(new java.awt.Color(255, 51, 51));
        btnE.setText("E");
        btnE.setBorderPainted(false);
        btnE.setContentAreaFilled(false);
        btnE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        getContentPane().add(btnE);
        btnE.setBounds(1110, 460, 70, 50);

        btnG.setBackground(new java.awt.Color(0, 0, 0));
        btnG.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnG.setForeground(new java.awt.Color(255, 51, 51));
        btnG.setText("G");
        btnG.setBorderPainted(false);
        btnG.setContentAreaFilled(false);
        btnG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        getContentPane().add(btnG);
        btnG.setBounds(810, 520, 60, 50);

        btnR.setBackground(new java.awt.Color(0, 0, 0));
        btnR.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnR.setForeground(new java.awt.Color(255, 51, 51));
        btnR.setText("R");
        btnR.setBorderPainted(false);
        btnR.setContentAreaFilled(false);
        btnR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        getContentPane().add(btnR);
        btnR.setBounds(1070, 580, 60, 50);

        btnP.setBackground(new java.awt.Color(0, 0, 0));
        btnP.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnP.setForeground(new java.awt.Color(255, 51, 51));
        btnP.setText("P");
        btnP.setBorderPainted(false);
        btnP.setContentAreaFilled(false);
        btnP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        getContentPane().add(btnP);
        btnP.setBounds(950, 580, 60, 50);

        btnL.setBackground(new java.awt.Color(0, 0, 0));
        btnL.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnL.setForeground(new java.awt.Color(255, 51, 51));
        btnL.setText("L");
        btnL.setBorderPainted(false);
        btnL.setContentAreaFilled(false);
        btnL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        getContentPane().add(btnL);
        btnL.setBounds(1160, 520, 70, 50);

        btnQ.setBackground(new java.awt.Color(0, 0, 0));
        btnQ.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnQ.setForeground(new java.awt.Color(255, 51, 51));
        btnQ.setText("Q");
        btnQ.setBorderPainted(false);
        btnQ.setContentAreaFilled(false);
        btnQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        getContentPane().add(btnQ);
        btnQ.setBounds(1020, 580, 60, 50);

        btnX.setBackground(new java.awt.Color(0, 0, 0));
        btnX.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnX.setForeground(new java.awt.Color(255, 51, 51));
        btnX.setText("X");
        btnX.setBorderPainted(false);
        btnX.setContentAreaFilled(false);
        btnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        getContentPane().add(btnX);
        btnX.setBounds(1010, 640, 60, 50);

        btnB.setBackground(new java.awt.Color(0, 0, 0));
        btnB.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 51, 51));
        btnB.setText("B");
        btnB.setBorderPainted(false);
        btnB.setContentAreaFilled(false);
        btnB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB);
        btnB.setBounds(870, 460, 60, 50);

        btnK.setBackground(new java.awt.Color(0, 0, 0));
        btnK.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnK.setForeground(new java.awt.Color(255, 51, 51));
        btnK.setText("K");
        btnK.setBorderPainted(false);
        btnK.setContentAreaFilled(false);
        btnK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        getContentPane().add(btnK);
        btnK.setBounds(1110, 520, 60, 50);

        btnV.setBackground(new java.awt.Color(0, 0, 0));
        btnV.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnV.setForeground(new java.awt.Color(255, 51, 51));
        btnV.setText("V");
        btnV.setBorderPainted(false);
        btnV.setContentAreaFilled(false);
        btnV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        getContentPane().add(btnV);
        btnV.setBounds(890, 640, 60, 50);

        btnI.setBackground(new java.awt.Color(0, 0, 0));
        btnI.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnI.setForeground(new java.awt.Color(255, 51, 51));
        btnI.setText("I");
        btnI.setBorderPainted(false);
        btnI.setContentAreaFilled(false);
        btnI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        getContentPane().add(btnI);
        btnI.setBounds(960, 520, 60, 50);

        btnS.setBackground(new java.awt.Color(255, 51, 51));
        btnS.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnS.setForeground(new java.awt.Color(255, 51, 51));
        btnS.setText("S");
        btnS.setBorderPainted(false);
        btnS.setContentAreaFilled(false);
        btnS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        getContentPane().add(btnS);
        btnS.setBounds(1120, 580, 70, 50);

        btnY.setBackground(new java.awt.Color(0, 0, 0));
        btnY.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnY.setForeground(new java.awt.Color(255, 51, 51));
        btnY.setText("Y");
        btnY.setBorderPainted(false);
        btnY.setContentAreaFilled(false);
        btnY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        getContentPane().add(btnY);
        btnY.setBounds(1050, 640, 60, 50);

        btnH.setBackground(new java.awt.Color(0, 0, 0));
        btnH.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnH.setForeground(new java.awt.Color(255, 51, 51));
        btnH.setText("H");
        btnH.setBorderPainted(false);
        btnH.setContentAreaFilled(false);
        btnH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        getContentPane().add(btnH);
        btnH.setBounds(880, 520, 70, 50);

        btnF.setBackground(new java.awt.Color(0, 0, 0));
        btnF.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnF.setForeground(new java.awt.Color(255, 51, 51));
        btnF.setText("F");
        btnF.setBorderPainted(false);
        btnF.setContentAreaFilled(false);
        btnF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        getContentPane().add(btnF);
        btnF.setBounds(740, 520, 60, 50);

        btnD.setBackground(new java.awt.Color(0, 0, 0));
        btnD.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 0, 51));
        btnD.setText("D");
        btnD.setBorderPainted(false);
        btnD.setContentAreaFilled(false);
        btnD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD);
        btnD.setBounds(1030, 460, 60, 50);

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 51, 51));
        btnC.setText("C");
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC);
        btnC.setBounds(940, 460, 70, 50);

        btnJ.setBackground(new java.awt.Color(0, 0, 0));
        btnJ.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        btnJ.setForeground(new java.awt.Color(255, 51, 51));
        btnJ.setText("J");
        btnJ.setBorderPainted(false);
        btnJ.setContentAreaFilled(false);
        btnJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ);
        btnJ.setBounds(1040, 520, 60, 50);

        lblLegs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/WhiteLady4.png"))); // NOI18N
        getContentPane().add(lblLegs);
        lblLegs.setBounds(410, 150, 530, 570);

        lblRope.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/WhiteLady.png"))); // NOI18N
        getContentPane().add(lblRope);
        lblRope.setBounds(790, 380, 80, 140);

        lblBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/WhiteLady3.png"))); // NOI18N
        getContentPane().add(lblBody);
        lblBody.setBounds(80, 430, 150, 230);

        lblHead.setForeground(new java.awt.Color(255, 255, 255));
        lblHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Whitelady2.png"))); // NOI18N
        lblHead.setText("head");
        getContentPane().add(lblHead);
        lblHead.setBounds(630, 430, 100, 150);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/85219859e5edf9deb03a68b5f33d9d94.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -20, 1280, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        check("M");


    }//GEN-LAST:event_btnMActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        check("D");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        check("J");
    }//GEN-LAST:event_btnJActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        check("O");
    }//GEN-LAST:event_btnOActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        check("Q");
    }//GEN-LAST:event_btnQActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        check("U");
    }//GEN-LAST:event_btnUActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        check("W");
    }//GEN-LAST:event_btnWActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        check("Z");

    }//GEN-LAST:event_btnZActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        check("A");

    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        check("B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        check("C");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        check("E");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        check("F");
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        check("G");
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        check("H");
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        check("I");
    }//GEN-LAST:event_btnIActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        check("K");
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        check("L");
    }//GEN-LAST:event_btnLActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        check("N");
    }//GEN-LAST:event_btnNActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        check("P");
    }//GEN-LAST:event_btnPActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        check("R");
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        check("S");
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        check("T");
    }//GEN-LAST:event_btnTActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        check("V");
    }//GEN-LAST:event_btnVActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        check("X");
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        check("Y");

    }//GEN-LAST:event_btnYActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBody;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLegs;
    private javax.swing.JLabel lblRope;
    private javax.swing.JLabel lblWord;
    // End of variables declaration//GEN-END:variables

    /**
     * setups the form
     */
    private void setForm() {
        this.setSize(FORM_WIDTH, FORM_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        MediaPlayer music = new MediaPlayer();

    }

    /**
     * if the user clicked the right letter it reveals it
     *
     */
    private void reveal() {
        String newWord = "";

        for (int i = 0; i < guessedSpots.length; i++) {
            if (guessedSpots[i] == true) {
                newWord += word[number].charAt(i) + " ";

            } else {

                newWord += "_ ";

            }

        }
        lblWord.setText("Word: " + newWord);

    }

    /**
     * check if the letter inputed is right
     *
     * @param letter represent the alphabet letter
     *
     */
    private void check(String btnletter) {
        boolean correct = false;


        for (int i = 0; i < word[number].length(); i++) {
            String currentLetter = "" + word[number].charAt(i);
            if (currentLetter.equalsIgnoreCase(btnletter)) {

                guessedSpots[i] = true;
                reveal();
                correct = true;

            }

        }
        // congrats the player
        if (win() == true) {
            JOptionPane.showMessageDialog(null, "Congratulations! you are one "
                    + "of the 1% of people who got it right for that I'll "
                    + "give you a high five");
            this.dispose();
            new Menu();

        } // its wrong
        else {

            if (correct == true) {
                return;

            } else {
                trys++;

                deathLabels[trys - 1].setVisible(true);

                if (trys == 2) {
                    lblRope.setVisible(false);
                } else if (trys == 3) {
                    lblHead.setVisible(false);
                } else if (trys == 3) {
                    deathLabels[3].setVisible(false);
                } else if (trys == 4) {

                    lblBody.setVisible(false);
                    JOptionPane.showMessageDialog(null,
                            "You died \n The word was " + word[number]);

                    this.dispose();

                    new GameOver();
                    return;
                } else {
                    reveal();
                    return;

                }
            }
        }
    }

    /**
     * Randomize number from 0 to 99
     *
     * @return roll which is a number
     */
    private int random() {
        double seed = Math.random();
        double low = 0;
        double high = 99;
        double random = (high - low + 1) * seed + low;
        int roll = (int) random;
        return roll;

    }

    /**
     * .
     * when the player guessed every letter of the word the person will win
     *
     * @return true when there is a winner false keeps the game going
     */
    private boolean win() {
        for (int i = 0; i < guessedSpots.length; i++) {
            if (guessedSpots[i] == false) {
                return false;
            }
        }
        return true;
    }
}
