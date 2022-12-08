import java.util.Scanner;

public class Tehtävä {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// Blueprint / Object
		Console console = new Console();
		console.printData();
		
		// Object 1
		Console console1 = new Console("Playstation");
		console1.printData();
		
		// Object 2
		Console console2 = new Console("XBOX", "450$");
		console2.printData();
		
		// Object 3
		Console console3 = new Console("Nintendo", "400$", "7.7");
		console3.printData();
		
		
// OLD USELESS CODE	BELOW	
		// Console on / off
//		console.startup();
//		if (console.isOn == true)
//		{
//			System.out.println("Console is on.");
//		}
//		else
//		{
//			System.out.println("Console has been shut down.");
//		} 
		
		// Controller connected / disconnected
//		console.connected();
//		if (console.controllerOn == true)
//		{
//			System.out.println("Controller is connected.");
//		}
//		else
//		{
//			System.out.println("Controller disconnected.");
//		}
		
		// Is an app running in the system or not
//		console.appRunning();
//		if (console.appOn == true)
//		{
//			System.out.println("An app is currently running.");
//		}
//		else
//		{
//			System.out.println("An app is not in use.");
//		}
// OLD USELESS CODE ENDS HERE		
	}
	} // Main ends here!!!


class Console
{
	// Attributes
	public boolean isOn;
	public boolean controllerOn;
	public boolean appOn;
	// Data
	public String brand;
	public String price;
	public String version;
	
	
	// Default constructor
	public Console()
	{
		isOn = false;
		controllerOn = false;
		appOn = false;
		brand = "" ;
		price = "" ;
		version = "";
	}
	
	
	// Constructor 1
	public Console(String brandName)
	{
		isOn = false;
		controllerOn = false;
		appOn = false;
		brand = brandName;
		price = "500$";
		version = "1.9";
	}
	
	
	// Constructor 2
	public Console(String brandName, String priceCost)
	{
		isOn = false;
		controllerOn = false;
		appOn = false;
		brand = brandName;
		price = priceCost;
		version = "2.7";
	}
	
	
	// Constructor 3
	public Console(String brandName, String priceCost, String versionNumber)
	{
		isOn = false;
		controllerOn = false;
		appOn = false;
		brand = brandName;
		price = priceCost;
		version = versionNumber;
	}
	
	
	// Attribute 1
	public void startup()
	{
		isOn = true;
	}
	public void shutdown()
	{
		isOn = false;
	}
	
	
	// Attribute 2
	public void connected()
	{
		controllerOn = true;
	}
	public void disconnected()
	{
		controllerOn = false;
	}
	
	
	// Attribute 3
	public void appRunning()
	{
		appOn = true;
	}
	public void appOff()
	{
		appOn = false;
	}
	
	
	// Print Data
	public void printData()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("System version: " + version);
		if (isOn)
		{
			System.out.println("Console is on.");
		}
		else
		{
			System.out.println("Console has been shut down.");
		} 
		if (controllerOn)
		{
			System.out.println("Controller is connected.");
		}
		else
		{
			System.out.println("Controller disconnected.");
		}
		if (appOn)
		{
			System.out.println("An app is currently running.");
		}
		else
		{
			System.out.println("An app is not in use.");
		}
		
	}
	
} // End of the class "Console"