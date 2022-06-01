package Constructor;

public class Employee {
	
	int id;
	String name;
	float salary;
	Employee(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(name+" "+id+" "+salary);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(100,"Zoro",80000f);
		Employee emp1 = new Employee(101,"Priya",50000f);
		Employee emp2 = new Employee(102,"Loki",45000f);
		
		emp.display();
		emp1.display();
		emp2.display();
		
	}

}
