import java.util.Scanner;

public class ReverseInt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = in.nextInt();
        int temp = n;
        int rev = 0;
        while(temp>0){
            int r = temp%10;
            rev = rev*10+r;
            temp = temp/10;
        }
        System.out.println(rev);
    }
}
