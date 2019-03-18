package nithin;

public class InterestCalculator {
	
	public double calculateSimpleInterest(int principle, int time, double rate) {
		
		return (principle * time * rate) / 100;
	}
	public double calculateCompoundInterest(int principle, int time, double rate) {
		
		return principle * (Math.pow((1 + rate / 100), time));
	}

}
