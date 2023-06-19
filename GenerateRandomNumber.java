package Week1;

import java.util.*;
public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int num= r.nextInt(200);
		System.out.println("Random number generated is : "+num);

	}

}
