public class MinimumCoins {
    public static void main(String[] args){

    }

    private static int minCoins(int n, int a[]){
        if(n==0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++){
            if(n-a[i]>=0){
                int subAns = minCoins(n-a[i], a);
                if(subAns +1<ans){
                    ans=subAns;
                }
            }
        }
        return ans;
    }
}
