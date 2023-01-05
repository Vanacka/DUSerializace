import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public class Auto implements Serializable {
    private String spz;
    private int najetoKm;
    public Auto() {
        spz = generujSPZ();
        najetoKm = ThreadLocalRandom.current().nextInt(999999);
    }

    public static String generujSPZ() {
        return String.format("A%c%c%04d",
                (char) (ThreadLocalRandom.current().nextInt(26) + 'A'),
                (char) (ThreadLocalRandom.current().nextInt(26) + 'A'),
                ThreadLocalRandom.current().nextInt(9999));
    }

    public String toString() {
        return "\n Auto { spz = " + spz + ", najetoKm = " + najetoKm + "}";
    }
}
