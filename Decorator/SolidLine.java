package Decorator;

/*
 * @author Shyam Makwana
 */

public class SolidLine extends ShapeDecorator {

    public SolidLine(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        setSolidLine(decoratedShape);
    }

    private void setSolidLine(Shape decoratedShape) {
        System.out.println("BorderLine: Solid");
    }
}