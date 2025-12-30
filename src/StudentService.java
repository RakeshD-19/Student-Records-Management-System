import java.util.List;

public class StudentService {
    private List<Student> studentList;
    public StudentService(List<Student> studentList){
        this.studentList=studentList;
    }

    private boolean isStudentidExist(int id){
        for(Student student:studentList){
            if(student.getStudentId()==id){
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(Student student){
        if(isStudentidExist(student.getStudentId())){
            return false;
        }
        studentList.add(student);
        return true;
    }

    public void viewStudents(){
        if(studentList.isEmpty()){
            System.out.println("No student records found");
        }
        System.out.printf("%-5s %-15s %-5s %-15s %-7s%n","ID", "Name", "Age", "Course", "Marks");
        for (Student student:studentList){
            System.out.println(student);
        }
    }

    public Student searchbyId(int id){
        for (Student student:studentList){
            if(student.getStudentId()==id){
                return student;
            }
        }
        return null;
    }

    public Student searchbyName(String name){
        for (Student student:studentList){
            if (student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(int id,String name,int age,String course,double marks){
        Student student=searchbyId(id);
        if (student==null){
            return false;
        }
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        student.setMarks(marks);

        return true;
    }

    public boolean deleteStudent(int id){
        Student student=searchbyId(id);
        if (student==null){
            return false;
        }
        studentList.remove(student);
        return true;
    }

    public void sortbyName(){
        studentList.sort((s1,s2)->s1.getName().compareToIgnoreCase(s2.getName()));
    }

    public void sortbyMarks(){
        studentList.sort((s1,s2)->Double.compare(s2.getMarks(),s1.getMarks()));
    }
}
