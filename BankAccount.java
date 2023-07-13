class BankAccount{
 //balance
 //credit , debit
 
 static double balance;
 static int amount;

 public static boolean credit(int amount){
 boolean isCredited = false;
 //System.out.println("Invoking credit()");
 if(amount > 0){
 balance = balance + amount;
 isCredited = true;
 System.out.println("the current balance is "+ balance);
 }

 //System.out.println("End of credit()");
  return isCredited;
 }
 
  public static boolean debit(int amount){
  boolean isDebited = false;
 //System.out.println("Invoking debit()");
 if(amount <= balance){
 balance = balance - amount;
 isDebited = true;
 System.out.println("the current balance is "+ balance);
 }

 //System.out.println("End of debit()");
  return isDebited;
 }
 
 public static double getBalance(){
	 return balance; 
 }
 
}