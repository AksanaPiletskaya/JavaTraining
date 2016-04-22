import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        // task1();
        // task2();
        task3();
    }

    public static void task1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");

        try {
            int number = Integer.parseInt(br.readLine());
            int length = (int) Math.log10(number) + 1;

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

    public static void task2(){
        System.out.println("Input three numbers:");
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();
        double expr = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -3);
        System.out.println("Result:");
        System.out.println(expr);
    }

    public static void task3(){
        System.out.println("Input cathetuses a, b:");
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + hypotenuse;
        double square = a*b/2;

        System.out.println("Perimeter:");
        System.out.println(perimeter);
        System.out.println("Square:");
        System.out.println(square);
    }
}