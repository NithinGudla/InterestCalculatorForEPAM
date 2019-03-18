package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompoundInterestTest {

	@Test
	void test() {
		InterestCalculator interestCalculator = new InterestCalculator();
		double output = interestCalculator.calculateCompoundInterest(100, 3, 200);
		assertEquals(2700, output);
	}

}
