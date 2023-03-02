import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите перовое число:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
