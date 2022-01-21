/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Customer;

/**
 * @author HP
 *
 */
public class CustomerService {
	//The service class implementing all the operations for creating, updating and deleting the customers
	
	//Customer customer = new Customer();
	Customer myCustomers[] = new Customer[] {new Customer(), new Customer(), new Customer()};

	
	
	public void createCustomer() {
		
		System.out.println("Customer is created");
		//Add Dummy values in customer object
		// First Record Insert
		myCustomers[0].setCustomerId(101);
		myCustomers[0].setCustomerName("Training");
		myCustomers[0].setCustomerAddress("IBM");
		// Second Record Insert
		myCustomers[1].setCustomerId(102);
		myCustomers[1].setCustomerName("Flipkart");
		myCustomers[1].setCustomerAddress("Delhi");
		// Third Record Insert
		myCustomers[0].setCustomerId(103);
		myCustomers[0].setCustomerName("JBL");
		myCustomers[0].setCustomerAddress("Patna");
	}
	
	public void updateCustomer() {
		
		System.out.println("Customer is updated");
	}
	public void listCustomer() {
		
		System.out.println("Customer is listed");
		for(Customer  cust : myCustomers){
			
			  System.out.println("Customer Details---> id--> " +cust.getCustomerId() + "Name" +cust.getCustomerName() + "Address" +cust.getCustomerAddress());	
				
			}
		
	}
	public void deleteCustomer() {
		
		System.out.println("Customer is deleted");
	}
}
