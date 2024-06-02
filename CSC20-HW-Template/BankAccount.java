import java.util.*;
public class BankAccount implements Comparable<BankAccount>{
public final double MINIMUM=500.00;
private
 String  firstName;
 String lastName;
 int accountNumber;
 double balance;

public
  BankAccount(){

  }
 BankAccount(String  firstName, String lastName, int accountNumber,double balance){
  // regular constructor
 }

 public String toString(){
   


String output = String.format("%10s%10s%12s%d%10s%10.2f", firstName,lastName, ": Account Number ",accountNumber," Balance: ",balance);
   
   // return firstName + " "+ lastName+ ": Account Number "+accountNumber+ " Balance: "+balance;
    return output;
 }

public void deposit(double amount){
  //deposit amount
  // if amount is negative throw InputMismatch Exception
}
public int getAccountNumber(){
  //
}
public int compareTo(BankAccount other){
  // implement this method to compare two bank account numbers, from this and other
}
public String getFirstName(){
  //
}
public void withdraw(double amount){
  //if amount withdrawn leaves less than minimum throw InputMismatch exeption
}
}