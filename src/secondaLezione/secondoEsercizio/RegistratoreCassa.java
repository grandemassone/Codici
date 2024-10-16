package secondaLezione.secondoEsercizio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class RegistratoreCassa {
    private List<Prodotto> listino = new ArrayList<Prodotto>();
    private double fondoCassa = 150.50;

    ///METODI GETTER
    public double getFondoCassa() { return fondoCassa; }
    public List<Prodotto> getListino() { return listino; }

    ///METODO per pagare il prodotto
    public double pagaProdotto(double banconota, int codice) {
        Prodotto prodotto;

        for(Prodotto prodottoFor : listino) {
            if(codice == prodottoFor.getCodice()) {
                if(banconota < prodottoFor.getPrezzo()){
                    System.out.println("Banconote non sufficienti!");
                    return 1;
                }

                fondoCassa += prodottoFor.getPrezzo();
                return banconota - prodottoFor.getPrezzo();
            }
        }
        return 0;
    }

    ///Stampa il listino
    public void printListino(){
        System.out.println("\nStampo il listino prezzi: ");
        for(Prodotto prodotto : listino){
            System.out.println("\nNome: " + prodotto.getNome() + ", prezzo: " + prodotto.getPrezzo() + ", codice: " + prodotto.getCodice() + "\n");
        }
        System.out.println("\n");
    }
}