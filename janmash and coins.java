class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//read the input from keyboard
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     //form a loop so that it should continued till total test cases
	     while(t-->0)
	     {
	         //read x and y values
	         int x=sc.nextInt();
	         int y=sc.nextInt();
	         //total amoutnt calculation
	         int j=x*10+y*5;
	         System.out.println(j);
	     }
	}
}
