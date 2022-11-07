import java.util.HashMap;

public class PizzaFabrik {
    private final HashMap<String, Pizza> pizzaMap = new HashMap<>();

    public Pizza holePizza(String pizzaName) {
        Pizza pizza = pizzaMap.get(pizzaName);

        if (pizza == null) {
            pizza = new Pizza(pizzaName);
            pizzaMap.put(pizzaName, pizza);
        }

        return pizza;
    }
}
