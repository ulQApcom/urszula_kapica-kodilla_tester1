public class SimpleArray {
    public static void main(String[] args) {

        String[]series=new String[]{"Wikings","Witcher","Mr Robot","Chernobyl","Outlander"};

        String[] series1=new String[5];

        series1[0]="Wikings";
        series1[1]="Witcher";
        series1[2]="Mr Robot";
        series1[3]="Chernobyl";
        series1[4]="Outlander";

        String serieses = series1[3];
        System.out.println(series[3]);
        System.out.println(serieses);

        int numberOfElements=series.length;


        System.out.println("Moja tablica zawiera "+ numberOfElements+" pozycji");
    }
}
