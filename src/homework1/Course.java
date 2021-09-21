package homework1;

import java.util.Random;

public class Course {
    private final int COUNT_BARRIERS = 3;

    Barrier[] barriers = new Barrier[COUNT_BARRIERS];

    Course() {
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = randomBarrier();
        }
    }

    private Barrier randomBarrier() {
        return Barrier.values()[new Random().nextInt(Barrier.values().length)];
    }

    void doIt(Team team) {

        // Количество победивших
        int sizeOfWinners = 0;

        for (int i = 0; i < team.humans.length; i++) {

            System.out.println("Игрок " + team.humans[i].getName() + " побежал! Его предел усталости - " + team.humans[i].getMaxFatigue());
            for (int j = 0; j < barriers.length; j++) {
                if (team.humans[i].getCurrentFatigue() < team.humans[i].getMaxFatigue()) {
                    team.humans[i].setCurrentFatigue(barriers[j].getPlusFatigue());
//                    System.out.println(team.humans[i].getName() + " столкнулся с преградой " + barriers[j].getTitle() +
//                            ". Усталость увеличилась на " + barriers[j].getPlusFatigue() +
//                            " и теперь равна " + team.humans[i].getCurrentFatigue());
                } else {
//                    System.out.println(team.humans[i].getName() + " столкнулся с преградой "
//                            + barriers[j].getTitle() + " и не смог её преодолеть. Устал.");
                    break;
                }
            }

            if (team.humans[i].getCurrentFatigue() < team.humans[i].getMaxFatigue()) {
                // Фиксируем человека как победителя
                System.out.println("Игрок " + team.humans[i].getName() + " сумел преодолеть полосу препятствий!");
                team.humans[i].setWinner(true);
                // Подсчитываем количество победителей
                sizeOfWinners++;
            } else {
                System.out.println("К сожалению, игрок " + team.humans[i].getName() + " не справился с полосой препятствий!");
            }

        }

        // Создаем массив победителей
        team.winners = new Human[sizeOfWinners];
        for (int i = 0; i < sizeOfWinners; i++) {
            if (team.humans[i].isWinner()) {
                team.winners[i] = team.humans[i];
            }
        }
    } // Конец метода doIt()

}
