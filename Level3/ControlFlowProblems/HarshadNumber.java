import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tempNumber = number;
        int sumOfDigits = 0;
        while (tempNumber > 0) {
            sumOfDigits += tempNumber % 10;
            tempNumber /= 10;
        }
        if (number % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}