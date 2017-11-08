package de.clearit.Artikelerfassung;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class ContentPanel 
{
	private String text;
	private JPanel contentPanel;
	private JLabel imageLabel;
	private JTextArea textArea;
    private Border blackline;	
	
	public ContentPanel()
	{
		blackline = BorderFactory.createLineBorder(Color.black);
		
		
		contentPanel = new JPanel(new FlowLayout());
		text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet";
		textArea = new JTextArea(text);
		textArea.setPreferredSize(new Dimension(550, 400));
		textArea.setLineWrap(true);
		textArea.setBorder(blackline);
		
		contentPanel.add(textArea);
		
		imageLabel = new JLabel("display image");
		imageLabel.setPreferredSize(new Dimension(350, 400));
		
		imageLabel.setBorder(blackline);
		contentPanel.add(imageLabel);
		
		
	}
	
	public JPanel getContentPanel()
	{
		return contentPanel;
	}

}
