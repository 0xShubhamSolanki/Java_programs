import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of bars
        int[] arr = new int[n];  // Heights of bars
        
        // Reading the heights of the bars
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Arrays to store the next smaller right and next smaller left
        int[] nsr = new int[arr.length];  // Next smaller right
        int[] nsl = new int[arr.length];  // Next smaller left
        
        Stack<Integer> st = new Stack<>();
        
        // 1. Calculate NSR (Next Smaller Right) array
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack until we find a smaller element
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            // If stack is empty, there is no smaller element to the right
            if (st.isEmpty()) {
                nsr[i] = arr.length;  // Store length of array
            } else {
                nsr[i] = st.peek();  // Store index of next smaller element
            }
            st.push(i);  // Push current index to the stack
        }
        
        // Clear the stack before using it again
        st.clear();
        
        // 2. Calculate NSL (Next Smaller Left) array
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack until we find a smaller element
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            // If stack is empty, there is no smaller element to the left
            if (st.isEmpty()) {
                nsl[i] = -1;  // No smaller element to the left
            } else {
                nsl[i] = st.peek();  // Store index of next smaller element
            }
            st.push(i);  // Push current index to the stack
        }
        
        // 3. Calculate the maximum area using the NSR and NSL arrays
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;  // Calculate the width
            int area = arr[i] * width;  // Calculate the area
            maxArea = Math.max(maxArea, area);  // Track the maximum area
        }
        
        // Output the maximum area
        System.out.println(maxArea);
    }
}
