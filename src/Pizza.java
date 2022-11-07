public class Pizza {
    private final String name;
    private final String adresse;

    public Pizza(String adresse, String name) {
        this.name = name;
        this.adresse = adresse;
    }

    public void zubereiten() {
        System.out.println("Die Pizza '" + name + "' wird gebacken.");
    }

    public void ausliefern() {
        System.out.println("Die Pizza '" + name + "' wird an die Adresse '" + adresse + "' ausgeliefert.");
    }
}
