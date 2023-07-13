class BankAccountTester{
   
   public static void main(String account[]){
   System.out.println("Main started");
   
   BankAccount.credit(20000);
   double currentBalance1 = BankAccount.getBalance();
   System.out.println(currentBalance1);
   BankAccount.debit(300);
   double currentBalance2 = BankAccount.getBalance();// to display values
   System.out.println(currentBalance2);
  
   BankAccount.credit(12000);
   System.out.println(BankAccount.getBalance());
   System.out.println(BankAccount.credit(1000));
   BankAccount.debit(200);
   System.out.println(BankAccount.getBalance());
   System.out.println("Main ended");
  
   }

}

