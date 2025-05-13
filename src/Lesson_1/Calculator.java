public class Calculator {
    public static void main(String[] args) {
        int firstNum = 2;
        String sign = "^";
        int secondNum = 10;
        int result = 1;

        if (sign.equals("+")) {
            result = firstNum + secondNum;
        } else if (sign.equals("-")) {
            result = firstNum - secondNum;
        } else if (sign.equals("*")) {
            result = firstNum * secondNum;
        } else if (sign.equals("/")) {
            result = firstNum / secondNum;
        } else if (sign.equals("%")) {
            result = firstNum % secondNum;
        } else if (sign.equals("^")) {
            for (int i = secondNum; i > 0; i--) {
                result *= firstNum;
            }
        }
        System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
    }
}
