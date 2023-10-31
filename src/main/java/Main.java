import java.util.Scanner;

public class Main {
    public static double sum;

    public static void main(String[] args) {

        int quantityPerson;
        quantityPerson = 0;
        double sum;
        String messageTemplate = "\nСумма, которую должен заплатить каждый человек %.2f";


        // запрашиваем у пользователя данные по количеству человек
        Scanner scanner = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счёт? ");

        while(true) {
            if (scanner.hasNextInt()) { // проверяемя введена ли цифра
                quantityPerson = scanner.nextInt();
                if (quantityPerson > 1) { // если количество гостей > 1, то выходим из цикла
                    break;
                } else {
                    System.out.print("Ошибка. Пожалуйста, введите верное количество гостей ");
                }
                 } else {
                System.out.print("Вы ввели не число. Пожалуйста, введите число "); // если введено не число

            }
            scanner.nextLine();
            }

            Product.calculate();

        sum = Product.totalPrice/quantityPerson;

        System.out.println("Добавленные товары: \n" + Product.nameList);
        //System.out.println("Количество человек = " + quantityPerson);
        System.out.println(String.format(messageTemplate,sum) + " рубл" + Rubles.vivod(sum));


        }
    }
