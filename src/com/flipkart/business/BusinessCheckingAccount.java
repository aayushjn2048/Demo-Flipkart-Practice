/**
 * 
 */
package com.flipkart.business;
import java.io.*;

import com.flipkart.exception.InsufficientFundException;

public class BusinessCheckingAccount
{
   private double balance;
   private int number;
   public BusinessCheckingAccount(int number)
   {
      this.number = number;
   }
   public void deposit(double amount)
   {
      balance += amount;
   }
   public void withdraw(double amount) throws InsufficientFundException
   {
      if(amount <= balance)
      {
         balance -= amount;
      }
      else
      {
         double needs = amount - balance;
         throw new InsufficientFundException(needs);
      }
   }
   public double getBalance()
   {
      return balance;
   }
   public int getNumber()
   {
      return number;
   }
}
