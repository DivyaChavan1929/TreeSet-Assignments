package custom.comparator.demo;

import java.util.Comparator;

public class CustomComparatorName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);// ascending order
	}
}
