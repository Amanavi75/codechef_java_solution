class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner kb=new Scanner( System.in);
	   int t=kb.nextInt();
	   while(t-->0){
	       int a=3;
	       int max=-1;
	       while(a-->0){
	           int a1=kb.nextInt();
	           int a2=kb.nextInt();
	           if(max<a1+a2)
	             max=a1+a2;
	       }
	       System.out.println(max);
	   }
	}
}

