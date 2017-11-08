package de.clearit.Artikelerfassung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ButtonPanel 
{
	private JPanel buttonPanel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JScrollPane scrollPane;
	
	public ButtonPanel()
	{
		buttonPanel = new JPanel();
		//buttonPanel.setPreferredSize(new Dimension(1000, 200));
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.BLUE);
		scrollPane = new JScrollPane(buttonPanel);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		
		btn1.setPreferredSize(new Dimension(80,40));
		buttonPanel.add(btn1);
		
		
		
		buttonPanel.add(btn2);
		btn2.setPreferredSize(btn1.getPreferredSize());
		
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		buttonPanel.add(btn5);
		
	}

	public JScrollPane getPanel()
	{
		return scrollPane;
	}
	
}
