package homework1;

public class Test {
    public static void main(String[] args) {

        Course c = new Course();

        Human humanAndrey = new Human("Andrey", true, 150);
        Human humanAnton = new Human("Anton", true);
        Human humanOlga = new Human("Olga", false);
        Human humanElena = new Human("Elena", false, 80);

        Team team = new Team(humanAndrey, humanAnton, humanOlga, humanElena);


        c.doIt(team);
        System.out.println("\n***********\nВсе участники команды:\n**********");
        System.out.println(team.allHumans());
        System.out.println("\n***********\nПобедители:\n***********\n");
        System.out.println(team.allWinners(team.winners));

    }
}
