import java.util.Scanner;
public class Ex_03
{
    
    public static void main(String[]args)
    {
        
        Ex_03 payment = new Ex_03();
        int rate = 12;
        int principal = 34;
        int time = 56;
        int number = 78;
        
        
        System.out.println("Your monthly will be " + payment (rate, principal, time, number));
        
    }
    
    public double payment(double rate, double principal, double number, double time)
    {
        return ( p * ( Math.pow (1+r/n, n*t)))/(t*12);
        
    }
    
    
}