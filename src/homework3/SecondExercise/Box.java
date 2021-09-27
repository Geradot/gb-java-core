package homework3.SecondExercise;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list.addAll(list);
    }

    // добавление фрукта
    public void addFruit(T fruit) {
        this.list.add(fruit);
    }

    // вычисление веса коробки
    public double getWeight() throws MyException {
        if (this.list.size() == 0) {
            throw new MyException("тут фруктов нет");
        }
        return this.list.size() * this.list.get(0).getWeight();
    }

    // сравнение коробок
    public boolean compare(Box<?> fruitBox) throws MyException {
        return this.getWeight() == fruitBox.getWeight();
    }

    // пересып из одной коробки в другую
    public void intersperseInto(Box<T> fruitBox) {
        fruitBox.setList(this.list);
        this.list.clear();
    }
}

