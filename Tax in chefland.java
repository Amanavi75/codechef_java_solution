class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner scn =new Scanner(System.in);
	    int t=scn.nextInt();
	    for (int i=0;i<t;i++){
	        int x=scn.nextInt();
	        if (x>100){
	            System.out.println(x-10);
	        }else {System.out.println(x);
	        }
	    }
	}
}
