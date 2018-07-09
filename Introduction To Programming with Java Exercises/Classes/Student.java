package unit14;

public class Student {

    public static int studentCount = 0;

    private String firstName;
    private String secondName;
    private String thirdName;
    private int course;
    private String major;
    private String university;
    private String email;
    private String phoneNumber;

    public Student(String firstName, String secondName, String thirdName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.course = 0;
        this.major = "";
        this.university = "";
        this.email = "";
        this.phoneNumber = "";

        studentCount++;
    }

    public void getStudentInfo(){
        System.out.printf("The student %s %s %s is in his %d year in %s.\nEmail: %s\nPhone Number: %s"
                + "",firstName,secondName,thirdName,course,major,university,email,phoneNumber);
    }

    public int getStudentCount(){
        return studentCount;
    }

}
