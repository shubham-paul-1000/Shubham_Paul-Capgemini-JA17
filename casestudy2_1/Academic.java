package casestudy2_1;
public class Academic extends Payroll{
	private String name;
	private int salary;
	public Academic() {}
	public Academic(String name, int salary) {
		this.name = name;
		this.salary = salary;
		super.adjustSalary(salary);
	}
	public void giveLecture() {
		System.out.println("Giving lecture");
	}
}