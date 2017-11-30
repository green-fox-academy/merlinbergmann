import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        arrayList.set(1, "Croissant");
        arrayList.set(3, "Ice cream");

        //if index is unclear - e.g. in very long lists, use iterator to determine position:
        /*
        ListIterator<String> iterator = arrayList.listIterator();
            while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(2)) {
         //Replace element
            iterator.set("Croissant");
            }
            if (next.equals("false")) {
            iterator.set("Ice cream")
            }
     }
 }
         */

        System.out.println(arrayList);
    }
}