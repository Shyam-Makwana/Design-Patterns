package Interceptor;

import java.util.Date;

/*
 * @author Shyam Makwana
 */

public class LogFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println(new Date() + " # Logging request : " + request);
    }
}
