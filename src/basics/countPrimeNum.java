package basics;

public class countPrimeNum {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 6, 8};
		int count = 0;
		for(int num : arr) {
			boolean prime = true;
			if(num < 2) prime = false;
			else {
				for(int i = 2; i <= num; i++) {
					if(num % i == 0) {
						prime = false;
					}
				}
			}
			if(prime) count++;
		}
		System.out.println("Prime count: " + count);
	}	
}
