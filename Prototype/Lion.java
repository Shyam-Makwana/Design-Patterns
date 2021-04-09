package Prototype;

/*
 * @author Shyam Makwana
 */

public class Lion extends Animal {

    public Lion() {
        type = "Lion";
        System.out.println("Lion object created");
    }

    void render() {
        System.out.println("Inside Lion::render() method.");
    }
}