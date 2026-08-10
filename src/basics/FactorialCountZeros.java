package basics;

public class FactorialCountZeros {

	public static void main(String[] args) {
		int n = 10;
		long factorial = 10;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial " + factorial);
		
		int count = 0;
		long temp = factorial;
		while(temp % 10 == 0) {
			count++;
			temp = temp / 10;
		}
		System.out.println("Zeros = " + count);
	}

}
