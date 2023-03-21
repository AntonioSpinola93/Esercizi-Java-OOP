package Javaoop._1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static String courseName;
    private static int maxStudents;
    private static int qualityRatingOutOf10;
    private static String subjectCourse1;
    private static String subjectCourse2;



    List<Student> students =new ArrayList<Student>();

    //costruttore della classe Course

    //public Course (String name,int maxStd,int qualityRate,String sub1,String sub2){
       // this.courseName=name;
       // this.maxStudents=maxStd;
       // this.qualityRatingOutOf10=qualityRate;
      //  this.subjectCourse1=sub1;
      //  this.subjectCourse2=sub2;


  // }
    //imposto i getter e setter per gli attributi della classe
    public String getCourseName(){          //getter
        return courseName;
    }
    public void setCourseName(String name){   //setter
        courseName=name;
    }
    public int getMaxStudents(){
        return maxStudents;
    }
    public void setMaxStudents(int maxStd){
        maxStudents=maxStd;
    }
    public int getQualityRatingOutOf10(){
        return qualityRatingOutOf10;

    }
    public void setQualityRatingOutOf10(int qualityRate){
        qualityRatingOutOf10=qualityRate;
    }
    public String getSubjectCourse1(){
        return subjectCourse1;
    }
    public void setSubjectCourse1(String sub1){
        subjectCourse1=sub1;
    }
    public String getSubjectCourse2(){
        return subjectCourse2;
    }
    public void setSubjectCourse2(String sub2){
        subjectCourse2=sub2;
    }

}
