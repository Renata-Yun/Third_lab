import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        int kek1 = 0;
        int kek2 = 0;
        int kek3 = 0;
        String luck = " ";
        String sos = " ";
        double rar = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        // 1 program
        System.out.println("Программа №1 - Сочинение Бесси");
        System.out.print("Введите количество слов в исходном предложении: ");
        kek1 = scanner.nextInt();
        System.out.print("Введите количество символов в преобразованной строке: ");
        kek2 = scanner1.nextInt();
        System.out.print("Введите предложение: ");
        sos = scanner2.nextLine();
        System.out.print("Вывод преобразованного предложения:");
        Essay.essay(kek1,kek2,sos);

        // 2 program
    }
}
