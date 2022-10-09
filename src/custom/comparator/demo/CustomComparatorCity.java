package custom.comparator.demo;

import java.util.Comparator;

public class CustomComparatorCity implements Comparator<Employee>{
@Override
public int compare(Employee e1, Employee e2) {
	return e1.city.compareTo(e2.city);// ascending order
}
}
