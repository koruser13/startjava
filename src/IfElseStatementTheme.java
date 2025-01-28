package Lesson1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean male = true;

        if (!male) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Вы мужчина");
        }

        int age = 18;

        if (age > 18) {
            System.out.println("Вход разрешен");
        } else {
            System.out.println("Вход запрещен");
        }

        float height = 1.8F;
        if (height < 1.8) {
            System.out.println("Вы невысокого роста");
        } else {
            System.out.println("У вас хороший рост");
        }

        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени начинается на букву М");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени начинается на букву I");
        } else {
            System.out.println("Первая буква имени начинается на любую букву, кроме M и I");
        }

        System.out.println("\n2.Поиск большего числа");
        int firstNumber = 28;
        int secondNumber = 25;

        if (firstNumber > secondNumber) {
            System.out.println("Первое число больше второго числа");
        } else if (secondNumber > firstNumber) {
            System.out.println("Второе число больше первого числа");
        } else {
            System.out.println("Оба числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int integer = 70;

        if (integer == 0) {
            System.out.println("Число равно " + integer);
        } else if (integer % 2 == 0 && integer < 0) {
            System.out.println(integer + " является отрицательным и четным");
        } else if (integer % 2 != 0 && integer < 0) {
            System.out.println(integer + " является отрицательным и нечетным");
        } else if (integer % 2 == 0 && integer > 0) {
            System.out.println(integer + " является положительным и четным");
        } else if (integer % 2 != 0 && integer > 0) {
            System.out.println(integer + " является положительным и нечетным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;

        int hundredsOfNum1 = num1 / 100;
        int tensOfNum1 = num1 % 100 / 10;
        int onesOfNum1 = num1 % 10;

        int hundredsOfNum2 = num2 / 100;
        int tensOfNum2 = num2 % 100 / 10;
        int onesOfNum2 = num2 % 10;

        if (hundredsOfNum1 != hundredsOfNum2 && tensOfNum1 != tensOfNum2 && onesOfNum1 != onesOfNum2) {
            System.out.println("Равных цифр нет");
        } else if (num1 == num2) {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: сотни " + hundredsOfNum1 + " и " + hundredsOfNum2 + "; десятки " +
                     tensOfNum1 + " и " + tensOfNum2 + "; единицы " + onesOfNum1 + " и " + onesOfNum2);
            System.out.println("Сотни, десятки и единицы равны");
        } else if (hundredsOfNum1 == hundredsOfNum2 && tensOfNum1 == tensOfNum2) {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: сотни " + hundredsOfNum1 + " и " + hundredsOfNum2 + "; десятки " +
                    tensOfNum1 + " и " + tensOfNum2);
            System.out.println("Сотни и десятки равны");
        } else if (hundredsOfNum1 == hundredsOfNum2 && onesOfNum1 == onesOfNum2) {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: сотни " + hundredsOfNum1 + " и " + hundredsOfNum2 + "; единицы " +
                    onesOfNum1 + " и " + onesOfNum2);
            System.out.println("Сотни и единицы равны");
        } else if (tensOfNum1 == tensOfNum2 && onesOfNum1 == onesOfNum2) {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: десятки " + tensOfNum1 + " и " + tensOfNum2 + "; единицы " +
                    onesOfNum1 + " и " + onesOfNum2);
            System.out.println("Десятки и единицы равны");
        } else if (hundredsOfNum1 == hundredsOfNum2) {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: сотни " + hundredsOfNum1 + " и " + hundredsOfNum2);
            System.out.println("Сотни равны");
        } else if (tensOfNum1 == tensOfNum2) {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: десятки " + tensOfNum1 + " и " + tensOfNum2);
            System.out.println("Десятки равны");
        } else {
            System.out.println("Исходные числа: " + num1 + " и " + num2);
            System.out.println("Одинаковые цифры: единицы " + onesOfNum1 + " и " + onesOfNum2);
            System.out.println("Единицы равны");
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0057';

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " - большая буква");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " - маленькая буква");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " - цифра");
        } else if (!Character.isLetterOrDigit(ch)) {
            System.out.println(ch + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double depositSum = 321123.59;

        double fivePercentPerYear = (depositSum * 0.05) / 365 * 365;
        double finalSum1 = depositSum + fivePercentPerYear;

        double sevenPercentPerYear = (depositSum * 0.07) / 365 * 365;
        double finalSum2 = depositSum + sevenPercentPerYear;

        double tenPercentPerYear = (depositSum * 0.1) / 365 * 365;
        double finalSum3 = depositSum + tenPercentPerYear;

        if (depositSum < 100000) {
            System.out.println("Сумма вклада " + depositSum);
            System.out.println("Сумма начисленного % " + fivePercentPerYear);
            System.out.println("Итоговая сумма с % " + finalSum1 );
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            System.out.println("Сумма вклада " + depositSum);
            System.out.println("Сумма начисленного % " + sevenPercentPerYear);
            System.out.println("Итоговая сумма с % " + finalSum2 );
        } else if (depositSum > 300000) {
            System.out.println("Сумма вклада " + depositSum);
            System.out.println("Сумма начисленного % " + tenPercentPerYear);
            System.out.println("Итоговая сумма с % " + finalSum3 );
        }

        System.out.println("\n7. Определение оценки по предметам");
        double historySubject = 60;
        int historyGrade = 2;

        if (historySubject <= 60) {
            System.out.println("История: " + historyGrade);
        } else if (historySubject > 60 && historySubject <= 73) {
            historyGrade = 3;
            System.out.println("История: " + historyGrade);
        } else if (historySubject > 73 && historySubject <= 91) {
            historyGrade = 4;
            System.out.println("История: " + historyGrade);
        } else {
            historyGrade = 5;
            System.out.println("История: " + historyGrade);
        }

        double progSubject = 74;
        int progGrade = 2;

        if (progSubject <= 60) {
            System.out.println("Программирование: " + progGrade);
        } else if (progSubject > 60 && progSubject <= 73) {
            progGrade = 3;
            System.out.println("Программирование: " + progGrade);
        } else if (progSubject > 73 && progSubject <= 91) {
            progGrade = 4;
            System.out.println("Программирование: " + progGrade);
        } else {
            progGrade = 5;
            System.out.println("Программирование: " + progGrade);
        }

        double averageGrade = (historyGrade + progGrade) / 2;
        double averagePercent = (historySubject + progSubject) / 2;
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("средний % по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли");
        double income = 13025.233;
        double roomRent = 5123.018;
        double productionCost = 9001.729;
        double profitPerYear = income - roomRent - productionCost;

        if (profitPerYear > 0) {
            System.out.println("Прибыль за год: " + "+" + profitPerYear + " руб.");
        } else if (profitPerYear < 0) {
            System.out.println("Прибыль за год: " + profitPerYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitPerYear + " руб.");
        }
    }
}