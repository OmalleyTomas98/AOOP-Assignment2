package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


// Delta should be a singleton class




/**

* @author Tomas Omalley
* @version 1.0
* @since 1.8
* 
* public class Delta collections and add to instantiate a new array list 
*/
public class Delta {
	
	
	
	
	/**

	* @author Tomas Omalley
	* @version 1.0
	* @since 1.8
	* 
	* public class Delta collections and add to instantiate a new array list 
	*/
	private Collection<Omega> list = new ArrayList<>();

	
	
	/**
	* 
	* create instance of class Delta 
	*/
	private  static  Delta instance = new  Delta();
	
	

	/**
	* 
	* Add private Constructor
	*/
	Delta() { };

	
	
	/**
	* 
	* Create and return  instance singleton of delta 
	*/
	static Delta getInstance()
	{

			return instance;
		}


	/**
	* 
	*  needs to  be a singleton class add to beta 
	*/
     
	public void add(Beta beta)
	{
		list.addAll((Collection<? extends Omega>) beta);
	}
	
	/**
	* 
	*  public void remove removes subtyoe from list omega 
	*/
	public void remove(Omega o)
	{
	      list.remove(o);
	}
	/**
	* 
	*  public class iterate over Omega subclass and returns a list  
	*/
	
	public Iterator<Omega> getIterator()
	{
		return list.iterator();
	}

}