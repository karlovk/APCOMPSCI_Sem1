import java.util.ArrayList;
import java.util.Arrays;
public class satellite
{
   public static void main(String[]args)
   {
       ArrayList<thecarclass> locate = new ArrayList<>();
	   
       double[] positions = new double[6];
	   
	   for(int i=0; i<6; i++)
	   {
		   positions[i] = Math.round((double)(Math.random()*100) + 1);
	   }
	   double[] honLoc = {5, 6};
	   
       locate.add(new honda(honLoc));
	   
       locate.add(new toyota("8, 9"));
	   
       locate.add(new gmc(3, 8));
	   
	   int i = 0;
	   for(thecarclass loc : locate)
	   {
			loc.move(positions[i], positions[i+1]);
			i += 2;
	   }
	   
	   double[] home = {0, 0};

       String printout = "\n\n" +
              "==========================" + "\nStarting locations...";
	
       for(thecarclass loc : locate)
	   {
		   printout += "\nLocation for " + loc.getID() + ": (" + getLocation(loc.getLoc())+ ")";
	   }
	   printout += "\n\n" + "==========================";
	   
	   i = 0;
	   for (thecarclass loc : locate)
       {
		   
		   double[] newPosition = loc.getLoc();
		   
		   double x = newPosition[0], y = newPosition[1];
		   
		   printout += "\nAfter " + loc.getID() + " moved (" + positions[i] + ", " + positions[i+1] + ")" + "\nNew Location: " + "(" + (x + positions[i]) + ", " + (y + positions[i+1]) + ")";
		   
		   i += 2;
		   
       }
	   
	   

       printout += "\n\n" + "==========================" +
                  "\nDistance from home...";

       for (thecarclass l : locate)
       {
		   
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
		   
       }
       System.out.println(printout);
   }

    public static double getDistance(double[] thecarclass, double[] home)
   {
	   
       return Math.round(Math.sqrt((Math.pow(thecarclass[0] - home[0], 2)+ Math.pow(thecarclass[1] - home[1], 2))));
	   
   }

    public static String getLocation(double[] loc)
   {
	   
       return loc[0] + ", " + loc[1];
	   
   }
}