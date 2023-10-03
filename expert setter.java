class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		     int X = sc.nextInt(); // Number of problems submitted
            int Y = sc.nextInt(); // Number of problems approved

            double approvalPercentage = (double) Y / X * 100;
            if (approvalPercentage >= 50) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        
		}
	}
}
