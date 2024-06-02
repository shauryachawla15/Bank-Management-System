import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    // create a new bank called Wells Fargo
      Bank wellsFargo  = new Bank("Wells Fargo");
      // populate the bank with bank account objects read from the file
      populateBankDataBase(wellsFargo);
      // make a copy of this unsorted bank account arraylist
      Bank copy = new Bank("Copy of WellsFargo");
    
      wellsFargo.backup(copy);
      //make another copy of the unsorted wellsfargo bank
      Bank anotherCopy = new Bank("Another Copy of WellsFargo");
      wellsFargo.backup(anotherCopy);
      // use bubble sort to sort the wells fargo bank 
      // all sorts are based on account number
      int timesBubble= wellsFargo.bubbleSort();
      System.out.println(wellsFargo.toString());
      //print the number of swaps
      System.out.println("The number of swaps for bubble sort was "+timesBubble);
      // use selection sort to sort the copy of wells fargo
      int timesSelection =copy.selectionSort();
      System.out.println(copy.toString());
      // print the number of swaps for this sort
      System.out.println("The number of swaps for selection sort was "+timesSelection);

      // use the JAva Collections sort  by passing a AutoNamesCompare object

      anotherCopy.nameSort();
      System.out.println(anotherCopy.toString());

      // search for an existing account 1201
      searchAccount(wellsFargo);
      //search for a non exisiting account 1200
     searchAccount(copy);

     //test the withdraw and deposit methods
     int number = getAccountNumber();
     int found =b.recursiveBinarySearch(number);
     if (found>=0){
    // bank.get(found.deposit(1000)); test this
    //bank.get(found.withdraw(1)); test this
    // bank.get(found).withdraw(1000);  test this
    // bank.get(found).deposit(-1000);  test this
   
     }

   

  }
  public static void populateBankDataBase(Bank b){

      try{
       // read the bank account information line by line (there is one account per line)
       // create a bank account object for each account 
       // add the bank account to the bank 

        }
      }
      catch(FileNotFoundException e){
        System.out.println("File BankData.txt open error ");
      }
    
  }
  public static int getAccountNumber(){
    System.out.print("What is the account number ? ");
    Scanner console = new Scanner(System.in);
    return console.nextInt();
  }
  public static void searchAccount(Bank b){
    int accountNumber =getAccountNumber();
    int num = b.recursiveBinarySearch(accountNumber);
    if (num>=0)
        System.out.println(b.get(num).toString());
    else
      System.out.println("Account Does Not Exist");
  }

}