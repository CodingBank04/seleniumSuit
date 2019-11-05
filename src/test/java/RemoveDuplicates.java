import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        myIntArray();
        myStringArray();

        Integer[] mySetArray = {1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 7};
        System.out.println(filterDuplicates(mySetArray));
    }

    public static void myIntArray() {
        List<Integer> duplicates = Lists.newArrayList(1, 1, 2, 2, 3, 3);
        List<Object> noDuplicates = duplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplicates);
    }

    public static void myStringArray() {
        List<String> duplicates = Lists.newArrayList("aa", "cc", "cc", "aa");
        List<Object> noDuplicates = duplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplicates);
    }

    public static Set<Integer> filterDuplicates(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        TreeSet<Integer> set = new TreeSet<Integer>(list);
        return set;
    }

}