import java.util.ArrayList;
import java.util.List;

public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000,2018);
        displayParameters(notebook);

        Notebook heavyNotebook = new Notebook(2000, 1500,2017);
        displayParameters(heavyNotebook);

        Notebook oldNotebook = new Notebook(1600, 500, 2015);
        displayParameters(oldNotebook);

//        List<Notebook> notebooksList = new ArrayList<>();
//
//        notebooksList.add(notebook);
//        notebooksList.add(heavyNotebook);
//        notebooksList.add(oldNotebook);
//
//        for(Notebook notebook1 : notebooksList){
//            displayParameters(notebook1);
//        }
    }

    private static void displayParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.comparePriceAndYear();
    }
}
