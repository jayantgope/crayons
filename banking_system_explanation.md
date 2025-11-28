# 🧒📘 **Explaining the Java Program in a Simple Way (10th Class Level)**

## 🎯 **First: What is Java?**

Java is a **programming language** used to create applications — like mobile apps, desktop apps, games, ATM software, banking software, etc.

Java is popular because:

* It is **easy to read**
* It is **secure**
* It works on **any computer** ("Write once, run anywhere")
* It uses **OOP** (Object-Oriented Programming) — a way of organizing code like real-life objects

---

# 🧩 **Important Java Terms (Explained Simply)**

### ✔️ **Class**

A *class* is like a **blueprint**.

Example:
*"BankAccount"* is a class — it tells how a bank account should look and behave.

### ✔️ **Object**

An **object** is something created using a class.
Example: Your own bank account created from the “BankAccount” blueprint.

### ✔️ **Methods**

Methods are **actions** that objects can do.

Example:

* `deposit()` → add money
* `withdraw()` → take money
* `checkBalance()` → show balance

### ✔️ **Variables**

Variables store **information**.

Example:

* `name` → account owner’s name
* `accountNumber` → unique number
* `balance` → money in account

### ✔️ **Constructor**

A constructor is a **special method** used to create an object.

---

# 🏦 **Understanding the Banking Program**

## 1️⃣ **BankAccount Class**

```java
class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;
```

* Every account has a **name**, **account number**, and **balance**.
* `private` means nobody outside the class can directly change these values → this keeps data safe.

### Constructor

```java
public BankAccount(String name, int accountNumber) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = 0.0;
}
```

When a new account is created:

* Name is stored
* Account number is stored
* Balance is set to **0**

---

## 2️⃣ **Deposit Method**

```java
public void deposit(double amount) {
    balance = balance + amount;
    System.out.println("₹" + amount + " deposited successfully.");
}
```

This takes an amount and adds it to balance.

---

## 3️⃣ **Withdraw Method**

```java
if (amount <= balance) {
    balance = balance - amount;
}
```

Withdraws only if enough balance is available.

---

## 4️⃣ **Check Balance**

Simply prints current balance.

---

# 🖥️ **Main Class: BankingSystem**

This is where the **program runs**.

```java
static BankAccount[] accounts = new BankAccount[100];
```

* We can store up to **100 accounts**
* `totalAccounts` keeps count

---

## 📌 The Menu System

The program shows:

```
1. Create New Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Check Total Accounts
6. Exit
```

This *loop continues* until the user presses **6**.

---

# 🧠 **Important Concepts Explained Simply**

### 👉 Scanner

```java
Scanner sc = new Scanner(System.in);
```

Used to take input from the keyboard — like typing your name or account number.

---

## 🔍 **Finding an Account**

Whenever you deposit or withdraw, you must enter your account number.

```java
public static BankAccount findAccount(int accNo)
```

This checks the list of accounts and finds the matching one.

---

# 🧾 **Flow of How the Program Works**

### ✔️ Step 1: Create Account

You enter name → program creates account number → balance starts at 0

### ✔️ Step 2: Deposit Money

You enter account number → enter amount → amount gets added

### ✔️ Step 3: Withdraw Money

Program checks if money is available
If yes → withdraw
If no → shows “Insufficient balance”

### ✔️ Step 4: Check Balance

Program prints your current balance

---

# 🧒✨ **Explaining in a Real-Life Example**

Imagine a bank with 100 empty lockers.
Each time a new customer comes:

* A locker (account) is created
* Customer’s name and number are written
* When money is added → balance increases
* When money is taken → balance decreases
* At any time, customer can check how much is inside

Java is used to **simulate** this exact real-life behavior in the computer.

---

# 🏁 **Conclusion**

This Java program teaches:

✔️ How classes and objects work
✔️ How to use methods (deposit, withdraw, check balance)
✔️ How to use loops and menu-driven programs
✔️ How to store multiple objects using arrays
✔️ How to take user input

It is a very good beginner-level example to understand **Object-Oriented Programming (OOP)**.

---

If you want, I can also:

✅ Convert this explanation into a **PDF**
✅ Create a **diagram or flowchart**
✅ Create a **simplified version** of the program
✅ Provide a **practice worksheet** for students

Just tell me!
