/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,m,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    n = sc.nextInt();
		    m = sc.nextInt();
		    if(m>=n)
		    System.out.println(0);
		    else
		    System.out.println(n-m);
		}
	}
}
