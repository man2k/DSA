public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a[] = { 1, 2, 3, 4, 5 };
        String k[] = { "daw", "fsgs", "dbfsd", "dawvs", "dwad" };
        double b[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 0 },
                { 1, 2, 3, 4, 5 }
        };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}