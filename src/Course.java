/**
 * This class contains information about a college course
 *
 * @author Jack
 */
class Course {

    // Fields
    String name; // instance variable
    String instructor;
    private double averageGPA;
    static String institution = "University of Minnesota"; // class variable

    // Default constructor
    public Course() {
        name = "CS200";
        instructor = "Marc Williams";
        averageGPA = 0.0;
    }

    // Overloaded constructor
    public Course(String name, String instructor, double gpa) {
        this.name = name;
        this.instructor = instructor;
        this.averageGPA = gpa;
    }

    // Given a correct password, returns the average GPA for the course
    // mutator
    public void setAverageGPA(String password, double gpa) {
        Course c = new Course("Hi", "Me", 2);
        if (c.verifyCredentials(password)) {
            this.averageGPA = gpa;
        }
    }

    // accessor
    public double getAverageGPA() {
        return this.averageGPA;
    }

    // Private methods
    // This can only be called from within the Course class
    private boolean verifyCredentials(String password) {
        return password.equals("agoodpassword");
    }
}
