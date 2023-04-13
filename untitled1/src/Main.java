
import java.sql.SQLOutput;
import java.util.Scanner;
        public class Main {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Выберите действие: 1) сумма\n" +
                "2) разность\n" +
                "3) произведение\n" +
                "4) деление:");

        int action =  scan.nextInt();


        System.out.println(" Введите число:");
        int num1 =  scan.nextInt();
        System.out.println(" Введите число:");
        int num2 =  scan.nextInt();
        int res;
        switch (action) {
            case "1":
                res = num1 + num2;
                System.out.println("Результат:" + res);
                break;

            case  "2":
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
        }
        












    }
}