class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int s=x*y;
		    if(s>=n){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
