package patterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pyramidInv {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size");
        int N = Integer.parseInt(r.readLine());
        for (int i = N - 1; i >= 0; i--) {
            int k = N - i - 1;
            int o = i * 2 - 1;
            for (int j = 0; j < N + N - 1; j++) {
                if (k > 0) {
                    System.out.print(" ");
                    k--;
                } else if (o > 0) {
                    System.out.print("*");
                    o--;
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
