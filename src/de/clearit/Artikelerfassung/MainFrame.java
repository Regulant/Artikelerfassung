package de.clearit.Artikelerfassung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame

{
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
		btnPanel = new ButtonPanel();
		contentPanel = new ContentPanel();
		
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		frame.setSize(1000, 1000);
	//	frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel.setSize(frame.getSize());
		
		frame.add(mainPanel, BorderLayout.CENTER);
		
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
	//	c.weightx = 1;
	//	c.weighty = 1;
	
		mainPanel.add(contentPanel.getContentPanel(), c);
		
		
		
		// neu Button 3. Zeile
		newBtn = new JButton("neu");
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 0;
		c.weighty = 0;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.LINE_START;
		mainPanel.add(newBtn, c);
		
	}
	
}
