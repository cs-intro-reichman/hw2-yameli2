// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter =1;
		int j;
		if (mode.equals("v")) 
		{
			for(int i=1; i<=seed; i++)
			{
				j=i;
				System.out.print(j+" ");
				while(j != 1|| counter == 1 )
				{
				if(j%2 == 0 ){
					j= j/2;
					System.out.print(j+" ");
					counter++;
				}
				else
				{
					j = (j*3)+1;
					System.out.print(j+" ");
					counter++;
				}
			   }
			   System.out.println("("+counter+") ");
			   counter=1;
			}
			System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		}
		else
			System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		}
		}

