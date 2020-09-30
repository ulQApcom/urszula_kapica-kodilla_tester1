public class Flight {
    //przylot//
    String arrival;
    //odlot//
    String departure;

    public static void main(String[] args) {
    }

    public Flight(String arrival, String departure){
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getDetails(){
        return "Flight from" + this.departure + "to" + this.arrival;
    }
}
