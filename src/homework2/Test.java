package homework2;

public class Test {
    public static void main(String[] args) {
        // Правильный массив
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        // Неправильный массив
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "Hello", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        // Неправильный массив
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16", "17"}
        };

        try {
            array4x4(array);
        } // перехват прерывания касательно неправильного размера массива
        // и нечислового значения ячейки массива
        catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            array4x4(array2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            array4x4(array3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void array4x4(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length == 4)
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4)
                    throw new MyArraySizeException();
                else {
                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            sum += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }
                }
            }
        else
            throw new MyArraySizeException();

        System.out.println("Сумма чисел массива = " + sum);
    }
}
