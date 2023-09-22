class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x + y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
		
		
	}
}
