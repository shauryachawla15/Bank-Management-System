import java.util.*;
public class Bank implements Comparator{ 
  private

  String bankName="";

  ArrayList<BankAccount> bank=null;

  public Bank(String bankName){
    this.bankName=bankName;
    bank= new ArrayList<BankAccount>();
  }

  public void add(BankAccount a){
    bank.add(a);
  }
  public int bubbleSort(){
    int times=0;
    int i=0;
    boolean swap=true;
    int number = bank.size();
   
    while ((i<number-1)&&swap){
      swap=false;
      for (int j=i+1;j<number;j++)
        if (bank.get(i).compareTo(bank.get(j))>0){
           swapEm(i,j);
           swap=true;
           times++;
           }

     i++;

    }
    return times;
  }
  public void swapEm(int i, int j){
    BankAccount temp1=bank.get(i);
    BankAccount temp2 = bank.get(j);
    bank.remove(i);
    bank.add(i,temp2);
    bank.remove(j);
    bank.add(j,temp1);
  }
  public int selectionSort(){
    int times=0;
    int i=0;
    int number = bank.size();
    boolean swap=true;
    int minValue=0,minIndex=0;
    while (i<number-1&&swap){
      minIndex=i;
       swap=false;
      minValue=bank.get(i).getAccountNumber();
      for (int j=i+1;j<number;j++){
        if (bank.get(j).getAccountNumber()<minValue){
          swap=true;
          minIndex=j;
          minValue=bank.get(j).getAccountNumber();
        }
      }
      if(swap) {
        swapEm(i,minIndex);
        times++;
      }
      i++;
    }
    return times;
  }
  public String toString(){
    String output = "\n"+bankName+"\n";
    for (int i= 0;i<bank.size();i++)
      output = output + bank.get(i).toString()+"\n";
    return output;
  }
  public int recursiveBinarySearch(int accountNumber, int first, int last){
    if (first>last) return -1;
    int middle= (first+last)/2;
    if (accountNumber== bank.get(middle).getAccountNumber())
      return middle;
    else if (accountNumber> bank.get(middle).getAccountNumber())
      return recursiveBinarySearch(accountNumber, middle+1,last);
    else 
       return recursiveBinarySearch(accountNumber, first,last-1);
  }
  public int recursiveBinarySearch(int accountNumber){

    return recursiveBinarySearch(accountNumber,0,bank.size()-1);
    
  }
  public void nameSort(){
    Collections.sort(bank,new AccountCompareNames());
  }
  
  public BankAccount get(int i){
    return bank.get(i);
  }
  private ArrayList<BankAccount> getAccounts(){
    return bank;
  }
  public void backup(Bank other){
    for (int i=0;i<bank.size();i++)
      other.add(bank.get(i));
   //Collections.copy(bank,other.getAccounts());
  }
}