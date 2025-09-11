import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input lena
        int n = scn.nextInt();   // input number dalo
        int k = scn.nextInt();   // rotation kitni baar

        // Step 1: Count digits
        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // Step 2: Normalize k
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        // Step 3: Find divisor and multiplier
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        // Step 4: Split number
        int q = n / div;
        int r = n % div;

        // Step 5: Rotate and print
        int ans = r * mult + q;
        System.out.println(ans);
    }
}
