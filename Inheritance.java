package Week1;

//Memory usuage optimization
//code reusuability
//		--faster development
//		--central code (East to debug/ test)
//productivity/ efficiency

public class Inheritance {
	int width;
	int height;
	
	
	
	void display(String item) {
		System.out.println(item +" Width "+width+" Height "+height);
	}
	public static void main(String[] args) {
		Chair neelkamal= new Chair();
		neelkamal.foo();
	}
}

class Chair extends Inheritance{
//	int width;
//	int height;
	
//	void getDebt() {
//		
//	}
	void foo() {
		width=10;
		height=20;
		display("chair");
	}
	
}

class Table extends Inheritance{
//	int width;
//	int height;
	
	void foo() {
		width=30;
		height=50;
		display("Table");
	}
}

class Almira extends Inheritance{
//	int width;
//	int height;
	void foo() {
		width=100;
		height=200;
		display("Almira");
	}
}
//complexity : Memory occupied = n*8 bytes here n is count of classes.
