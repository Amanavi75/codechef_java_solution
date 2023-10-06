class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        if(X<Y){ // checking for the condition if crosses the target 
	            int p=Y-X; // how much he has excedded 
	            System.out.println(p*2+X);
	        }else if(X==Y){
	            System.out.println(X);
	        }else{
	            System.out.println(Y);
	        }
	    }
		// your code goes here
	}
}
