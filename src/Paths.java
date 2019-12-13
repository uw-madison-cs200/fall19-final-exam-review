/**
 * Paths
 *  - Relative vs absolute
 *  - File class, ref: https://www.geeksforgeeks.org/file-class-in-java/
 *
 * @author T.J. Wilder
 */
import java.io.File;
import java.io.IOException;

public class Paths {
    public static void main(String[] args) throws IOException {
        // example 1
        File f = new File("src/Paths.java"); // what path is this?
        // apply File class methods on File object
        System.out.println("File name: " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path: "  + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable: " + f.canWrite());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is a directory: " + f.isDirectory());
            System.out.println("File Size in bytes: " + f.length());
        }

        // example 2
        File f2 = new File("./src/Paths.java");
        File f3 = new File("/Users/tj/Desktop/Code/cs200/fall19-final-exam-review/src/Paths.java");
        System.out.println("F2 Exists: " + f2.exists());
        System.out.println("F3 Exists: " + f3.exists());
        System.out.println("F2 Absolute path: " + f2.getAbsolutePath());
        System.out.println("F3 Absolute path: " + f3.getAbsolutePath());

        // not exist file / path?
        File f4 = new File("./NotHere.class");
        System.out.println("F4 Exists: " + f4.exists());
        // how to distinguish absolute and relative path?
        // ignoring the drive, if the path starts with the root "\" or "/"
        // that means it is absolute, otherwise it is relative
    }
}
