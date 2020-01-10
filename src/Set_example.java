import java.util.*;
public class Set_example
{
    public static void main(String[] args)
    {
        Set<Integer> hash_Set = new HashSet<Integer>();
        hash_Set.add(3867786);
        hash_Set.add(7657652);
        hash_Set.add(777);
        hash_Set.add(586787687);
        hash_Set.add(8761);
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);
        System.out.print("Sorted Set after passing into TreeSet");
        Set<Integer> tree_Set = new TreeSet<Integer>(hash_Set);
        System.out.println(tree_Set);
    }
}

