package FrontController;

import java.util.Date;

/*
 * @author Shyam Makwana
 */

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println(new Date() + " # Page requested : " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            dispatcher.dispatchRequest(request);
        }
    }
}