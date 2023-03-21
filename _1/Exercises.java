package Javaoop._1;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {

        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);



        for (int i=0;i<studentNames.size();i++){
            Student student= createNewStudent(studentNames.get(i),studentAges.get(i));
            System.out.println("Studente : "+ student.getStudentName() + " Età : " +student.getStudentAge());

        }

        // Use a for i loop
    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        student.setStudentName(name);
        student.setStudentAge(age);


        // Write your code here

        return student;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");
        Course corso = new Course();
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex","Tony");
        List<Integer> studentAges = Arrays.asList(23, 31, 38,29);
        int sum = 0;
        for (int i=0;i<studentNames.size();i++){
            Student student= createNewStudent(studentNames.get(i),studentAges.get(i));
            System.out.println("Studente : "+ student.getStudentName() + " Età : " +student.getStudentAge());
            corso.students.add(student);

            }
         for ( int age: studentAges ) {
             sum += age;
        }
         double average = (double)sum / studentAges.size();
        System.out.println("The average age is : " + average);


        // Write your code here
    }
}
