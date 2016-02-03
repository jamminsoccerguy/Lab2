package step4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 2: Step 4
 */
public class RationalTest {
    
    @Test
    public void testReciprocal() throws Exception {

    }

    @Test
    public void testAddRational() throws Exception {
        Rational rat1 = new Rational(1, 5);
        Rational rat2 = new Rational(2, 5);

        Rational expected = new Rational(3, 5);
        Rational actual = rat1.addRational(rat2);

        assertEquals(expected, actual);

        //assertEquals(new Rational(1,5).addRational(new Rational(2,5)), new Rational(15,25));
    }

    @Test
    public void testSubRational() throws Exception {

    }

    @Test
    public void testMulRational() throws Exception {

    }

    @Test
    public void testDivRational() throws Exception {

    }
}