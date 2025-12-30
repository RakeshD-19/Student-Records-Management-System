import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = FileHandler.loadStudents();
        StudentService service = new StudentService(studentList);

        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, age, course, marks);

                    if (service.addStudent(student)){
                        FileHandler.saveStudents(studentList);
                        System.out.println("Student added successfully.");
                    } else{
                        System.out.println("Student ID already exists.");
                    }
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId=sc.nextInt();
                    Student foundbyId=service.searchbyId(searchId);
                    if(foundbyId !=null){
                        System.out.println(foundbyId);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student Name: ");
                    String searchName=sc.nextLine();
                    Student foundbyName=service.searchbyName(searchName);
                    if (foundbyName!=null){
                        System.out.println(foundbyName);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID to update: ");
                    int updateId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName=sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    if (service.updateStudent(updateId,newName,newAge,newCourse,newMarks)){
                        FileHandler.saveStudents(studentList);
                        System.out.println("Student updated successfully.");
                    } else{
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId=sc.nextInt();
                    if (service.deleteStudent(deleteId)){
                        FileHandler.saveStudents(studentList);
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 7:
                    service.sortbyName();
                    service.viewStudents();
                    break;

                case 8:
                    service.sortbyMarks();
                    service.viewStudents();
                    break;

                case 9:
                    FileHandler.saveStudents(studentList);
                    System.out.println("Data saved.Exiting application");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }

    private static void showMenu() {

        System.out.println("\n--- Student Record Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Search Student by Name");
        System.out.println("5. Update Student");
        System.out.println("6. Delete Student");
        System.out.println("7. Sort Students by Name");
        System.out.println("8. Sort Students by Marks");
        System.out.println("9. Save & Exit");
        System.out.print("Enter Choice: ");


    }
}
