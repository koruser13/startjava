public class Calculator {
    public static void main(String[] args) {
        int firstNum = 2;
        char sign = '^';
        int secondNum = 3;
        int result = 1;

        if (sign == '+') {
            result = firstNum + secondNum;
        } else if (sign == '-') {
            result = firstNum - secondNum;
        } else if (sign == '*') {
            result = firstNum * secondNum;
        } else if (sign == '/') {
            result = firstNum / secondNum;
        } else if (sign == '%') {
            result = firstNum % secondNum;
        } else if (sign == '^') {
            for (int i = secondNum; i > 0; i--) {
                result *= firstNum;
            }
        }
        System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
    }
}
