package Practise_Section_During_Class;

class Student{
    String name;
    int age;

    public void display(){
        System.out.println(name + ", you are age is " + age);
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Hassan";
        student1.age = 12;
        student1.display();

        Student student2 = new Student();
        student2.name = "Talal Ahmad";
        student2.age = 20;
        student2.display();

    }

}
