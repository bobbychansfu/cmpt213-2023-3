package ca.cmpt213;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.cmpt213.calculator.Calculator;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @After
    public void tearDown() {

    }

    @Test 
    public void testAdd() {
        assertEquals(5.0, cal.add(1.0,4.0),0.0001);
        assertEquals(-1.0, cal.add(-2.0,1.0),0.0001);
    }
    @Test
    public void testDivide(){
        assertEquals(2.0, cal.divide(6.0,3.0),0.0001);
    }
    @Test
    public void testDivideByZero(){
        try {
            cal.divide(3.0, 0.0);
            fail();
        } catch (IllegalArgumentException ex) {
            // assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
}
