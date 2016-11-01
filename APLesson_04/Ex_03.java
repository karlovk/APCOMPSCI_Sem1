import java.util.Scanner;
public class Ex_03
{
    
    public static void main(String[]args)
    {
       
       Scanner kb = new Scanner(System.in);
       Ex_03 a = new Ex_03();
       
       System.out.println("Please enter Rate : "); 
       double r = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Please enter principal: "); 
       double p = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Please enter number: "); 
       double n = kb.nextDouble();
        
	   kb.nextLine();
       System.out.println("Please enter time: "); 
       double t = kb.nextDouble();
        
        System.out.println("Your monthly payment will be " + a.payment(r, p, n, t));
        
    }
    
    public double payment(double r, double p, double n, double t)
    {
        return  p * ( Math.pow (1+r/n, n*t))/(t*12);
        
    }
    
    
}