public class Elevator
{
	public int currentFloor;
	public int destinationFloor;
	public boolean up;
	public boolean doorsOpen;

	public Elevator(int currentFloor)
	{
		this.currentFloor = currentFloor;
		System.out.println("Inside one-argument constructor");
	}

	public Elevator()
	{
		this(1);
		System.out.println("Inside no-argument constructor");
	}

	public void goToFloor(int floor)
	{
		System.out.println("Changing destination floor to " + floor);
		destinationFloor = floor;
		if(destinationFloor > currentFloor)
		{
			goingUp();
		}
		else if(destinationFloor < currentFloor)
		{
			goingDown();
		}
		currentFloor = destinationFloor;
	}

	public void openDoors()
	{
		System.out.println("Opening doors");
		doorsOpen = true;
	}

	public void closeDoors()
	{
		System.out.println("Closing doors");
		doorsOpen = false;
	}

	public void goingUp()
	{
		System.out.println("Going up...");
		up = true;
	}	

	public void goingDown()
	{
		System.out.println("Going down...");
		up = false;
	}
}