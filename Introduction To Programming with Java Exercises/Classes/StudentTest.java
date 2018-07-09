package unit14;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static Student [] students = new Student[2];
    //public static List<Student> students = new ArrayList<Student>();

    public static void main(String[] args){
        createStudents();
        System.out.println(students[0].getStudentCount());
        students[0].getStudentInfo();
    }

    public static void createStudents(){
        students[0] = new Student("Moulashka","Moulashkin","Moulashkevisch");
        students[1] = new Student("Sporge","Mertinuf","Budjinuff");
    }

}
