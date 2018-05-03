package JavaPracticeProjrct;



public class Proj7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayone [] = new int [99];
		for(int i = 0; i < arrayone.length; i++) {
			arrayone[i]=i;
			
		}
		Print(arrayone);
		System.out.println();
		// transpose the array
		int len = arrayone.length;
		
		if (len%2==0) {
			for (int num = 0; num <= (len/2); num++) {
				
			
			int temp=0;
			//arrayone[num]=temp;
			temp=arrayone[num];
			arrayone[num]=arrayone[len-1-num];
			arrayone[len-1-num]=temp;
			}
		}
		else if (len%2!=0) {
			for (int num=0; num<=(((len-1)/2)+1);num++) {
				int temp=0;
				//arrayone[num]=temp;
				temp=arrayone[num];
				arrayone[num]=arrayone[len-1-num];
				arrayone[len-1-num]=temp;
				
				
			}
		}
		Print(arrayone);
		System.out.println();
	}
		// define a method
		public static void Print (int x [ ]) {
			for (int a=0; a<x.length; a++) {
				System.out.print(x[a] + " ");
				
				
			}
			
			
		}

	}


