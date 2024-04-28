import java.util.Arrays;
import java.util.Scanner;

public class SumAllOds {
    public static void main(String args[]){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = in.nextInt();
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        } 
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
