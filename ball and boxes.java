class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    k=k*(k+1)/2;
	    if(n>=k)
	    System.out.println("YES");
	    else
	    System.out.println("NO");
		   
		    t--;
		
		}
	}
}
