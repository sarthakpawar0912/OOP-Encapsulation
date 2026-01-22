# Java Encapsulation - Complete Learning Guide

A comprehensive Java project demonstrating **Encapsulation** - one of the four fundamental OOP concepts. This repository contains 10 practical programs covering different aspects of encapsulation.

---

## Table of Contents

1. [What is Encapsulation?](#what-is-encapsulation)
2. [Why Do We Need Encapsulation?](#why-do-we-need-encapsulation)
3. [How to Implement Encapsulation](#how-to-implement-encapsulation)
4. [Project Structure](#project-structure)
5. [Programs Explained](#programs-explained)
6. [Types of Encapsulation Access](#types-of-encapsulation-access)
7. [Key Interview Points](#key-interview-points)
8. [How to Run](#how-to-run)

---

## What is Encapsulation?

**Encapsulation** means wrapping data (variables) and methods together into a single unit (class), and **hiding the data from outside access**.

In Java, encapsulation is achieved using:
- **`private` variables** - to hide the data
- **`public` getter & setter methods** - to provide controlled access

### Real-Life Example (ATM Machine)

Think of an **ATM Machine**:
- You **cannot directly access** the bank's balance database
- You **use ATM options** (withdraw, check balance) to interact with your money

```
Balance      = private (hidden from direct access)
ATM Options  = public methods (controlled access)
```

---

## Why Do We Need Encapsulation?

### Without Encapsulation (Dangerous!)
```java
account.balance = -10000;  // Anyone can set invalid data!
```

### With Encapsulation (Safe!)
```java
account.setBalance(10000);  // Controlled access with validation
```

### Benefits:
| Benefit | Description |
|---------|-------------|
| **Data Hiding** | Internal data is hidden from outside world |
| **Controlled Access** | Access only through defined methods |
| **Security** | Prevents unauthorized data manipulation |
| **Maintainability** | Easy to modify internal implementation |
| **Modularity** | Each class manages its own data |

---

## How to Implement Encapsulation

### Step 1: Declare variables as `private`
```java
private int balance;
```

### Step 2: Provide `public` getter and setter methods
```java
public int getBalance() {
    return balance;
}

public void setBalance(int amount) {
    if (amount > 0) {
        balance = amount;
    }
}
```

---

## Project Structure

```
Encapsulation/
├── src/
│   ├── BasicEncapsulation/
│   │   └── Student.java           # 1. Basic getter/setter
│   ├── EncapsulationwithValidation/
│   │   └── BankAccount.java       # 2. Encapsulation with validation
│   ├── ReadOnlyData/
│   │   └── Aadhaar.java           # 3. Read-only data example
│   ├── WriteOnlyData/
│   │   └── Password.java          # 4. Write-only data (security)
│   ├── EmployeeSalaryProtection/
│   │   └── Employee.java          # 5. Salary with minimum validation
│   ├── LoginSystem/
│   │   └── Login.java             # 6. Authentication system
│   ├── StudentAdmissionSystem/
│   │   └── Admission.java         # 7. Admission eligibility check
│   ├── EncapsulationwithConstructor/
│   │   └── Student.java           # 8. Using constructor for initialization
│   ├── ProductManagement/
│   │   └── Product.java           # 9. Product management system
│   └── ATMSystem/
│       └── ATM.java               # 10. Real-world ATM simulation
└── README.md
```

---

## Programs Explained

### Program 1: Basic Encapsulation (`BasicEncapsulation/Student.java`)

**Concept:** Simple implementation of getter and setter methods.

```java
class Student {
    private int roll;          // Private variable - hidden from outside

    public int getRoll() {     // Getter - to read the value
        return roll;
    }

    public void setRoll(int roll) {  // Setter - to write the value
        this.roll = roll;
    }
}
```

**How it works:**
1. `roll` is **private** - cannot be accessed directly as `student.roll`
2. `getRoll()` allows reading the roll number
3. `setRoll()` allows setting the roll number

**Output:** `10`

---

### Program 2: Encapsulation with Validation (`EncapsulationwithValidation/BankAccount.java`)

**Concept:** Adding validation logic inside setter to prevent invalid data.

```java
class BankAccount {
    private int balance;

    public void setbalance(int amount) {
        if (amount > 0) {          // Validation: only positive amounts
            balance = amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
```

**How it works:**
1. Balance can only be set if `amount > 0`
2. Negative amounts are **rejected automatically**
3. This prevents scenarios like `balance = -10000`

**Output:** `50000`

---

### Program 3: Read-Only Data (`ReadOnlyData/Aadhaar.java`)

**Concept:** Data that can only be read, not modified from outside.

```java
public class Aadhaar {
    private String number = "1234-5678-9012";  // Initialized once

    public String getNumber() {     // Only getter provided
        return number;
    }
}
```

**How it works:**
1. Aadhaar number is **pre-set** and should not change
2. Only **getter** is used to read the value
3. **No setter** means no one can change the Aadhaar number

**Real-world use:** Aadhaar Card, PAN Card, Date of Birth

**Output:** `Aadhar Number: 1234-5678-9012`

---

### Program 4: Write-Only Data (`WriteOnlyData/Password.java`)

**Concept:** Data that can only be written/set, never read back.

```java
public class Password {
    private String pass;

    public void setPass(String p) {    // Only setter - NO getter
        pass = p;
        System.out.println("Password set Successfully");
    }
}
```

**How it works:**
1. Password is set using `setPass()`
2. **No getter method** - password cannot be retrieved
3. Provides maximum security for sensitive data

**Real-world use:** Passwords, PINs, Security Keys, OTPs

**Output:** `Password set Successfully`

---

### Program 5: Employee Salary Protection (`EmployeeSalaryProtection/Employee.java`)

**Concept:** Protecting salary with minimum wage validation.

```java
public class Employee {
    private double salary;

    public void setSalary(double s) {
        if (s >= 10000) {          // Minimum salary validation
            salary = s;
        }
    }

    public double getSalary() {
        return salary;
    }
}
```

**How it works:**
1. Salary must be **at least 10,000**
2. Any value below minimum wage is rejected
3. Protects employees from underpayment

**Output:** `100000.0`

---

### Program 6: Login System (`LoginSystem/Login.java`)

**Concept:** Secure authentication without exposing credentials.

```java
public class Login {
    private String username = "admin";    // Hidden credentials
    private String password = "1234";

    public boolean authenticate(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}
```

**How it works:**
1. `username` and `password` are **private** - cannot be accessed directly
2. **No getters** for credentials - they stay hidden
3. `authenticate()` method verifies without exposing the actual values
4. Returns `true` if credentials match, `false` otherwise

**Output:** `true`

---

### Program 7: Student Admission System (`StudentAdmissionSystem/Admission.java`)

**Concept:** Encapsulation with business logic for admission eligibility.

```java
public class Admission {
    private int marks;

    public void setmatrks(int m) {
        if (m >= 0 && m <= 100) {    // Valid marks range
            marks = m;
        }
    }

    public void check() {
        if (marks >= 70) {
            System.out.println("Admission granted");
        } else {
            System.out.println("Admission Rejected");
        }
    }
}
```

**How it works:**
1. Marks are validated to be between **0 and 100**
2. `check()` method determines admission based on marks
3. **70+ marks** = Admission granted
4. **Below 70** = Admission rejected

**Output:** `Admission granted` (for marks = 88)

---

### Program 8: Encapsulation with Constructor (`EncapsulationwithConstructor/Student.java`)

**Concept:** Initializing private data through constructor instead of setter.

```java
public class Student {
    private int roll;

    Student(int r) {           // Constructor for initialization
        roll = r;
    }

    public int getRoll() {     // Only getter - read-only after creation
        return roll;
    }
}
```

**How it works:**
1. Roll number is set **only once** during object creation
2. No setter method - value cannot be changed later
3. Makes the object **immutable** after creation
4. Useful for data that should not change (IDs, registration numbers)

**Output:** `5`

---

### Program 9: Product Management (`ProductManagement/Product.java`)

**Concept:** Managing multiple private fields with combined setter.

```java
public class Product {
    private String name;
    private int price;

    public void setProduct(String n, int p) {  // Combined setter
        name = n;
        price = p;
    }

    public void show() {
        System.out.println(name + " Rs. " + price);
    }
}
```

**How it works:**
1. Both `name` and `price` are **private**
2. `setProduct()` sets both values together
3. `show()` displays product details
4. External code cannot directly manipulate name or price

**Output:** `Mobile Rs. 15000`

---

### Program 10: ATM System (`ATMSystem/ATM.java`)

**Concept:** Real-world ATM simulation demonstrating encapsulation.

```java
public class ATM {
    private int balance = 10000;       // Hidden balance

    public void withdraw(int amount) {
        if (amount <= balance) {       // Validation: sufficient balance
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
```

**How it works:**
1. `balance` is **private** - no direct access
2. `withdraw()` deducts money only if sufficient balance exists
3. `getBalance()` allows checking balance
4. **No setBalance()** - balance can only change through valid operations

**Workflow:**
```
Initial Balance: 10000
Withdraw: 2000
Final Balance: 8000
```

**Output:** `8000`

---

## Types of Encapsulation Access

| Type | Getter | Setter | Example | Use Case |
|------|--------|--------|---------|----------|
| **Read-Only** | Yes | No | Aadhaar.java | IDs, DOB, Constants |
| **Write-Only** | No | Yes | Password.java | Passwords, PINs, OTPs |
| **Read-Write** | Yes | Yes | Student.java | General data fields |

---

## Key Interview Points

1. **What is Encapsulation?**
   - Wrapping data and methods together
   - Hiding data using `private` keyword
   - Providing access through `public` getter/setter

2. **Encapsulation vs Abstraction**
   - Encapsulation = **Data hiding** (HOW it's hidden)
   - Abstraction = **Implementation hiding** (WHAT is shown)

3. **Why use Encapsulation?**
   - Security - prevents unauthorized access
   - Validation - controls what data goes in
   - Flexibility - internal changes don't affect external code

4. **Real-world Examples**
   - ATM Machine (balance is private)
   - Aadhaar Card (number is read-only)
   - Login Systems (credentials are hidden)

5. **Spring Boot Connection**
   - Entity classes use encapsulation
   - All fields are `private`
   - Lombok's `@Getter` `@Setter` generates methods

---

## How to Run

### Prerequisites
- Java JDK 8 or higher
- Any IDE (IntelliJ IDEA, Eclipse, VS Code)

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/sarthakpawar0912/OOP-Encapsulation.git
   ```

2. **Open in IDE**
   - Open the project folder in your preferred IDE

3. **Run any program**
   - Navigate to the desired package
   - Run the `main()` method in any Java file

### Example:
```bash
cd src
javac BasicEncapsulation/Student.java
java BasicEncapsulation.Student
```

---

## Summary Table

| # | Program | Package | Key Concept |
|---|---------|---------|-------------|
| 1 | Student.java | BasicEncapsulation | Basic getter/setter |
| 2 | BankAccount.java | EncapsulationwithValidation | Validation in setter |
| 3 | Aadhaar.java | ReadOnlyData | Read-only access |
| 4 | Password.java | WriteOnlyData | Write-only (security) |
| 5 | Employee.java | EmployeeSalaryProtection | Minimum value validation |
| 6 | Login.java | LoginSystem | Hidden credentials |
| 7 | Admission.java | StudentAdmissionSystem | Business logic encapsulation |
| 8 | Student.java | EncapsulationwithConstructor | Constructor initialization |
| 9 | Product.java | ProductManagement | Multiple fields management |
| 10 | ATM.java | ATMSystem | Real-world simulation |

---

## Author

**Sarthak Pawar**

---

## License

This project is for educational purposes. Feel free to use and modify for learning.
