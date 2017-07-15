package comparing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-05.
 */
public class Test {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");

        System.out.println("\nExample 3 - Count all with Map");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        System.out.println(map);
    }
}
