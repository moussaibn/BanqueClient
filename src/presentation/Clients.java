package presentation;

import java.net.*;
import java.util.*;

import javax.swing.*;

import java.io.*;
import java.awt.event.*;

import entites.*;
@SuppressWarnings("serial")
public class Clients extends JFrame implements ActionListener 
{
	 // Variables declaration - do not modify     
	 @SuppressWarnings("rawtypes")
	private JComboBox JCB_AgenceClient;
	    @SuppressWarnings("rawtypes")
		private JComboBox JCB_sensop;
	    private JTextField JT_NumCliAfficheCompte;
	    private JTextField JT_NumCliAfficheReleve;
	    private JTextField JT_libcompte;
	    private JTextField JT_libop;
	    private JTextField JT_montant;
	    private JTextField JT_nomcli;
	    private JTextField JT_numCompteOp;
	    private JTextField JT_numcli;
	    private JTextField JT_numclicompte;
	    private JTextField JT_numcompte;
	    private JTextField JT_prenomcli;
	    private JPanel PanCreerAgence;
	    private JPanel PanCreerClient;
	    private JPanel PanCreerCompte;
	    private JPanel PanOperation;
	    private JPanel PanVisualiserInfos;
	    private JPanel accueil;
	    private JButton boutonAjouterCli;
	    private JButton boutonCreerAgence;
	    private JButton boutonCreerCompte;
	    private JButton boutonValiderop;
	    private JButton bouton_AfficherAgence;
	    private JButton bouton_VisualiserInfos;
	    private JButton bouton_afficheCompteCli;
	    private JButton bouton_afficheReleve;
	    private JButton creerAgence;
	    private JButton creerClient;
	    private JButton creerCompte;
	    private JLabel jLabel1;
	    private JLabel jLabel10;
	    private JLabel jLabel12;
	    private JLabel jLabel13;
	    private JLabel jLabel14;
	    private JLabel jLabel15;
	    private JLabel jLabel16;
	    private JLabel jLabel17;
	    private JLabel jLabel2;
	    private JLabel jLabel3;
	    private JLabel jLabel4;
	    private JLabel jLabel5;
	    private JLabel jLabel6;
	    private JLabel jLabel9;
	    private JSeparator jSeparator1;
	    private JTextField jTextField1;
	    private JTextField jTextField2;
	    private JButton passerOp;
	    private String[] tab=new String[100];    private Socket socket;
	DataOutputStream out;
	DataInputStream in;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    
    
	public Clients() 
	{
		initComponents();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() 
    {
        accueil = new JPanel();
        creerAgence = new JButton();
        creerClient = new JButton();
        creerCompte = new JButton();
        passerOp = new JButton();
        jSeparator1 = new JSeparator();
        jTextField1 = new JTextField();
        PanCreerAgence = new JPanel();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        boutonCreerAgence = new JButton();
        PanCreerClient = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        JT_numcli = new JTextField();
        JT_nomcli = new JTextField();
        JT_prenomcli = new JTextField();
        boutonAjouterCli = new JButton();
        jLabel13 = new JLabel();
        JCB_AgenceClient = new JComboBox();
        PanCreerCompte = new JPanel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        JT_numcompte = new JTextField();
        JT_libcompte = new JTextField();
        boutonCreerCompte = new JButton();
        JT_numclicompte = new JTextField();
        jLabel14 = new JLabel();
        PanOperation = new JPanel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        JT_libop = new JTextField();
        JT_montant = new JTextField();
        boutonValiderop = new JButton();
        JT_numCompteOp = new JTextField();
        jLabel15 = new JLabel();
        JCB_sensop = new JComboBox();
        bouton_VisualiserInfos = new JButton();
        PanVisualiserInfos = new JPanel();
        bouton_AfficherAgence = new JButton();
        JT_NumCliAfficheCompte = new JTextField();
        bouton_afficheCompteCli = new JButton();
        JT_NumCliAfficheReleve = new JTextField();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        bouton_afficheReleve = new JButton();
        
        creerAgence.addActionListener(this);
        creerClient.addActionListener(this);
        creerCompte.addActionListener(this);
        passerOp.addActionListener(this);
        bouton_VisualiserInfos.addActionListener(this);
        boutonAjouterCli.addActionListener(this);
        boutonCreerCompte.addActionListener(this);
        boutonValiderop.addActionListener(this);
        bouton_AfficherAgence.addActionListener(this);
        bouton_afficheCompteCli.addActionListener(this);
        bouton_afficheReleve.addActionListener(this);
        boutonAjouterCli.addActionListener(this);
        boutonCreerAgence.addActionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(680, 550));

        accueil.setBackground(new java.awt.Color(20, 204, 204));
        accueil.setPreferredSize(new java.awt.Dimension(680, 550));



        creerAgence.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        creerAgence.setText("Creer une Agence");

        creerClient.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        creerClient.setText("Creer un Client");
    
        creerCompte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        creerCompte.setText("Creer un compte");

        passerOp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passerOp.setText("Passer une Operation");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("Gestion des operations bancaires");
        jTextField1.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nom Agence");

        boutonCreerAgence.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boutonCreerAgence.setText("Valider");

        GroupLayout PanCreerAgenceLayout = new GroupLayout(PanCreerAgence);
        PanCreerAgence.setLayout(PanCreerAgenceLayout);
        PanCreerAgenceLayout.setHorizontalGroup(
            PanCreerAgenceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, PanCreerAgenceLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(PanCreerAgenceLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(boutonCreerAgence, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanCreerAgenceLayout.setVerticalGroup(
            PanCreerAgenceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanCreerAgenceLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(PanCreerAgenceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(boutonCreerAgence, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        PanCreerClient.setPreferredSize(new java.awt.Dimension(387, 296));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Numero Client");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nom Client");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Prenom Client");

        boutonAjouterCli.setText("Ajouter");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Agence");

        

        GroupLayout PanCreerClientLayout = new GroupLayout(PanCreerClient);
        PanCreerClient.setLayout(PanCreerClientLayout);
        PanCreerClientLayout.setHorizontalGroup(
            PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanCreerClientLayout.createSequentialGroup()
                .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(PanCreerClientLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JT_numcli, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(JT_nomcli, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(JT_prenomcli, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(JCB_AgenceClient, 0, 173, Short.MAX_VALUE)))
                    .addGroup(PanCreerClientLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(boutonAjouterCli, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        PanCreerClientLayout.setVerticalGroup(
            PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanCreerClientLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JT_numcli, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_nomcli, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_prenomcli, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(PanCreerClientLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JCB_AgenceClient, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(boutonAjouterCli, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        PanCreerCompte.setPreferredSize(new java.awt.Dimension(387, 296));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Numero Compte");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Libelle Compte");

        boutonCreerCompte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boutonCreerCompte.setText("Creer");
     
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Numero Client");

        GroupLayout PanCreerCompteLayout = new GroupLayout(PanCreerCompte);
        PanCreerCompte.setLayout(PanCreerCompteLayout);
        PanCreerCompteLayout.setHorizontalGroup(
            PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanCreerCompteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14))
                .addGap(24, 24, 24)
                .addGroup(PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(JT_numclicompte, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_numcompte, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonCreerCompte, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_libcompte, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        PanCreerCompteLayout.setVerticalGroup(
            PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanCreerCompteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_numcompte, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JT_libcompte, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanCreerCompteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_numclicompte, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(39, 39, 39)
                .addComponent(boutonCreerCompte, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        PanOperation.setPreferredSize(new java.awt.Dimension(387, 296));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Libelle Operation");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Sens Operation");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Montant");

        boutonValiderop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boutonValiderop.setText("Valider");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Numero Compte");

        JCB_sensop.setModel(new DefaultComboBoxModel(new String[] { "CR", "DB"}));

        GroupLayout PanOperationLayout = new GroupLayout(PanOperation);
        PanOperation.setLayout(PanOperationLayout);
        PanOperationLayout.setHorizontalGroup(
            PanOperationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanOperationLayout.createSequentialGroup()
                .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(PanOperationLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, GroupLayout.Alignment.LEADING)))
                    .addGroup(GroupLayout.Alignment.TRAILING, PanOperationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(boutonValiderop, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_libop, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_sensop, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_numCompteOp, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_montant, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        PanOperationLayout.setVerticalGroup(
            PanOperationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanOperationLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_libop, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38)
                .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JCB_sensop, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_numCompteOp, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addGroup(PanOperationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_montant, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(46, 46, 46)
                .addComponent(boutonValiderop, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bouton_VisualiserInfos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bouton_VisualiserInfos.setText("Visualiser infos");

        bouton_AfficherAgence.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bouton_AfficherAgence.setText("Afficher liste agences");
   
        bouton_afficheCompteCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bouton_afficheCompteCli.setText("Afficher Comptes client");
       
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Numero client");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Numero Compte Client");

        bouton_afficheReleve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bouton_afficheReleve.setText("Afficher Releve bancaire");

        GroupLayout PanVisualiserInfosLayout = new GroupLayout(PanVisualiserInfos);
        PanVisualiserInfos.setLayout(PanVisualiserInfosLayout);
        PanVisualiserInfosLayout.setHorizontalGroup(
            PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanVisualiserInfosLayout.createSequentialGroup()
                .addGroup(PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(PanVisualiserInfosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(JT_NumCliAfficheCompte, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(JT_NumCliAfficheReleve))
                        .addGap(31, 31, 31)
                        .addGroup(PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(bouton_afficheCompteCli, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                            .addComponent(bouton_afficheReleve, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanVisualiserInfosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(PanVisualiserInfosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(PanVisualiserInfosLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(bouton_AfficherAgence, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanVisualiserInfosLayout.setVerticalGroup(
            PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PanVisualiserInfosLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(bouton_AfficherAgence, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_NumCliAfficheCompte, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_afficheCompteCli, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanVisualiserInfosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_NumCliAfficheReleve, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_afficheReleve, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        GroupLayout accueilLayout = new GroupLayout(accueil);
        accueil.setLayout(accueilLayout);
        accueilLayout.setHorizontalGroup(
            accueilLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(accueilLayout.createSequentialGroup()
                .addGroup(accueilLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(accueilLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
                    .addGroup(accueilLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
                    .addGroup(accueilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(accueilLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(creerAgence, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(creerClient, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(creerCompte, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(passerOp, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(bouton_VisualiserInfos, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanCreerAgence, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanCreerCompte, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanVisualiserInfos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanCreerClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanOperation, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accueilLayout.setVerticalGroup(
            accueilLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(accueilLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(accueilLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PanCreerAgence, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(accueilLayout.createSequentialGroup()
                        .addComponent(creerAgence, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(creerClient, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(creerCompte, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(passerOp, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(bouton_VisualiserInfos, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanCreerCompte, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanCreerClient, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanOperation, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanVisualiserInfos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(accueil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(accueil, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        
        try
		{
		socket= new Socket("localhost",8000);
		out = new DataOutputStream(socket.getOutputStream());
	    in = new DataInputStream(socket.getInputStream());
	    oos=new ObjectOutputStream(socket.getOutputStream());
	    ois=new ObjectInputStream(socket.getInputStream());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
        
        pack();
    }// </editor-fold>
	                                                                            
                             
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==creerAgence)
		{
			this.accueil.setVisible(true);
	        this.PanCreerAgence.setVisible(true);
	        this.PanCreerClient.setVisible(false);
	        this.PanOperation.setVisible(false);
	        this.PanVisualiserInfos.setVisible(false);
		}
		else
			if(e.getSource()==creerClient)
			{
				this.accueil.setVisible(true);
		        this.PanCreerAgence.setVisible(false);
		        this.PanCreerClient.setVisible(true);
		        this.PanCreerCompte.setVisible(false);
		        this.PanOperation.setVisible(false);
		        this.PanVisualiserInfos.setVisible(false);
		        
		        try
				{
					oos.writeObject("remplir");
					ArrayList<Object> ob=(ArrayList<Object>)ois.readObject();
		        	for(int i=0;i<ob.size()  ;i++){
			        	 tab[i]=ob.get(i).toString();
			         }
		        	JCB_AgenceClient.setModel(new DefaultComboBoxModel(
		            		tab
		                    ));
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		else
			if(e.getSource()==creerCompte)
			{
				this.accueil.setVisible(true);
		        this.PanCreerAgence.setVisible(false);
		        this.PanCreerClient.setVisible(false);
		        this.PanCreerCompte.setVisible(true);
		        this.PanOperation.setVisible(false);
		        this.PanVisualiserInfos.setVisible(false);
			}
		else
			if(e.getSource()==passerOp)
			{
				this.accueil.setVisible(true);
			    this.PanCreerAgence.setVisible(false);
			    this.PanCreerClient.setVisible(false);
	            this.PanCreerCompte.setVisible(false);
			    this.PanOperation.setVisible(true);
			    this.PanVisualiserInfos.setVisible(false);
			}
		else
			if(e.getSource()==bouton_VisualiserInfos)
			{
				this.accueil.setVisible(true);
				this.PanCreerAgence.setVisible(false);
		        this.PanCreerClient.setVisible(false);
		        this.PanCreerCompte.setVisible(false);
      		    this.PanOperation.setVisible(false);
				this.PanVisualiserInfos.setVisible(true);
			}
		else
			if (e.getSource()==boutonCreerAgence)
			{
				
				Agence A;
				 try
				 {
				 
			    	    oos.writeObject("Creeragence");
			        	oos.flush();
			    		String nomagence=jTextField2.getText();
			    	    A = new Agence();
			    		A.setNomagence(nomagence);
			    		oos.writeObject(A);
			    		oos.flush();
			    		jTextField2.setText("");
			    }
				 catch(Exception ex)
				 {
					 System.out.println(ex.getMessage());
				 }
			}
		
		else
			if (e.getSource()==boutonAjouterCli)
			{
				
				Client C;
				 try
				 {
				 

			    	    oos.writeObject("AjoutClient");
			        	oos.flush();
			        	String nomcli=JT_nomcli.getText();
			    		String numcli=JT_numcli.getText();
			    		String prenomcli=JT_prenomcli.getText();
			    		int numagenceCli=JCB_AgenceClient.getSelectedIndex();
			    		C = new Client();
			    		C.setNumcli(numcli);
			    		C.setNomcli(nomcli);
			    		C.setPrenomcli(prenomcli);
			    	    C.setNumagence(numagenceCli);
			    		oos.writeObject(C);
			    		oos.flush();
			    		JT_numcli.setText("");
			    		JT_nomcli.setText("");
			    		JT_prenomcli.setText("");
			    }
				 catch(Exception ex)
				 {
					 System.out.println(ex.getMessage());
				 }
			}
		
			else
				if (e.getSource()==boutonCreerCompte)
				{
					
					Compte C;
					 try
					 {
					 

				    	    oos.writeObject("Creercompte");
				        	oos.flush();
				        	String numcompte=JT_numcompte.getText();
				    		String libcompte=JT_libcompte.getText();
				    		String numclicompte=JT_numclicompte.getText();
				    		Double solde=0.0;
				    		String sens="CR";
				    	    C = new Compte();
				    		C.setNumcli(numclicompte);
				    		C.setLibcompte(libcompte);
				    		C.setNumcompte(numcompte);
				    		C.setSolde(solde);
				    		C.setSens(sens);
				    		oos.writeObject(C);
				    		oos.flush();
				    		JT_numcompte.setText("");
				    		JT_libcompte.setText("");
				    		JT_numclicompte.setText("");
				    }
					 catch(Exception ex)
					 {
						 System.out.println(ex.getMessage());
					 }
				}
		
				else
					if (e.getSource()==boutonValiderop)
					{
						
						Operations op;
						 try
						 {
						 

					    	        oos.writeObject("Passeroperation");
					        	    oos.flush();
						    		String libop=JT_libop.getText();
						    		String sensop=JCB_sensop.getSelectedItem().toString();
						    		Calendar date_jour = Calendar.getInstance(); 
						    		 int mois = date_jour.get(Calendar.MONTH)+1;
						    	     int annee = date_jour.get(Calendar.YEAR);
						    	     int jour = date_jour.get(Calendar.DATE);
						    	     int heure = date_jour.get(Calendar.HOUR_OF_DAY);
						    	     int minute = date_jour.get(Calendar.MINUTE);
						    	     int seconde = date_jour.get(Calendar.SECOND);
						    		String dateop=annee+"/"+mois+"/"+jour+" "+heure+":"+minute+":"+seconde;
						    		String numCompteOp=JT_numCompteOp.getText();
						    		String vmontant=JT_montant.getText();
						    		Double montant=Double.parseDouble(vmontant);
						    	    op = new Operations();
						    		op.setLibop(libop);
						    		op.setSensop(sensop);
						    		op.setDateop(dateop);
						    		op.setNumcompte(numCompteOp);
						    		op.setMontant(montant);
						    		oos.writeObject(op);
						    		oos.flush();
						    		JT_libop.setText("");
						    		JT_numCompteOp.setText("");
						    		JT_montant.setText("");

					    }
						 catch(Exception ex)
						 {
							 System.out.println(ex.getMessage());
						 }
					}
		
		else
			
			if (e.getSource()==bouton_AfficherAgence)//icu
			{
				try
				{
					oos.writeObject("listerAgences");
                    oos.flush();
			         ArrayList<Agence> liste=(ArrayList<Agence>)ois.readObject();
                    new ListeAgences(liste);

				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		
			else
				
				if (e.getSource()==bouton_afficheCompteCli)
				{
					Client cli; 
					try
					{
						 oos.writeObject("afficheCompteCli");	
				         oos.flush();
				         String numclicompte=JT_NumCliAfficheCompte.getText();
				         cli=new Client();
				         cli.setNumcli(numclicompte);
				         oos.writeObject(cli);
				    	 oos.flush();
				         ArrayList<Compte> liste=(ArrayList<Compte>)ois.readObject();
				         new ListerComptesClient(liste);
				        
					}
					catch(Exception ex)
					{
						System.out.println(ex.getMessage());
					}
					
					
				}
		
			else
					
			    if (e.getSource()==bouton_afficheReleve)
				{
			    	Compte cp;
					try
					{
						  oos.writeObject("Afficherelevebancaire");	
					      oos.flush();
					      String numcompte = JT_NumCliAfficheReleve.getText();
					      cp=new Compte();
					      cp.setNumcompte(numcompte);
					      oos.writeObject(cp);
					      oos.flush();
					      ArrayList<Operations> liste=(ArrayList<Operations>)ois.readObject();
					      new AfficherReleveBancaire(liste);
					        
					}
					catch(Exception ex)
					{
						System.out.println(ex.getMessage());
					}
						
						
				}
		
	}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
                new Clients().accueil.setVisible(true);
                new Clients().PanCreerAgence.setVisible(true);
                new Clients().PanCreerClient.setVisible(false);
                new Clients().PanCreerCompte.setVisible(false);
                new Clients().PanOperation.setVisible(false);
                new Clients().PanVisualiserInfos.setVisible(false);
            }
        });
    }
}

