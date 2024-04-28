import java.util.Scanner;
public class prac1 {
    public static String Main(String arg){
        // System.out.println(arg);
        String k[] = arg.split(",");
        int kf[] = new int[k.length];
        int o = 0;
        for(String i: k){
            try{
                kf[o] = Integer.valueOf(i.trim());
                o++;
            } catch(Exception e){
                
            }
        }
        for(int i: kf){
            System.out.println(i);
        }
        return arg;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println(Main(in.nextLine()));

    }
}
