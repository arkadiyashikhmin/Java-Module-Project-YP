public class Rubles {
    static int a; // объявили интовую переменную
 public static String vivod(double sum) {
     String format = ""; // инициализровали строковую переменную
     a = (int) sum; // записали в интовую переменнюу значение из дабл переменной с приведением типа

     // условие работы (подсмотрел в нашем чатике)
     if (a >= 11 && a <= 14) {
         format = "ей";
     }
     else if (a % 10 == 1) {
         format = "ь";
     }
     else if ((a % 10 == 2 || a %10 == 3 || a %10 == 4)) {
         format = "я";
     }

     else format = "ей";
     return format;

    }
}

