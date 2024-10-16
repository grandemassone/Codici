package secondaLezione.primoEsercizio;

public class Distributore {
    private int gettone = 0;
    private int lattina;

    public Distributore(int numeroLattina) { lattina = numeroLattina; }

    ///Funzione per inserire gettone e dare una lattina
    public void compraBibita(int numeroGettone){
        if(lattina == 0){
            System.out.println("\nLe lattine sono finite!\n");
            return;
        }
        gettone += numeroGettone;
        lattina -= numeroGettone;
        System.out.println("\nSono state acquistate: " + numeroGettone + " lattine!\n");
    }

    ///SETTER
    public void addLattine(int lattina){
        this.lattina += lattina;
        System.out.println("\nSono state aggiunte " + lattina + " lattine.\n");
    }
    ///FINE SETTER

    ///GETTER
    public int getLattina() {
        return lattina;
    }
    public int getGettone() {
        return gettone;
    }
    ///FINE GETTER
}
