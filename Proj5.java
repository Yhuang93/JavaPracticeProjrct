package JavaPracticeProjrct;

public class Proj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Finalsum = prosum(30);
		System.out.print("The final output is:"+ Finalsum);
	}
		public static double prosum(int n) {
			double sum = 0;
			double product = 1;
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=i; j++) {
					
					product = product*j;
					
					
				}
				sum= sum+product;
				product = 1;
				
				
			}
			return sum;
			
		}

	}


