package secondaLezione.primoEsercizio;

public class Esercizio1 {
    public static void main(String[] args) {
        Distributore ds = new Distributore(20);
        System.out.println("Il distributore ha: " + ds.getLattina() + " lattine\n");

        ds.addLattine(50);
        System.out.println("Il distributore ha: " + ds.getLattina() + " lattine\n");

        ds.compraBibita(40);

        System.out.println("Il distributore ha: " + ds.getLattina() + " lattine\n");
        System.out.println("Il distributore ha: " + ds.getGettone() + " gettoni\n");
    }
}
