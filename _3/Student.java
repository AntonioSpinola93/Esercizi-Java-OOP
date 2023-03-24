package Javaoop._3;

public class Student {
    private String studentName;
    private String studentSurname;
    private int studentAge;
    private String studentAddress;
    private String studentCity;
    private static int cityCounter =0; // deve essere statica perchè sarà condivisa da tutte le istanze della classe student( ogni student creato ne avrà accesso)



    public Student(String name,String surname,int age,String address,String city){
        this.studentName = name;
        this.studentSurname = surname;
        this.studentAge = age;
        this.studentAddress =address;
        this.studentCity=city;
        setStudentAge(age);//inizializza setStudentAge per inserire vincolo
        setStudentName(name);
        setStudentSurname(surname);

    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        if (studentName.matches(".*\\d+.*")){          // uso il regex in modo che il nome sia non valido se contiene caratteri numerici
            throw new IllegalArgumentException("Il nome non deve contenere caratteri numerici");
        }
        studentName=name;
    }
    public String getStudentSurname(){
        return studentSurname;
    }
    public void setStudentSurname(String surname){
        if (studentSurname.matches(".*\\d+.*")){
            throw new IllegalArgumentException("Il cognome non deve contenere caratteri numerici");
        }
        studentSurname=surname;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public void setStudentAge(int age){
        if (studentAge<=0){
            throw new IllegalArgumentException("L'età non può essere negativa"); // throw viene utilizzata per lanciare un eccezione ovvero la classe IllegalArgumentException
        }
            studentAge = age;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public void setStudentAddress(String address){
        studentAddress=address;
    }
    public String getStudentCity(){
        cityCounter++;
        return studentCity;
    }
    public void setStudentCity(String city){
        studentCity= city;
    }
    public static int getCityCounter(){
        return  cityCounter;
    }

}
