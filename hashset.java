package sample;
import java.util.*;

class Employee{
	int id;
	String name;
	int contact;
	
	public Employee(int id,String name,int contact) {
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	
}

public class hashset {

	public static void main(String[] args) {
		HashSet<Employee> hs= new HashSet<Employee>();
		Employee a = new Employee(1,"A",5);
		Employee b = new Employee(2,"B",6);
		Employee c = new Employee(3,"C",7);
		hs.add(a);
		hs.add(b);
		hs.add(c);
		for(Employee e: hs) {
			System.out.println(e.id+e.name+e.contact);
		}
		List<Employee> list = new ArrayList<Employee>(hs);
		System.out.println(list.get(0).name);
	}

}
