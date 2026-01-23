public class MultiplesBelow100While {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int i = number;
        while (i < 100) {
            System.out.println(i);
            i += number;
        }
        sc.close();
    }
}
