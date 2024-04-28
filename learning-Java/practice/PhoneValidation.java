import java.util.regex.*;
public class PhoneValidation {
    public static void main(String args[]){
        String phnum1 = "7873923408";
        String phnum2 = "9123124123";
        String phnum3 = "+917873923408";
        String phnum4 = "123-456-7890";
        String phnum5 = "123.456.7890";

        printResult(phnum1);
        printResult(phnum2);
        printResult(phnum3);
        printResult(phnum4);
        printResult(phnum5);
    }
    public static void printResult(String p){
        System.out.println("Is "+ p + " valid phone ? -> "+ phoneValidCheck(p));
    }
    
    public static boolean phoneValidCheck(String phonenum){
        
        Pattern p = Pattern.compile("^([+]?91|0)?[7-9][0-9]{9}$");
        Pattern p2 = Pattern.compile("^[(]?[0-9]{3}[)]?[- .]?[0-9]{3}[- .]?[0-9]{4}$");

        Matcher m = p.matcher(phonenum);
        Matcher m2 = p2.matcher(phonenum);
        // System.out.println(m2.matches(phonenum));
        return (m.matches() || m2.matches());

    }
}
