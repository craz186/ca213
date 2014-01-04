class WriteInts
{
	public static String writeInt(int num)
	{
		String number=num+"";
		
		if(number.length()<4||(number.charAt(0))==('-')&&number.length()<5)//Handles - signs.
		{
			return number;
		}
		else
		if(num/1000!=0)
			return(writeInt(num/1000)+","+number.substring(number.length()-3,number.length()-0));

		return ""; //Makes sure something is returned.
	}
	public static void main(String[] args)
	{
		int num=155555500;
		System.out.println(writeInt(num));//Testing
	
	}
}