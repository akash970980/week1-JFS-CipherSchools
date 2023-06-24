package Week1;

public class Constructor {
	
//	Identification
//	Same name as class name
//	No return type
	
	
//	Purpose
//	It creates/Intilizes object in memory(RAM)
//	you can use constructor block to initialize some default values...
	int employeeId=101;
	int salary=3000;
	String dept="testing";
	
	Constructor(){
		employeeId=101;
		salary=3000;
		dept="testing";
	}
	
	Constructor(int empid, int sal, String d){
		employeeId=empid;
		salary=sal;
		dept=d;
	}

	public static void main(String[] args) {
		
		Constructor rahul= new Constructor();
		System.out.println(rahul.employeeId+" Salary "+rahul.salary+ " Dept "+rahul.dept );
		
		
		Constructor mehul= new Constructor();
		System.out.println(mehul.employeeId+" Salary "+mehul.salary+ " Dept "+mehul.dept );
		
		Constructor harsha= new Constructor(102, 3500,"Engineering");
		System.out.println(harsha.employeeId+" Salary "+harsha.salary+ " Dept "+harsha.dept );

	}

}
