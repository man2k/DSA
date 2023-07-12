package numbers;

import java.lang.Math;

public class primeNo {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        boolean k = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                k = false;
                break;
            }
        }
        if (k)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }
}
