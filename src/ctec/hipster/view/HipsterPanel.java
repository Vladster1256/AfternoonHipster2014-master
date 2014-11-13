package ctec.hipster.view;

import java.awt.Color;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album info here :D");
		hipsterImage = new JLabel("Hipster Vlad", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster/view/derf/hipsterVlad.jpg")), JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.EAST, hipsterImage, -47, SpringLayout.WEST, albumLabel);
		albumBox = new JComboBox();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		
	}
	
	private void setupPanel()
	{
		this.setSize(1000,400);
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 94, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, albumBox, 0, SpringLayout.EAST, albumLabel);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 526, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, albumLabel, -104, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, 122, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 230, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, hipsterImage, -17, SpringLayout.NORTH, albumLabel);
	}
	
	private void setupListeners()
	{
		
	}

}
