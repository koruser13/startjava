import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int attemptNum = 5;
        int randomNum = 50;

        System.out.println("Введите число от 1 до 100");
        System.out.println("У вас есть " + attemptNum + " попыток");

        for (int i = 0; i < 5; i++) {
            int guessedNum = scan.nextInt();
            if (randomNum == guessedNum) {
                System.out.println("Вы победили!");
                break;
            } else if (guessedNum > randomNum) {
                System.out.println(guessedNum + " больше того, что загадал компьютер");
            } else {
                System.out.println(guessedNum + " меньше того, что загадал компьютер");
            }
        }
    }
}
