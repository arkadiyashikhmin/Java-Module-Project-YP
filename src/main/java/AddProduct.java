import java.util.Scanner;

public class AddProduct {

    static String answer;
    static String gameover;
    static Scanner scanner = new Scanner(System.in);

    public static void question() {
        gameover = "Завершить";
        System.out.println("Хотите добавить еще один товар? Если нет, напишите \"завершить\".");
        answer = scanner.nextLine();
        while (true) {
            if (answer.equalsIgnoreCase(("завершить"))) {
                break;
            }
            else {
                    Product.calculate();
                }
            }
        }
    }