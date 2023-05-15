package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15,24,21,21,20,20,28));
        List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Removed Duplicates From the ArrayList:\t"+newlist);
    }
}
