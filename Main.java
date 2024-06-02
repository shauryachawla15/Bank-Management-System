// SHAURYA CHAWLA
// PROJECT-4 ( FILE-4)

import java.io.*;
import java.util.*;

/**
 * The main class for the bank project (Project 4). Contains a 
 * main method for testing all functionalities.
 * 
 * @version December 11, 2020
 * @author Wenshen Zhong
 */
class Main {
	public static void main(String[] args) {
		// create a new bank called Wells Fargo
		Bank wellsFargo = new Bank("Wells Fargo");
		// populate the bank with bank account objects read from the file
		populateBankDataBase(wellsFargo);
		// make a copy of this unsorted bank account arraylist
		Bank copy = new Bank("Copy of WellsFargo");

		wellsFargo.backup(copy);
		// make another copy of the unsorted wellsfargo bank
		Bank anotherCopy = new Bank("Another Copy of WellsFargo");
		wellsFargo.backup(anotherCopy);
		// use bubble sort to sort the wells fargo bank
		// all sorts are based on account number
		int timesBubble = wellsFargo.bubbleSort();
		System.out.println(wellsFargo.toString());
		// print the number of swaps
		System.out.println("The number of swaps for bubble sort was " + timesBubble);
		// use selection sort to sort the copy of wells fargo
		int timesSelection = copy.selectionSort();
		System.out.println(copy.toString());
		// print the number of swaps for this sort
		System.out.println("The number of swaps for selection sort was " + timesSelection);

		// use the JAva Collections sort by passing a AutoNamesCompare object

		anotherCopy.nameSort();
		System.out.println(anotherCopy.toString());

		// search for an existing account 1201
		searchAccount(wellsFargo);
		// search for a non exisiting account 1200
		searchAccount(copy);

		// test the withdraw and deposit methods
		int number = getAccountNumber();
		int found = wellsFargo.recursiveBinarySearch(number);
		if (found >= 0) {
			wellsFargo.get(found).deposit(1000);
			wellsFargo.get(found).withdraw(1);
			wellsFargo.get(found).withdraw(1000);
			wellsFargo.get(found).deposit(-1000);

		}

	}

	/**
	 * Read the bank account information line by line (there is one account
	 * per line), create a bank account object for each account, and add teh
	 * bank account to the bank.
	 * @param b A bank to add accounts to.
	 */
	public static void populateBankDataBase(Bank b){

    	try{
       // read the bank account information line by line (there is one account per line)
       // create a bank account object for each account 
       // add the bank account to the bank 
			Scanner read = new Scanner(new File("BankData.txt"));
			while(read.hasNextLine()) {
				String firstName = read.next();
				String lastName = read.next();
				int accountNumber = read.nextInt();
				double balance = read.nextDouble();
				BankAccount account = new BankAccount(firstName, lastName, accountNumber, balance);
				b.add(account);
			}
			read.close();
        
    	} catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File BankData.txt open error ");
		}

	}

	/**
	 * Prompts the user to enter an account number.
	 * @return Account number input by user.
	 */
	public static int getAccountNumber() {
		System.out.print("What is the account number ? ");
		Scanner console = new Scanner(System.in);
		return console.nextInt();
	}

	/**
	 * Searchs for an account of a given account number in a bank.
	 * @param b The bank to search in.
	 */
	public static void searchAccount(Bank b) {
		int accountNumber = getAccountNumber();
		int num = b.recursiveBinarySearch(accountNumber);
		if (num >= 0)
			System.out.println(b.get(num).toString());
		else
			System.out.println("Account Does Not Exist");
	}

}