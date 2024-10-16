package primaLezione.primoEsercizio;
import java.util.Scanner;
import java.io.PrintStream;

public class Esercizio1 {
    public static void main(String[] args) {
        //Creo uno scanner e un printer
        Scanner scanner = new Scanner(System.in);
        PrintStream printer = System.out;

        //Creo un array e gli inserisco 9 elementi
        int[] array = new int[9];
        printer.println("Inserisci 9 elementi: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //Sommo gli elementi a indice pari e sottraggo quelli nell'indice dispari
        int risultato = 0;
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                risultato += array[i];
            }else{
                risultato -= array[i];
            }
        }

        //Stampo il risultato
        printer.println("\nRisultato: " + risultato);
    }
}
