package homework1;

public class Tools {
    public static int randomizer(int min, int max) {
         max -= min;
         return (int) (Math.random() * ++max) + min;
    }
}
