import java.util.HashMap;

public class PizzaFabrik {
    private final HashMap<String, Pizza> pizzaMap = new HashMap<>();

    /**
     * Methode für die Rückgabe eines Pizza Fliegengewicht Objekts
     *
     * @param pizzaName Name der Pizza
     * @return Pizza Objekt
     */
    public Pizza holePizza(String pizzaName) {
        Pizza pizza = pizzaMap.get(pizzaName);

        // Falls in der Map kein Pizza Objekt mit dem entsprechenden Namen existiert, wird ein neues erstellt
        if (pizza == null) {
            pizza = new Pizza(pizzaName);
            pizzaMap.put(pizzaName, pizza);
        }

        return pizza;
    }
}
