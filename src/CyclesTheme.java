public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");

        int startRange = -10;
        int counter = startRange;
        int endRange = 21;
        int evenSum = 0;
        int oddSum = 0;

        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter <= endRange);
        System.out.println("В отрезке [" + startRange + ", " + endRange + "] " +
                "сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num3;

        if (num2 > maxNum) {
            maxNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        if (num1 < minNum) {
            minNum = num1;
        }
        if (num2 < minNum) {
            minNum = num2;
        }

        System.out.println("Максимальное число " + maxNum);
        System.out.println("Минимальное число " + minNum);

        for (maxNum--; maxNum > minNum; maxNum--) {
            System.out.print(maxNum + " ");
        }

        System.out.println("\n\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");

        int initialNum = 1234;
        int digitSum = 0;

        while (initialNum > 0) {
            int digit = initialNum % 10;
            digitSum += digit;
            initialNum /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма выделенных цифр " + digitSum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");

        startRange = 1;
        endRange = 24;
        counter = 0;
        for (int i = startRange; i < endRange; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                counter++;
                if (counter % 5 == 0) {
                    System.out.println();
                }
            }
        }
        while (counter % 5 != 0) {
            System.out.printf("%3d", 0);
            counter++;
        }

        System.out.println("\n\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");

        int originalNum = 3242592;
        int currentNum = originalNum;
        int twosNum = 0;

        while (currentNum > twosNum) {
            if ((currentNum % 10) == 2) {
                twosNum++;
            }
            currentNum /= 10;
        }

        String parity = "четное";

        if (twosNum % 2 != 0) {
            parity = "нечетное";
        }
        System.out.println("В " + originalNum + " " + parity + " (" + twosNum + ") " + "количество двоек");

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");

        int cols = 5;
        int rows = 10;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        while (cols >= 1) {
            rows = 1;
            while (rows <= cols) {
                System.out.print("#");
                rows++;
            }
            System.out.println();
            cols--;
        }
        System.out.println();

        cols = 5;
        counter = 0;

        do {
            rows = 0;
            do {
                if (counter > 2) {
                    rows++;
                }
                if (counter > 3) {
                    rows -= 2;
                }
                System.out.print("$");
            } while (++rows <= counter && rows > 0);
            System.out.println();
        } while (++counter < cols);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ\n");

        char startSign = 0;
        char endSign = 127;

        System.out.printf("%21s%13s%15s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (char j = startSign; j <= endSign; j++) {
            if (j % 2 != 0) {
                if (j >= 33 && j < 48) {
                    System.out.printf("%18d%12s\t\t\t   %-5s%n", (int) j, j, Character.getName(j));
                }
            } else {
                if (j >= 97 && j < 123) {
                    System.out.printf("%18d%12s%33s%n", (int) j, j, Character.getName(j));
                }
            }
        }

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");

        initialNum = 1234321;
        currentNum = initialNum;
        int reversedNum = 0;

        while (currentNum > 0) {
            int digit = currentNum % 10;
            reversedNum = reversedNum * 10 + digit;
            currentNum /= 10;
        }
        if (initialNum == reversedNum) {
            System.out.println("Число " + reversedNum + " - палиндром");
        } else {
            System.out.println("Число " + reversedNum + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");

        initialNum = 123321;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int firstHalfNum = initialNum / 1000;
        int secondHalfNum = initialNum % 1000;
        int firstHalfNumCopy = firstHalfNum;
        int secondHalfCopy = secondHalfNum;

        for (int i = 0; i < 3; i++) {
            firstHalfSum += firstHalfNumCopy % 10;
            firstHalfNumCopy /= 10;
            secondHalfSum += secondHalfCopy % 10;
            secondHalfCopy /= 10;
        }

        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + initialNum + " - счастливое");
        } else {
            System.out.println("Число " + initialNum + " - несчастливое");
        }
        System.out.println("Сумма цифр " + firstHalfNum + " = " + firstHalfSum);
        System.out.println("Сумма цифр " + secondHalfNum + " = " + secondHalfSum);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");

        System.out.print("   | ");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println("\n --+------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 2; j <= 9; j++)
                System.out.printf("%2d ", i * j);
            System.out.println();
        }
    }
}


