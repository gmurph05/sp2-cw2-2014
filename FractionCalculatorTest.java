/**
 * 
 */
package FractionCalculator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author gmurph05
 *
 */
public class FractionCalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testEvaluate() {
		String expression = "1/2 + 1/2";
		Fraction f = new Fraction(1,1);
		Fraction answer = FractionCalculator.evaluate(expression);
		assertEquals("Does not evaluate", f, answer);
	}
	


}
