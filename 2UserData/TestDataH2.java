public class TestDataH2
{
	public static void main(String[] args)
	{
		// declaration
		int pelania = -5; // this is what u get for being late
		int brain = 12;
		double mcv;
		
		// addition
		pelania = pelania + 10;
		System.out.println("Value of pelania is " + pelania);
		
		// subtraction
		pelania = pelania - 3;
		System.out.println("Value of pelania is " + pelania);
		
		// multiplication
		pelania = brain * pelania;
		System.out.println("Value of pelania is " + pelania);
		
		// pelania is now 24
		// integer division calculates the quotient
		// division, shows quotient with no remainder, / is integer division
		pelania = pelania / 5;
		System.out.println("Value of pelania is " + pelania);
		
		// division, shows the remainder with no quotient
		// calculating remainder
		pelania = 23;
		pelania = pelania % 5;
		System.out.println("Value of pelania is " + pelania);
		
		// regular division of a decimal number
		// (double) also does decimal division
		// reassign pelania as a different number and divide it
		pelania = 17;
		mcv = pelania / 4.0;
		System.out.println("Value of mcv is " + mcv);
		
		mcv = pelania + mcv;
		System.out.println("Value of mcv is now " + mcv);
		 
		mcv = 13.999;
		pelania = (int)mcv + pelania;
		System.out.println("Value of pelania is now " + pelania);

		/* the 9 is for the amount of spaces after is including the 18.
		The 3 is for the amount of decimals
		The f 
		It counts from right to left, looks at decimal, realizes there are 
		3 places for the 757, and then moves on to 18. and counts 3
		spaces after the 18.757 so that there are 3 spaces after is
		*/
		mcv = 18.75678943;
		System.out.println("Mcv is " + mcv);
		System.out.printf("Mcv is%9.3f now fsdfidsj \n" , mcv);
		
	}
}