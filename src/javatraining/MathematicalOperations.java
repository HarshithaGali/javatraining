import java.util.*;
import java.lang.*;
class MathematicalOperations {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         try{
         System.out.println("Enter the first number");
         int n1=sc.nextInt();
         System.out.println("Enter the second number");
         int n2=sc.nextInt();
         System.out.println("Sum:"+(n1+n2)+"\nDifference: "+(n1-n2)+"\nProduct: "+(n1*n2)+"\nAverage: "+((n1+n2)/2)+"\nDistance: "+Math.abs(n1-n2)+"\nMax: "+Math.max(n1,n2)+"\nMin: "+Math.min(n1,n2));
         }
         catch(InputMismatchException e)
         {
             System.out.println(" Input Mismatch");
         }
          
    }
}
