public class StringDemo
{
	public static void main(String [] args)
	{
		String first = "Rich", last = "Raposa";
		String name = first + " " + last;
		System.out.println("Name = " + name);

		double pi = 3.14159;
		String s = "Hello, " + first;
		System.out.println(s + pi + 7);
		System.out.println(pi + 7 + s);
	}
}
