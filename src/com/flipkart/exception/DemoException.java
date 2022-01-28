/**
 * 
 */
package com.flipkart.exception;

/**
 * @author HP
 *
 */
public class DemoException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a,b,c;
			a = 10;
			b = 0;
			c = a/b;
			System.out.println("Output of c: "+c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Maths operation is wrong: "+ex.getMessage());
		}
	}

}
