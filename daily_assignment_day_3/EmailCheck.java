package daily_assignment_day_3;
import java.util.*;
public class EmailCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the email:");
		String email=sc.next();
		if(email.contains("@") && email.contains("."))
			System.out.println("Email contains both '@' and '.'");
		else if(email.contains("@"))
			System.out.println("Email contains '@' but not '.'");
		else if(email.contains("."))
			System.out.println("Email contains '.' but not '@'");
		else
			System.out.println("Email does not contain both '@' and '.'");
		sc.close();
	}

}