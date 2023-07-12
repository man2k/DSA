package numbers;

public class checkPalindrome {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        int t = N;
        int rev = 0;
        while (t > 0) {
            rev = rev * 10 + t % 10;
            t = t / 10;
        }
        if (rev == N) {
            System.out.println("The number is palindrome: " + rev);
        } else
            System.out.println("The number is not palindrome");
    }
}
