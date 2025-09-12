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
        int sp = n-1;
        int st = 1;
        for(int i =0;i<n;i++){
            for(int j =0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j =0;j<st;j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
       
        
	}
}
