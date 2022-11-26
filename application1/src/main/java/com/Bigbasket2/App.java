package com.Bigbasket2;

/**
 * Hello world!
 *
 */
public class App {
    
    private final String message = "Hello World,Good Mrng To All";
    
    public App() {}
    public static void main( String[] args ) {
        System.out.println( new App().getMessage() );
    }
    
    private final String getMessage() {
        return message;
    }    
}
