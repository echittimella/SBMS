package jsonToJava;
public class Employee {
    public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_addr() {
		return emp_addr;
	}
	public void setEmp_addr(String emp_addr) {
		this.emp_addr = emp_addr;
	}
	private String emp_name;
    private int emp_id;
    private String emp_addr;
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", emp_addr=" + emp_addr + ", toString()="
				+ super.toString() + "]";
	}
   
}