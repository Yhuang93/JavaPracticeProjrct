package JavaPracticeProjrct;

public class NarcissisticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0; // last bit from left
		int a_temp = 0; 
		int b = 0; // middle bit
		int b_temp = 0; // 
		int c = 0; // first bit from left
		int count=0; // count number
		for (int i =99;i<1000;i++) {
			a = i % 10;
			a_temp = (i-a)/10;
			b = a_temp % 10;
			b_temp = a_temp-b;
			c = b_temp/10;
			if (i == (a*a*a) + (b*b*b) + (c*c*c)) {
				System.out.println("Narcissistic number: " + i);
				count++;
			}
			
		}
		System.out.println("Total Number: " + count);

	}

}
