public class TempConverter
{
	public static void main(String [] args)
	{
		double F = Double.parseDouble(args[0]);
		double C = (5.0/9.0) * (F - 32);
		System.out.println(F + " degrees Fahrenheit = " + C + " degrees Celcius");
	}
}
