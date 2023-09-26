public class FibonacciSeries {

    private static long[] fibCache;
    public static void main(String[] args){
        int n = 10000;
        // 92 is the limit for fibonacci nums in java long
        fibCache = new long[n+1];
        // for(int i = 0; i <n;i++){
        //     System.out.print(fibonacci(n)+ " ");

        // }
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n){
        if(n<2){
            return n;  
        }
        if(fibCache[n]!=0){
            return fibCache[n];
        }

        long nthFibNum = fibonacci(n-1)+fibonacci(n-2);
        fibCache[n] = nthFibNum;
        return nthFibNum;
    }
}

// Trying Bigint

// import java.math.BigInteger;

// public class FibonacciSeries {

//     private static BigInteger[] fibCache;
//     public static void main(String[] args){
//         int n = 6;
//         // 92 is the limit for fibonacci nums in java long
//         fibCache = new BigInteger[n+1];
//         // for(int i = 0; i <n;i++){
//         //     System.out.print(fibonacci(n)+ " ");

//         // }
//         System.out.println(fibonacci(n));
//     }

//     private static BigInteger fibonacci(int n){
//         if(n<2){
//             return BigInteger.valueOf(n);  
//         }
//         if(fibCache[n]!=BigInteger.valueOf(0)){
//             return fibCache[n];
//         }

//         BigInteger nthFibNum = (fibonacci(n-1)).add(fibonacci(n-2));
//         fibCache[n] = nthFibNum;
//         return nthFibNum;
//     }
// }
