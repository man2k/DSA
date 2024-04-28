import java.util.Arrays;
import java.util.Scanner;
public class RomantoInt {

    public static int value(char s){
        if(s=='I')
            return 1;
        else if(s=='V')
            return 5;
        else if(s=='X')
            return 10;
        else if(s=='L')
            return 50;
        else if(s=='C')
            return 100;
        else if(s=='D')
            return 500;
        else if(s=='M')
            return 1000;
    return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // String rs[] = s.trim().split("");
        // System.out.println(Arrays.toString(rs));
        int total = 0;

        for(int i = 0; i< s.length(); i++){
            if(i+1<s.length() && value(s.charAt(i))>value(s.charAt(i+1))){
                total +=value(s.charAt(i));
            }else if(i+1<s.length() && value(s.charAt(i))<value(s.charAt(i+1))){
                total = total + (value(s.charAt(i+1))-value(s.charAt(i)));
                i++;
            }else{
                total += value(s.charAt(i));
            }
            System.out.println(total);
        }
        System.out.println("Value of " + s+ " = "+total );
    }
}
