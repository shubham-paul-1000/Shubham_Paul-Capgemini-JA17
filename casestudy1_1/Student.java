package casestudy1_1;
public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public String getProgram()
	{
		return program;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public double getFee()
	{
		return fee;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	@Override
	public String toString()
	{
		return "Student[Person[name = "+getName()+", address = "+getAddress()+"], program = "+program+", year = "+year+", fee = "+fee+"]";
	}
}
