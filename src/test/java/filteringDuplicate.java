import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class filteringDuplicate {

    public static void main(String[] args) {
        //Question 1--How to reverse a string
        //Question-2 Largest Number in Array using Arrays class
        //Question-3 Filter Duplicates in an array
        //prime numbers
        //Fibonocci
        //Armstrong
        //Count number of Vowels and Constants in the word


        ArrayList<String> list=new ArrayList<String>();

        for (int i=0;i<10;i++)
        {
            list.add(String.valueOf(i));
        }
        for (int i=0;i<5;i++)
        {
            list.add(String.valueOf(i));
        }

        //{ 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4}

        //System.out.println(list);
        System.out.println(processed1(list));
    }

    public static Set<String> processed1(List<String> listcontaningDiplicates)
    {

        Set<String> resultSet=new HashSet<String>();

        for(String yourInt:listcontaningDiplicates){
            resultSet.add(yourInt);
        }

        return resultSet;




    }}
