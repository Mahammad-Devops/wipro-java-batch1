package javaprep;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class linkedList {
public static void main(String[] args) {
	List<String> L1 = new linkedList<String>();
	L1.add("100");
	L1.add("200");
	L1.add("300");
	L1.add("400");
	System.out.println("List of elements");
	for(Object obj: L1) {
		System.out.println(obj);
	}
	L1.remove(400);
	System.out.println("After removing Element");
	for(Object obj: L1) {
		System.out.println(obj);
	}
	L1.add(3,"500");
	System.out.println("After adding element");
	for(Object obj: L1) {
		System.out.println(obj);
	}
	System.out.println("\ntotal elements: " + L1.size());
}
}

