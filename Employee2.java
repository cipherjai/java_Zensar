public class Employee2
{
	// instance variables

	private int employeeId ;
	private String employeeName ;
	private double employeeSalary ;

	Employee2()
	{
		employeeId = 12321;
		employeeName = "Jai Gupta";
		employeeSalary = 120000.0;
	}

	Employee2(int id, String name, double salary)
	{
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
	}

	public void setEmployeeId(int id)
	{
		employeeId = id;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeName(String name)
	{
		employeeName = name;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeSalary(double salary)
	{
		employeeSalary = salary ;
	}

	public double getEmployeeSalary()
	{
		return employeeSalary ;
	}

	public String toString()
	{
		return "The salary of "+employeeName+" with employee Id "+employeeId+" is "+employeeSalary;
	}


/*	// setting employee data

	/*
	public void setEmployee(int id, String name, double salary)
	{
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
	}

	// getting salary for an employee

	/*public void getEmployeeData()
	{
		System.out.println("The Salary of "+employeeName+" with Employee Id: "+employeeId+" is : "+employeeSalary); // Printing salary
	}


	public int setEmployeeId(int id)
	{
		employeeId = id;
		return employeeId;
	}

	public String setEmployeeName(int name)
	{
		employeeName = name;
		return employeeName;
	}

	public double setEmpl

	public static void main(String[] args)
	{
		Employee2 objectEmployee = new Employee2(); //creating object
		objectEmployee.setEmployee(12345, "Jai Gupta", 12000.98);
		objectEmployee.getEmployeeData();
	}
}

*/
