# Student Record Management System

## 📌 Project Overview
The Student Record Management System is a **console-based Java application** designed to manage student records efficiently.  
It allows users to add, view, search, update, delete, and sort student information, with data persisted using a CSV file.

This project focuses on **core programming concepts**, **object-oriented design**, **data structures**, **file handling**, and **basic automation**, as required in the task.

---

## 🛠 Technologies Used
- **Programming Language:** Java  
- **Data Storage:** CSV file  
- **Automation:** Bash script  
- **Execution Mode:** Terminal / Console  

---

## 📂 Project Structure

Student Management System/
│
├── src/
│ ├── Main.java
│ ├── Student.java
│ ├── StudentService.java
│ └── FileHandler.java
│
├── studentData/
│ └── studentData.csv
│
├── scripts/
│ └── run.sh
│
├── screenshots/
│
└── README.md


---

## ⚙️ Features Implemented

### 1. Add Student
- Add a new student with ID, name, age, course, and marks
- Ensures **Student ID is unique**

### 2. View All Students
- Displays all student records in a **formatted table**
- Supports viewing sorted data

### 3. Search Student
- Search by **Student ID**
- Search by **Student Name**

### 4. Update Student
- Update student details using Student ID
- Student ID remains unchanged

### 5. Delete Student
- Remove a student record using Student ID

### 6. Sorting
- Sort students by **Name**
- Sort students by **Marks**

### 7. Save & Load Data
- Student records are stored in a CSV file
- Data is automatically loaded when the application starts

---

## ▶️ How to Run the Application

### Prerequisites
- Java (JDK 8 or above)
- Linux terminal (or Git Bash on Windows)

### Steps

1. Navigate to the project root directory:
cd Student\ Management\ System

2. Give execute permission to the script (one-time):
chmod +x scripts/run.sh

3. Run the application using the automation script:
./scripts/run.sh

The script will:

Compile all Java source files

Ensure required data directory exists

Run the application from the correct working directory

🤖 Automation

A Bash script (run.sh) is included to automate:

Compilation of Java files

Execution of the application

Creation of required data directory

This reduces manual effort and ensures consistent execution.

📄 Data Storage Format (CSV)

The application uses a CSV file for persistence.

Example:

studentId,name,age,course,marks
1,Rakesh,22,DataOps,99
2,Naresh,26,Linux,92


The CSV file stores clean, comma-separated values

No formatting or alignment is applied in the file

Alignment is handled only during console display

📝 Assumptions Made

Student ID is unique and numeric

Console-based interaction is sufficient

CSV file structure remains consistent

No database is used, as per task requirements

📸 Screenshots

Screenshots of application execution are included in the screenshots/ folder, showing:

Menu display

Add student

View students

Search, update, and delete operations

File persistence

🚀 Conclusion

This project demonstrates clean code structure, proper separation of concerns, effective file handling, and basic automation.
It is intentionally kept simple and aligned with the given requirements to focus on core programming fundamentals.
