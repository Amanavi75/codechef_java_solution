class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int number_of_army = scan.nextInt();
		int even = 0;
		int odd = 0;
		for(int i = 1; i <= number_of_army; i++){
		    int army = scan.nextInt();
		    if(army % 2 == 0){
		        even++;
		    } else {
		        odd++;
		    }
		} if(even > odd){
		    System.out.println("READY FOR BATTLE");
		} else{
		    System.out.println("NOT READY");
		}
		scan.close();
	}
}
