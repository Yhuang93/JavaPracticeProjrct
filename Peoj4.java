package JavaPracticeProjrct;

public class Peoj4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10;
		for(int i = 1; i <= length; i++) {
			for(int j = 1; j<= length-i;j++) {
				System.out.print(" ");
			}
			for (int j = 1;j <= i;j++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
		}
		

	}

}
