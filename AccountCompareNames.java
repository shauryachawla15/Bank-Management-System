// SHAURYA CHAWLA
// PROJECT-4 (FILE-3)

import java.util.*;

/**
 * This class defines the compare method that's used to compare
 * the first names of the owners of two different bank accounts.
 * 
 * @version December 11, 2020
 * @author Wenshen Zhong
 */
public class AccountCompareNames implements Comparator<BankAccount> {

    // implementIing the compare method

    @Override
    public int compare(BankAccount a, BankAccount b) {
        String nameA = a.getFirstName();
        String nameB = b.getFirstName();

        return nameA.compareTo(nameB);  // compareTo returns a positive/negative number based on the names' order.
    }
    

}
