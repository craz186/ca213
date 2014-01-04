import java.util.*;
class Passwords
{
	public static void main(String[] args)
	{
		HashMap<String,String> passwords= new HashMap<>();
		String input1;
		String input2;
		while(!Console.endOfFile())
		{
			input1= Console.readToken();
			input2= Console.readToken();
		
			if(input2.equals("?"))
			{
				if(passwords.get(input1)==null)
					System.out.println(input1+ " unknown");
				else
					System.out.println(passwords.get(input1));
			}
			else
				passwords.put(input1,input2);
		}
	}
}