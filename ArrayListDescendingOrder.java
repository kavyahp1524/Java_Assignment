package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDescendingOrder {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(24,15,28,20,21));
//        list.add(24);
//        list.add(15);
//        list.add(28);
//        list.add(20);
//        list.add(21);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted Arraylist in Descending Order:\t" + list);
    }
}
