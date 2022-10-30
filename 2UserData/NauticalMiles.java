/* Caroline Hsu - 09/29/2020
This program computes the number of miles and kilometers to nautical miles
for any given job.
*/
public class NauticalMiles
{
	public static void main (String[] args)
		{
			// This section declares variables
			int nauticalMiles = 53;
			double miles;
			double kilometers;
			final double NAUTICAL_MILE_KM = 1.852;
			final double NAUTICAL_MILE_MILE = 1.15;
			
			// This section computes the value of kilometers for 53 nautical miles
			kilometers = nauticalMiles * NAUTICAL_MILE_KM;
			System.out.println("We need to compute the amount of kilometers for " + 
													nauticalMiles + " nautical miles.");
			System.out.printf("The amount of kilometers in " + nauticalMiles +
												" nautical miles is%7.3f kilometers. \n" , kilometers);
			
			// This section computes the value of miles for 53 nautical miles
			miles = nauticalMiles * NAUTICAL_MILE_MILE;
			System.out.println("We need to compute the amount of miles for " + 
													nauticalMiles + " nautical miles.");
			System.out.printf("The amount of miles in " + nauticalMiles +
												" nautical miles is %6.3f miles. \n" , miles);
			
			// This section computes the value of kilometers for 27 nautical miles
			nauticalMiles = 27;
			kilometers = nauticalMiles * NAUTICAL_MILE_KM;
			System.out.println("We need to compute the amount of kilometers for " +
													nauticalMiles + " nautical miles.");
			System.out.printf("The amount of kilometers in " + nauticalMiles +
												" nautical miles is %6.3f kilometers. \n" , kilometers);
			
			// This section computes the value of miles for 27 nautical miles
			miles = nauticalMiles * NAUTICAL_MILE_MILE;
			System.out.println("We need to compute the amount of miles for " + 
													nauticalMiles + " nautical miles.");
			System.out.printf("The amount of miles in " + nauticalMiles +
												" nautical miles is%7.3f miles. \n" , miles);
			
			// This section computes the value of kilometers for 253 nautical miles
			nauticalMiles = 253;
			kilometers = nauticalMiles * NAUTICAL_MILE_KM;
			System.out.println("We need to compute the amount of kilometers for " +
													nauticalMiles + " nautical miles.");
			System.out.printf("The amount of kilometers in " + nauticalMiles +
												" nautical miles is%8.3f kilometers. \n" , kilometers);
			
			// This section computes the value of miles for 253 nautical miles
			miles = nauticalMiles * NAUTICAL_MILE_MILE;
			System.out.println("We need to compute the amount of miles for " + 
													nauticalMiles + " nautical miles.");
			System.out.printf("The amount of miles in " + nauticalMiles +
												" nautical miles is%8.3f miles. \n" , miles);
		}
}