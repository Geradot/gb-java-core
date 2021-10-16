package homework4.exercise2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String lastname, String phoneNumber) {
        HashSet<String> phoneNumbers;

        phoneNumbers = (map.containsKey(lastname)) ? map.get(lastname) : new HashSet<>();

        phoneNumbers.add(phoneNumber);

        map.put(lastname, phoneNumbers);
    }

    Set<String> get(String lastname) {
        return map.get(lastname);
    }
}
