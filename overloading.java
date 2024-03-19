package javaprep;


	class method{
		void student(int rollNo) {
			System.out.println("student id " + rollNo);
		}
		void student(String studentname){
			System.out.println("student id" + studentname);
		}
		void student(int rollNo, String studentname) {
			System.out.println("student id " + rollNo + "student id " + studentname);
		}
		void student(String studentname, int rollNo){
			System.out.println("student id " + studentname + "student id " + rollNo);
		}
	}
public class overloading {
		public static void main(String[] args) {
			
		method s = new method();
		s.student(538);
		s.student("Mahammad");
		s.student(538, "Mahammad");
		s.student("Mahammad",538);
		}
}
