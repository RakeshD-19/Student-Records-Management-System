# Student Record Management System

## 📌 Project Overview
The Student Record Management System is a **console-based Java application** designed to manage student records efficiently.  
It allows users to add, view, search, update, delete, and sort student information, with data persisted using a CSV file.

This project focuses on **core Java programming concepts**, including object-oriented design, data structures, file handling, and basic automation, as required in the task.

---

## 🛠 Technologies Used
- **Programming Language:** Java  
- **Data Storage:** CSV file  
- **Automation:** Bash script  
- **Execution Mode:** Terminal / Console
---

## Features
- Add student records with unique Student ID
- View all student records in a formatted table
- Search students by Student ID or Name
- Update student details using Student ID
- Delete student records
- Sort students by Name or Marks
- Automatic save and load of data using a CSV file

---

## How to Run the Application

### Prerequisites
- Java (JDK 8 or above)
- Linux terminal (or Git Bash on Windows)

### Steps
```bash
cd Student\ Management\ System
chmod +x scripts/run.sh
./scripts/run.sh

The script will:

Compile all Java source files

Create the required data directory if it does not exist

Run the application from the correct working directory

Automation
A Bash script (run.sh) is included to automate:

Compilation of Java source files

Execution of the application

Creation of the required data directory

Logging both compilation and runtime error(stderr) with timestamp in logs/error.log

This reduces manual effort and ensures consistent execution and logging.

Data Storage Format (CSV)
Student records are stored in a CSV file.

Example:
studentId,name,age,course,marks
1,Rakesh,22,DataOps,99
2,Naresh,26,Linux,92

The CSV file contains clean, comma-separated values

No formatting or alignment is applied in the file

Data alignment is handled only during console display

Assumptions
Student ID is unique and numeric

Console-based interaction is sufficient

CSV file structure remains consistent

No database is used, as per task requirements

Screenshots
The screenshots/ folder contains execution screenshots demonstrating:

Menu display

Add student

View students

Search, update, and delete operations

Data persistence in the CSV file

Conclusion
This project demonstrates clean code structure, proper separation of concerns, effective file handling, and basic automation.
It is intentionally kept simple and aligned with the given requirements to focus on core programming fundamentals.
