import java.util.Scanner;

public class ExtraTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int f;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= 11; i++) {
            f = a+ b;
            System.out.print(f + " ");
            a = b;
            b = f;
        }
        System.out.println();



        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int period = in.nextInt();

        for (int i = 1; i <= period; i++){
            sum += sum * 0.07;
        }
        System.out.println("После " + period + " месяцев сумма вклада составит " + sum);
        in.close();



        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
