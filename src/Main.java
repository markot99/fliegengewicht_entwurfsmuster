import java.util.ArrayList;

public class Main {
    static ArrayList<Pizza> bestellungen = new ArrayList<>();

    public static void bestellen(String addresse, String pizzaName) {
        Pizza pizza = new Pizza(addresse, pizzaName);
        bestellungen.add(pizza);
    }

    public static void main(String[] args) {

        bestellen("Adresse1", "Pizza Verdure");
        bestellen("Adresse2", "Pizza Caprese");
        bestellen("Adresse3", "Pizza Verdure");
        bestellen("Adresse4", "Pizza Funghi");
        bestellen("Adresse5", "Pizza Verdure");
        bestellen("Adresse6", "Pizza Verdure");
        bestellen("Adresse7", "Pizza Caprese");

        for (Pizza pizza : bestellungen) {
            pizza.zubereiten();
            pizza.ausliefern();
        }
    }
}
