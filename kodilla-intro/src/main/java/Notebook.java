public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 500) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price < 500 && this.price >= 1000) {
            System.out.println( "The price is good");
        }else {
            System.out.println("The notebook is expensive");
        }

        }

    public void checkWeight() {
        if (this.weight >= 500) {
            System.out.println("This notebook is very light.");
        } else if (this.weight >= 1600 && this.weight <= 1900) {
            System.out.println("This notebook is quite light");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYear(){
        if (this.price <= 500) {
            System.out.println("perfect for home use");
        }
        else if (this.year <= 2010) {
            System.out.println("perfect for home use");
        }
        else if (this.price < 200) {
            System.out.println ("suspisiously low price");
        }
        else {
            System.out.println("think again");
        }
    }
}











