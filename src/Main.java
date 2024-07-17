import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                System.out.print("Введите число a: ");
                int a = Integer.parseInt(reader.readLine());
                System.out.print("Введите число b: ");
                int b = Integer.parseInt(reader.readLine());
                if (a > b) {
                    System.out.println(a + " > " + b);
                } else if (a < b) {
                    System.out.println(a + " < " + b);
                } else System.out.println(a + " = " + b);
                int sum = a + b;
                int difference = a - b;
                int multiplication = a * b;
                double division = (double) a / b;
                System.out.println("Сложение: " + a + " + " + b + " = " + sum);
                System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
                System.out.println("Умножение: " + a + " * " + b + " = " + multiplication);
                if (b != 0) {
                    System.out.println("Деление: " + a + " / " + b + " = " + division);
                } else {
                    System.out.println("Деление невозможно (деление на ноль)");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение");
            }
        }
    }
}