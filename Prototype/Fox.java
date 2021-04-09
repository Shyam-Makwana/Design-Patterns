package Prototype;

/*
 * @author Shyam Makwana
 */

public class Fox extends Animal {

    public Fox() {
        type = "Fox";
        System.out.println("Fox object created");
    }

    public void render() {
        System.out.println("Inside Fox::render() method.");
    }
}
