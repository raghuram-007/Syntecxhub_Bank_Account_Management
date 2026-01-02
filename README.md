

# 🏦 Bank Account Management System

**Java Console Application**

---

## 📖 Project Description

The **Bank Account Management System** is a **menu-driven Java console application** developed as part of the **Syntecxhub Java Internship Program**.
This project focuses on **secure and efficient management of bank accounts** using the **Java Collections Framework**.

The application allows users to perform essential banking operations such as account creation, deposits, withdrawals, and balance inquiries while ensuring **data integrity** and **efficient retrieval**.

---

## 🎯 Project Objectives

* Apply **Java Collections (Map & Set)** in a real-world scenario
* Implement **core banking operations**
* Prevent duplicate account creation
* Ensure safe handling of financial data
* Build a clean, user-friendly **CLI-based system**

---

## 🛠️ Technologies & Tools Used

* **Java (Core Java)**
* **Java Collections Framework**

  * `HashMap`
  * `HashSet`
* **Object-Oriented Programming (OOP)**

  * Encapsulation
  * Abstraction
* **Frontend:** Console-based interface (CLI)

---

## 📂 Project Structure

```
Syntecxhub_Bank_Account_Management/
│
├── Main.java           // Program entry point
├── BankManager.java   // Business logic & collection handling
├── BankAccount.java   // Account model class
└── README.md
```

---

## ⚙️ Functional Features

* ✅ Create new bank accounts
* ✅ Prevent duplicate account numbers
* ✅ Deposit money into an account
* ✅ Withdraw money with balance validation
* ✅ View individual account balance
* ✅ View all existing accounts
* ✅ Menu-driven & user-friendly interface

---

## 📘 Java Collections Usage

| Collection Type                 | Purpose                                        |
| ------------------------------- | ---------------------------------------------- |
| `HashMap<Integer, BankAccount>` | Stores and retrieves bank accounts efficiently |
| `HashSet<Integer>`              | Ensures uniqueness of account numbers          |

---

## ▶️ How to Run the Application

### Prerequisites

* Java JDK **8 or above**
* Command Prompt / Terminal

### Steps

1. Clone the repository:

```bash
git clone https://github.com/your-username/Syntecxhub_Bank_Account_Management.git
```

2. Navigate to the project directory:

```bash
cd Syntecxhub_Bank_Account_Management
```

3. Compile the program:

```bash
javac Main.java
```

4. Run the application:

```bash
java Main
```

---

## 🧪 Sample Output

### Main Menu

```
===== Bank Account Management =====
1. Create Account
2. Deposit Money
3. Withdraw Money
4. View Balance
5. View All Accounts
6. Exit
Enter choice:
```

### Creating an Account

```
Enter choice: 1
Enter Account Number: 101
Enter Account Holder Name: Rahul
Enter Initial Balance: 5000
Account created successfully!
```

### Depositing Money

```
Enter choice: 2
Enter Account Number: 101
Enter Amount: 2000
Amount deposited successfully!
```

### Withdrawing Money

```
Enter choice: 3
Enter Account Number: 101
Enter Amount: 1500
Withdrawal successful!
```

### Viewing Balance

```
Enter choice: 4
Enter Account Number: 101
Current Balance: Rs.5500.0
```

### Viewing All Accounts

```
Enter choice: 5
Account No: 101 | Name: Rahul | Balance: Rs.5500.0
```

---

## 🔐 Security & Validation Highlights

* Duplicate account numbers are **blocked**
* Withdrawals fail if balance is insufficient
* Invalid account numbers are handled safely
* Only positive transaction amounts are accepted

---

## 🎓 Learning Outcomes

* Practical use of **Java Collections**
* Improved understanding of **OOP principles**
* Efficient data storage and retrieval
* Building real-world **banking logic**
* Writing clean, structured Java code

---

## 📌 Internship Details

* **Internship Program:** Java Programming
* **Organization:** Syntecxhub
* **Project Type:** Console-Based Java Application
* **Task:** Weekly Internship Project

---

## 📁 Repository Naming Convention

```
Syntecxhub_Bank_Account_Management
```

---

## 🙏 Acknowledgment

I would like to thank **Syntecxhub** for providing hands-on internship projects that enhance practical knowledge and prepare interns for real-world software development.

---

