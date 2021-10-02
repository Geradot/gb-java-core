package homework4.exercise1;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        String[] strings = new String[] {
            "qwer", "wert", "erty", "rtyu",
            "qwer", "asdf", "sdfg", "dfgh",
            "asdf", "poiu", "oiuy", "erty"
        };

        Set<String> uniqueStrings = new HashSet<>(Arrays.asList(strings));
        System.out.println(uniqueStrings);

        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string,0) + 1);
        }
        System.out.println(map);

    }
}
