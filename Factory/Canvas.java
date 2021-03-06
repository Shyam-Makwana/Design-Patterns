package Factory;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * @author Shyam Makwana
 */

public class Canvas {

    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addNewShape(String shapeType) {
        Shape shape = ShapeFactory.getShape(shapeType);
        shapeList.add(shape);
    }

    public void redraw() {
        Iterator<Shape> itr = shapeList.iterator();
        while (itr.hasNext()) {
            Shape shape = itr.next();
            shape.draw();
        }
    }
}