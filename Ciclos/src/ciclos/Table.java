package ciclos;
import java.util.Scanner;
public class Table {
	

	
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result 
	        int i=1;
	       
	        while(i <= 10)
	        {
	        	int  resultado = num * i++;
	            System.out.printf("\ntabla \n "+ resultado);
	            
	        }
	    }
	}

