class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		StringBuilder op=new StringBuilder("");
		
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    op.append((y-x)+"\n");
		    
		}
		
		System.out.print(op.toString());
	}
}
