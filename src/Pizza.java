public class Pizza {
    private final String name;

    /**
     * Konstruktor
     *
     * @param name Name der Pizza
     */
    public Pizza(String name) {
        this.name = name;
    }

    /**
     * Methode für die Zubereitung der Pizza
     */
    public void zubereiten() {
        System.out.println("Die Pizza '" + name + "' wird gebacken.");
    }

    /**
     * Methode für die Auslieferung der Pizza
     *
     * @param adresse Adresse für die Lieferung
     */
    public void ausliefern(String adresse) {
        System.out.println("Die Pizza '" + name + "' wird an die Adresse '" + adresse + "' ausgeliefert.");
    }
}
