package custom.comparator.demo;

import java.util.Comparator;

public class CustomeComparatorName1 implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e2.name.compareTo(e1.name);// descending order
	}

}
