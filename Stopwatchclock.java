import java.util.*;
import java.time.localTime;
import java.time.format.DateTimeFormatter;

public class Stopwatchclock {
    public static void display() {
        localTime currentTime = localTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofpattern("HH:mm:ss");
        System.out.println("Current Time:" + currentTime.format(formatter));
    }

    public static void Stopwatch(Scanner input) {
        System.out.println("press enter to start ...");
        input.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println("press enter to stop ...");
        input.nextLine();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Stop watch time:" + (elapsedTime / 1000.0) + "seconds");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n******** Stopwatch+clock *******");
            display();
            Stopwatch(input);
            System.out.println("if you want to continue enter 1 else 0:");
            String ch = input.nextLine();
            if (!ch.equals("1")) {
                break;
            }

        }
        input.close();
        System.out.println("end!");
    }
}