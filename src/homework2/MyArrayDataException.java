package homework2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("Невозможно преобразовать элемент массива [" + i + "][" + j + "] в число.");
    }
}
