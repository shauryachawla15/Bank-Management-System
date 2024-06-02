// SHAURYA CHAWLA
// PROJECT-4 (FILE-2)

import java.util.*;

/**
 * This class defines the structure of a bank that holds 
 * bank accounts. Including the bank's name.
 * 
 * @version December 11, 2020
 * @author Wenshen Zhong
 */
public class Bank implements Comparator {
	private

	String bankName = "";

	ArrayList<BankAccount> bank = null;

	/**
	 * Constructs a bank containing bank accounts.
	 * @param bankName Name of the bank.
	 */
	public Bank(String bankName) {                                            
		this.bankName = bankName;
		bank = new ArrayList<BankAccount>();
	}

	/**
	 * Adds a bank account to a bank.
	 * @param a Bank account to be added.
	 */
	public void add(BankAccount a) {
		bank.add(a);
	}

	/**
	 * Bobble sort algorithm.
	 * @return The number of swaps.
	 */
	public int bubbleSort() {
		int times = 0;
		int i = 0;
		boolean swap = true;
		int number = bank.size();

		while ((i < number - 1) && swap) {
			swap = false;
			for (int j = i + 1; j < number; j++)
				if (bank.get(i).compareTo(bank.get(j)) > 0) {
					swapEm(i, j);
					swap = true;
					times++;
				}

			i++;

		}
		return times;
	}

	/**
	 * Swap the bank accounts based on the sorting result.
	 * @param i First bank account.
	 * @param j Second bank account.
	 */
	public void swapEm(int i, int j) {
		BankAccount temp1 = bank.get(i);
		BankAccount temp2 = bank.get(j);
		bank.remove(i);
		bank.add(i, temp2);
		bank.remove(j);
		bank.add(j, temp1);
	}

	/**
	 * Selection sort algorithm.
	 * @return The number of swaps.
	 */
	public int selectionSort() {
		int times = 0;
		int i = 0;
		int number = bank.size();
		boolean swap = true;
		int minValue = 0, minIndex = 0;
		while (i < number - 1 && swap) {
			minIndex = i;
			swap = false;
			minValue = bank.get(i).getAccountNumber();
			for (int j = i + 1; j < number; j++) {
				if (bank.get(j).getAccountNumber() < minValue) {
					swap = true;
					minIndex = j;
					minValue = bank.get(j).getAccountNumber();
				}
			}
			if (swap) {
				swapEm(i, minIndex);
				times++;
			}
			i++;
		}
		return times;
	}

	/**
	 * Returns a String containing all info of a bank.
	 */
	public String toString() {
		String output = "\n" + bankName + "\n";
		for (int i = 0; i < bank.size(); i++)
			output = output + bank.get(i).toString() + "\n";
		return output;
	}

	/**
	 * Recursive binary search algorithm for bank accounts, based
	 * on the account numbers.
	 * @param accountNumber Target account number.
	 * @param first Index of the first element to search.
	 * @param last Index of the last element to search.
	 * @return
	 */
	public int recursiveBinarySearch(int accountNumber, int first, int last) {
		if (first > last)
			return -1;
		int middle = (first + last) / 2;
		if (accountNumber == bank.get(middle).getAccountNumber())
			return middle;
		else if (accountNumber > bank.get(middle).getAccountNumber())
			return recursiveBinarySearch(accountNumber, middle + 1, last);
		else
			return recursiveBinarySearch(accountNumber, first, last - 1);
	}

	public int recursiveBinarySearch(int accountNumber) {

		return recursiveBinarySearch(accountNumber, 0, bank.size() - 1);

	}

	/**
	 * Sorts the list of bank account based on the owner's names.
	 */
	public void nameSort() {
		Collections.sort(bank, new AccountCompareNames());
	}

	/**
	 * Returns the bank account object at index i
	 * @param i Index.
	 * @return A bank account object at index i.
	 */
	public BankAccount get(int i) {
		return bank.get(i);
	}

	/**
	 * THe list of bank accounts. (Bank)
	 * @return The bank Arraylist.
	 */
	private ArrayList<BankAccount> getAccounts() {
		return bank;
	}

	public void backup(Bank other) {
		for (int i = 0; i < bank.size(); i++)
			other.add(bank.get(i));
		// Collections.copy(bank,other.getAccounts());
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}