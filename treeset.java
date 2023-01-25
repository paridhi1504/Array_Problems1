import java.util.TreeSet;

public class treeset {
    public static void main(String args[]){
        TreeSet<String> trreset = new TreeSet<>();
        //System.out.println(trreset.isEmpty());
        trreset.add("c");
        trreset.add("3");
        trreset.add("a");
        trreset.add("A");
        trreset.add("56");
        trreset.add("A");
        System.out.println(trreset);
       String a =  trreset.ceiling("A");
        System.out.println(trreset);
        System.out.println(a);
        trreset.descendingSet();
        System.out.println(trreset.descendingSet());
        System.out.println(trreset.first());
        System.out.println(trreset.pollFirst());
        System.out.println(trreset.subSet("56", "A"));
        System.out.println(trreset.contains("A"));
    }
}
