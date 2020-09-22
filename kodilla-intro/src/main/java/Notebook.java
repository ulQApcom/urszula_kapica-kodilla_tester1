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
        } else if (this.price > 500 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("The notebook is expensive");
        }

    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 600 && this.weight <= 1600) {
            System.out.println("This notebook is quite light");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYear() {
        if (this.year <= 2015) {
            System.out.println("This notebook is perfect for home use");
        } else if (this.year <= 2017 && this.year < 2018) {
            System.out.println("This notebook is good for work");
        } else {
            System.out.println("This notebook is perfect at work and home");
        }
    }

    public void comparePriceAndYear() {
        if (this.year == 2018 && this.price == 1000) {
            System.out.println("This is amazing opportunity!");
        } else if (this.year < 2014) {
            System.out.println("This hardware may be too weak");
        }
    }
}

    












