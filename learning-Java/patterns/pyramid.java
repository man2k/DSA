package patterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pyramid {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter Size");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        for (int i = 0; i < N; i++) {
            int k = N - i - 1;
            int o = i * 2 + 1;
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
