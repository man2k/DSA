public class CakeCut {
    public static void main(String args[]) {
        int M = 1000000007;
        int cuts = Integer.parseInt(args[0]);
        int maxp = ((cuts * (cuts+1)) +2)/2;
        System.out.println("max cuts: "+ maxp%M);
    }
}
