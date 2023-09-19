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
		Scanner scn = new Scanner(System.in);
		String name = scn.next(); // taking input string for checking the lucky char 
		
		System.out.println(name.charAt(6));   // consider seventh letter of the word as the lucky char 
	}
}
