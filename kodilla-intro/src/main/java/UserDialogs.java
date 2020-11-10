import java.util.Scanner;

public class UserDialogs {

    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("J");
            String name = scanner.nextLine().trim();
            // (nextLine()m.in. przy pomocy tej metody może być realizowane odczytanie danych z klawiatury
            // metoda trim(), której zadaniem jest usunięcie spacji na początku i na końcu tekstu.
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again");
        }
    }
    //    public static String getUserSelection() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
//            String calc = scanner.nextLine().trim().toUpperCase();
//            if (calc.equals("A")) {
//                return "ADD";
//            } else if (calc.equals("S")) {
//                return "SUB";
//            } else if (calc.equals("D")) {
//                return "DIV";
//            } else if (calc.equals("M")) {
//                return "MUL";
//            }
//            System.out.println("Wrong calculation. Try again.");
//        }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
            public static int getValue(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number");
                int val = scanner.nextInt();
                return val;
            }
        }





