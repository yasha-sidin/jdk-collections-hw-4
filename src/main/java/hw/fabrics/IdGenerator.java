package hw.fabrics;

public class IdGenerator {
    private static long currentAvailableID = 0;

    public static long getCurrentAvailableID() {
        return currentAvailableID++;
    }
}
