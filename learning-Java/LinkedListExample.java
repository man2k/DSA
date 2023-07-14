import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        LinkedList<String> l = new LinkedList<>();
        l.add("Man");
        l.add("Man2");
        l.add("Man3");
        l.add("Man5");
        l.add("Man7");
        System.out.println(l);
        System.out.println(l.get(2)); // slower for linkedList
        // Can be used to insert with ease
        l.add(1,"manhk"); // faster for link
        
        ArrayList<String> a = new ArrayList<>();
        a.add("man");
        a.add("man2k");
        a.add("man3k");
        a.add("man4k");
        a.add("man6k");
        a.add("man8k");
        System.out.println(a);
        System.out.println(a.get(2)); // faster with arrays
        a.add(1,"manhk");
        //
    }
}
