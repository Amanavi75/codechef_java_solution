class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int c=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='4'){
		            c++;
		        }
		    }System.out.println(c);
		}
	}
}
