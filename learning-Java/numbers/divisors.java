package numbers;

import java.lang.Math;

public class divisors {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println(i);
                System.out.println(N / i);
            }
        }
    }
}
