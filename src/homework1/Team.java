package homework1;

public class Team {
    private String title;

    Human[] humans = new Human[4];
    Human[] winners;

    Team(Human human1, Human human2, Human human3, Human human4) {
        humans[0] = human1;
        humans[1] = human2;
        humans[2] = human3;
        humans[3] = human4;
    }

    String allHumans() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < humans.length; i++) {
            s.append("Игрок #").append(i + 1).append(":\nИмя - ")
                    .append(humans[i].getName()).append("\nМаксимальная усталость: ").append(humans[i].getMaxFatigue()).append("\n")
                    .append("Текущая усталость: ").append(humans[i].getCurrentFatigue()).append("\n************\n");
}
        return s.toString();
    }

    String allWinners(Human[] winners) {
        StringBuilder s = new StringBuilder();
        if (winners.length > 0) {
            for (Human winner : winners) {
                s.append("Игрок ").append(winner.getName())
                        .append(". Он устал только на ").append(winner.getCurrentFatigue())
                        .append(" из ").append(winner.getMaxFatigue()).append("\n************\n");
            }
            return s.toString();
        } else return "Победителей нет!";
    }
}
