package Prototype;

/*
 * @author Shyam Makwana
 */

public class Bear extends Animal {

    public Bear() {
        type = "Bear";
        System.out.println("Bear object created");
    }
    public void render() {
        System.out.println("Inside Bear::render() method.");
    }
}
