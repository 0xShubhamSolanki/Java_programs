import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sp = 2*n-3;
		int st= 1;
		
	
		for(int i =1;i<=n;i++){
		   	int val =1; 
		for(int j =1;j<=st;j++){
		    System.out.print(val+"\t");
		    val++;
		}
			for(int j =1;j<=sp;j++){
		    System.out.print("\t");
		}
		if(i==n){
		    st--;
		    val--;
		}
			for(int j =1;j<=st;j++){
			      val--;
		    System.out.print(val+"\t");
		  
		}
		st++;
		sp-=2;
		System.out.println();
		}
	}
}
