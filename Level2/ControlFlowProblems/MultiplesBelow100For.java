public class MultiplesBelow100For {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }
        sc.close();
    }
}
