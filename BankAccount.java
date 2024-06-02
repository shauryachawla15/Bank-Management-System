// SHAURYA CHAWLA
// PROJECT-4 (FILE-1)

import java.util.*;

/**
 * This class defines the info of a bank account. It contains 
 * the minimum balance that an account has, the owner's first 
 * and last name, account number, and balance.
 * 
 * @version December 11, 2020
 * @author Wenshen Zhong
 */
public class BankAccount implements Comparable<BankAccount> {
	public final double MINIMUM = 500.00;
	private String firstName;
	String lastName;
	int accountNumber;
	double balance;

	public BankAccount() {

	}

	/**
	 * Constructs a bank account object with given info
	 * @param firstName Owner's first name.
	 * @param lastName Owner's last name.
	 * @param accountNumber Account number.
	 * @param balance Current balance.
	 */
	BankAccount(String firstName, String lastName, int accountNumber, double balance) {
		// regular constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	/**
	 * Returns the String that contains all info of a bank account.
	 */
	public String toString() {

		String output = String.format("%10s%10s%12s%d%10s%10.2f", firstName, lastName, ": Account Number ",
				accountNumber, " Balance: ", balance);

		// return firstName + " "+ lastName+ ": Account Number "+accountNumber+ "
		// Balance: "+balance;
		return output;
	}

	/**
	 * Deposit a certain amount of money to an account.
	 * @param amount Deposit amount.
	 */
	public void deposit(double amount) {
		// deposit amount
		// if amount is negative throw InputMismatch Exception
		if(amount < 0) {
			System.err.println("Cannot deposit negative amount.");
			throw new InputMismatchException();
		}
		else
			balance += amount;

	}

	/**
	 * Returns the account number of an account.
	 * @return The account number.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Returns an int that indicates if an account number is 
	 * smaller, greater, or equal to another.
	 * @param other The other bank account for comparison.
	 */
	public int compareTo(BankAccount other) {
		// implement this method to compare two bank account numbers, from this and
		// other
		if(accountNumber > other.accountNumber)
			return 1;
		else if(accountNumber < other.accountNumber)
			return -1;
		else if(accountNumber == other.accountNumber)
			return 0;
		else
			return -1;
	}

	/**
	 * Returns the first name of the account holder.
	 * @return Owner's first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Withdraws (subtracts) a certain amount of money from 
	 * a bank account.
	 * @param amount Amount of withdrawal.
	 */
	public void withdraw(double amount) {
		// if amount withdrawn leaves less than minimum throw InputMismatch exeption
		if((balance - amount) < MINIMUM) {
			System.err.println("Cannot withdraw: Balance under Minimum.");
			throw new InputMismatchException();
		}
		else
			balance -= amount;
	}
}