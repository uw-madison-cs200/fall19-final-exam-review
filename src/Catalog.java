/**
 * This class implements a simple course catalog
 *
 * @author Jack
 */

//If not specified, default visibility is Package
class Catalog {

    public static void main(String[] args){

        //create an object/instance of the Course class

        //intro is declared to be of type Course, but no memory
        //is allocated for it yet
        Course intro; 

        //using default constructor
        intro = new Course();
        System.out.println(intro.name + "\n");

        //create a different object/instance of the Course class
        //using the other constructor
        Course advanced = new Course("Advanced Topics in Machine Learning",
                "Rob Ot", 3.0);

        //error, no corresponding constructor
        //Course testCourse = new Course("CS100", "Jim Renault");

        //------------------------------------------------------------

        //changing a class/static variable
        Course.institution = "University of Wisconsin";

        //this works, but it's bad style
        System.out.println(advanced.institution);
        System.out.println(intro.institution);

        //much better
        System.out.println(Course.institution + "\n");

        //------------------------------------------------------------

        //averageGPA is a private field, so this is not allowed
        intro.averageGPA = 3.5;

        //use a mutator method instead
        intro.setAverageGPA("agoodpassword", 4.0);

        //using an accessor method
        double introGPA = intro.getAverageGPA();
        System.out.println(introGPA);
    }
}
