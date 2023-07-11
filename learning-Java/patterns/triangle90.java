package patterns;

import java.io.IOException;

public class triangle90 {
    public static void main(String args[]) throws IOException {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N * 2; i++) {
            for (int j = 0; j < (i < N ? (i + 1) : (i - ((i % N) * 2 + 1))); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
