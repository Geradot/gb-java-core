package homework3.FirstExercise;

public class Test {
    public static void main(String[] args) {
        Object[] obj = {"asdf", 123, 'f'};

        swapTwoItems(obj, 1, 3);

        for (Object o : obj) {
            System.out.print(o + " ");
        }
    }

    // меняет указанные элементы местами (по порядку, а не индексу)
    public static void swapTwoItems(Object[] object, int a, int b) {
        Object tmp = object[a - 1];
        object[a - 1] = object[b - 1];
        object[b - 1] = tmp;
    }
}
