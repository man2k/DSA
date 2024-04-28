import java.util.Arrays;
import java.util.Scanner;
public class MaximumMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(binarySearch(n,k, arr));
    }

    public static int binarySearch(int n, int k, int[] arr){
        int l, h, m, res;

        Arrays.sort(arr);

        l = 0;
        h = arr[n-1];
        res = 0;

        while(l<=h){
            m = (l+h)/2;
            if(!isPossible(arr, n,k,m))
                h = m-1;
            else{
                res = Math.max(res, m);
                l = m + 1;
            }
        }

        return res;
    }

    public static boolean isPossible(int[] arr, int n, int k, int m){
        int count = 1; int cp = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i]-cp >= m){
                count++;
                cp = arr[i];
            }
            if(count == k)
                return true;
        }
        return false;
    }
}
