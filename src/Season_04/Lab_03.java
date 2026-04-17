package Season_04;

class Course {
    private String courseName;
    private String courseID;
    protected int credits;

    // Constructor 1
    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = 0; // Default
    }

    // Constructor 2
    public Course(String courseName, String courseID, int credits) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = credits;
    }

    // Default constructor for child class to use
    public Course() {}

    // Getters for private variables so the child class can access them
    public String getCourseName() { return courseName; }
    public String getCourseID() { return courseID; }

    public String getDetails() {
        return "Course: " + courseName + " (ID: " + courseID + ")";
    }
}

class Instructor extends Course {
    private String instructorName;
    protected String department;

    // Constructor 1: Only instructor details
    public Instructor(String instructorName, String department) {
        super(); // Calls default Course constructor
        this.instructorName = instructorName;
        this.department = department;
    }

    // Constructor 2: Instructor details + associating an existing Course object
    public Instructor(String instructorName, String department, Course course) {
        // We use super to initialize the parent part of this object
        super(course.getCourseName(), course.getCourseID(), course.credits);
        this.instructorName = instructorName;
        this.department = department;
    }

    // Method Overriding: Same method signature as parent, but new behavior
    @Override
    public String getDetails() {
        return "Instructor: " + instructorName + " | Dept: " + department + " | " + super.getDetails();
    }
}

public class Lab_03 {
    public static void main(String[] args) {
        Course c1 = new Course("Object Oriented Programming", "CS102", 4);
        Instructor inst1 = new Instructor("Dr. Ahmed", "Computer Science", c1);

        System.out.println(c1.getDetails());
        System.out.println(inst1.getDetails());
    }
}


