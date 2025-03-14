public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int num1 = -10;
        int firstNum = num1;
        int num2 = 21;
        int evenNum = 0;
        int oddNum = 0;

        do {
            if (num1 % 2 == 0) {
                evenNum += num1;
            } else {
                oddNum += num1;
            }
            num1++;
        } while (num1 <= num2);
        System.out.println("В отрезке [" + firstNum + ", " + num2 + "] " +
                "сумма четных чисел = " + evenNum + ", а нечетных = " + oddNum);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");

        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        int min = number3;

        if (number2 > max) {
            max = number2;
        } else if (number3 > max) {
            max = number3;
        }
        if (number1 < min) {
            min = number1;
        } else if (number2 < min) {
            min = number2;
        }

        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);

        for (max -= 1; max > min; max--) {
            System.out.print(max + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int count = 1;
        int number = 1234;
        int sum = 0;
        int reverse = 0;

        while (count < 5) {
            sum += number % 10;
            reverse = number % 10;
            number /= 10;
            System.out.print(reverse);
            count++;
        }

        System.out.println("\nСумма выделенных цифр " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");

        int startNum = 1;
        int finishNum = 24;

        for (int i = startNum; i < finishNum; i++) {
            for (int j = 0; j < 5 && i < finishNum; i++) {
                if (i % 2 != 0) {
                    System.out.printf("%3d", i);
                    j++;
                }
            }
            System.out.println();
        }

        System.out.println("\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");

        int num = 3242592;
        int originalNum = num;
        int count2 = 0;
        String parity = "";

        while (num > count2) {
            if ((num % 10) == 2) {
                count2++;
            }
            num /= 10;
            if (count2 % 2 == 0) {
                parity = "четное";
            } else {
                parity = "нечетное";
            }
        }
        System.out.println("В " + originalNum + " " + parity + " (" + count2 + ") " + "количество двоек");
    }
}

