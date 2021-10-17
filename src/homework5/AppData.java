package homework5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {

    public static final String DELIMITER = ";";

    private String[] header;
    private Integer[][] data;

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void readFromFile(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer[]> rowsList = new ArrayList<>();
            header = reader.readLine().split(DELIMITER);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strArray = line.split(DELIMITER);
                Integer[] intArray = new Integer[strArray.length];
                for (int i = 0; i < strArray.length; i++) {
                    intArray[i] = Integer.parseInt(strArray[i]);
                }
                rowsList.add(intArray);
            }
            data = rowsList.toArray(new Integer[][]{});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToCSV(String resultFileName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName), StandardCharsets.UTF_8));
            StringBuffer oneLine = new StringBuffer();

            for (String s : header) {
                oneLine.append(s);
                oneLine.append(DELIMITER);
            }
            bufferedWriter.write(oneLine.toString());
            bufferedWriter.newLine();

            for (Integer[] rowData : data) {
                oneLine.delete(0, oneLine.length());
                for (Integer rowDatum : rowData) {
                    oneLine.append(rowDatum);
                    oneLine.append(DELIMITER);
                }
                bufferedWriter.write(oneLine.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // конец метода writeToCSV

}
