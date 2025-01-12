import java.util.Scanner;
public class PhoneBook
{ 
	private String name, city, phone;
	private int areacode;
	public PhoneBook ( )
	{ 
		name = new String ( "Thomas Jefferson" );
		city = new String ( "New York" ); 
		phone = new String ( "123-4567" );
	}
	public static void main ( String [] args )
	{ 
		PhoneBook book = new PhoneBook ( );
		book.getInput ( );
		book.processInputAndPrint ( ); 
	}
	public void getInput ( )
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("% ");
		System.out.print("Enter name as first last: ");
		name = reader.nextLine();
		System.out.print("Enter city of residence: ");
		city = reader.nextLine();
		System.out.print("Enter phone number (without area code) : ");
		phone = reader.nextLine();
	} 


	public void processInputAndPrint() 
	{
		if (city.equalsIgnoreCase("Mountain View")||city.equalsIgnoreCase("Palo Alto"))
		{
			System.out.print("The phone number will be alphebatized under " + name.charAt(name.lastIndexOf(" ")+1));
			System.out.print(", under"+ name.substring(name.lastIndexOf(" ")) +  ", "+ name.substring(0, name.lastIndexOf(" ")) + " at ");
			System.out.print("(650) "+ phone);
		}
		else if (city.equalsIgnoreCase("Cupertino")||city.equalsIgnoreCase("San Jose"))
		{
			System.out.print("The phone number will be alphebatized under " + name.charAt(name.lastIndexOf(" ")+1));
			System.out.print(", under"+ name.substring(name.lastIndexOf(" ")) +  ", "+ name.substring(0, name.lastIndexOf(" ")) + " at ");
			System.out.print("(408) "+ phone);
		}
		else
			System.out.print("please enter a city which is Mountain View, Palo Alto, Cupertino, or San Jose");
		System.out.print("\n%");
		
		
	}
}
