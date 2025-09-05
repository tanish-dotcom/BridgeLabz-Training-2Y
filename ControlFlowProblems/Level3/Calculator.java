import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        double result = 0.0;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                result = first / second;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}