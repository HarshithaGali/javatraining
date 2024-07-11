import java.util.*;
class ConvertSeconds {
    
        public static void main(String args[]) {
        System.out.println("Enter the seconds you want to convert:");
        Scanner sc=new Scanner(System.in);
        int sec=sc.nextInt();
        int c[]={1,60,3600};
        
        for(int i=c.length-1;i>=0;i--)
            {
                int k=sec/c[i];
                sec=sec-c[i]*k;
                if(i==2)
                {
                    System.out.print(k+" Hours ");
                }
                else if(i==1)
                {
                    System.out.print(k+" Minutes ");
                }
                else if(i==0)
                {
                    System.out.print(k+" Seconds");
                }
               
            }
     
    }
    
}
