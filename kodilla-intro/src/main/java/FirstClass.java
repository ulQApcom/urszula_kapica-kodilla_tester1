public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook ("600g",2000);
        System.out.println(notebook.weight+" "+notebook.price);
        System.out.println(notebook.price);

        Notebook heavyNotebook = new Notebook ("2000g",1800);
        System.out.println(heavyNotebook.weight+" "+heavyNotebook.price);
        System.out.println(heavyNotebook.price);

        Notebook oldNotebook = new Notebook ("1200g",1600);
        System.out.println(oldNotebook.weight+ " "+oldNotebook.price);
        System.out.println(oldNotebook.price);


    }
}