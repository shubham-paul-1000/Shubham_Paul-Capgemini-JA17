package casestudy1_2;
public class Shape {
	String color;
	boolean filled;
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	@Override
	public String toString()
	{
		return "Shape[color = "+color+", filled = "+filled+"]";
	}
}