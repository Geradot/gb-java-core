package homework4.exercise2;

public class Test {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Johnson", "555-924-342");
        phonebook.add("Anderson", "555-924-343");
        phonebook.add("Robinson", "555-924-344");
        phonebook.add("Robinson", "555-831-639");

        System.out.println(phonebook.get("Robinson"));
    }
}
