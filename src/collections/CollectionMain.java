package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

    Set<String> treeSety = new TreeSet<>();
    Set<String> hashSety = new HashSet<>();

    public static int[] makeUnique(int... values)
    {
        return Arrays.stream(values).distinct().toArray();
    }

    public static String[] makeUniqueString(String... values)
    {
        return Arrays.stream(values).distinct().toArray(String[]::new);
    }

    public static void main(String[] args) {
        int[] inty = makeUnique(1,2,3,5,5,6,4,4,1,2,3,5,4,8,2,1);
        Arrays.stream(inty).forEach(System.out::println);

        String[] stringi = makeUniqueString("Anna", "Radek", "Jolka", "Anna", "Iwona", "Piotrek", "Radek");

        Arrays.stream(stringi).forEach(System.out::println);


    }

}
