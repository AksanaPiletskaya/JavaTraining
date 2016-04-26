import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        // Task1();
        // Task2();
        // Task3();
        // Task4();
        // Task5();
        // Task6();
        // Task7();
        // Task8();
        // Task9();
        Task10();

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

    public static void Task7() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a, b:");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Input step h:");
        int h = s.nextInt();

        int i;
        for (i = a; i <= b; i = i + h) {
            double f = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
            System.out.println("x = " + i + "  f(x) = " + f);

        }
    }

    public static void Task8(){
        int a[] = { 3, 6, 9, 12, 19 };
        int k = 3;
        int sum = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] % k == 0){
               sum = sum + a[i];
            }
        }
        System.out.println("Sum:" + sum);
    }

    public static void Task9(){
        int a1[] = { 1, 2, 3, 4, 5 };
        int a2[] = { 10, 20, 40 };

        int k = 3;

        System.arraycopy(a2, 0, a1, k-1, a2.length);
        for (int i = 0; i < a1.length; i++){
            System.out.println(i +": " + a1[i]);
        }
    }

    public static void Task10() {
        System.out.println("Input n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 1;
        int num = n;

        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++) {
            if(i%2 == 0) {
                for(int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = k;
                    k ++;
                }
                k = 1;
            }
            else {
                for(int j = 0; j < matrix.length;j++) {
                    matrix[i][j] = num;
                    num --;
                }
                num = n;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


} // Main