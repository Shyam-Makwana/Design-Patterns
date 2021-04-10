package Decorator;

/*
 * @author Shyam Makwana
 */

public class Main {

    public static void main(String[] args) {
        Shape oval = new Oval();
        Shape solidCircle = new SolidLine(new Oval());
        Shape dottedRectangle = new DottedLine(new Rectangle());
        System.out.println("Oval with Normal Line");
        oval.draw();
        System.out.println("\nOval with Solid Line");
        solidCircle.draw();
        System.out.println("\nRectangle with Dotted Line");
        dottedRectangle.draw();
    }
}
