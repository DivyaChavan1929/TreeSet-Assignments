package custom.comparator.demo;

import java.util.Objects;

public class Employee {

	String name;
	String city;
	int emp_id;
	
	
	
	
	public Employee(String name,String city,int emp_id) {
		this.name=name;
		this.city=city;
		this.emp_id=emp_id;
		
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return emp_id == other.emp_id;
	}

	
}
