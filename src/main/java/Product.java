import java.util.Scanner;

public class Product {
    static String name;
    static double price;

    static double totalPrice;
    static String nameList = "";

    static Scanner scanner = new Scanner(System.in);


    public static void calculate() {

        // Добавляем товар в цикле
        while (true) {
            System.out.println("Введите название товара");
            name = scanner.next(); //было scanner.nextLine
            nameList += "\n" + name;
            System.out.println("Введите цену товара в формате: рубли.копейки");
            while (true) {
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    if (price > 0) {
                        totalPrice += price;
                        System.out.print("Товар успешно добавлен.\n");
                        break;
                    } else {
                        System.out.print("Цена не может быть < = 0. Введите правильную цену ");
                    }
                } else {
                    System.out.print("Ошибка. Введите цену цифрах ");
                }
                scanner.nextLine();
            }
            scanner.nextLine();
            price = price + price;
            AddProduct.question();
            break;
        }
    }
}

