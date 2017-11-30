import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

 /*           if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
 */
            boolean exist4 = false;
            for (int i = 0; i < list.size(); i++){
                if (list.get(i) == 4) {
                    exist4 = true;
                }
            }
            boolean exist8 = false;
            for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 8) {
                exist8 = true;
            }
            }
            boolean exist12 = false;
            for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 12) {
                exist12 = true;
            }
            }
            boolean exist16 = false;
            for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 16) {
                exist16 = true;
            }
            }
                if (exist4 == true & exist8 == true & exist12 == true & exist16 == true){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }

}
    }
