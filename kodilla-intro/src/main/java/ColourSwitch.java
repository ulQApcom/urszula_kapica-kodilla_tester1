import java.util.Scanner;

public class ColourSwitch {
    public enum Switch {
        B, /* Blue */
        G, /* Grey */
        R, /* Rose */
        W, /* White */
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write first letter of colour: R - rose, W - white, B - blue, G - grey:");
            String colour = scanner.nextLine().trim().toUpperCase();
            Switch myColour = Switch.R;

            switch(myColour) {
                case R:
                    System.out.println("Rose");
                    break;
                case W:
                    System.out.println("White");
                    break;
                case B:
                    System.out.println("Blue");
                    break;
                case G:
                    System.out.println("Grey");
                    break;
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}