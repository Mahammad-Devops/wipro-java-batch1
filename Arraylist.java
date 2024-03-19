package javaprep;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {

		List<Double> l1 = new ArrayList<Double>();
		
		l1.add(1000.00);
		l1.add(2000.000);
		l1.add(3000.0000);
		l1.add(4000.00000);
		l1.add(5000.000000);
		
		System.out.println("List of elements");
		for (Object obj : l1) {
			System.out.println(obj);
		}
		
		l1.remove(1);
		
		System.out.println("\nafter removing the element");
		for (Object obj : l1) {
			System.out.println(obj);
		}
		
		l1.add(2, 6000.);
		System.out.println("\nAfter inserting elements");
		for (Object obj : l1) {
			System.out.println(obj);
		}
		System.out.println("\nTotal elements: " + l1.size());
		
	}

}


