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
		    
	    if(n%5==0 && k%5==0)
	        System.out.println(n/5-k/5);
	    else if(n%5==0 && k%5!=0)
	        System.out.println(n/5-k/5-1);
	    else if(n%5!=0 && k%5==0)
	        System.out.println(n/5-k/5+1);
	    else
	       System.out.println(n/5-k/5);
		    t--;
		
		}
	}
}
