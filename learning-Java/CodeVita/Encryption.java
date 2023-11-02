import java.util.*;

public class Encryption {
    public static void encrypt(int k, String s){
        LinkedList<Integer> arr = new LinkedList<Integer>();
        int temp = k;
        while(temp>0){
            arr.addFirst(temp%10);
            temp /= 10;
        }
        // System.out.println(arr.toString());

        int pos = 0;
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.print(c + " ");
            if(c == 'R'){
                pos+=1;
            }else if(c == 'L'){
                pos-=1;
            }else if(c == 'T'){
                arr.set(pos, (arr.get(pos)+1));
            }else if(c == 'D'){
                arr.set(pos,(arr.get(pos)-1));
            }else if(c == 'S'){
                int n = Character.getNumericValue(s.charAt(i+1));
                Integer t = arr.get(pos);
                // System.out.print(" n = "+n+" " );
                arr.set(pos, (arr.get(n-1)));
                arr.set(n-1,t);
                i++;
            }
            // System.out.print(pos+ " ");
            // System.out.println(arr.toString());

        }
        System.out.println(arr.toString());
        // for(int i =0 ; i< arr.size(); i++){
        //     System.out.print(arr.get(i)+ " ");
        // }
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        String s = inp.next();
        long startTime = System.currentTimeMillis();
        encrypt(k,s);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 
    }
}
