public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte coreCount = 6;
        short ramCapacity = 32;
        int refreshRate = 144;
        long ssdCapacity = 1000L;
        char ssdType = 'M';
        boolean hasOpticalDrive = false;
        float cpuFrequency = 3.3F;
        double screenSize = 15.6;

        System.out.println("Количество ядер: " + coreCount);
        System.out.println("Объем оперативной памяти: " + ramCapacity + "Гб");
        System.out.println("Максимальная частота обновления экрана: " + refreshRate + "Гц");
        System.out.println("Общий объем твердотельных накопителей: " + ssdCapacity + "Гб");
        System.out.println("Тип SSD диска: " + ssdType + ".2");
        System.out.println("Оптический привод: " + hasOpticalDrive);
        System.out.println("Частота процессора: " + cpuFrequency + "Ггц");
        System.out.println("Диагональ экрана: " + screenSize);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5F;
        float bookPrice = 203.83F;
        float basePrice = penPrice + bookPrice;
        float discountPercent = 0.11F;
        float discountSum = basePrice * discountPercent;
        float discountPrice = basePrice - discountSum;
        System.out.println("Стоимость товаров без скидки: " + basePrice);
        System.out.println("Сумма скидки: " + discountSum + "%");
        System.out.println("Стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte extremesByteValue = 127;
        short extremesShortValue = 32767;
        int extremesIntValue = 2147483647;
        long extremesLongValue = 9223372036854775807L;
        int extremesCharValue = Character.MAX_VALUE;

        System.out.println(extremesByteValue);
        System.out.println(++extremesByteValue);
        System.out.println(--extremesByteValue);
        System.out.println(extremesShortValue);
        System.out.println(++extremesShortValue);
        System.out.println(--extremesShortValue);
        System.out.println(extremesIntValue);
        System.out.println(++extremesIntValue);
        System.out.println(--extremesIntValue);
        System.out.println(extremesLongValue);
        System.out.println(++extremesLongValue);
        System.out.println(--extremesLongValue);
        System.out.println(extremesCharValue);
        System.out.println(++extremesCharValue);
        System.out.println(--extremesCharValue);

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
        System.out.print("" + slash + underscore + underscore + underscore + underscore +
                slash + backslash + underscore + underscore + backslash);

        System.out.println("\n\n8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        int digitSum = hundreds + tens + ones;
        int digitProduct = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит:");
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