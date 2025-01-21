package Lesson1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte laptopCoreCount = 6;
        short laptopRam = 32;
        int laptopPpi = 144;
        long laptopSsd = 1000L;
        char laptopSsdType = 'M';
        boolean hasOpticalDrive = false;
        float laptopFreqCpu = 3.3F;
        double laptopBluetooth = 5.2;

        System.out.println("Количество ядер: " + laptopCoreCount);
        System.out.println("Объем оперативной памяти: " + laptopRam + "Гб");
        System.out.println("Максимальная частота обновления экрана: " + laptopPpi + "Гц");
        System.out.println("Общий объем твердотельных накопителей: " + laptopSsd + "Гб");
        System.out.println("Тип SSD диска: " + laptopSsdType + ".2" );
        System.out.println("Оптический привод: " + hasOpticalDrive);
        System.out.println("Частота процессора: " + laptopFreqCpu + "Ггц");
        System.out.println("Bluetooth: " + laptopBluetooth);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5F;
        float bookPrice = 203.83F;
        float totalPriceProduct = penPrice + bookPrice;
        float discountPercent = 0.11F;
        float discountSum = totalPriceProduct * discountPercent;
        float discountPriceProduct = totalPriceProduct - discountSum;
        System.out.println("Стоимость товаров без скидки: " + totalPriceProduct);
        System.out.println("Сумма скидки: " + discountSum + "%");
        System.out.println("Стоимость товаров со скидкой: " + discountPriceProduct);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxValueOfByteType = 127;
        short maxValueOfShortType = 32767;
        int maxValueOfIntType = 2147483647;
        long maxValueOfLongType = 9223372036854775807L;
        char sign = '\uFFFF';
        int maxValueOfCharType = (int) sign;

        System.out.println(maxValueOfByteType);
        System.out.println(++maxValueOfByteType);
        System.out.println(--maxValueOfByteType);
        System.out.println(maxValueOfShortType);
        System.out.println(++maxValueOfShortType);
        System.out.println(--maxValueOfShortType);
        System.out.println(maxValueOfIntType);
        System.out.println(++maxValueOfIntType);
        System.out.println(--maxValueOfIntType);
        System.out.println(maxValueOfLongType);
        System.out.println(++maxValueOfLongType);
        System.out.println(--maxValueOfLongType);
        System.out.println(maxValueOfCharType);
        System.out.println(++maxValueOfCharType);
        System.out.println(--maxValueOfCharType);

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
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);

        System.out.println("\nС помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char caret = '^';
        char tilde = '~';

        System.out.println("Код символа " + (int) dollar + " - " + dollar);
        System.out.println("Код символа " + (int) asterisk + " - " + asterisk);
        System.out.println("Код символа " + (int) atSign + " - " + atSign);
        System.out.println("Код символа " + (int) caret + " - " + caret);
        System.out.println("Код символа " + (int) tilde + " - " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftBracket = '(';
        char rightBracket = ')';

        System.out.println("\n    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftBracket + " " + rightBracket + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.print("" + slash + underscore + "" + underscore + "" + underscore + "" + underscore +
                slash + backslash + underscore + underscore + backslash);

        System.out.println("\n\n8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        int digitSum = hundreds + tens + ones;
        int digitProduct = hundreds * tens * ones;

        System.out.println("Число " + number  + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма разрядов = " + digitSum);
        System.out.println("Произведение разрядов = " + digitProduct);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int totalSecs = 86399;
        int hh = totalSecs / 3600;
        int mm = (totalSecs % 3600) / 60;
        int ss = totalSecs % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}