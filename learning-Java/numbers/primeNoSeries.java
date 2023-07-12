package numbers;

public class primeNoSeries {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        for (int i = 2; i <= N; i++) {
            boolean f = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                // System.out.println(f);
                System.out.print(i + " ");
            }

        }
    }
}
