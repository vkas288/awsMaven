package com.vkas.aws;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private App subject;
    
    @Before
    public void setup() {
        subject = new App();
    }

    @Test
    public void testGetMessage()
    {
        assertEquals("Hello World!", subject.getMessage(false));
        assertEquals("Hello Universe!", subject.getMessage(true));
    }
}
