/*
Starters 77
  
In a classic chase, Tom is running after Jerry as Jerry has eaten Tom's favourite food.
Jerry is running at a speed of X metres per second while Tom is chasing him at a speed of Y metres per second. Determine whether Tom will be able to catch Jerry.
Note that initially Jerry is not at the same position as Tom.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(y>x)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
