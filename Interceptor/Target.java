package Interceptor;

/*
 * @author Shyam Makwana
 */

public class Target {
    public void executeRequest(String request) {
        System.out.println("Executing request: " + request);
    }
}