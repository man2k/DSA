package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesProb {
    public static void main(String args[]){
        ArrayList<Fruit> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i<k; i++){
            String name = sc.next();
            double uprice = sc.nextDouble();
            int quantity = sc.nextInt();

            list.add(new Fruit(name, uprice, quantity));
        }

        sc.close();

        for(Fruit fruit: list){
            System.out.println(fruit);
        }

    calculate(list,k);

    }

    public static void calculate(ArrayList<Fruit> list, int k){
        int tosp = 0;
        int asp = 0;
        String topspname = "";
        for(int i=0; i<k; i++){
            Fruit f = list.get(i);
            tosp += f.quantity*f.uprice;
        }
        asp = tosp/k;


        HashMap<String, Integer> fruitQnty = new HashMap<String, Integer>();
        for(Fruit f: list){
            if(fruitQnty.containsKey(f.name)){
                fruitQnty.put(f.name, Integer.valueOf(f.quantity+fruitQnty.get(f.name))); 
            }
            else{
                fruitQnty.put(f.name,f.quantity);
            }
        }
        int max = 0;
        // fruitQnty.forEach((String f,Integer fq )->{
        //     String t = "";
        //     if(max<fq){
        //         t = f;
        //     }

        // });


        // System.out.println(Arrays.asList(fruitQnty));
        for(HashMap.Entry<String,Integer> set: fruitQnty.entrySet()){
            int temp = set.getValue();
            String tempn = set.getKey();
            if (max<k){
                max=temp;
                topspname = tempn;
                // System.out.println(temp);
            }
        }
        System.out.println(tosp+ "\n" +asp+ "\n"+topspname);
    }
}


class Fruit {
    String name;
    double uprice;
    int quantity;

    public Fruit(String name, double uprice, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.uprice = uprice;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + uprice +
                ", quantity=" + quantity +
                '}';
    }
}
