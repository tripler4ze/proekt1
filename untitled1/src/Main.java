

import java.util.Scanner;
        public class Main {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Выберите действие: 1) сумма\n" +
                "2) разность\n" +
                "3) произведение\n" +
                "4) деление:");

        String action = scanner.nextLine();

        System.out.println(" Введите число:");
        int num1 =  scanner.nextInt();

        System.out.println(" Введите число:");
        int num2 =  scanner.nextInt();

        int res;

        switch (action) {
            case "1":
                res = num1 + num2;
                System.out.println("Результат:" + res);
                break;

            case "2":
                res = num1 - num2;
                System.out.println("Результат:" + res);
                break;
            case "3":
            res = num1 * num2;
            System.out.println("Результат:" + res);
            break;

            case "4":
            res = num1 / num2;
            System.out.println("Результат:" + res);
                break;
            default:
                System.out.println(" Ошибка:Ведите значение от 1 до 4");
        }
        System.out.println("Хотите выйти из проекта?  1)да" + "2)нет");
        String choice= scanner.nextLine();
        switch (choice) {
            case "1":

        }



    }
}