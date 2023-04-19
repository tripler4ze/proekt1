

import javax.sound.midi.Soundbank;
import java.util.Scanner;
        public class Main {public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int Choice = 5;
            do {
                System.out.println("Выберите действие: 1) сумм \n" +
                        "2) разность\n" +
                        "3) произведение\n" +
                        "4) деление:" +
                        " 0) выход  " );


                String action = scanner.nextLine();

                System.out.println(" Введите число:");
                int num1 = scanner.nextInt();

                System.out.println(" Введите число:");
                int num2 = scanner.nextInt();

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
                    case "0" :
                        System.out.println("Выход из системы");
                        break;
                    default:
                        System.out.println(" Ошибка:Ведите значение от 0 до 4");

                }


            } while (Choice>0);  }
            

            }

