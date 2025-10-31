package Dimensional;
import java.util.Scanner;
import java.util.Arrays;

public class Single {
	public static void main(String args[])
	{
	 /*  Scanner user = new Scanner(System.in);
		int arrays[]= new  int[6];
		for (int i = 0 ; i <  6 ;i++) {
			
			System.out.println("Enter  number _"+i);
			int number  =  user.nextInt();
			
			arrays[i] = number;
		}
		System.out.println(Arrays.toString(arrays));
		
		user.close(); */
		
		
		
		//DImenisonal array;
		 Scanner  user  = new Scanner(System.in);
		 String Jashu  [][] = new String [3][3];
		  for (int i = 0; i< 3; i++)
		  { 
			  for (int j = 0; j <3;j++) {
				  System.out.println("Enter two_diensions_array "+i+""+j);
				  Jashu[i][j] = user.next();
				  
			  }

		  }
		  
		  
		 /* for(int i =0 ; i<3;i++) {
			  for (int j=0;j<3;j++) {
				  System.out.print(Jashu[i][j]+" ");
			  }
			  System.out.println(
					  );
		  }
		  */
		  
		  for (String arr[] :Jashu) {
			  for (String X : arr) {
				  System.out.print(X+" ");
			  }
			  System.out.println();
		  }
		  user.close();
	}
}