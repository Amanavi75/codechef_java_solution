class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
	    int i = in.nextInt();
	    for(i=i;i>0;i--){
	        if(!in.hasNext())break;
	        int Pa = in.nextInt();
	        int Pb = in.nextInt();
	        int Qa = in.nextInt();
	        int Qb = in.nextInt();
	        int minq = Math.max(Qa,Qb);
	        int minp = Math.max(Pa,Pb);
	        if(minq>minp){
	            System.out.println("P");
	            
	        }
	        if(minp>minq){
	            System.out.println("Q");
	            
	        }
	        if(minp==minq){
	            System.out.println("Tie");
	            
	        }
	    }
	}
}
