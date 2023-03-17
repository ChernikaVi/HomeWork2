import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int test = 0; test < 100; test += 1) {                    // task 1-2
            System.out.println(test);
        }

        for (int test1 = 5; test1 > 0; test1 -= 1) {
            System.out.println(test1);
        }


        int a;                                                         // task 3
        int sum = 0;

        System.out.print("Enter the number - ");
        int num = scan.nextInt();

        for (a = 1; a <= num; sum += a++);
        System.out.println(sum);


        /*int n = 98;
        for (int i = 7; i <= n; i += 7) {
            System.out.print(i + " ");*/

        int i = 7;                                                     // task 4
        while (i <= 98) {
            System.out.print (i + " ");
            i += 7;
        }


        int p = 5;                                                     // task 5
        System.out.println (p + "");

        for (int i2 = 1; i2 < 11; i2++) {
            p -= 5;
            System.out.print (p + " ");
        }


        for (int b = 9; b < 21; b++) {                                 // task 6
            System.out.println(b + "^2 = " + b * b);
        }
    }
}















