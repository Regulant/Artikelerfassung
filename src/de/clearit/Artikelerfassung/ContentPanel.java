package de.clearit.Artikelerfassung;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class ContentPanel // Bildet die zweite Reihe 
{
	private String text;
	private JPanel contentPanel;
	private JLabel imageLabel;
	private JTextArea textArea;
    private Border blackline;
    private JScrollPane textScroll;
    
    public ImageIcon imageIconRedBull;
	private ImageIcon imageIcon;
	
	public ContentPanel()
	{
		
		contentPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		blackline = BorderFactory.createLineBorder(Color.black);
		
		// Textarea
		text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet";
		textArea = new JTextArea(text);
		textScroll = new JScrollPane(textArea);
		textScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 2;
		gc.gridheight = 1;
		gc.weightx = 0.6;
		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.VERTICAL;
	    gc.insets = new Insets(0, 10, 0, 40);
		textArea.setPreferredSize(new Dimension(600, 400));
		textArea.setLineWrap(true);
		textScroll.setBorder(blackline);
		
		contentPanel.add(textScroll, gc);
		
		// JLabel f�r Image
		
		imageIconRedBull = new ImageIcon("./Bilder/redbull.png");
		
		imageLabel = new JLabel("", imageIconRedBull, JLabel.CENTER);
		gc.gridx = 2;
		gc.gridy = 0;
		gc.gridwidth = 1;
		gc.gridheight = 0;
		gc.weightx = 0.4;
		gc.anchor = GridBagConstraints.CENTER;
		imageLabel.setPreferredSize(new Dimension(350, 400));
		
		imageLabel.setBorder(blackline);
		contentPanel.add(imageLabel, gc);
		
		
	}
	
	public Border getBlackline()
	{
		return blackline;
	}

	public ImageIcon getImageIcon()
	{
		return imageIconRedBull;
	}
	
	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	public JPanel getContentPanel()
	{
		return contentPanel;
	}

}
