/*
Starters 77

The ultimate battle has begun in Tekken.
Each fight has two players. Let the initial health of the players be X and Y, then, after the fight, the health of both the players reduces by min(X,Y) .Anna, Bob, and
Claudio have initial health levels of A,B, and C respectively. Each pair of players fight exactly once.
Considering that you can schedule the fight between each pair in any order, find whether Anna can have a positive health level at the end of the battle.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
  public static void main (String[]args) throws java.lang.Exception
  {
    // your code goes here
    Scanner sc = new Scanner (System.in);
    int t = sc.nextInt ();
    while (t-- > 0)
      {
	int a = sc.nextInt ();
	int b = sc.nextInt ();
	int c = sc.nextInt ();



	int th = Math.max (a, Math.max (b, c));
	int s = 0;
	int f = 0;
	if (th == a)
	  f = Math.min (b, c);
	else if (th == b)
	  f = Math.min (a, c);
	else
	    f = Math.min (a, b);

	if ((th == a || th == b) & (f == b || f == a))
	  s = c;
	else if ((th == a || th == c) & (f == c || f == a))
	  s = b;
	else
	    s = a;

	if (a == 0)
	  System.out.println ("No");
	else if (a == b & b == c & c == a)
	  System.out.println ("Yes");
	else if (b == c)
	  System.out.println ("Yes");
	else if (a == b || a == c)
	  {
	    if (a > (Math.abs (b - c)))
	      System.out.println ("Yes");
	    else
	      System.out.println ("No");
	  }
	else if (th == a)
	  {
	    System.out.println ("Yes");
	  }
	else if (f == a)
	  {
	    if (a > (Math.abs (th - s)))
	      System.out.println ("Yes");
	    else
	      System.out.println ("No");
	  }
	else if (s == a)
	  {
	    int sub = th - f;
	    if (s != Math.min (s, sub))
	      System.out.println ("Yes");
	    else
	      System.out.println ("No");
	  }
	else
	  System.out.println ("No");

      }
  }
}





_____________________________________________________________________________________________________________________________________________________________

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
		while(t-- > 0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int x = b-Math.min(b,c);
		    int y = c-Math.min(b,c);
		    
		    if(x>y) {
		        a=a-x;
		        if(a>0)
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		    else {
		        a = a-y;
		        if(a>0)
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		}
	}
}
