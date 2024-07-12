import java.util.*;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		double d=sc.nextDouble();
		if(d<0)
		{
			System.out.println("Negative");
		}
		else if(d>0)
		{
			System.out.println("Positive");
			
		}
		else
			System.out.println("Zero");

	}

}
