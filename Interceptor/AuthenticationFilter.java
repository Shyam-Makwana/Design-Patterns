package Interceptor;

/*
 * @author Shyam Makwana
 */

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request : " + request);
    }
}