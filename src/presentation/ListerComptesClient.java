package presentation;

import javax.swing.*;

import entites.*;

import java.awt.event.*;
import java.awt.*;
import java.util.*;

import javax.swing.table.DefaultTableModel;

public class ListerComptesClient extends JFrame implements ActionListener
{
	private JTable table;
	private ArrayList<Compte> liste;
	private JScrollPane sc;
	private JPanel panneau1,panneau2;
	private JButton qt;
	
	public ListerComptesClient(ArrayList <Compte> liste)
	{
		panneau1=new JPanel();
		panneau2=new JPanel();
		qt = new JButton("Quitter");
		 this.liste=liste;
		  sc  = new JScrollPane();
		  table = new JTable();
		  sc.setViewportView(table);
		  DefaultTableModel modele = (DefaultTableModel)table.getModel();
		  modele.addColumn("Numero compte");
		  modele.addColumn("Libelle compte");
		  int ligne=0;
		  for (Compte cp : liste)
		  {
			  modele.addRow( new Object[0]);
			  modele.setValueAt(cp.getNumcompte(), ligne, 0);
			  modele.setValueAt(cp.getLibcompte(), ligne, 1);
			  ligne++;
		  }
		 
		  setTitle("Liste des Comptes du clients");
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

