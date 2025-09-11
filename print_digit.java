import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int nod =0;
		int temp = n;
		while(temp !=0){
		    temp= temp/10;
		    nod++;
		}
		int div = (int)Math.pow(10,nod-1);
		while(div!=0){
		    int q = n/div;
		    System.out.println(q);
		    
		    n=n%div; // remainder bacha hua 
		    div = div/10;
		}

	}
}
