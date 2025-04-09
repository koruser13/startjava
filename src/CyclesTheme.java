public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int initialNum = -10;
        int initialNumCopy = initialNum;
        int endNum = 21;
        int evenSum = 0;
        int oddSum = 0;

        do {
            if (initialNumCopy % 2 == 0) {
                evenSum += initialNumCopy;
            } else {
                oddSum += initialNumCopy;
            }
            initialNumCopy++;
        } while (initialNumCopy <= endNum);
        System.out.println("В отрезке [" + initialNum + ", " + endNum + "] " +
                "сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");

        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        int min = number3;

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number1 < min) {
            min = number1;
        }
        if (number2 < min) {
            min = number2;
        }

        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);

        for (max--; max > min; max--) {
            System.out.print(max + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int someNum = 1234;
        int digitSum = 0;

        while (someNum > 0) {
            digitSum += someNum % 10;
            int digit = someNum % 10;
            someNum /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма выделенных цифр " + digitSum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");

        int startNum = 1;
        int finishNum = 24;
        int num = 0;
        for (int i = startNum; i < finishNum; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                num++;
                if (num % 5 == 0) {
                    System.out.println();
                }
            }
        }
        while (num % 5 != 0) {
            System.out.printf("%3d", 0);
            num++;
        }

        System.out.println("\n\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");

        int originalNum = 32425922;
        int currentNum = originalNum;
        int count2 = 0;
        String parity;

        while (currentNum > count2) {
            if ((currentNum % 10) == 2) {
                count2++;
            }
            currentNum /= 10;
        }

        if (count2 % 2 == 0) {
            parity = "четное";
        } else {
            parity = "нечетное";
        }
        System.out.println("В " + originalNum + " " + parity + " (" + count2 + ") " + "количество двоек");

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");

        int row = 5;
        int column = 10;

        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int counter1 = 5;

        while (counter1 >= 1) {
            int counter2 = 1;
            while (counter2 <= counter1) {
                System.out.print("#");
                counter2++;
            }
            System.out.println();
            counter1--;
        }
        System.out.println();

        int height = 5;
        int counter = 0;

        do {
            int counter2 = 0;
            do {
                if (counter > 2) {
                    counter2++;
                }
                if (counter > 3) {
                    counter2 -= 2;
                }
                System.out.print("$");
            } while (++counter2 <= counter && counter2 > 0);
            System.out.println();
        } while (++counter < height);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ\n");

        char startSign = 0;
        char endSign = 127;

        System.out.printf("%21s%13s%15s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (char j = startSign; j <= endSign; j++) {
            if (j % 2 != 0) {
                if (j >= 33 && j < 48) {
                    System.out.printf("%18d%12s\t\t\t\t%-5s%n", (int) j, j, Character.getName(j));
                }
            } else {
                if (j >= 97 && j < 123) {
                    System.out.printf("%18d%12s%34s%n", (int) j, j, Character.getName(j));
                }
            }
        }

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");

        int originalNumber = 1234321;
        int checkedNum = originalNumber;
        int reversedNum = 0;

        while (checkedNum > 0) {
            int digit = checkedNum % 10;
            reversedNum = reversedNum * 10 + digit;
            checkedNum /= 10;
        }
        if (originalNumber == reversedNum) {
            System.out.println("Число " + reversedNum + " - палиндром");
        } else {
            System.out.println("Число " + reversedNum + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");

        int origNum = 123321;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int firstHalfNum = origNum / 1000;
        int secondHalfNum = origNum % 1000;
        int firstHalfNumCopy = firstHalfNum;
        int secondHalfCopy = secondHalfNum;

        for (int i = 0; i < 3; i++) {
            firstHalfSum += firstHalfNumCopy % 10;
            firstHalfNumCopy /= 10;
            secondHalfSum += secondHalfCopy % 10;
            secondHalfCopy /= 10;
        }

        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + origNum + " - счастливое");
        } else {
            System.out.println("Число " + origNum + " - несчастливое");
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


