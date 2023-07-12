package numbers;

import java.lang.Math;

public class armstrongNum {
    public static void main(String args[]) {
        int k = 0;
        int t = Integer.parseInt(args[0]);

        while (t > 0) {
            k += Math.pow(t % 10, 3);
            t /= 10;
        }
        if (k == Integer.parseInt(args[0])) {
            System.out.println("Number is armstrong!: " + k);
        } else
            System.out.println("Number is not armstrong!: " + args[0]);
    }
}
