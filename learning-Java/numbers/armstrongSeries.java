package numbers;

import java.lang.Math;

public class armstrongSeries {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        for (int i = 2; i < N; i++) {
            int t = i;
            int k = 0;
            while (t > 0) {
                k += Math.pow((t % 10), 3);
                t /= 10;
            }
            if (k == i) {
                System.out.print(i + ", ");
            }
        }
    }
}
