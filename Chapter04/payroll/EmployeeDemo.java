public class EmployeeDemo
{
	public static void main(String [] args)
	{
		Employee e1, e2;
		e1 = new Employee();
		e2 = new Employee();

		e1.name = "Robert Smith";
		e1.address = "123 Main St., Anytown, USA";
		e1.number = 101;
		e1.SSN = 111223333;
		e1.salary = 10000.00;

		System.out.println(e1.computePay());
		e1.mailCheck();

		e2.name = "Jane Smith";
		e2.address = "321 Main St., Anytown, USA";
		e2.number = 202;
		e2.SSN = 333221111;
		e2.salary = 100000.00;

		System.out.println(e2.name + " " + e2.SSN);
		System.out.println(e2.computePay());
		e2.mailCheck();
	}
}