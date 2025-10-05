//Sliding window maximum brute force TC - O(N*k)
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int[] maxSlidingWindow(int arr[],int k){
     int n = arr.length;
     int ans[] = new int[n-k+1];
     for(int i =0;i<n-k+1;i++){
         int maxVal = Integer.MIN_VALUE;
         for(int j= 1;j<i+k;j++){
             maxVal = Math.max(maxVal,arr[j]);
         }
         ans[i] = maxVal; 
     }
     return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int ans[] = maxSlidingWindow(arr,k);
		System.out.println(Arrays.toString(ans));
	}
}
//Better approch sliding windwo stack
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
   public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] nge = new int[n]; // Next Greater Element index array
        Stack<Integer> st = new Stack<>();

        // Step 1: NGE array banao
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Step 2: Har window ka max निकालो
        int[] res = new int[n - k + 1];
        int j = 0; // current max ka index
        for (int i = 0; i <= n - k; i++) {
            if (j < i) j = i; // agar max index window ke bahar chala gaya
            // jab tak window ke andar NGE hai, udhar jump kar jao
            while (nge[j] < i + k) {
                j = nge[j];
            }
            res[i] = nums[j];
        }

        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int ans[] = maxSlidingWindow(arr,k);
		System.out.println(Arrays.toString(ans));
	}
}
