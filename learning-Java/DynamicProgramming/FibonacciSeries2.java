public class FibonacciSeries2 {
    public static void main(String[] args){
        int n = 10000;
        if(n<2){
            System.out.println(n);
            return;
        }
        long prev2 = 0;
        long prev = 1;
        // int curi = 0;
        for(int i = 2; i<=n;i++){
            long curi = prev + prev2;
            prev2 = prev;
            prev = curi; 
        }
        System.out.println(prev);
    }
}
