package patterns;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.IOException;

public class doublePyramid {
    public static void main(String args[]) throws IOException {
        // BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter Size");
        // int N = Integer.parseInt(r.readLine());
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N * 2; i++) {
            int k, o, p = 0;
            if (i < N) {
                k = N - i - 1;
                o = i * 2 + 1;
            } else {
                k = i - N;
                o = (N - (i % (N))) * 2 - 1;
            }
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
