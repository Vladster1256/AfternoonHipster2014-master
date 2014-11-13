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
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 526, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, albumLabel, -104, SpringLayout.SOUTH, this);
		hipsterImage = new JLabel("name");
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, 0, SpringLayout.NORTH, albumLabel);
		baseLayout.putConstraint(SpringLayout.EAST, hipsterImage, -232, SpringLayout.WEST, albumLabel);
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 94, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, albumBox, 0, SpringLayout.EAST, albumLabel);
		
		
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
		
	}
	
	private void setupListeners()
	{
		
	}

}
