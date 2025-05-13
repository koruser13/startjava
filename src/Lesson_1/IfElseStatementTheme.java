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

        if (age > 19) {
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
        int firstNumber = 29;
        int secondNumber = 29;

        if (firstNumber > secondNumber) {
            System.out.println("Первое число " + firstNumber + " больше второго числа " + secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Второе число " + secondNumber + " больше первого числа " + firstNumber);
        } else {
            System.out.println("Первое число " + firstNumber + " и второе число " + secondNumber + " равны");
        }

        System.out.println("\n3. Проверка числа");

        int checkedNum = 1;
        if (checkedNum == 0) {
            System.out.println("Проверяемое число равно 0");
        } else {
            if (checkedNum % 2 == 0) {
                System.out.print(checkedNum + " - является чётным");
            } else {
                System.out.print(checkedNum + " - является нечётным");
            }
            if (checkedNum > 0) {
                System.out.println(" и положительным");
            } else {
                System.out.println(" и отрицательным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 343;
        int num2 = 323;

        int hundredsOfNum1 = num1 / 100;
        int tensOfNum1 = num1 / 10 % 10;
        int onesOfNum1 = num1 % 10;

        int hundredsOfNum2 = num2 / 100;
        int tensOfNum2 = num2 / 10 % 10;
        int onesOfNum2 = num2 % 10;

        System.out.println("Исходные числа: " + num1 + " и " + num2);

        if (hundredsOfNum1 != hundredsOfNum2 && tensOfNum1 != tensOfNum2 && onesOfNum1 != onesOfNum2) {
            System.out.println("Равных цифр нет");
        } else {
            String digit = "";
            System.out.print("Одинаковые цифры: ");
            if (hundredsOfNum1 == hundredsOfNum2) {
                System.out.print(hundredsOfNum1 + " ");
                digit += "сотни ";
            }
            if (tensOfNum1 == tensOfNum2) {
                System.out.print(tensOfNum1 + " ");
                digit += "десятки ";
            }
            if (onesOfNum1 == onesOfNum2) {
                System.out.print(onesOfNum1);
                digit += "единицы";
            }
            System.out.println("\nНазвания разрядов: " + digit);
        }

        System.out.println("\n5. Определение символа по его коду");
        char sign = '\u0057';

        if (Character.isUpperCase(sign)) {
            System.out.println(sign + " - большая буква");
        } else if (Character.isLowerCase(sign)) {
            System.out.println(sign + " - маленькая буква");
        } else if (Character.isDigit(sign)) {
            System.out.println(sign + " - цифра");
        } else {
            System.out.println(sign + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double depositSum = 321123.59;

        int percent = 5;

        if (depositSum > 300_000) {
            percent = 10;
        } else if (depositSum >= 100_000) {
            percent = 7;
        }

        double percentSum = (depositSum * percent / 100);
        double finalSum = depositSum + percentSum;
        System.out.println("Сумма вклада " + depositSum);
        System.out.println("Сумма начисленного % " + percentSum);
        System.out.println("Итоговая сумма с % " + finalSum);

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 59;
        int historyGrade = 2;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        double csPercent = 92;
        int csGrade = 2;

        if (csPercent > 91) {
            csGrade = 5;
        } else if (csPercent > 73) {
            csGrade = 4;
        } else if (csPercent > 60) {
            csGrade = 3;
        }

        double averageGrade = (historyGrade + csGrade) / 2.;
        double averagePercent = (historyPercent + csPercent) / 2;
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + csGrade);
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("средний % по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли");
        double income = 13025.233;
        double roomRent = 5123.018;
        double productionCost = 9001.729;
        double profitPerYear = (income - roomRent - productionCost) * 12;

        if (profitPerYear > 0) {
            System.out.println("Прибыль за год: +" + profitPerYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitPerYear + " руб.");
        }
    }
}