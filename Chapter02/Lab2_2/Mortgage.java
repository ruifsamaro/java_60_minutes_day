public class Mortgage
{
	public static void main(String [] args)
	{
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		int N = years * 12;
		double R = rate / (12 * 100);
		
		double payment = principal * (R / (1 - Math.pow(1+R, -N)));
		System.out.println("Monthly payment = $" + payment);
	}
}
