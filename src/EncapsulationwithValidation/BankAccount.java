package EncapsulationwithValidation;

 class BankAccount {
     private int balance;
     public void setbalance(int amount){
         if(amount > 0){
             balance=amount;
         }
     }

     public int getBalance(){
         return balance;
     }

     public static void main(String[] args) {
         BankAccount account= new BankAccount();
         account.setbalance(50000);
         System.out.println(account.getBalance());
     }
}
