import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberArray {
    public static void main(String[] args) {
          Integer[] nums={1,2,3,9,4,5,6,7};

        System.out.println(returnlargest(nums,7));
    }


    public static int returnlargest(Integer[] b, int total) {

        List<Integer> list1 = Arrays.asList(b);
        Collections.sort(list1);
        int largest=list1.get(total-1);
        return largest;
    }
}





   /* public static void main(String args[]){
        int array[] = {10, 20, 254444, 6443, 96, 57};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[size-1];
        System.out.println("largest element is ::"+res);
    }

    */


