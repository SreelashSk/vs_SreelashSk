package coreJavaAssignment2;

public class Employee extends Person {
	private int employeeId = 123;
	private double salary = 20000.0;

//		public Employee(int employeeId, double salary) {
//			this.employeeId = employeeId;
//			this.salary = salary;
//		}
	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

}
