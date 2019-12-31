/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 *
 * @author dell
 */
import java.util.*;
public class City
{
	private String name;		// The name of the City
	private ArrayList<City> connectsWith;		// Which cities are connected to this one
	
	public City(String cityName)
	{
		name = cityName;
		connectsWith = new ArrayList<City>();
	}
	
	// Method: addConnection
	// Purpose: To note that you can catch a flight to the destination, from this city
	// Passed:
	//     destination - The City which you can fly to.
	public void addConnection(City destination)
	{
		if (destination != null && destination != this)
			connectsWith.add(destination);
	}
	
	// Method:  getConnections
	// Purpose: To retrieve a list of cities you can reach from this one.
	// Note: You are given a clone, (to avoid a privacy leak), and can manipulate it however 
	//    you like. E.g. you could delete elements.
	public ArrayList<City> getConnections()
	{
		return (ArrayList<City>) connectsWith.clone();
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return name;
	}
}
