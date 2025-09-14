import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
	    
	    for(int div = 2;div*div <=n;div++){
	        while(n %div ==0){
	            n =n/div;
	            System.out.println(div + " ");
	        }
	    }
	    if(n!=1){
	        System.out.println(n);
	    }

	}
}
