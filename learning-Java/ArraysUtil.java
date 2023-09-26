import java.lang.Math;
import java.util.Arrays;
public class ArraysUtil {
    public static void main(String[] args){
        int[] a = new int[20];
        int[] b = new int[20];
        for(int i = 0; i<20;i++){
            a[i] = (int)(Math.random()*100+1);
        }
        // for(int i = 0; i<100;i++){
        //     b[i] = (int)(Math.random()*100+1);
        // }
        // for(int i = 0; i< 100;i++){
        //     b[i] = a[i];
        // }

        // Hashcode depends on the ordering of the elements. no if even one element is missing from the array or if its position is changed(Sorted or changed) then the resultant hash will change.
        // for(int i: a){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.println(Arrays.hashCode(a));
        // Arrays.sort(a);
        // for(int i: a){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.println(Arrays.hashCode(a));


        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
