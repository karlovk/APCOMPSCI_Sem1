import java.util.Scanner;
import java.util.ArrayList;

public class runner_14_1
{
   public static void main(String[]args)
   {
       ArrayList< interface_14_1 > locate = new ArrayList<>();
	   
       double[] honLoc = {5, 6};
	   
       locate.add(new honda_14_1(honLoc));
	   locate.add(new toyota_14_1("8, 9"));
       locate.add(new gmc_14_1(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (interface_14_1 l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (interface_14_1 l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

        System.out.println(printout);
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}