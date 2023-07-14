import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String args[]){
        Pattern p = Pattern.compile("a", Pattern.MULTILINE);
        Matcher m = p.matcher("agbdfda");
        boolean b = m.matches();
        boolean b2 = Pattern.matches(".s", "as");
        System.out.println(b + " "+ b2);
    }
    
}
