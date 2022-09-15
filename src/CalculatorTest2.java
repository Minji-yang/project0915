import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest2 {


	@Test
	void testSum() {
		double result;
		result=Calculator.sum(6, 3);
		assertTrue("결과 : 9",(result==9));
	}

	@Test
	void testSubtract() {
		double result;
		result=Calculator.subtract(6, 3);
		assertTrue("결과 : 3",(result==3));
	}

	@Test
	void testMultiply() {
		double result;
		result=Calculator.multiply(6, 3);
		assertTrue("결과 : 18",(result==18));
	}

	@Test
	void testDevide() {
		double result;
		result=Calculator.devide(5, 3);
		assertTrue("결과 : 1",(result==1));
	}

}
