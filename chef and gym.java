class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    if(c>=a && c<a+b)
		    System.out.println("1");
		    else if(c>=a+b)
		    System.out.println("2");
		    else
		    System.out.println("0");
		}
	}
}
