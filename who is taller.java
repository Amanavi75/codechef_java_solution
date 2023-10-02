class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X<Y){
                System.out.println("B");
            }else{
                System.out.println("A");
            }
		}
	}
}
