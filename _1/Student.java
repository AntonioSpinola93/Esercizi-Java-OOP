package Javaoop._1;

public class Student {
    private static String studentName;
    private static int studentAge;

    //costruttore della class student

    //public Student(String theName , int theAge){
        //this.studentName = theName;
       // this.studentAge= theAge;

    //}
    // getter and setter
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String theName){
        studentName=theName;

    }
    public int getStudentAge(){
        return studentAge;
    }
    public void setStudentAge(int theAge){
        studentAge=theAge;
    }

}
