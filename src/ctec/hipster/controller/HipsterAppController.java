package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;
/**
 *  HipsterAppController for the 2014 Hipster day project
 * @author CodyH
 * @version 1.0 11/12/14 Basic framework only
 */
public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String [] myAlbums;
	
	/**
	 * This is the method that we use to delcare variables equal to the variables in the delcaration
	 */
	public HipsterAppController()
	{
		
		selfHipster = new Hipster("Vladster", 17);
		buildAlbumArray();
		
		baseFrame = new HipsterFrame(this);
	}
	
	/**
	 * This is the method that we call when we start the project
	 */
	public void start()
	{
		
		
	}
	
	/**
	 * This is our arraylist that we assign 
	 */
	private void buildAlbumArray()
	{
		String [] myAlbums = new String[4];
		myAlbums[0] = "Queen: not hipster";
		myAlbums[1] = "MDK: too new, sooooo hipster";
		myAlbums[2] = "Skrillex: SOOOO Hipster";
		myAlbums[3] = "Your Mother: on a scale of 1 to hipster, i cant even";
		selfHipster.setHipsterAlbums(myAlbums);
		
		//hipster
		// only one line
		String [] otherAlbums = {"stuff", "other", "way for", "hipster array"};
		
		//ultra hipster
		String [] weirdAlbums;
		weirdAlbums =new String[] {"", "", "", "asdf"};
	}
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
}
