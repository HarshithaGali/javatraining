import java.util.*;
public class InchToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double d=sc.nextDouble();
		double m=d*0.0254;
		System.out.printf("%.2f",m);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}

	}

}
