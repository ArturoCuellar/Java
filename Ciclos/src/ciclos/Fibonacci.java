package ciclos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
			Scanner s = new Scanner(System.in);
			int num=0;
		    int num1=0;
		    int num2=1;
		    int i=0;
		    int result=0;
		    
		    System.out.print("Enter any positive integer: ");
		    num = s.nextInt();
		 
			
			do {
				 num2 = num1 + num2;
		         num1 = num2 - num1;

				System.out.println(num2);
				i++;
			}
			while(i<num);
		}
}
