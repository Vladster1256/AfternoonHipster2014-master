package ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;
/**
 * This is the Hipster panel Method that
 * @author Vladster1256
 * @version 1.1
 */
public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	/**
	 * This is the hipster panel method that we use to delcare variables equal to something and call methods
	 * @param baseController is the main controller <hipsterappcontroller>
	 */
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
	
	/**
	 * This is the drop down menu with different options in the list that we pulled from the array list
	 */
	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));
	}
	
	/**
	 * We setup Panel that sits inside the Pane
	 */
	private void setupPanel()
	{
		this.setSize(1000,400);
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	/**
	 * We setup the layout of the GUI
	 */
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
	
	/**
	 * We listen to listeners from listeners, like albumBox
	 */
	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent arg0)
			{
				if(albumBox.getSelectedIndex() == 0)
				{
					albumLabel.setText("You ain't a hipster");
					
				}
				else if(albumBox.getSelectedIndex() <= 2)
				{
					albumLabel.setText("You are so hipster");
				}
				else
				{
					albumLabel.setText("Over level 9000 Hipster");
				}
			}
		});
	}

}
