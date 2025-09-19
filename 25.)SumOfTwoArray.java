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

        // Result array (maximum length dono me se jo bada ho)
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0; // carry

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        // Addition digit by digit
        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += a1[i];
            }
            if (j >= 0) {
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        // Agar last me carry bacha hai
        if (c != 0) {
            System.out.print(c);
        }

        // Sum array print
        for (int val : sum) {
            System.out.print(val);
        }
    }
}
