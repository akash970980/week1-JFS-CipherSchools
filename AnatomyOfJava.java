package Week1;

import java.util.*;
public class AnatomyOfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		code 1 Guesser game
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int num= r.nextInt(200);
		System.out.println("Random number generated is : "+num);
		
		
		
		for(int i=0;i<6;i++) {
			System.out.println("Guess the number");
			int userChoice=sc.nextInt();
			if (userChoice>num) System.out.println("Your guess is higher");
			else if(userChoice<num) System.out.println("your guess is lower");
			else {
				System.out.println("Hey! you guessed it right");
				break;
			}
		}
		
//		code 2 while loop
		char ch='A';
		while(ch<=90) {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
		
//		code 3 do while loop
		char ch1='A';
		do {
			System.out.print(ch1+" ");
			ch1++;
		}while(ch1<='Z');
		System.out.println();
		
//		code 4 Get user division and print its rank

		System.out.println("Enter your division");
		int div=sc.nextInt();
		switch(div) {
		case 1:
			System.out.println("First Rank");
			break;
	
		case 2:
			System.out.println("Second Rank");
			break;
		case 3:
			System.out.println("Third Rank");
			break;
		default:
			System.out.println("No Rank");
		}

		
//	code 5 to print long burp as per input
		System.out.println("Enter length of ur rrrr :");
		String s="";
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			s=s+"r";
			i++;
		}
		System.out.println("Bu"+s+"p");
		
//		code 6 birthday  and police problem
		System.out.println("Enter speed : ");
		int speed =sc.nextInt();
		System.out.println("Is today ia ur bday???");
		boolean isBirthday=sc.nextBoolean();
		
		if(isBirthday==true) {
			speed-=5;
		}
		
		if(speed>80) System.out.println("High Ticket");
		else if(speed >=60) System.out.println("Mid Ticket");
		else System.out.println("No Ticket");
	}

}
