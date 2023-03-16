import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number - ");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 2, 12 -> System.out.println("It's winter");
            case 3, 4, 5 -> System.out.println("It's spring");
            case 6, 7, 8 -> System.out.println("It's summer");
            case 9, 10, 11 -> System.out.println("It's autumn");
            default -> System.out.println("default");
        }


        if (month == 12 || month == 1 || month == 2) {
            System.out.println("It's winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("It's spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("It's summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("It's autumn");
        } else {
            System.out.println("default");
        }


        int number;
        System.out.print("Enter an integer - ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if ((number % 2) == 0) {
                System.out.println("Even number " + number);
            } else {
                System.out.println("Odd number " + number);
            }
        } else {
            System.out.println("You have not entered an integer");
        }


        System.out.print("Enter the temperature - ");
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.println("It's warm");
        } else if (-5<t || t>-20) {
            System.out.println("It's normal");
        } else if (-20 > t) {
            System.out.println("It's cold");
        } else {
            System.out.println("default");
        }


        System.out.print("Enter the number of the rainbow color - ");
        int color = scanner.nextInt();

        switch (color) {
            case 1 -> System.out.println("It's red");
            case 2 -> System.out.println("It's orange");
            case 3 -> System.out.println("It's yellow");
            case 4 -> System.out.println("It's green");
            case 5 -> System.out.println("It's sky blue");
            case 6 -> System.out.println("It's dark blue");
            case 7 -> System.out.println("It's violet");
            default -> System.out.println("default");
        }

    }
}