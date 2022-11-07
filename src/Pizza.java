public class Pizza {
    private final String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void zubereiten() {
        System.out.println("Die Pizza '" + name + "' wird gebacken.");
    }

    public void ausliefern(String adresse) {
        System.out.println("Die Pizza '" + name + "' wird an die Adresse '" + adresse + "' ausgeliefert.");
    }
}
