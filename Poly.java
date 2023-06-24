package Week1;


// Polymorphism
//	 an ability of an object to take many formes..
//	static/dynamic
//static : overloading function
//dynamic : over riding
public class Poly {

//	Function overloading : defining multiple function with same name but with diffrent parameters
//	add is exsisting form using parameters
	
	void add(int num1, int  num2) {
		System.out.println(num1+num2);
	}
	void add(int num1, int  num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	void add(float num1, float num2) {
		System.out.println(num1+num2);
	}
	void add(int num1, float  num2) {
		System.out.println(num1+num2);
	}
	void add(float num1, int  num2) {
		System.out.println(num1+num2);
	}
	
	
		// rules
//		no of parameters must be different.
//		no of parameters are same but it is valid because type is different
//		no of parameters are same and type are almost same. Its sequence/ order is different
		
	public static void main(String[] args) {
		Poly p = new Poly();
		p.add(12.2f, 300);
		
		System.out.println();
	}
	

}
