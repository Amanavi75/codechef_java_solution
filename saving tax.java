class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();

        for(int i = 0 ; i < test ; i ++ ){
            int totalAmount = sc.nextInt();
            int payTax = sc.nextInt();

            System.out.println(totalAmount- payTax);
        }
	}
}
