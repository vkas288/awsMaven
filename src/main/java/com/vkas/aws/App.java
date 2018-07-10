package com.vkas.aws;

/**
 * Hello world!
 *
 */
public class App 
{
    public String getMessage( boolean bigger )
    {
        if (bigger) {
            return "Hello Universe!";
        } else {
            return "Hello World!";
        }
    }
}
