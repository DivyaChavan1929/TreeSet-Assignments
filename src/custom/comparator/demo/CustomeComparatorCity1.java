package custom.comparator.demo;

import java.util.Comparator;

public class CustomeComparatorCity1 implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.city.compareTo(e1.city);// decending order
		
	}

}
