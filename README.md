# Bank-Management-System
This is my Bank account management project, done in Java language. I built this when I was in my freshman year, in CSUS. It was a part of CSC-20 class( Programming Concepts and Methodology II).

CSC20 Programming Project 4


Create the following hierarchy of classes

1.	Create a class called BankAccount with the following UML diagram. BankAccount implements Comparable
                                                BankAccount
-String firstName
-String lastName
-double balance
-int accountNumber
+BankAccount(String firstName, String lastName, double balance int accountNumber)
setter methods
getter methods
toString method
+ deposit(double amount
+ compareTo(BankAccount other): int
+ withdraw(double amount)



2.	Create a class called Bank  that contains an arrayList of BankAccount objects. Bank also implements Comparable.
                                  Bank
-ArrayList<BankAccount>

+Bank(String bankName)
+add(BankAccount a)
+get(int i): BankAccount // returns BankAccount at index i
+bubbleSort(): int // use bubble sort algorithm to sort the bank database (returns number of swaps)
+selectionSort(): int // // use selection sort algorithm to sort the bank database (returns number of swaps)
+ nameSort()// use Collections.sort to sort the bank database according to name using AccountCompareNames object
+recursiveBinarySearch(): int // use recursive binary search algorithm to search the bank database (index of desired item or -1 if not found)

+toString() // returns the entire list of bank account objects in the bank database as a string

                      AccountCompareNames implements Comparator<BankAccount>
+ compare(BankAccount a, BankAccount b): int 
compares BankAccount a and b by comparing names and returns 0 for same, a positive number if a is lexicographically greater than b and a negative number if a is less than b



  Programming Guidance

1.	You are given the driver, write the classes that will make the output that is given below
2.	Write the BankAccount class using the method headers and comments
3.	Write the Bank class using the method headers and comments
4.	Write AccountCompareNames class
5.	Some methods are given to you.
Testing Output
![image](https://github.com/shauryachawla15/Bank-Management-System/assets/142179616/1cbb311d-09f9-432e-9c35-453d1f5dca5d)


 


Grading policies

1.	Comments/ JavaDoc is necessary for each class
2.	Indentation and good programming style
3.	Data validation/reading from a file using try catch exception handling
4.	Follow the assignment specifications as given


