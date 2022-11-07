public class Bestellung {
    String adresse;
    Pizza pizza;

    /**
     * Konstruktor
     *
     * @param adresse Adresse der Bestellung
     * @param pizza   Pizza Fliegengewicht
     */
    public Bestellung(String adresse, Pizza pizza) {
        this.adresse = adresse;
        this.pizza = pizza;
    }
}
