class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++){
		    int patties = sc.nextInt();
		    int buns = sc.nextInt();
		    if(patties>buns){
		        System.out.println(buns);
		    }
		    else{
		        System.out.println(patties);
		    }
		} 
	}
}
