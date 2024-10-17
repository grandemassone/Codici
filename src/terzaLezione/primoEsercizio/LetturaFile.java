package terzaLezione.primoEsercizio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetturaFile {
    public static void main(String[] args) throws FileNotFoundException {
        File usFile = new File("/Users/grandemassone/Desktop/Davide/Università/POO/Teoria tutorato POO/src/terzaLezione/primoEsercizio/file.txt");
        Scanner sf = new Scanner(usFile);

        List<Record> records = new ArrayList<>();
        int numeroOperazioni = 0;
        double importoAcquisto = 0;
        double importoVendita = 0;

        // Reading the file
        while (sf.hasNext()) {
            String nome = sf.next();  // Read the name
            double importo = sf.nextDouble();
            int quantita = sf.nextInt();
            char operazione = sf.next().charAt(0);

            // Create a new Record object and add it to the list
            Record record = new Record(nome, importo, quantita, operazione);
            records.add(record);

            // Update counters and sums
            numeroOperazioni++;
            if (operazione == 'S') {
                importoAcquisto += importo * quantita;
            } else if (operazione == 'B') {
                importoVendita += importo * quantita;
            }

            // Output the record (optional, for debugging)
            System.out.println(record);
        }

        sf.close();

        // Print the final results
        System.out.println("\nNumero Operazioni: " + numeroOperazioni);
        System.out.println("Totale Importo Acquisto (S): " + importoAcquisto);
        System.out.println("Totale Importo Vendita (B): " + importoVendita + "\n");
    }
}
