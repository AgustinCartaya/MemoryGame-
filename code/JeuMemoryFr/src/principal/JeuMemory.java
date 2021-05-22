package principal;


import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Fenêtre principale du jeu.
 * Il contient la table de jeu, les personnages et des informations sur les joueurs
 * Il a la barre d'outils pour modifier, visualiser et éditer le jeu,
 * dispose également des boutons pour démarrer et arrêter le jeu
 * @author Agustin Cartaya
 * @see Personnage
 * @see LesPersonnages
 * @see Joueur
 * @see LesJoueurs
 */
public class JeuMemory extends javax.swing.JFrame {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuMemory().setVisible(true);
            }
        });
    }
    
    /**
     *  initialise la fenêtre et ses composants,
     *  et crée les sous-fenêtres
     */
    public JeuMemory() {
        initComponents();
        initButtons( 20 );
        this.joueurs = new LesJoueurs();
        this.persos = new LesPersonnages ();
        this.initDlg = new InitDlg(this, true, this);
        this.visuJoueursDlg = new VisuJoueursDlg(this,true,this.joueurs);
        this.saisieJoueurDlg = new SaisieJoueurDlg(this,true, this.joueurs);

    }
    
    
    /**
     * ajout un joueur a la liste
     * @param j joueur a ajouter
     * @see LesJoueurs#ajouteJoueur(principal.Joueur) 
    
    public void addJoueur(Joueur j){
        this.joueurs.ajouteJoueur(j);
    }*/
 
    /**
     * Crée les boutons (cartes) qui contiendront 
     * les images des personnages sur le plateau
     * @param nbCartes nombre de boutons
     */
    private void initButtons(int nbCartes){
        
        this.nbCartes = 20;
        cartes = new JButton [nbCartes];
        for(int i =0; i<nbCartes; i++){
            cartes[i]= new JButton();
            this.jPanelCartes.add(cartes[i]);
        }

    }
    
    /**
     * etablit les parametres par defaut tels que
     * la difficulté du jeu et les joueurs par defaut
     * @param lj joueurs à ajouter
     * @param lp personnages à ajouter sur le plateau
     * @see LesJoueurs
     * @see LesPersonnages
     */
    public void setPrincipalParametres(LesJoueurs lj, LesPersonnages lp){
        this.persos = lp;
        this.joueurs.ajouteJoueurs(lj);
        this.repaint();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaInformation = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        nPersonagesTrouvesJ1 = new javax.swing.JLabel();
        nPersonagesTrouvesJ2 = new javax.swing.JLabel();
        nomJoueur = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btDemarrer = new javax.swing.JButton();
        btRecommencer = new javax.swing.JButton();
        jPanelCartes = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        optParametres = new javax.swing.JMenu();
        itmOptions = new javax.swing.JMenuItem();
        itmAjoutJoueur = new javax.swing.JMenuItem();
        optVisualiser = new javax.swing.JMenu();
        itmJoueur = new javax.swing.JMenuItem();
        itmCartes = new javax.swing.JMenuItem();
        optTest = new javax.swing.JMenu();
        transferTest = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jtaInformation.setColumns(20);
        jtaInformation.setRows(5);
        jtaInformation.setText("Information:");
        jScrollPane2.setViewportView(jtaInformation);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        nPersonagesTrouvesJ1.setText("Nombre de personages trouvees: 2");
        jPanel3.add(nPersonagesTrouvesJ1);

        nPersonagesTrouvesJ2.setText("Nombre de personages trouvees: 8");
        jPanel3.add(nPersonagesTrouvesJ2);

        nomJoueur.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nomJoueur.setText("Cést a lara de jouer!");
        jPanel3.add(nomJoueur);

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        btDemarrer.setText("Demarrer");
        btDemarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDemarrerActionPerformed(evt);
            }
        });
        jPanel4.add(btDemarrer);

        btRecommencer.setText("Recommencer");
        btRecommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecommencerActionPerformed(evt);
            }
        });
        jPanel4.add(btRecommencer);

        jPanel1.add(jPanel4, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanelCartes.setLayout(new java.awt.GridLayout(4, 5));
        getContentPane().add(jPanelCartes, java.awt.BorderLayout.CENTER);

        optParametres.setText("Parametres");

        itmOptions.setText("Options");
        itmOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOptionsActionPerformed(evt);
            }
        });
        optParametres.add(itmOptions);

        itmAjoutJoueur.setText("Ajout Joueur");
        itmAjoutJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAjoutJoueurActionPerformed(evt);
            }
        });
        optParametres.add(itmAjoutJoueur);

        jMenuBar1.add(optParametres);

        optVisualiser.setText("Visualiser");

        itmJoueur.setText("Joueur");
        itmJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmJoueurActionPerformed(evt);
            }
        });
        optVisualiser.add(itmJoueur);

        itmCartes.setText("Cartes");
        itmCartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCartesActionPerformed(evt);
            }
        });
        optVisualiser.add(itmCartes);

        jMenuBar1.add(optVisualiser);

        optTest.setText("Test");

        transferTest.setText("Transfer");
        transferTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferTestActionPerformed(evt);
            }
        });
        optTest.add(transferTest);

        jMenuBar1.add(optTest);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRecommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecommencerActionPerformed
        // pass
    }//GEN-LAST:event_btRecommencerActionPerformed

    private void btDemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDemarrerActionPerformed
        // pass
    }//GEN-LAST:event_btDemarrerActionPerformed

    /**
     * Ouvre la fenêtre qui permet de définir
     * les paramètres et personnages par défaut du jeu
     * @param evt source de l'événement
     */
    private void itmOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOptionsActionPerformed
        this.initDlg.setVisible(true);
    }//GEN-LAST:event_itmOptionsActionPerformed

    /**
     * Ouvre la fenêtre qui permet de voir les joueurs
     * et ses caractéristiques
     * @param evt source de l'événement
     */
    private void itmJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmJoueurActionPerformed
        this.visuJoueursDlg.setVisible(true);
    }//GEN-LAST:event_itmJoueurActionPerformed

    /**
     * Ouvre la fenêtre qui permet d'ajouter un joueur
     * @param evt source de l'événement
     */
    private void itmAjoutJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAjoutJoueurActionPerformed
        this.saisieJoueurDlg.setVisible(true);
    }//GEN-LAST:event_itmAjoutJoueurActionPerformed

    /**
     * Ouvre la fenêtre qui permet de voir les cartes
     * du joueur actuel
     * @param evt source de l'événement
     */
    private void itmCartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCartesActionPerformed
        (new VisuPersonnagesDlg(this, true, this.joueurs.getJoueur(this.joueurs.getNbJoueurs()-1))).setVisible(true);
    }//GEN-LAST:event_itmCartesActionPerformed

    /**
     * permet le transfert de cartes d'un joueur a un autre
     * methode pas encore utilise
     * @param evt
     * @deprecated 
     */
    private void transferTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferTestActionPerformed
        Joueur j1=new Joueur("FanMemory0", "commun");
        j1.initPaquetTest();
        Joueur j2=new Joueur("FanMemory1", "commun");
        j2.getPaquet().ajoutePerso(new Personnage("epiques", "burnout", 20));
        j2.getPaquet().ajoutePerso(new Personnage("epiques", "funk-ops", 30));
        j2.getPaquet().ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
        this.joueurs.ajouteJoueur(j1);
        this.joueurs.ajouteJoueur(j2);
        TransfertDlg diag = new TransfertDlg(this,true,joueurs,0);
        diag.setVisible(true);
    }//GEN-LAST:event_transferTestActionPerformed

    //Liste de personnages sur le plateau
    private LesPersonnages persos ;
    
    //Liste de joueurs
    private LesJoueurs joueurs ;
    
    //references aux JDilogs
    private InitDlg initDlg;
    private VisuJoueursDlg visuJoueursDlg;
    private SaisieJoueurDlg saisieJoueurDlg;
    private VisuPersonnagesDlg visuPersonnagesDlg; //non utilise
    
    //juste pour l'esthétique pas d'utilite pour le moment
    private JButton [] cartes;
    private int nbCartes;
    
    //indice du joueur actuel
    private int jactuel;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDemarrer;
    private javax.swing.JButton btRecommencer;
    private javax.swing.JMenuItem itmAjoutJoueur;
    private javax.swing.JMenuItem itmCartes;
    private javax.swing.JMenuItem itmJoueur;
    private javax.swing.JMenuItem itmOptions;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCartes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaInformation;
    private javax.swing.JLabel nPersonagesTrouvesJ1;
    private javax.swing.JLabel nPersonagesTrouvesJ2;
    private javax.swing.JLabel nomJoueur;
    private javax.swing.JMenu optParametres;
    private javax.swing.JMenu optTest;
    private javax.swing.JMenu optVisualiser;
    private javax.swing.JMenuItem transferTest;
    // End of variables declaration//GEN-END:variables
  

}