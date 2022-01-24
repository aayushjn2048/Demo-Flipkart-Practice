/**
 * 
 */
package com.flipkart.collection;

import java.util.*;

/**
 * @author HP
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList declaration and allocation
		List<String> list = new ArrayList<String>();
		System.out.println("Initial size of list: "+list.size());
		list.add("Mumbai");
		list.add("Pune");
		list.add("Delhi");
		list.add("Male");
		list.add("Pune");
		System.out.println("size of list: "+list.size());
		
		
		
		list.remove("Pune");
        //  al.remove(2);
          System.out.println("Size of al after deletions: " + list.size());
          System.out.println("Contents of al: " + list);
        
        // Iterable interface 
          
          // Iterator is interface which is using to iterate the Collection
          Iterator<String> i=list.iterator();
          while(i.hasNext()){
        	  
        	  String test=i.next();
        	  System.out.println("detals of Capital------>" +test);
          }
	
          
    
          // Another way to iterate the collection using for loop 
          
       // Loop through elements.
             for (String value : list) {
         	    
         	    System.out.println("Element: " + value);
         	}
          
	}

}
