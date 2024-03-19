package javaprep;

class employee {
	int empid = 538;
	String empname = "Mahammad";
	
	void display() {
		System.out.println("Employee id: " + empid + "Employeename: " + empname );
	}
}
class Employeegrade extends employee {
		char empGrade = 'A';
		
		void display() {
			System.out.println("Employee id: " + empid + "\tEmployeename: " + empname + "\tEmgrade: " + empGrade);
		
	}

}
public class overriding{

	public static void main(String[] args){
		
		Employeegrade eg = new Employeegrade();
		eg.display();
	}
}




