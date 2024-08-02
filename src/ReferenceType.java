import java.awt.*;
import java.util.Date;

// There are several Reference Types, they are:

// Date
// Point
// String
// Array
//
//

public class ReferenceType {
    public static void main(String[] args) {
//      Date is one of the reference types
        Date currentDate = new Date();
//        System.out.println(currentDate);

//        Point is also a reference type
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;

//        System.out.println(point2);

//        String ia a reference type YOU CAN CHECK CHEATSHEET FOR STRING METHODS USAGE and special characters
        String message = "Things are getting interesting.";

        String joinBoth = "My name is " + "Abiola John Oluwaseyi.";

        String ending = " Let's keep going :)";

        System.out.println(message + ending);
    }
}
