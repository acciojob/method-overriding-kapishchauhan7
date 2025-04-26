package com.driver.test;

import com.driver.A;
import com.driver.B;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    @Test
    public void testMethodOverride() {
        A a = new A();
        B b = new B();

        
        assertEquals("Invoking method from class A", a.meth());
        assertEquals("Method is overridden in Extended class B", b.meth());
        assertEquals("Invoking method from class A", b.printA());
    }
}
