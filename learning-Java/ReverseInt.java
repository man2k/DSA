class Solution {
    public static int reverse(int x) {
        int sign = 0;
        if(x<0){
            sign = 1;
        }
        // System.out.println(Integer.MAX_VALUE);
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE){
            return 0;
        }
        int t = Math.abs(x);
        long r = 0;
        while(t!=0){
            int temp = t%10;
            r = r*10+temp;
            t=t/10;
            // System.out.println("r : "+r);
            if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
                return 0;
            }
        }
        if(sign == 0){
            return (int)r;
        }else{
            return (int)-r;
        }
    }
    public static void main(String args[]){
        System.out.println(reverse(1534236469));
    }
}