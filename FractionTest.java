/**
 * 
 */
package FractionCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author gmurph05
 *
 */

public class FractionTest {

	// test Fraction constructor
	
	// test divide by zero - should print an error and exit
	@Test
	public void testDivideByZero() {
		new Fraction(1, 2);
	}
	
	// test multiply
	@Test
	public void testMultiply(){
		Fraction f = new Fraction(3,10);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(3,5);
		Fraction expectedOutput = f;
		Fraction actualOutput = g.multiply(h);
		//if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
		assertEquals("Multiply failed!", expectedOutput, actualOutput);
	}
	
	// test divide
		@Test
		public void testDivide(){
			
			
		}
	
	// test equals
	@Test
	public void testEquals(){
		test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
		test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
		test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
		test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
		test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");
	}
	
	// test add
	@Test
	public void testAdd(){
		Fraction i = new Fraction(2,3);
		Fraction j = new Fraction(1,3);
		Fraction k = new Fraction(2,6);
		Fraction expectedOutput = i;
		Fraction actualOutput = j.add(k);
		assertEquals("Addition failed", expectedOutput, actualOutput);
	}
	
	// test subtract
	@Test
	public void testSubtract(){
		Fraction i = new Fraction(1,3);
		Fraction j = new Fraction(2,3);
		Fraction k = new Fraction(2,6);
		Fraction expectedOutput = i;
		Fraction actualOutput = j.subtract(k);
		assertEquals("Subtraction failed", expectedOutput, actualOutput);
	}
	
	// test absolute value
	@Test
	public void testAbsValue(){
		Fraction x = new Fraction(-2,6);
		Fraction y = new Fraction(2,6);
		Fraction expectedOutput = y;
		Fraction actualOutput = x.absValue();
		assertEquals("Absolute Value failed", expectedOutput, actualOutput);
		
	}
	

		static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
	}
}
