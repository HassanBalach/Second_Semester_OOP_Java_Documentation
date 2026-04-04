package Season_03;

class Student{
    String name;
    int rollNumber;

    double grade1;
    double grade2;
    double grade3;

    Student(String name , int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    double CalculatedAverageGrade(){
        return (grade1 + grade2 + grade3) / 3;
    }

    void displayStudentDetail(){
        System.out.println("Name: " + name);
        System.out.println("RollNumber :" + rollNumber);
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Grade: " + CalculatedAverageGrade() );
    }

}
public class Lab_02 {
    public static void main(String[] args) {
        Student student01 = new Student("Hassan Balach" , 123);
        student01.grade1 = 75.2;
        student01.grade2 = 85.3;
        student01.grade3 = 99.1;


        student01.displayStudentDetail();



        Student student02 = new Student("Kamran Balach" , 321);
        student02.grade1 = 56.2;
        student02.grade2 = 58.3;
        student02.grade3 = 69.1;


        student02.displayStudentDetail();
    }


}
