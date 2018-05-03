package JavaPracticeProjrct;

public class Proj_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayone [ ] = {1,3,4,2,5};
		int sum = 0;
		for (int i=1; i<arrayone.length; i++) {
			//sum=sum+arrayone[i]
			
			for (int j=0; j<arrayone.length; j++) {
				//sum=sum+arrayone[j];
				int temp = 0;
				if(arrayone[i]<arrayone[j]) {
					temp=arrayone[i];
					arrayone[i]=arrayone[j];
					arrayone[j]=temp;
					
				}
			}
			
		}
		for(int aa = 0; aa<arrayone.length; aa++) {
			sum=sum+arrayone[aa];
		}
		System.out.println("The total summation is: " + sum);
		System.out.println("The min of the array is: " + arrayone[0]);
		System.out.println("The max of the array is: " + arrayone[(arrayone.length)-1]);

	}

}



