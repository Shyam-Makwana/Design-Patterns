package Observer;

/*
 * @author Shyam Makwana
 */

public class Point {

    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "(" + xPos + "," + yPos + ")";
    }
}
