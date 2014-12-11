package ctec.hipster.model;

/**
 * Hipster object for the Hipster Project 2014
 * @author vladster1256
 * @version 1.1 11/13/14
 */
public class Hipster
{

	private String name;
	private int age;
	private String [] hipsterAlbums;
	
	/**
	 * This is our hipster that has defaults from the begining
	 */
	public Hipster()
	{
		name = "";
		age = -99;
		hipsterAlbums = null;
	}
	
	/**
	 * This is the setter for the Hipster
	 * @param name is the name of Hipster
	 * @param age is the age of Hipster
	 */
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = null;
	}

	/**
	 * This is getter for Name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * this is getter for the age
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * this is gette for selfHipster
	 * @return selfHipster
	 */
	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	/**
	 * setter for name	
	 * @param name is name of Hipster
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * setter for age
	 * @param age is age of Hipster
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * this is the setter for hipsterAlbums
	 * @param hipsterAlbums is hipsterAlbums for Hipster
	 */
	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}
	
}
