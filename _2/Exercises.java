package Javaoop._2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }


    /**
     *  1: Create a constructor inside Student that takes 'name' and 'age'
     *
     *     make sure to set the fields too using the 'this' keyword
     *
     *     Add a print statement to the constructor at the start saying "Constructing!"
     *     Add a print statement to the constructor at the start saying "Constructed!"
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie","Sara");
        List<Integer> studentAges = Arrays.asList(23, 31, 38,28);
        List<Student> students = new ArrayList<>();
        System.out.println(students);

        for (int i = 0; i < studentAges.size(); i++) {
            Student student = new Student(studentNames.get(i),studentAges.get(i));
            students.add(student); //aggiunge un parametro alla lista

        }
        System.out.println(students.get(0).name +students.get(0).age+
                      "\n"+students.get(1).name +students.get(1).age +
                      "\n"+ students.get(2).name +students.get(2).age +
                       "\n"+ students.get(3).name +students.get(3).age);
    }

    /**
     * 2: Add 3 more constructors to student, remember you need to change the parameters
     *    a constructor accepts in order to allow multiple.
     *
     *    a Constructor that takes only a student's age
     *    a Constructor that takes only a student's name
     *    a Constructor that does not take any parameters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

         //Once you've added the correct constructors uncomment the code below, there should be errors!
         List<Student> students = Arrays.asList(new Student("Alice", 33), new Student("Bob"), new Student(33), new Student());
    }
}
