import java.util.Scanner;

public class Tehtävä {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Console console = new Console();
		Console controller = new Console();
		Console app = new Console();
		
		// Console on / off
		console.startup();
		if (console.isOn == true)
		{
			System.out.println("Console is on.");
		}
		else
		{
			System.out.println("Console has been shut down.");
		} 
		
		// Controller connected / disconnected
		console.connected();
		if (console.controllerOn == true)
		{
			System.out.println("Controller is connected.");
		}
		else
		{
			System.out.println("Controller disconnected.");
		}
		
		// Is an app running in the system or not
		console.appRunning();
		if (console.appOn == true)
		{
			System.out.println("An app is currently running.");
		}
		else
		{
			System.out.println("An app is not in use.");
		}
		
	}
	} // Main ends here!!!


class Console
{
	// Attribute 1
	public boolean isOn;
	
	public void startup()
	{
		isOn = true;
	}
	
	public void shutdown()
	{
		isOn = false;
	}
	
	
	// Attribute 2
	public boolean controllerOn;
	
	public void connected()
	{
		controllerOn = true;
	}
	
	public void disconnected()
	{
		controllerOn = false;
	}
	
	
	// Attribute 3
	public boolean appOn;
	
	public void appRunning()
	{
		appOn = true;
	}
	
	public void appOff()
	{
		appOn = false;
	}
} // End of class "Console"