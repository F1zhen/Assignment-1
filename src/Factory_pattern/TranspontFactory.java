package Factory_pattern;

import org.w3c.dom.ls.LSOutput;

public class TranspontFactory {
    public Transport createTransport(String way) {
        if (way.equals("land")) {
            return new Track();
        } else if (way.equals("air")) {
            return new Drone();
        } else if (way.equals("water")) {
            return new Ship();
        } else {
            System.out.println("Sorry i dont understand");
            return null;
        }
    }
}
