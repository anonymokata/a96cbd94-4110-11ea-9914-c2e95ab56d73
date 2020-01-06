import java.util.Scanner;

public class BabysitterPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a start time (military time - ex. 5pm = 1700; between 1700 and 0400): ");
        String input1 = getInput(scanner);
        if (input1.equals("-1")) {
            return;
        }
        System.out.print("Enter an end time (military time, between 1700 and 0400): ");
        String input2 = getInput(scanner);
        if (input2.equals("-1")) {
            return;
        }
        System.out.print("Enter a family (A, B, or C): ");
        String input3 = getInput(scanner);
        if (input3.equals("-1")) {
            return;
        }

        KataPractice kataPractice = new KataPractice();
        String output = kataPractice.getInput(input1,input2,input3);
        if (output.length() > 3) {
            System.out.println(output);
        } else {
            System.out.println("Total Pay: $" + output);
        }
    }

    private static String getInput(Scanner scanner) {
        String input = scanner.nextLine();
        if (input.length() == 0) {
            return "-1";
        } else {
            return input;
        }
    }
}
