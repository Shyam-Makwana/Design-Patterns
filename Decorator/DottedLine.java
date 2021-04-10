package Decorator;

/*
 * @author Shyam Makwana
 */

public class DottedLine extends ShapeDecorator {

    public DottedLine(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        setDottedLine(decoratedShape);
    }

    private void setDottedLine(Shape decoratedShape) {
        System.out.println("BorderLine: Dotted");
    }
}
