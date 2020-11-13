package homework;

public class ApplicationSystem {
    public static void main(String[]args){
        OperatingSystem operatingSystem = new OperatingSystem();

        operatingSystem.turnOff();
        operatingSystem.turnOn();

        AndroidSystem androidSystem = new AndroidSystem(2020);
        androidSystem.displayVersionYear();

        androidSystem.turnOff();
        androidSystem.turnOn();

        IiOsSystem iiOsSystem = new IiOsSystem(2021);
        iiOsSystem.displayVersionYear();
        iiOsSystem.turnOff();
        iiOsSystem.turnOn();
    }
}
