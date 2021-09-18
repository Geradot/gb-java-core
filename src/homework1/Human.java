package homework1;

public class Human {
    private String name;

    private int maxFatigue; // максимальная усталость
    private int currentFatigue = 0; // текущая усталость
    private boolean isWinner = false; // победитель или нет
    private boolean man; // мужчина или нет

    Human(String name, boolean man) {
        this.name = name;
        this.man = man;
        this.maxFatigue = (man) ? Tools.randomizer(70, 100) : Tools.randomizer(50, 70);
    }

    Human(String name, boolean man, int maxFatigue) {
        this.name = name;
        this.man = man;
        this.maxFatigue = maxFatigue;
    }

    public String getName() {
        return name;
    }

    public boolean isMan() {
        return man;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxFatigue() {
        return maxFatigue;
    }

    public void setMaxFatigue(int maxFatigue) {
        this.maxFatigue = maxFatigue;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public int getCurrentFatigue() {
        return currentFatigue;
    }

    public void setCurrentFatigue(int currentFatigue) {
        this.currentFatigue += currentFatigue;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
