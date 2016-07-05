public class Employee
{
	// declaing globally 

	private int employeeId ;
	private String employeeName ;
	private double employeeSalary ;

	// setting employee data

	public void setEmployee(int id, String name, double salary)
	{
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
	}

	// getting salary for an employee

	public void getEmployeeData()
	{
		System.out.println("The Salary of "+employeeName+" with Employee Id: "+employeeId+" is : "+employeeSalary); // Printing salary
	}

	public static void main(String[] args) 
	{
		Employee objectEmployee = new Employee(); //creating object
		objectEmployee.setEmployee(12345, "Jai Gupta", 12000.98);
		objectEmployee.getEmployeeData();
	}
}

