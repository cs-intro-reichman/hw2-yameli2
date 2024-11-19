// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int num = Integer.parseInt(args[0]); 
		double calc=1.0;
		for(int i =1; i<num; i++)
		{
			if(i%2==0)
			{
				calc = calc+(1.0/((2.0*i)+1.0));
			}
			else
			{
				calc = calc-(1.0/((2.0*i)+1.0));
			}
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated: "+calc*4.0);

	}
}
