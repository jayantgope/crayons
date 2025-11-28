# Java Banking System -- Detailed Explanation for 10th Class Students

## 🌟 Introduction to Java

Java is a powerful, high-level programming language used worldwide to
build applications like: - Mobile apps - Web services - Games - Banking
systems - Desktop applications

Java is popular because: - It is easy to understand - It is secure - It
works on any operating system: Windows, Linux, or Mac - It uses
Object-Oriented Programming (OOP), which helps organize code like
real-world objects

------------------------------------------------------------------------

# 🧠 1. Java Basics

## ✔️ Syntax

Syntax means the *rules* of writing code.\
Examples: - `;` ends a statement\
- `{ }` groups statements\
- `class` defines a blueprint\
- `public`, `private` control access\
- `int`, `double`, `String` are data types

------------------------------------------------------------------------

# 🧩 2. Key Java Concepts

## ✔️ Class

A class is a **blueprint** or **template**.\
Example: `BankAccount` class shows how every bank account should look.

## ✔️ Object

An object is something built from a class.\
Example: Your personal bank account created using the `BankAccount`
blueprint.

## ✔️ Variables

Variables store information: - `String name` → stores text\
- `int accountNumber` → whole number\
- `double balance` → decimal value

## ✔️ Methods

Methods are **actions** objects can do: - deposit()\
- withdraw()\
- checkBalance()

## ✔️ Constructor

A constructor helps create an object and set initial values.

------------------------------------------------------------------------

# 🏦 3. BankAccount Class Explained

``` java
class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;
}
```

This class models a **real bank account**.\
- Name: Account holder\
- Account Number: Unique ID\
- Balance: Stored money

### Constructor

``` java
public BankAccount(String name, int accountNumber) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = 0.0;
}
```

This sets: - Account holder name\
- Account number\
- Balance = 0

### deposit()

``` java
public void deposit(double amount) {
    balance = balance + amount;
}
```

Adds money to the account.

### withdraw()

``` java
if (amount <= balance) {
    balance = balance - amount;
}
```

Only withdraws if balance is enough.

### checkBalance()

Prints current balance.

------------------------------------------------------------------------

# 📘 4. Main Program -- BankingSystem Class

This class controls the entire banking system.

### Storing Accounts

``` java
static BankAccount[] accounts = new BankAccount[100];
static int totalAccounts = 0;
```

The program can store up to **100 accounts**.

### Menu System

    1. Create New Account
    2. Deposit Money
    3. Withdraw Money
    4. Check Balance
    5. Check Total Accounts
    6. Exit

A loop keeps the program running until user chooses "Exit".

------------------------------------------------------------------------

# 🛠 5. How the Program Works (Step-by-Step)

## ✔️ Create Account

-   User enters name\
-   Program generates account number\
-   Balance starts at 0

## ✔️ Deposit Money

-   User enters account number\
-   Program finds the account\
-   Amount is added

## ✔️ Withdraw Money

-   User enters account number\
-   Program checks balance\
-   If enough money → withdraw\
-   Else → show error

## ✔️ Check Balance

Shows current balance.

## ✔️ Check Total Accounts

Shows how many accounts exist.

------------------------------------------------------------------------

# 🧍‍♂️ 6. Real-Life Example

Think of 100 lockers in a bank.

Each time a customer comes: 1. A locker number is assigned\
2. Their name is written\
3. They can put money (deposit)\
4. They can take money (withdraw)\
5. They can ask how much is left (check balance)

This program **simulates a real bank system** using Java.

------------------------------------------------------------------------

# 🏁 Final Conclusion

This Java program teaches: - Classes & Objects\
- Methods\
- Data hiding using `private`\
- User input using `Scanner`\
- Arrays\
- Loops\
- Decision making (`if-else`)\
- Real-world application using OOP

Perfect beginner example for students learning Java!
