class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    if(n%10==0){
		        System.out.println(n/10);
		    }
		    else{
		        System.out.println((n/10)+1);
		    }
		    t--;
		}
	}
}
