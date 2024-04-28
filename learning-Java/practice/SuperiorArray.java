import java.util.Scanner;
public class SuperiorArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        int count=1;
        for(int i = 0 ; i<n-1;i++){
            int flag=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    flag=1;
                    break;
                }
            }
            System.out.println("flag "+flag);
            if(flag==0){
                count++;
            }else{
                flag=0;
            }
        }
        System.out.println(count);
    }
}
