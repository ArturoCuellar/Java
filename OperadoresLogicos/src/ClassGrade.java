import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		double str1 = s.nextDouble();
		
		if(str1 < 3) {
			System.out.println("Failed");
		}else if(str1>=3 && str1 <6) {
			System.out.println("Insufficient");
		}else if(str1>=6 && str1<10) {
			System.out.println("Good");
		}else if(str1==10) {
			System.out.println("Excellent");
		}else {
			System.out.println("Error");
		}

	}

}
