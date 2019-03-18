package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleInterestTest {

	@Test
	void test() {
		InterestCalculator interestCalculator = new InterestCalculator();
		double output = interestCalculator.calculateSimpleInterest(3000 , 1, 7);
		assertEquals(210, output);
	}

}
