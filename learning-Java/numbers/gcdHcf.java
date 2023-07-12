package numbers;

public class gcdHcf {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        // gcdHcf obj = new gcdHcf();
        // obj.gcd(N, M);
        long elapsedTime = System.currentTimeMillis();
        gcdGeneric(N, M);
        elapsedTime = System.currentTimeMillis() - elapsedTime;
        System.out.println("Time Required :" + elapsedTime + " miliseconds");
        elapsedTime = System.currentTimeMillis();
        gcdEuc(N, M);
        elapsedTime = System.currentTimeMillis() - elapsedTime;
        System.out.println("Time Required :" + elapsedTime + " miliseconds");
    }

    public static void gcdGeneric(int N, int M) {
        int gcd = 0;
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        for (int i = N; i > 0; i--) {
            if (N % i == 0 && M % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD : " + gcd);
    }

    public static void gcdEuc(int N, int M) {
        // Eucledian Algorithm states
        // GCD(N,M) = GCD((N-M), M) provided N>M
        // we do it repeatedly

        if (N != 0 && M != 0) {
            if (N > M)
                gcdEuc((N % M), M); // gcdEuc((N-M), M) -> less optimised
            else
                gcdEuc((M % N), N);
        } else if (N == 0) {
            System.out.println("GCD : " + M);
        } else {
            System.out.println("GCD : " + N);
        }
    }
}
