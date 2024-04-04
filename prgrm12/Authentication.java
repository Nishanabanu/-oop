import java.util.Scanner;
class InvalidUserException extends Exception
{
	public InvalidUserException(String msg)
	{
		super (msg);
	}
}
public class Authentication
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Username: ");
		String username=sc.nextLine();
		System.out.print("Enter the Password:");
		String password=sc.nextLine();
		try
		{
			if (username.length() < 8)
			{
				throw new InvalidUserException("Invalid Username,Username must be greater than 7 characters!");
			}
			else if(!password.equals("asdfg123"))
			{
				throw new InvalidUserException("Incorrect Password,Enter correct Password!");
			}
			else
			{
				System.out.println("Login Successfully...");
			}
		}
		catch(InvalidUserException e)
		{
			e.printStackTrace();
		}
	}
}
