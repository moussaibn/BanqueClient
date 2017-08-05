package presentation;

import javax.swing.*;

import entites.*;

import java.awt.event.*;
import java.awt.*;
import java.util.*;

import javax.swing.table.DefaultTableModel;

public class AfficherReleveBancaire extends JFrame implements ActionListener
{
	private JTable table;
	private ArrayList<Operations> liste;
	private JScrollPane sc;
	private JPanel panneau1,panneau2;
	private JButton qt;
	
	public AfficherReleveBancaire(ArrayList <Operations> liste)
	{
		panneau1=new JPanel();
		panneau2=new JPanel();
		qt = new JButton("Quitter");
		 this.liste=liste;
		  sc  = new JScrollPane();
		  table = new JTable();
		  sc.setViewportView(table);
		  DefaultTableModel modele = (DefaultTableModel)table.getModel();
		  modele.addColumn("Libelle Operation");
		  modele.addColumn("Sens Operation");
		  modele.addColumn("Date Operation");
		  modele.addColumn("Montant");
		  int ligne=0;
		  double solde=0;
		  for (Operations op : liste)
		  {
		  	solde = op.solde;
			  modele.addRow( new Object[0]);
			  modele.setValueAt(op.getLibop(), ligne, 0);
			  modele.setValueAt(op.getSensop(), ligne, 1);
			  modele.setValueAt(op.getDateop(), ligne, 2);
			  modele.setValueAt(Double.valueOf(op.getMontant()),ligne,3);
			  ligne++;
		  }
		modele.addRow( new Object[0]);
		modele.setValueAt("", ligne, 0);
		modele.setValueAt("", ligne, 1);
		modele.setValueAt("", ligne, 2);
		modele.setValueAt(Double.valueOf(solde),ligne,3);
		  setTitle("Releve bancaire du client");
		  setSize(550,500);
		  qt.addActionListener(this); 
		  panneau1.add(sc);
		  panneau2.add(qt);
		  add(panneau1,BorderLayout.NORTH);
		  add(panneau2,BorderLayout.SOUTH);
		  setLocationRelativeTo(null);
		  setVisible(true);
	}
    public void actionPerformed(ActionEvent e)
    {
    	if (e.getSource()==qt)
    	{
    		dispose();
    		new Clients();
    	}
    }
	
}


