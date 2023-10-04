class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); //for No. of test cases
		while(T-->0) {
		    //your code goes here
		    int x = in.nextInt(); //initial position of policeman
		    int y = in.nextInt(); //initial position of thief
		    System.out.println(Math.abs(y-x));
		}
		in.close();
	}
}
