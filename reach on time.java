class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        while(n-->0){
            int x =in.nextInt();
            String p=(x>=30)?"yes":"No";
            System.out.println(p);
        }
	}
}
