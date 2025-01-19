package Lesson1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte coreCounts = 6;
        short ram = 32;
        int ppi = 144;
        long ssd = 1000L;
        char symbol = 'M';
        boolean opticalDrive = false;
        float cpuFrequency = 3.3F;
        double bluetooth = 5.2;
        System.out.println("Количество ядер: " + coreCounts);
        System.out.println("Объем оперативной памяти: " + ram + "Гб");
        System.out.println("Максимальная частота обновления экрана: " + ppi + "Гц");
        System.out.println("Общий объем твердотельных накопителей: " + ssd + "Гб");
        System.out.println("Тип SSD диска: " + symbol + ".2" );
        System.out.println("Оптический привод: " + opticalDrive);
        System.out.println("Частота процессора: " + cpuFrequency + "Ггц");
        System.out.println("Bluetooth: " + bluetooth);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float pen = 105.5F;
        float book = 203.83F;
        float sum = pen + book;
        float discount = 11;
        float result = sum - (sum * 11 / 100);
        System.out.println("Стоимость товаров без скидки: " + sum);
        System.out.println("Сумма скидки: " + discount + "%");
        System.out.println("Стоимость товаров со скидкой: " + result);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        char e = 65535;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c--);
        System.out.println(d);
        System.out.println(d++);
        System.out.println(d--);
        System.out.println(e);
        System.out.println(e++);
        System.out.println(e--);

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("\nС помощью третьей переменной:");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);

        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);

        System.out.println("\nС помощью арифметических операций");
        System.out.println("Исходные значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);

        System.out.println("\nС помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 36;
        char ch2 = 42;
        char ch3 = 64;
        char ch4 = 124;
        char ch5 = 126;
        System.out.println("Код 36 " + ch1);
        System.out.println("Код 42 " + ch2);
        System.out.println("Код 64 " + ch3);
        System.out.println("Код 124 " + ch4);
        System.out.println("Код 126 " + ch5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftBracket = '(';
        char rightBracket = ')';

        System.out.print("\n    " + slash);
        System.out.println(backSlash);
        System.out.print("   " + slash);
        System.out.println("  " + backSlash);
        System.out.print("  " + slash);
        System.out.print(underscore);
        System.out.print(leftBracket + " " + rightBracket);
        System.out.println(backSlash);
        System.out.print(" " + slash);
        System.out.println("      " + backSlash);
        System.out.print(slash);
        System.out.print(underscore + "" + underscore + "" + underscore + "" + underscore);
        System.out.print(slash);
        System.out.print(backSlash);
        System.out.print(underscore);
        System.out.print(underscore);
        System.out.println(backSlash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        System.out.println("Число 123 содержит:");
        int hundreds = 123 / 100;
        int tens = 123 % 100 / 10;
        int units = 123 % 10;
        int digitSum = hundreds + tens + units;
        int digitProduct = hundreds * tens * units;

        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);
        System.out.println("Сумма разрядов = " + digitSum);
        System.out.println("Произведение разрядов = " + digitProduct);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int total = 86399;
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
