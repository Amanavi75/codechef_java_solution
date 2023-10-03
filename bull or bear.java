class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) 
		{
			int buyingValue = sc.nextInt();
			int sellingValue = sc.nextInt();
			
			if(sellingValue>buyingValue) 
			{
				System.out.println("PROFIT");
			}else if(sellingValue<buyingValue)
			{
				System.out.println("LOSS");
			}else 
			{
				System.out.println("NEUTRAL");
			}
			
			
		}//while
	}
}
