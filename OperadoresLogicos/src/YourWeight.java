import java.util.Scanner;

public class YourWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your weigth in Kilograms: ");
		double weight = s.nextDouble();
		System.out.println("Please enter your heigth in meters: ");
		double height = s.nextDouble();
		
		double imc = weight/(height* height);
		System.out.println("Your imc is: "+ imc);
		if(imc < 18.5) {
			System.out.println("Low Weight");
		}else if(imc >= 18.5 && imc <24.9) {
			System.out.println("Normal");
		}else if(imc >=25 && imc<29.9) {
			System.out.println("Overweight");
		}else if(imc>30) {
			System.out.println("Obessity");
		}else {
			System.out.println("Error");
		}
		
	}

}
