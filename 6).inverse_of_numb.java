import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//inverse of a number pepcoding lecture 23
	 Scanner sc= new Scanner(System.in);
	 int n = sc.nextInt();
	 
	 int inv=0;
	 int original_place =1;
	 while(n!=0){
	     int original_digit = n%10;
	     int inv_digit =original_place;
	     int inv_place  =original_digit;
	     
	     inv = inv + inv_digit*(int)Math.pow(10,inv_place-1);
	     n = n/10;
	     original_place++;
	 }
	 System.out.println(inv);
	}
}
