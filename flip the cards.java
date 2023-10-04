class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int dif=n-x;
		    if(dif>x)
		    System.out.println(x);
		    else
		    System.out.println(dif);
		    t--;
		}
	}
}
