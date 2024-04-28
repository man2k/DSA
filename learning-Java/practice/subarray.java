package practice;

public class subarray {
    public static void main(String[] args){
        int[] arr = new int[] {3,4,-7,1,3,3,1,-4};
        int t = 7;
        findSubArray(arr,t);
    }

    
    public static void findSubArray(int[] arr,int t){
        int n = arr.length;
        for(int i =0;i<n; i++){
            int sum = 0;
            for(int j = i; j<n;j++){
                sum += arr[j];
                if(sum == t){
                    // System.out.println(j);
                    printit(arr, i,j);
                }
            }
        }
    }
    public static void printit(int[] arr,int i, int j){
        for(int k = i; k<=j;k++){
            // System.out.print("what");
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}
