import java.util.Scanner;
public class Ex_04
{
  
    public static void main(String[]args)
    {
       Scanner kb = new Scanner(System.in);
       Ex_04 volCube = new Ex_04();  
       
       System.out.println("Please enter height: "); 
       double height = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Please enter lenght: "); 
       double lenght = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Please enter width: "); 
       double width = kb.nextDouble();
       
       System.out.println(volCube.subwooverbox(height,lenght, width));
       
    }

    
    public double subwooverbox(double  height, double lenght, double width)
    {
      return height * lenght * width;
    }
}

