
public class ReverseInt2 {
    public static void main(String args[]){
        int k = Integer.parseInt(args[0]);
        int rev =0 ;
        while(k>0){
            rev = rev*10+ k%10;
            k=k/10;
        }
        System.out.println(rev);
        
    }    
}
