/* Caroline Hsu - 09/24/2020
This program shows computes and displays the amount of gallons for 
any given job. */

public class QuartsToGallons
{
	public static void main (String[] args)
		{
			// This section declares variables
			int paintingQuarts = 24;
			int gallons;
			int quarts;
			final int QUARTS_IN_GALLON = 4;
			
			/* This section computes the amount of gallons in a job
			that needs 24 quarts */
			gallons = paintingQuarts / QUARTS_IN_GALLON;
			System.out.println("We need to complete a painting job with " + 
													paintingQuarts + " quarts.");
			System.out.println("The amount of gallons in " + paintingQuarts +
											 " quarts is " + gallons + " gallons.");
			System.out.println("Therefore, we need " + gallons + " gallons" +
													" to complete the paint job.");			
			
			/* This section computes the amount of gallons in a job 
			that needs 57 quarts*/
			paintingQuarts = 57;
			gallons = paintingQuarts / QUARTS_IN_GALLON;
			System.out.println("We need to complete a painting job with " + 
													paintingQuarts + " quarts.");
			System.out.println("The amount of gallons in " + paintingQuarts +
												" quarts is " + gallons + " gallons.");
			
			/* Because 57 is not a number divisible by 4, we need to
			find the remainder to get the amount of quarts */
			quarts = paintingQuarts % QUARTS_IN_GALLON;
			System.out.println("The amount of quarts leftover is " + quarts + " quart.");
			System.out.println("Therefore, we need " + gallons + " gallons and " 
													+ quarts + " quarts to complete the paint job."); 
		}
}