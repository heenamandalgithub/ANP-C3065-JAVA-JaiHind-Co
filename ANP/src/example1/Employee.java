package example1;
class Employee {
	int employeeId;
	String employeeName;
	boolean employeeStatus;
	
	Employee(){
		System.out.println("Non parameterized constructor");
	}
	Employee(int empId,String empName){
		System.out.println("Parameterized constructor");
		employeeId=empId;
		employeeName=empName;
	}
	Employee(int empId)
	{
	}
	Employee(int empId,boolean empName){
	}
		
	void displayEmployeeDetails() {
		int empValue;
		//System.out.println(empValue);
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeStatus);
	}
}
	public class Employee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		Employee employee2=new Employee(1,"heena");
		employee1.displayEmployeeDetails();
		employee2.displayEmployeeDetails();

	}
	}

