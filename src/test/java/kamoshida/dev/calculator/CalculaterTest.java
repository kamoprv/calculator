package kamoshida.dev.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	private Calculator calculator = new Calculator();
	
	@Test
	
	public void testSum() {
		assetEquals(5, calculator.sum(2, 3));
    }
}
