package Javaoop._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student1 = new Student("Antonio","Spinola",29,"XXIV maggio","Alezio");
        System.out.println("Student1 Name = "+ student1.getStudentName()+ "; Surname : "+ student1.getStudentSurname()+"; Age : "+student1.getStudentAge()+"; Address : "+ student1.getStudentAddress()+"; City : "+student1.getStudentCity());



        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student2 = new Student("Peter","Griffin",45,"Quahog","Rhode Island");
        System.out.println("Student1 Name = "+ student2.getStudentName()+ "; Surname : "+ student2.getStudentSurname()+"; Age : "+student2.getStudentAge()+"; Address : "+ student2.getStudentAddress()+"; City : "+student2.getStudentCity());
        System.out.println("Student cities constructed = "+ Student.getCityCounter());

        //Write your code here
    }


}
