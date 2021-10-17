package homework5;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("./src/homework5/data.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("./src/homework5/new_data.csv");
    }
}
