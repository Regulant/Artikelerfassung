package de.clearit.Artikelerfassung;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainFrame

{
	private JFrame frame;
	private JPanel mainPanel;
	private JButton newBtn;
	private GridBagLayout mainLayout;
	private JSplitPane splitPane;
	

	public MainFrame()
	{
		frame = new JFrame("a");
		mainPanel = new JPanel ();
		newBtn = new JButton("neu");
		GridBagLayout layout = new GridBagLayout();
		
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		frame.add(mainPanel);
		frame.add(newBtn);
		
	}
	
}
