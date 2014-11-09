/**
 * 
 */
package FractionCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author gmurph05
 *
 */

public class FractionTest {

	// test divide by zero - should print an error and exit
	@Test
	public void testDivideByZero() {
		new Fraction(1, 0);
	}
	
	// test multiply
	@Test
	public void testMultiply(){
		Fraction f = new Fraction(3,10);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(3,5);
		if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
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
		
	}
	
	// test subtract
	@Test
	public void testSubtract(){
		
	}
	
	// test divide
	@Test
	public void testDivide(){
		
	}
	
	// test absolute value
	@Test
	public void testAbsValue(){
		
	}
	
	
		static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
	}
}
