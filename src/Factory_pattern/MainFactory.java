package Factory_pattern;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {
        TranspontFactory factory = new TranspontFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your type (land/water/air): ");
        String way = scanner.nextLine();

        Transport transport = factory.createTransport(way.toLowerCase());
        if (transport != null) {
            transport.deliver();
        }
    }
}
