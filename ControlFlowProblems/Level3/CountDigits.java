import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println(1);
            return;
        }
        int count = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber > 0) {
            tempNumber /= 10;
            count++;
        }
        System.out.println(count);
    }
}