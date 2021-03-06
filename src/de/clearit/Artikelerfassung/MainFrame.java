package de.clearit.Artikelerfassung;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener

{
	private ArrayList<JButton> buttons;
	private JButton buttonArr[];
	private String text;
	private JFrame frame;
	private JPanel mainPanel;
	private JButton newBtn;
	private GridBagLayout mainLayout;
	private GridBagConstraints c;
	private ContentPanel contentPanel;
	private ButtonPanel btnPanel;
	
	

	public MainFrame()
	{
		
		// top level Komponenten
		
		frame = new JFrame();
		mainPanel = new JPanel();
		contentPanel = new ContentPanel();
		btnPanel = new ButtonPanel(contentPanel);
		//btnPanel.setImageIcon(contentPanel.getImageIcon());
		
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		frame.setSize(1500, 1000);
	//	frame.setResizable(false);
	//	frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//mainPanel.setSize(frame.getSize());
		
		frame.add(mainPanel);
		
		// darin eingeordnete Komponenten
		
		// ButtonPanel 1. Zeile
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.ipady = 50;
		c.insets = new Insets(10, 0, 40, 0); 
		
		mainPanel.add(btnPanel.getPanel(), c);
		
		// Content Panel mit Textarea und Image 2.Zeile
		
		c.gridx = 0;
		c.gridy = 1;
     	c.weightx = 1;
		c.weighty = 1;
	
		mainPanel.add(contentPanel.getContentPanel(), c);
		
		
		
		// neu Button 3. Zeile
		newBtn = new JButton("neu");
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 0;
		c.weighty = 0;
		newBtn.setPreferredSize(new Dimension(60, 1));
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.LAST_LINE_START;
		
		mainPanel.add(newBtn, c);
		
		
		// someComponent.addActionListener(instanceOfMyClass);    ???
		newBtn.addActionListener(this);
		
		// TODO Action listener on click append new button to btnArr 
		// bei click auf den entsprechenden button soll der verkn�pfte Artikel angezeigt werden
		// brauche ich hier erst mal mehr Verst�ndnis f�r Datenbanken? 
		// ich m�sste ja alle Daten die in Kiwis Frame eingegeben werden verarbeiten?
		
		// TODO Action listener f�r neu Button on click erscheint kiwis frame
		// Wie pushen wir unsere beiden Projekte zusammen? Was passiert da jeder sein 
		// eigenes s�ppchen gekocht hat?
		
		
		// TODO sizing f�r JLabel und Buttons anpassen
		
		
		// bisher ist alles statisch, wie muss ich umdesignen um das dynamisch besser zu machen?
		
		
	}


	public void addButtonToList()
	{
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("button has been pressed");
		btnPanel.addToBtnArray("./Bilder/rebull.png");
		
	}



}
