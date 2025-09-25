//methord 1 tc On2
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner sc = new Scanner(System.in);

        // Step 1: User se size lena
     
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: User se elements lena
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

		int[] ans = new int[n];
		for(int i=0;i<n;i++){
		       int nextGreater = -1;
		    for(int j =i+1;j<n;j++){
		         if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break; // pehla bada element mil gaya toh ruk jao
                }
		    }
		    ans[i] = nextGreater;
		}
     System.out.println(Arrays.toString(ans));
	}
}
// methord 2 tc O(N)
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // stack se chhote elements hatao
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // agar stack empty → koi NGE nahi
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            // current element ko push karo
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
