public class FriendsAgeHeight {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();
        int minAge = ageAmar;
        String youngest = "Amar";
        if (ageAkbar < minAge) { minAge = ageAkbar; youngest = "Akbar"; }
        if (ageAnthony < minAge) { minAge = ageAnthony; youngest = "Anthony"; }
        int maxHeight = heightAmar;
        String tallest = "Amar";
        if (heightAkbar > maxHeight) { maxHeight = heightAkbar; tallest = "Akbar"; }
        if (heightAnthony > maxHeight) { maxHeight = heightAnthony; tallest = "Anthony"; }
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
        sc.close();
    }
}
