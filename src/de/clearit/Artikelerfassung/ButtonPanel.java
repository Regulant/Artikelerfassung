package de.clearit.Artikelerfassung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class ButtonPanel  // Bildet die erste Reihe
{

	//private ArrayList<JButton> buttons = new ArrayList<JButton>();	Kevin Code
//	private Map<String, JButton> mapButtonName2Button = new HashMap<>();	Christian Code
	private List<JButton> listButtons = new ArrayList<>();
	private ContentPanel contentPanel;
	private JPanel buttonPanel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JScrollPane scrollPane;
	private Border blackline;
	
	public ImageIcon imageIcon;
	
//	public void addButtonToList(JButton... someButtons) {
//		for(JButton someButton : someButtons) {
//			addButtonToList(someButton);
//		}
//	}
	
//	public void addButtonToList(JButton someButton) {
//		
//		mapButtonName2Button.put(someButton.getName(), someButton);
//		
//		listButtons.add(someButton);
//	}
	
	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
//	public ButtonPanel() {
//		this(null);
//	}
	
	public ButtonPanel()
	{
		// "work around" für wiederverwenden von icon
		contentPanel = new ContentPanel();
		
		
		//The ButtonGroup component manages the selected/unselected state for a set of buttons.
		//For the group, the ButtonGroup instance guarantees that only one button can be selected at a time.
		
		//blackline = BorderFactory.createLineBorder(Color.black);
		
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.BLUE);
		scrollPane = new JScrollPane(buttonPanel);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		btn1 = new JButton("", contentPanel.getImageIcon());
		btn2 = new JButton("test");
		btn3 = new JButton("wie");
		btn4 = new JButton("aussehen");
		btn5 = new JButton("wird");
		btn6 = new JButton("list");
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		buttons.add(btn6);
		System.out.println(buttons.size());
		
		
		
		
		btn1.setPreferredSize(new Dimension(80,90));
		btn1.setMargin(new Insets(0, 0, 0, 0));
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonPanel.add(btn1);
		
		scrollPane.setPreferredSize(btn1.getPreferredSize());
		
		
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
	
	
	
// Kevin Code	
//	public void addToBtnPanel()
//	{
//		JButton appendButton = new JButton();
//		buttons.add(appendButton);
//		System.out.println("action listener macht das");
//	}
	
}
