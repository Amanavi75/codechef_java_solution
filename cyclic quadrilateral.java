class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
	    	int A=sc.nextInt();
	    	int B=sc.nextInt();
	    	int C=sc.nextInt();
	    	int D=sc.nextInt();
	    	if((A+C)==180 && (B+D)==180)
	    	   System.out.println("YES");
	    	else  
		       System.out.println("NO");
		}
	}
}
