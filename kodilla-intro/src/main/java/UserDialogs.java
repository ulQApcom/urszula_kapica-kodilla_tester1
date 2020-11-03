import java.util.Scanner;

public class UserDialogs {

    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Jane");
            String name = scanner.nextLine().trim();
            // (nextLine()m.in. przy pomocy tej metody może być realizowane odczytanie danych z klawiatury
            // metoda trim(), której zadaniem jest usunięcie spacji na początku i na końcu tekstu.
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again");
        }
    }
}
