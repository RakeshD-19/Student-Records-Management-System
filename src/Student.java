// Student model class representing a student record
public class Student {

    private int studentId;
    private String name;
    private int age;
    private String course;
    private double marks;

    public int getStudentId() {
        return studentId;
    }


    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int studentId, String name, int age, String course, double marks){
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.course=course;
        this.marks=marks;
    }

    @Override
    public String toString(){
        return String.format(
                "%-5d %-15s %-5d %-15s %-7.2f",
                studentId, name, age, course, marks
        );
    }

}
