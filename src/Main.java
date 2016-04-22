import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");

        try {
            int number = Integer.parseInt(br.readLine());
            int length = (int) Math.log10(number) + 1;
            /// just for test

            if (length != 4) {
                System.out.println("Invalid Number! The number should be four figures.");
            } else {
                int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
                int secondDigit = Integer.parseInt(Integer.toString(number).substring(1, 2));
                int sum1 = firstDigit + secondDigit;

                int thirdDigit = Integer.parseInt(Integer.toString(number).substring(2, 3));
                int fourthDigit = Integer.parseInt(Integer.toString(number).substring(3, 4));
                int sum2 = thirdDigit + fourthDigit;

                if (sum1 == sum2) {
                    System.out.println("True!");
                } else
                    System.out.println("False!");

            }

        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }

    }
}

/*
public class Main {

    public static final String EXIT_COMMAND = "exit";

    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some text, or '" + EXIT_COMMAND + "' to quit");

        while (true) {

            System.out.print("> ");
            String input = br.readLine();
            System.out.println(input);

            if (input.length() == EXIT_COMMAND.length() && input.toLowerCase().equals(EXIT_COMMAND)) {
                System.out.println("Exiting.");
                return;
            }

            System.out.println("...response goes here...");
        }
    }
}

*/
