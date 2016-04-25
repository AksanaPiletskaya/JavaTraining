import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        // Task1();
        // Task2();
        // Task3();
        // Task4();
        // Task5();
        // Task6();

        // begin Task NoteBook
        /* Note note1 = new NoteBook("A1", 50, "Page 1");
           Note note2 = new NoteBook("A2", 150, "Page 123");

           System.out.println("Equals: " + note1.equals(note2));*/
        // end Task NoteBook

    }

    public static void Task1() throws IOException{
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

    public static void Task2(){
        System.out.println("Input three numbers:");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double expr = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -3);
        System.out.println("Result:");
        System.out.println(expr);
    }

    public static void Task3(){
        System.out.println("Input cathetuses a, b:");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + hypotenuse;
        double square = a*b/2;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Square: " + square);
    }

    public static void Task4(){

        Scanner s = new Scanner(System.in);
        System.out.println("Input point coordinate x:");
        int x = s.nextInt();
        System.out.println("Input point coordinate y:");
        int y = s.nextInt();

        if (( x >= -4 && x <= 4) && (y <=4 && y >=-3))
           System.out.println("True!");
        else
           System.out.println("False!");

    }

    public static void Task5(){
        System.out.println("Input 3 numbers:");
        Scanner s = new Scanner(System.in);
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();

        if (num1 > 0)
            System.out.println(Math.pow(num1, 2));
        else
            System.out.println(Math.pow(num1, 4));

        if (num2 > 0)
            System.out.println(Math.pow(num2, 2));
        else
            System.out.println(Math.pow(num2, 4));

        if (num3 > 0)
            System.out.println(Math.pow(num3, 2));
        else
            System.out.println(Math.pow(num3, 4));
    }

    public static void Task6(){
        System.out.println("Input 3 numbers:");
        Scanner s = new Scanner(System.in);
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();

        double minNum1 = Math.min(num1, num2);
        double minNum = Math.min(minNum1, num3);

        double maxNum1 = Math.max(num1, num2);
        double maxNum = Math.max(minNum1, num3);

        double sum = minNum + maxNum;
        System.out.println("Sum:" + sum);
    }

} // Main