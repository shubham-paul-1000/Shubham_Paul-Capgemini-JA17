package casestudy2;

public class Admin extends Payroll{
	private String name;
    private int salary;
    public Admin() {}
    public Admin(String name, int salary) {
        this.name = name;
        this.salary = salary;
        super.adjustSalary(salary);
    }
    public void doAdminStuff() {
        System.out.println("Admin in control");
    }
}
