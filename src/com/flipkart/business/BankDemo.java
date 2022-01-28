/**
 * 
 */
package com.flipkart.business;

import com.flipkart.exception.InsufficientFundException;

/**
 * @author HP
 *
 */
public class BankDemo
{
   public static void main(String [] args)
   {
      BusinessCheckingAccount c = new BusinessCheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      try
      {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
      }catch(InsufficientFundException e)
      {
         System.out.println("Sorry, but you are short $"
                                  + e.getAmount());
        // e.printStackTrace();
      }
    }
}
