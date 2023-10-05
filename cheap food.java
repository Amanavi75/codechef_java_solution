class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    if((n/10)>=100){
		        System.out.println(n/10);
		    }
		    else{
		        System.out.println(100);
		    }
		}
	}
}
