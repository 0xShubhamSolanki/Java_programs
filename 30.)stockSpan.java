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
	int arr[] = new int[n];
	for(int i =0;i<n;i++){
	    arr[i] = sc.nextInt();
	}
	
	int[] span = new int[n];
	Stack<Integer> st = new Stack<>();
	st.push(0);
	span[0] = 1;
	
	for(int i =1;i<n;i++){
	    while(!st.isEmpty() && arr[i] >=arr[st.peek()]){
	        st.pop();
	    }
	    if(st.isEmpty()){
	        span[i] = i+1;
	    }else{
	        span[i] = i - st.peek();
	    }
	    st.push(i);
	}
    for(int i =0;i<n;i++){
        System.out.print(span[i]+ " ");
    }
	}
}
