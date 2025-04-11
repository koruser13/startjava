public class Calculator {
    public static void main(String[] args) {
        String plusSign = "+";
        String minusSign = "-";
        String asteriskSign = "*";
        String slashSign = "/";
        String caretSign = "^";
        String percentSign = "%";
        int firstNum = 2;
        String sign = "^";
        int secondNum = 3;
        int result = 1;

        if (sign.equals(plusSign)) {
            result = firstNum + secondNum;
        } else if (sign.equals(minusSign)) {
            result = firstNum - secondNum;
        } else if (sign.equals(asteriskSign)) {
            result = firstNum * secondNum;
        } else if (sign.equals(slashSign)) {
            result = firstNum / secondNum;
        } else if (sign.equals(percentSign)) {
            result = firstNum % secondNum;
        }

        for (int i = secondNum; i != 0; i--) {
            if (sign.equals(caretSign)) {
                result *= firstNum;
            }
        }
        System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
    }
}
