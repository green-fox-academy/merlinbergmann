import java.util.*;

public class Unique {

/*
Create a function that takes a list of numbers as a parameter
Returns a list of numbers where every number in the list occurs only once

Example:
input: [1, 11, 34, 11, 52, 61, 1, 34]
output: [1, 11, 34, 52, 61]
 */


    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        Set<Integer> noDuplicates = new HashSet<>();
        //Hash Sets don't allow duplicates. We can use that here by adding the input to it
        //and using it as a filter before returning the values to the cleared input list.
        //The downside of this method is that we lose the original order of our input list.
        noDuplicates.addAll(input);
        input.clear();
        input.addAll(noDuplicates);

        System.out.println(input);


        }
    }