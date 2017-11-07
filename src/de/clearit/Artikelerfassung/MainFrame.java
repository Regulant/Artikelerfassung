package de.clearit.Artikelerfassung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
	
	private ButtonPanel btnPanel;
	

	public MainFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnPanel = new ButtonPanel();
		
		// top level Komponenten
		
		frame = new JFrame();
		mainPanel = new JPanel();
		
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		mainPanel.setBackground(Color.GREEN);
		
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
		mainPanel.setSize(frame.getSize());
		
		frame.add(mainPanel, BorderLayout.CENTER);
		
		// darin eingeordnete Komponenten
		
		// ButtonPanel
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 0.1;
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 5;
		mainPanel.add(btnPanel.getPanel(), c);
		
		
//		// text area
//		text = "hallo";
//		textArea = new JTextArea(text);
//		textArea.setEditable(false);
//		c.gridx = 0;
//		c.gridy = 1;
//		c.weightx = 0.5;
//		c.weighty = 0.5;
//		mainPanel.add(textArea, c);
//
//		// image label
//		imageLabel = new JLabel("upload an image in here");
//		c.gridx = 1;
//		c.gridy = 1;
//		c.weightx = 0.5;
//		c.weighty = 0.5;
//		mainPanel.add(imageLabel, c);
		
		// neu Button
		newBtn = new JButton("neu");
		c.gridx = 1;
		c.gridy = 3;
		mainPanel.add(newBtn, c);
		
	}
	
}
