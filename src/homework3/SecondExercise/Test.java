package homework3.SecondExercise;

public class Test {
    public static void main(String[] args) throws MyException {

        Box<Apple> appleBox = new Box<>();

        Box<Orange> orangeBox = new Box<>();

        for (int i = 0; i < 5; i++) {
            appleBox.addFruit(new Apple(1.0));
            orangeBox.addFruit(new Orange(1.5));
        }

        System.out.print("Вес коробки appleBox: ");
        try {
            System.out.println(appleBox.getWeight());
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

        System.out.print("Вес коробки orangeBox: ");
        try {
            System.out.println(orangeBox.getWeight());
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

        String compare = "Вес коробок " + ((appleBox.compare(orangeBox)) ? "одинаковый" : "не одинаковый");
        System.out.println(compare);

        // другая коробка для яблок
        Box<Apple> appleBox2 = new Box<>();

        // пересыпаем в другую коробку
        System.out.println("Пересыпаем из одной коробки в другую...");
        appleBox2.intersperseFrom(appleBox);

        System.out.print("Вес коробки appleBox: ");
        try {
            System.out.println(appleBox.getWeight());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Вес коробки appleBox2: ");
        try {
            System.out.println(appleBox2.getWeight());
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

    }
}
