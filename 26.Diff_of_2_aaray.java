import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        // Pehle number ka input
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        // Dusre number ka input
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        // Result array 
        int[] diff = new int[n2];
        int c = 0; // borrow

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        // Subtraction digit by digit
        while (k >= 0) {
            int d = 0;
            int a1v = (i >= 0) ? a1[i] : 0; // safe access

            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;

            i--;
            j--;
            k--;
        }

        // Leading zero hatana
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        // Agar poora 0 hai
        if (idx == diff.length) {
            System.out.println(0);
        } else {
            while (idx < diff.length) {
                System.out.println(diff[idx]);
                idx++;
            }
        }
    }
}
