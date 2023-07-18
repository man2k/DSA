import java.util.regex.Pattern;
import java.util.regex.Matcher;
class FindNum {
    public static int myAtoi(String s) {
        s = s.trim();
        Pattern p = Pattern.compile("^-?[0-9]*");
        Matcher m = p.matcher(s);
        // m.find();
        // System.out.println(m.end());
        // try{
        //     return Integer.parseInt(s.trim().substring(m.start(),m.end()));
        // }catch(NumberFormatException e){
        //     return Integer.MIN_VALUE;
        // }catch(Exception e){
        //     // System.out.println(e);

        //     return 0;
        // }
        String[] stemp = s.split(" ");
        for(String sk: stemp){
            try{
                return Integer.parseInt(sk);
            }catch(NumberFormatException e){
                System.out.println(e);
                return Integer.MIN_VALUE;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }
}