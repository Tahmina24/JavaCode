import java.util.Scanner;


public class NewMedication {
	static Scanner ob=new Scanner(System.in);
String name;
	public void getData()
	{
		System.out.println("Please type some few letter of the drug name");
		name=ob.next();
		if(name=="napa")
		{
			System.out.println("You Choose the drug name is napa");
		}
		else if (name=="sec")
		{
			System.out.println("You Choose the drug name is Seclo.\n Which is "
					+ "Helpful for the Gastric Problem");
		}
		}
}
