package custom.comparator.demo;

import java.util.TreeSet;

public class EmployeeTest1 {

	public static void main(String[] args) {
		
			Employee e1 = new Employee("Ajay","Pune",101);
			Employee e2 = new Employee("Bala","Mumbai",102);
			Employee e3 = new Employee("Chetan","Nagpur",103);
			Employee e4 = new Employee("Danny","Chennai",104);
			Employee e5 = new Employee("Ema","Hyderabad",105);
	 
			TreeSet t1= new TreeSet(new CustomeComparatorName1());
			
			t1.add(e1);
			t1.add(e2);
			t1.add(e3);
			t1.add(e4);
			t1.add(e5);
			System.out.println("Descending order of name:" +t1);
			System.out.println();
			
			
			
	      TreeSet t2= new TreeSet(new CustomeComparatorCity1());
			
			t2.add(e1);
			t2.add(e2);
			t2.add(e3);
			t2.add(e4);
			t2.add(e5);
			
			System.out.println("Descending order of city:" +t2);
			System.out.println();
			
	      TreeSet t3= new TreeSet(new CustomeComparatorId1());
			
			t3.add(e1);
			t3.add(e2);
			t3.add(e3);
			t3.add(e4);
			t3.add(e5);
			
			System.out.println("Descending order of emp_id:" +t3);
			
		

	}

}
