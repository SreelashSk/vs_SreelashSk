package coreJavaAssignment2;

public class PersonEmployeeMainClass {

	public static void main(String[] args) {
	     //Display the details of the person using the getter methods. 
		Person obj = new Person(); 
		obj.setName("Sreelash"); 
		obj.setAge(24);
		obj.setAddress("Kanyakumari");
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge()); 
		System.out.println("Address: " +obj.getAddress());
		
		System.out.println("*******************************");
		
		//Display the details of each person object.
		Person obj1 = new Person("Sreelash", 24, "Kanyakumari");
		Person obj2 = new Person("Suraj", 24, "Jharkand");
		System.out.println(obj1);
		System.out.println(obj2);
		Person.count();
		
		System.out.println("********************************");
		//Create an object of the "Employee" class and display its details.
		Employee emp = new Employee();
		//emp.setEmployeeId(123);
		//emp.setSalary(20000.0);
		System.out.println("Employee Id: "+emp.getEmployeeId());
		System.out.println("Employee Salary: "+emp.getSalary());
//		Employee emp1 = new Employee(123, 20000.0);
//		Employee emp2 = new Employee(456, 20000.0);
//		System.out.println(emp1.getEmployeeId());
//		System.out.println(emp2.getSalary());
		
		
		
	}

}
