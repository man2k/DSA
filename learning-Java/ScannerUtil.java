import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScannerUtil {
    public static void main(String[] args)throws IOException{
        System.out.println("Enter Name: ");
        Scanner ob = new Scanner(System.in);
        String name = ob.nextLine();
        System.out.println("Enter Age: ");
        BufferedReader ob2 = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(ob2.readLine());
        ob.close();
        
        
        System.out.println("Hey "+name);
        System.out.println("You are "+ age+ " years old");
    }
}
