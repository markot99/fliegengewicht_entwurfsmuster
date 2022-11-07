import java.util.ArrayList;

public class Main {

    static PizzaFabrik pizzaFabrik = new PizzaFabrik();
    static ArrayList<Bestellung> bestellungen = new ArrayList<>();

    /**
     * Methode für die Bestellung einer Pizza an eine Adresse
     *
     * @param adresse   Lieferadresse
     * @param pizzaName Name der Pizza
     */
    public static void bestellen(String adresse, String pizzaName) {
        Pizza pizza = pizzaFabrik.holePizza(pizzaName);
        Bestellung pizzaBestellung = new Bestellung(adresse, pizza);
        bestellungen.add(pizzaBestellung);
    }

    /**
     * Methode für den Lieferdienst
     *
     * @param args
     */
    public static void main(String[] args) {
        bestellen("Adresse1", "Pizza Verdure");
        bestellen("Adresse2", "Pizza Caprese");
        bestellen("Adresse3", "Pizza Verdure");
        bestellen("Adresse4", "Pizza Funghi");
        bestellen("Adresse5", "Pizza Verdure");
        bestellen("Adresse6", "Pizza Verdure");
        bestellen("Adresse7", "Pizza Caprese");

        for (Bestellung bestellung : bestellungen) {
            Pizza pizza = bestellung.pizza;
            pizza.zubereiten();
            String adresse = bestellung.adresse;
            pizza.ausliefern(adresse);
        }
    }
}
