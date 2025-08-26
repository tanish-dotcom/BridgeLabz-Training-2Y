import java.util.Scanner;

public class TrafficLightSystem {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color (Red, Yellow, Green): ");
        String color = sc.nextLine();
        
        
        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid");
         }
    }
}
              