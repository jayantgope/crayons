# Java Banking System - Detailed Explanation (For 10th Class Students)

## Introduction to Java

Java is a high-level programming language used to build mobile apps,
desktop applications, websites, and banking systems. It is secure, easy
to learn, and works on any computer platform.

------------------------------------------------------------------------

## Key Java Concepts

### 1. Syntax

Syntax is the set of rules that define how to write code in Java.\
Examples: - `;` ends a statement. - `{ }` define code blocks. - `class`
creates a blueprint for objects. - Data types like `int`, `double`,
`String`.

------------------------------------------------------------------------

### 2. Class

A class is a blueprint that defines the properties and behavior of an
object.\
Example:\
`BankAccount` is a class that defines: - name\
- account number\
- balance\
- actions like deposit, withdraw, check balance

------------------------------------------------------------------------

### 3. Object

An object is created from a class.\
Example: A real bank account created from the `BankAccount` class.

------------------------------------------------------------------------

### 4. Variables

Variables store data.\
Example: - `String name` - `int accountNumber` - `double balance`

------------------------------------------------------------------------

### 5. Methods

Methods are actions an object can perform.\
Example: - `deposit()` - `withdraw()` - `checkBalance()`

------------------------------------------------------------------------

### 6. Constructor

A constructor initializes objects. When a new account is created, it
sets: - name\
- account number\
- balance = 0

------------------------------------------------------------------------

## BankAccount Class Breakdown

### Variables

``` java
private String name;
private int accountNumber;
private double balance;
```

These store the account holder's details. `private` protects the data.

------------------------------------------------------------------------

### Constructor

``` java
public BankAccount(String name, int accountNumber) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = 0.0;
}
```

------------------------------------------------------------------------

### Deposit Method

``` java
public void deposit(double amount) {
    balance = balance + amount;
}
```

------------------------------------------------------------------------

### Withdraw Method

``` java
public void withdraw(double amount) {
    if (amount <= balance) {
        balance = balance - amount;
    }
}
```

------------------------------------------------------------------------

### Check Balance

``` java
public void checkBalance() {
    System.out.println("Current Balance: ₹" + balance);
}
```

------------------------------------------------------------------------

## BankingSystem Class Overview

The main class handles user interaction using a menu: - Create account\
- Deposit\
- Withdraw\
- Check balance\
- View total accounts\
- Exit

### Storing Accounts

``` java
static BankAccount[] accounts = new BankAccount[100];
static int totalAccounts = 0;
```

------------------------------------------------------------------------

## Real-Life Comparison

Imagine 100 lockers in a bank. Each user gets: - A locker number
(account number) - Locker starts empty (balance = 0) - They can add
money (deposit) - Remove money (withdraw) - Check content (check
balance)

The program simulates this bank system.

------------------------------------------------------------------------

## Conclusion

This program teaches: - Classes and objects\
- Arrays\
- User input\
- Conditional logic\
- Real-life modeling with code

A perfect beginner project for understanding Java programming!
