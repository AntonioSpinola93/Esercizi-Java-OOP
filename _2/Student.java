package Javaoop._2;



public class Student {
    public String name;
    public int age;

    public Student(String name, int age){
        System.out.println("Constructing!!");
        this.age=age;
        this.name=name;
        System.out.println("Student constructed!");

    }
    public Student(String name){
        this.name=name;
    }
    public Student(int age){
        this.age=age;
    }
    public Student(){

    }

}
