package ATMSystem;

public class ATM {
    private int balance=10000;

    public void withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
        }
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.withdraw(2000);
        System.out.println(atm.getBalance());
    }
}

//
//i have made a project i.e on enacpsulation various diffrent types of program i have made in it so now you have to
//  go through whole project first understand it i will give you its theory after wards you have to wirte a
//  comprehensive readmefile with explaining all things in it like what is in project thyere are 10 programs you have
//  to explauin in read me file it should be self explanatory even new one should understand it ,this is my file
//  location:C:\Users\Sarthak\OneDrive\Desktop\JAVA Training Capg\OOPs Concept\Encapsulation\Encapsulation and thi is
//  github location https://github.com/sarthakpawar0912/OOP-Encapsulation.git and this is thoery 1️⃣ WHAT IS
//  ENCAPSULATION?
//  📌 Definition
//
//  Encapsulation means wrapping data (variables) and methods together into a single unit, and hiding the data from
//  outside access.
//
//  👉 In Java, encapsulation is achieved using:
//
//  private variables
//
//  public getters & setters
//
//  2️⃣ REAL-LIFE EXAMPLE (Indian Context 🇮🇳)
//
//  🏦 ATM Machine
//
//  You cannot directly access balance
//
//  You use ATM options (withdraw, check balance)
//
//  👉 Balance = private
//  👉 ATM options = public methods
//
//  3️⃣ WHY DO WE NEED ENCAPSULATION?
//
//  Without encapsulation ❌:
//
//  account.balance = -10000; // dangerous
//
//
//  With encapsulation ✅:
//
//  account.setBalance(10000);
//
//
//  ✔ Prevents wrong data
//  ✔ Improves security
//  ✔ Controls access
//
//  4️⃣ FEATURES OF ENCAPSULATION
//
//  Data hiding
//
//  Controlled access
//
//  Improves security
//
//  Improves maintainability
//
//  Supports modularity
//
//  5️⃣ HOW ENCAPSULATION IS IMPLEMENTED?
//  Steps:
//
//  1️⃣ Declare variables as private
//  2️⃣ Provide public getter & setter methods
//
//  6️⃣ ADVANTAGES OF ENCAPSULATION
//
//  ✅ Data🧠 IMPORTANT INTERVIEW POINTS
//
//  ✔ Encapsulation = data hiding + abstraction
//  ✔ Use private + getter/setter
//  ✔ Improves security
//  ✔ Foundation of Spring Boot entities Explanation
//
//  pass is private
//
//  No getter → cannot read password
//
//  Used for passwords, PINs, security keys
//
//  🔐 IMPORTANT INTERVIEW NOTE
//  Type    Getter    Setter
//  Read-Only    ✅ Yes    ❌ No
//  Write-Only    ❌ No    ✅ Yes
//  Read-Write    ✅ Yes    ✅ Yes