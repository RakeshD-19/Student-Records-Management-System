import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileHandler {
    private static final String filePath="studentData/student.csv";

    public static List<Student> loadStudents(){
        ArrayList<Student> studentList=new ArrayList<>();
        File file=new File(filePath);

        if(!file.exists()){
            return studentList;
        }

        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line=br.readLine();
            while((line= br.readLine())!=null){
                String[] parts=line.split(",");

                int id=Integer.parseInt(parts[0]);
                String name=parts[1];
                int age=Integer.parseInt(parts[2]);
                String course=parts[3];
                double marks=Double.parseDouble(parts[4]);

                Student student=new Student(id,name,age,course,marks);
                studentList.add((student));

            }

        } catch (IOException e){
            System.out.println("Error reading student file");
        }

        return  studentList;
    }

    public static void saveStudents(List<Student> studentList){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath))){
            bw.write("StudentID,Name,Age,Course,Marks");
            bw.newLine();
            for(Student student:studentList){
                String line=student.getStudentId()+","+student.getName()+","+student.getAge()+","+student.getCourse()+","+student.getMarks();
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e){
            System.out.println("Error saving student file");
        }
    }
}

