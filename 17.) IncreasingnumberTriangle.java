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
        int count=1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                
                System.out.print(count+" ");
            count++;
                
            }
            System.out.println();
        }
	}
}
