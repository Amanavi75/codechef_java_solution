class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n-->0)
		{
		    String [] elements=br.readLine().split(" ");
		    int x=Integer.parseInt(elements[0]);
		    int y=Integer.parseInt(elements[1]);
		    int k=Integer.parseInt(elements[2]);
		    
		    if(x%k==0 && y%k==0)
		      System.out.println("YES");
		    else
		      System.out.println("NO");
		}
	}
}
