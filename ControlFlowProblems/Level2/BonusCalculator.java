public class BonusCalculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.println(bonus);
        sc.close();
    }
}
