package custom.comparator.demo;

import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Ajay");
		Student s2 = new Student(102, "Bala");
		Student s3 = new Student(103, "Chetan");
		Student s4 = new Student(104, "Danny");
		Student s5 = new Student(105, "Ema");

		TreeSet t1 = new TreeSet();

		t1.add(s3);
		t1.add(s1);
		t1.add(s4);
		t1.add(s2);
		t1.add(s5);
		
		System.out.println("Ascending Order using Roll Number:" +t1);

		System.out.println();


		TreeSet t2 = new TreeSet();


		t2.add(s2);
		t2.add(s1);
		t2.add(s3);
		t2.add(s5);
		t2.add(s4);

		System.out.println("Ascending Order using Name:" +t2);
		

	}

}
