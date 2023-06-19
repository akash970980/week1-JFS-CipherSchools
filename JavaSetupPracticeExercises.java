package Week1;

import java.util.Scanner;

public class JavaSetupPracticeExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check +ve , -ve or Neutral");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("+ve");
		}
		else if(num==0) {
			System.out.println("Neutral");
		}
		else {
			System.out.println("-ve");
		}
		
		System.out.println("Enter Salary");
		int salary=sc.nextInt();
		double HRA=0.0, DA=0.0,grossPay=0.0;
		if(salary>=5000) {
			HRA=0.1*salary;
			DA=0.2*salary;
		}
		else {
			HRA=0.2*salary;
			DA=0.3*salary;
		}
		grossPay=salary+DA+HRA;
		System.out.printf("HRA is : %.2f \nDA is : %.2f \nsalary is : %d",HRA,DA,salary);
//		System.out.println(grossPay);

	}

}
