package keepTrack;


class Employee {
	
	
	private String empName;
	private String empId;
	private String empDept;
	int salary;
	
	public Employee(String empName, String empId, String empDept, int salary) {
		
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empName+"\n"+empId+"\n"+empDept+"\n"+salary+"\n";
	}
	

}
class EmployeeDetails {
	
	public Employee getEmployeeInfo(String str) {
		String[] details = str.split("\\.|ID|DT|CTC|L");//ID|\\.|DT|CTC|L
		int salary = Integer.parseInt(details[details.length-1]) * 100000;
		return new Employee(details[0]+" "+details[1], details[2], details[3], salary);
	}
	
	public String getEmployeeTaxSlab(Employee e) {
		int salary = e.getSalary();
		if(salary>1000000) return "High";
		if(salary>=800000) return "Medium";
		if(salary>=500000) return "Low";
		return "None";
	}
	
	

}
public class source {

	public static void main(String[] args) {
		EmployeeDetails details = new EmployeeDetails();
		Employee e = details.getEmployeeInfo("Jimmy.RyanIDIE22IT023DTITCTC8L");
		System.out.println(e);
		System.out.println(details.getEmployeeTaxSlab(e));
		
	}

}
