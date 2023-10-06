class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,a,b,c;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    if(a!=b && b!=c && c!=a)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
