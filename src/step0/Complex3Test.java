package step0;

import static org.junit.Assert.*;
//import org.junit.Test;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 2: Step 0
 */

public class Complex3Test {
    
    @org.junit.Test
    public void testComplex3() throws Exception {
        Complex3 obj = new Complex3(5, 5);
        assertTrue(obj != null);
        assertTrue(obj.getImaginaryPart() == 5);
        assertTrue(obj.getRealPart() == 5);
        assertTrue(obj instanceof Complex3);
    }

    @org.junit.Test
    public void testSetRealPart() throws Exception {
        Complex3 obj = new Complex3(5, 5);
        double expected = 7.5, actual = 0;
        obj.setRealPart(expected);
        actual = obj.getRealPart();
        assertEquals(expected, actual, 0.01);
    }

    @org.junit.Test
    public void testSetImaginaryPart() throws Exception {
        Complex3 obj = new Complex3(5, 5);
        double expected = 7.5, actual = 0;
        obj.setImaginaryPart(expected);
        actual = obj.getImaginaryPart();
        assertEquals(expected, actual, 0.01);
    }

    @org.junit.Test
    public void testGetRealPart() throws Exception {
        Complex3 obj = new Complex3(10.0, 5.0);
        double expected = 10.0, actual = 0;
        actual = obj.getRealPart();
        assertEquals(expected, actual, 0.01);
    }

    @org.junit.Test
    public void testGetImaginaryPart() throws Exception {
        Complex3 obj = new Complex3(10.0, 5.0);
        double expected = 5.0, actual = 0;
        actual = obj.getImaginaryPart();
        assertEquals(expected, actual, 0.01);
    }

    @org.junit.Test
    public void testAddComplex() throws Exception {
        Complex3 num1 = new Complex3(3.1, 5.2);
        Complex3 num2 = new Complex3(2.3, 7.4);
        num1.addComplex(num2);
        double expectedReal = 5.4, expectedImaginary = 12.6;
        double actualReal = 0, actualImaginary = 0;
        actualReal = num1.getRealPart();
        actualImaginary = num1.getImaginaryPart();
        assertEquals(expectedReal, actualReal, 0.01);
        assertEquals(expectedImaginary, actualImaginary, 0.01);
    }

    @org.junit.Test
    public void testSubtractComplex() throws Exception {
        Complex3 num1 = new Complex3(3.4, 15.3);
        Complex3 num2 = new Complex3(2.1, 7.2);
        num1.subtractComplex(num2);
        double expectedReal = 1.3, expectedImaginary = 8.1;
        double actualReal = 0, actualImaginary = 0;
        actualReal = num1.getRealPart();
        actualImaginary = num1.getImaginaryPart();
        assertEquals(expectedReal, actualReal, 0.01);
        assertEquals(expectedImaginary, actualImaginary, 0.01);
    }
}