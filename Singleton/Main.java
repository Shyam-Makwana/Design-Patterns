package Singleton;

/*
 * @author Shyam Makwana
 */

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Object references : \nlogger1 = " + logger1 + "\nlogger2 = " + logger2);
    }
}
