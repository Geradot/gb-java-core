package homework1;

public enum Barrier {
    WALL("Wall", 40), WATER("Water", 50), SAND("Sand", 20);
    private String title;
    private int plusFatigue;

    Barrier(String title, int plusFatigue) {
        this.title = title;
        this.plusFatigue = plusFatigue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlusFatigue() {
        return plusFatigue;
    }

    public void setPlusFatigue(int plusFatigue) {
        this.plusFatigue = plusFatigue;
    }
}
