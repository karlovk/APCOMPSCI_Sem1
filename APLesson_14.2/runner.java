import java.util.Scanner;
import java.util.ArrayList;

public class runner
{
   public static void main(String[]args)
   {
       ArrayList<Inter_face> locate = new ArrayList<>();
	   double one = (double) (Math.random() * 100 + 1);
	   double two = (double) (Math.random() * 100 + 1);
       double[] honLoc = {5, 6};
       locate.add(new honda(honLoc));
       locate.add(new toyota("8, 9"));
       locate.add(new gmc(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (Inter_face l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Inter_face l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

        System.out.println(printout);
	   
	   
	   printout = "\n\n" +
               "==========================" + "\nStarting locations after move...";

        for (Inter_face l : locate)
       {
		   l.move(one,two);
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home after move...";

        for (Inter_face l : locate)
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
	
